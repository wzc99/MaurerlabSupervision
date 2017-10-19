package sys.spvisor.core.service.people;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

//import sys.spvisor.core.dao.people.PeopleDao;











import com.ibm.db2.jcc.am.i;

import sys.spvisor.core.entity.ana.TPeoplePoststatus;
import sys.spvisor.core.entity.ana.TPeoplePoststatusExample;
import sys.spvisor.core.util.SecurityUtil;
import sys.spvisor.core.entity.ana.TRole;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.people.PeopleToday;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectAndMember;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria;
import sys.spvisor.core.criteria.people.PeopleCriteria;
import sys.spvisor.core.criteria.people.PeopleManageCriteria;
import sys.spvisor.core.dao.ana.TPeoplePoststatusMapper;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TRoleMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.people.PeopleDao;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
@Service
public class PeopleService {
	
//	@Autowired
//	private PeopleDao statusDao;

	
//	@Autowired
//	private TEvectionStatusMapper TEvectionStatusMapper;
	@Autowired
	private TProjectPeopleMapper TProjectPeopleMapper;
	@Autowired
	private TRoleMapper TRoleMapper;
	@Autowired
	private PeopleDao statusDao;
	
	@Autowired
	private TPeoplePoststatusMapper TPeoplePoststatusMapper;
	
	@Autowired
	private TUserMapper TUserMapper;
	
	@Autowired
	private TUserRoleMapper TUserRoleMapper;
	

	
	
	//人员在岗状态
	@Transactional
	public List<TPeoplePoststatus> getPostStatus(){
		
		TPeoplePoststatusExample example = new TPeoplePoststatusExample();		
		List<TPeoplePoststatus> list = TPeoplePoststatusMapper.selectByExample(example); 		
		return list;
	}



	/*//查询当前人员动态表
	@Transactional
	public List<PeopleToday> selectByExample(PeopleToday msg) {
		
		TUserExample userExample = new TUserExample();
		sys.spvisor.core.entity.ana.TUserExample.Criteria userCriteria = userExample.createCriteria();
		
		if(msg.getUserLoginName() == "" || msg.getUserLoginName() == null){}
		else{
			userCriteria.andUserLoginNameLike("%" +msg.getUserLoginName() +"%");//姓名
			}
		if(msg.getUserName()=="" || msg.getUserName()==null){}
		else{
			userCriteria.andUserNameLike("%" +msg.getUserName() +"%");//出差位置
		}		
		if(msg.getUserWorkStatusId() == null) {}
		else {
			userCriteria.andUserWorkStatusIdEqualTo(msg.getUserWorkStatusId());//岗位状态
		}
		
		List<TUser> lists = TUserMapper.selectByExample(userExample);
		
//		List<PeopleToday>  people 
		return null;
	}*/

	//查询当前人员动态表
	@Transactional
	public List<PeopleToday> selectByExample(PeopleCriteria params) {
		
		if(!params.getProjectName().trim().isEmpty()) {
			params.setProjectName("%" +params.getProjectName().trim() + "%");
		}
		if(!params.getProUnit().trim().isEmpty()) {
			params.setProUnit( "%" + params.getProUnit().trim() + "%");
		}
		if(!params.getUserLoginName().trim().isEmpty()) {
			params.setUserLoginName( "%" + params.getUserLoginName() +  "%");
		}
		if(!params.getUserName().trim().isEmpty()) {
			params.setUserName(params.getUserName());
		}
		List<PeopleToday> lists  = statusDao.queryAllUserByCondition(params);
		
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).setUserWorkStatus(getuserPostStatus(lists.get(i).getUserWorkStatusId()));
			lists.get(i).setPpProRole(getUserRoleDes(lists.get(i).getPpProRoleId()));
			lists.get(i).setRole(roleDes(lists.get(i).getUserId()));
			
		}
		
		return lists;
		
	}
	
	//查询当前人员动态表的总数
		@Transactional
		public int selectByExampleCount(PeopleCriteria params) {
			
			List<PeopleToday>  lists = statusDao.queryAllUserByConditionCount(params);
			int count = lists.size();
			return count;
			
		}
			
		

	public List<PeopleToday> getAllPeople() {
		
		PeopleCriteria peo = new PeopleCriteria();
		peo.setPaging(true);
		peo.setOffset(0);
		peo.setLimit(10);
 		// TODO Auto-generated method stub
		
		List<PeopleToday> lists  = statusDao.queryAllUserByCondition(peo);
		
		
		
		/*List<PeopleToday> lists =  statusDao.getAllPeople();*/
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).setUserWorkStatus(getuserPostStatus(lists.get(i).getUserWorkStatusId()));
			lists.get(i).setPpProRole(getUserRoleDes(lists.get(i).getPpProRoleId()));
			lists.get(i).setRole(roleDes(lists.get(i).getUserId()));			
		}
		return lists;
	}
	
