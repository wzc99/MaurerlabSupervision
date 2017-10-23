package sys.spvisor.core.service.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.project.TGoodsListsMapper;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.project.TGoodsListsExample;
import sys.spvisor.core.entity.project.TGoodsListsExample.Criteria;
import sys.spvisor.core.result.work.TGoodListModel;

@Service
public class GoodListService {
	
	@Autowired
	TGoodsListsMapper tGoodsListsMapper;
	@Autowired
	GoodTypeService goodTypeService;
	
	@Transactional
	public int addOrUpdateGoodList(int proId, TGoodListModel model) {
		TGoodsListsExample example= new TGoodsListsExample();
		Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TGoodsLists> originalLists = tGoodsListsMapper.selectByExample(example);
		List<TGoodsLists>  addList= model.getList();
		//记录改变行数
		int rows = 0;
		//判断是否是第一次添加
		if(originalLists.size() == 0) {
			for (int i = 0; i < addList.size(); i++) {
				TGoodsLists recoder = addList.get(i);
				recoder.setProId(proId);
				recoder.setGoodType(goodTypeService.getTypeNameByTypeId(recoder.getGoodId()));
				tGoodsListsMapper.insert(recoder);
				rows++;
			}
		}else {
			//把删除的从数据库中去掉
			for (int i = 0; i < originalLists.size(); i++) {
				for (int j = 0; j < addList.size(); j++) {
					//TODO
					//这里需要什么条件才能判别是同一个物资
					//目前用了物资类型的id和物资名称，客户指定的名称
					if(originalLists.get(i).getGoodId() == addList.get(j).getGoodId() && originalLists.get(i).getGoodName().equals(addList.get(j).getGoodName())&& originalLists.get(i).getGoodSpecifications().equals(addList.get(j).getGoodSpecifications())) {
						originalLists.remove(i);
						i--;
						break;
					}
				}
			}
			
			for (int i = 0; i < originalLists.size(); i++) {
				tGoodsListsMapper.deleteByPrimaryKey(originalLists.get(i).getId());
			}
			
			for (int i = 0; i < addList.size(); i++) {
				TGoodsLists recoder = addList.get(i);
				recoder.setProId(proId);
				recoder.setGoodType(goodTypeService.getTypeNameByTypeId(recoder.getGoodId()));
				TGoodsLists good = decideHaveGoodList(recoder,proId);
				
				if(good == null) {
					tGoodsListsMapper.insert(recoder);
				}else {
					recoder.setId(good.getId());
					tGoodsListsMapper.updateByPrimaryKey(recoder);
				}
				rows++;
			}
			
		}
		
		
		return rows;
	}
	
	@Transactional
	public TGoodsLists decideHaveGoodList(TGoodsLists good,int proId) {
		TGoodsListsExample example= new TGoodsListsExample();
		Criteria criteria = example.createCriteria();
		//TODO
		//用那几个条件进行判断是同一个物资？
		criteria.andProIdEqualTo(proId);
		criteria.andGoodIdEqualTo(good.getGoodId());
		criteria.andGoodNameEqualTo(good.getGoodName());
		criteria.andGoodSpecificationsEqualTo(good.getGoodSpecifications());
		List<TGoodsLists> originalLists = tGoodsListsMapper.selectByExample(example);
		if(originalLists.size() == 0) {
			return null;
		}else {
			return originalLists.get(0);
		}
	}
	
	@Transactional
	public List<TGoodsLists> getAllGoodsByProId(int proId) {
		TGoodsListsExample example= new TGoodsListsExample();
		Criteria criteria = example.createCriteria();
		criteria.andProIdEqualTo(proId);
		List<TGoodsLists> originalLists = tGoodsListsMapper.selectByExample(example);
		return originalLists;
	}

}
