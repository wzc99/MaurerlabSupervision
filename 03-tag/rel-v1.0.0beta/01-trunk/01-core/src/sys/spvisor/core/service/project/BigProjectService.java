package sys.spvisor.core.service.project;

import java.sql.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.project.TBalanceMapper;
import sys.spvisor.core.dao.project.TBigProjectMapper;
import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.entity.project.TBalance;
import sys.spvisor.core.entity.project.TBalanceExample;
import sys.spvisor.core.entity.project.TBigProjectExample;
import sys.spvisor.core.entity.project.TBigProject;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectExample;
import sys.spvisor.core.entity.project.TProjectExample.Criteria;

@Service
public class BigProjectService {
	
	@Autowired
	TBigProjectMapper tBigProjectMapper;
	
	@Autowired
	TProjectMapper tProjectMapper;
	
	@Autowired
	TBalanceMapper tBalanceMapper;
	
	
	
	//查询相关大项目
	@Transactional
	 public List<TBigProject> selectByExample(String bigName,String userName,int index,int limit) {
		TBigProjectExample bigProjectExample = new TBigProjectExample();
		sys.spvisor.core.entity.project.TBigProjectExample.Criteria criteria =  bigProjectExample.createCriteria();
		if(bigName!=null && bigName.length()>0) {
			criteria.andBigProjectNameLike(bigName);
		}
		if(userName!= null && userName.length()>0) {
			criteria.andBigProjectCreatePeopleLike(userName);
		}
		bigProjectExample.setLimit(limit);
		if(index == 0) {
			bigProjectExample.setOffset(0);
		}else {
			bigProjectExample.setOffset((index - 1) *limit );
		}
		
		List<TBigProject> lists = tBigProjectMapper.selectByExample(bigProjectExample);
		
		return lists;
		
	}
	
	@Transactional
	 public int selectAllCount() {
		TBigProjectExample bigProjectExample = new TBigProjectExample();
		sys.spvisor.core.entity.project.TBigProjectExample.Criteria criteria =  bigProjectExample.createCriteria();
		
		int count = tBigProjectMapper.countByExample(bigProjectExample);
		
		return count;
	}
	
	/**
	 * 获取大项目中的的所有子项目
	 * @param bigProId
	 * @return
	 */
	@Transactional
	public List<TProject> getSmallProjectsByBigId(int bigProId) {
		TProjectExample tProjectExample = new TProjectExample();
		Criteria criteria = tProjectExample.createCriteria();
		criteria.andProBigProjectIdEqualTo(bigProId);
		
		List<TProject> lists = tProjectMapper.selectByExample(tProjectExample);
		
		for (int i = 0; i < lists.size(); i++) {
			TBalanceExample example = new TBalanceExample();
			sys.spvisor.core.entity.project.TBalanceExample.Criteria bCriteria = example.createCriteria();
			bCriteria.andProIdEqualTo(lists.get(i).getProId());
			List<TBalance> myBalance = tBalanceMapper.selectByExample(example);
			if(myBalance.size() != 0) {
				lists.get(i).setSumMoney(myBalance.get(0).getSumMoney());
			}
			example.clear();
		}
		return lists;
	}
	
	public int insertBalance(int proId,double sumMoney,int bigProId) {
		TBalanceExample example = new TBalanceExample();
		sys.spvisor.core.entity.project.TBalanceExample.Criteria bCriteria = example.createCriteria();
		bCriteria.andProIdEqualTo(proId);
		List<TBalance> lists = tBalanceMapper.selectByExample(example);
		
		int influenceRows = 0;
		
		//判断是第一次添加还是修改
		//第一次添加
		if(lists.size() == 0) {
			TBalance tBalance = new TBalance();
			tBalance.setBigId(bigProId);
			tBalance.setProId(proId);
			tBalance.setSumMoney(sumMoney);
			tBalance.setBalanceDate(new Date(new java.util.Date().getTime()));
			influenceRows = tBalanceMapper.insert(tBalance);
			TProject tProject = new TProject();
			tProject.setProId(proId);
			tProject.setProStatus("C");
			tProject.setProEndtime(new Date(new java.util.Date().getTime()));
			tProjectMapper.updateByPrimaryKeySelective(tProject);
			
		}else {
			TBalance tBalance = lists.get(0);
			tBalance.setSumMoney(sumMoney);
			influenceRows = tBalanceMapper.updateByPrimaryKey(tBalance);
		}
		
		
		return influenceRows;
	}
}