//	岗位状态
	public String getuserPostStatus(Integer userWorkStatusId){
		
		String postStatus = "";
		if(userWorkStatusId == null){
			return postStatus;
		}else{
			TPeoplePoststatus  peoplePoststatus = TPeoplePoststatusMapper.selectByPrimaryKey(userWorkStatusId);
			postStatus = peoplePoststatus.getPostStatusDes();
			return postStatus;	
		}
					
	}
//	角色描述
	public String getUserRoleDes(Integer roleID){
		
		
		String roleDes = "";
		if(roleID == null){
			return roleDes;
		}else{
			TRole  peoplePoststatus = TRoleMapper.selectByPrimaryKey(roleID);
			roleDes = peoplePoststatus.getRoleDesc();
			return roleDes;	
		}					
	}
//	角色的等级
	public Integer getUserLevel(Integer roleID){
		
		
		Integer roleLevel = null;
		if(roleID == null){
			return roleLevel;
		}else{
			TRole  peoplePoststatus = TRoleMapper.selectByPrimaryKey(roleID);
			roleLevel = peoplePoststatus.getLevel();
			return roleLevel;	
		}					
	}
//	角色统计
	public String roleDes(Integer userId){
		String des = "";
		StringBuffer strDes = new StringBuffer();
		TUserRoleExample example = new TUserRoleExample();
		
		sys.spvisor.core.entity.ana.TUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(userId);
		List<TUserRole> list = TUserRoleMapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			if(getUserLevel(list.get(i).getRoleId())==1){
				if(i == 0 ){
					strDes.append(getUserRoleDes(list.get(i).getRoleId()));
				}else{
					strDes.append(","+getUserRoleDes(list.get(i).getRoleId()));
				}
			}			
		}
		des = strDes.toString();
		return des;
		
	}



	public List<TUser>  getAllUser() {
		// TODO Auto-generated method stub
		TUserExample userExample = new TUserExample();
		sys.spvisor.core.entity.ana.TUserExample.Criteria userCriteria = userExample.createCriteria();
//		userCriteria.andUserRoleFlagEqualTo(1);
		List<TUser> lists = TUserMapper.selectByExample(userExample);
		return lists;
	}
	
//	查询人员管理的人员
	public List<TUser> queryPeopleUser(PeopleManageCriteria params) {
		// TODO Auto-generated method stub
		

		if(!params.getUserLoginName().trim().isEmpty()) {
			params.setUserLoginName( "%" + params.getUserLoginName() +  "%");
		}
		if(!params.getUserName().trim().isEmpty()) {
			params.setUserName(params.getUserName());
		}
		
		
		List<TUser> lists = TUserMapper.queryUserByCondition(params);
		return lists;
	}

//	查询人员管理的人员总数
	public int queryPeopleUserCount(PeopleManageCriteria params) {
		// TODO Auto-generated method stub
		
		List<TUser> lists = TUserMapper.queryUserByConditionCount(params);
		int count = lists.size();
		return count;
	}


//	public List<TUser> queryPeopleUser(TUser msg) {
//		// TODO Auto-generated method stub
//		
//		TUserExample userExample = new TUserExample();
//		sys.spvisor.core.entity.ana.TUserExample.Criteria userCriteria = userExample.createCriteria();
//		if(msg.getUserLoginName() == "" || msg.getUserLoginName() == null){
//			
//		}else{
//			userCriteria.andUserLoginNameLike("%" +msg.getUserLoginName() +"%");
//			}
//		if(msg.getUserName()=="" || msg.getUserName()==null){
//			
//		}else{
//			userCriteria.andUserNameLike("%" +msg.getUserName() +"%");
//		}		
//		if(msg.getUserWorkStatusId() == null) {
//			userCriteria.andUserWorkStatusIdNotEqualTo(7);
//		}else {
//			userCriteria.andUserWorkStatusIdEqualTo(msg.getUserWorkStatusId());
//		}
//		if(msg.getUserRoleFlag() == null || msg.getUserRoleFlag() == 0) {
//			
//		}else {
//			userCriteria.andUserRoleFlagEqualTo(msg.getUserRoleFlag());
//		}
//		List<TUser> lists = TUserMapper.selectByExample(userExample);
//		return lists;
//	}



	public void EditPeopleUserData(TUser people) throws IOException{
		// TODO Auto-generated method stub
		
		
		TUserMapper.updateByPrimaryKeySelective(people);
	}



	public int JudgeAddUserLoginNameIn(String userLoginName) {
		// TODO Auto-generated method stub
		
		int count = 0;
		TUserExample example = new TUserExample();
		sys.spvisor.core.entity.ana.TUserExample.Criteria criteria = example.createCriteria();
		criteria.andUserLoginNameEqualTo(userLoginName);
		count = TUserMapper.countByExample(example);
		return count;
	}



	public void AddPeopleUserData(TUser people) throws IOException{
		// TODO Auto-generated method stub
		TUser user = people;
		
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		String Edate = "2100-01-01";
		Date date = null;
		try {
			date = format.parse(Edate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String password= "123456";
		String selkey=people.getUserLoginName() ;
		String sel =SecurityUtil.genSalt(selkey);
	    String maskedPassword= SecurityUtil.calcMaskedPassword(sel,password);
	    
	    user.setUserLoginPassword(maskedPassword);
		user.setStatus("O");
		user.setPwdErrCnt(0);
		user.setExpirationDate(date);
		user.setCheckStatus("O");
		user.setCreateDatetime(new Date());
		user.setUpdateDatetime(new Date());
		
		TUserMapper.insertSelective(user);
		
	}



	public void RemovePeopleData(String userId) throws IOException{
		// TODO Auto-generated method stub
//		改变用户表的状态
		int userid = Integer.parseInt(userId);
		TUser user = new TUser();
		user.setUserId(userid);
		user.setUserWorkStatusId(7);
		user.setStatus("C");
		user.setUpdateDatetime(new Date());
		TUserMapper.updateByPrimaryKeySelective(user);
		//		改变他所参与的项目的所有状态
//		TProjectPeople recordStatus = new TProjectPeople();
//		recordStatus.setPpStatus("C");
		TProjectPeopleExample example = new TProjectPeopleExample();
		Criteria criteria = example.createCriteria();
		criteria.andPpUserIdEqualTo(userid);
		criteria.andPpStatusNotEqualTo("C");
		
		List<TProjectPeople> lists = TProjectPeopleMapper.selectByExample(example);
		
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).setPpStatus("C");
//			Date date = new Date();
//			lists.get(i).setPpOutProTime(date);
		}
	}



	public void renewPeopleDutyData(String userId) {
		// TODO Auto-generated method stub
		int userid = Integer.parseInt(userId);
		TUser user = new TUser();
		user.setUserId(userid);
		user.setUserWorkStatusId(5);
		user.setStatus("O");
		user.setUpdateDatetime(new Date());
		TUserMapper.updateByPrimaryKeySelective(user);
		
	}
	
	
}
