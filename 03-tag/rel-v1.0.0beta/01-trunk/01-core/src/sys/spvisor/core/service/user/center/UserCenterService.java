package sys.spvisor.core.service.user.center;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.ana.RoleDao;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.ana.UserDao;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.ana.User;
import sys.spvisor.core.entity.ana.UserCase;
import sys.spvisor.core.service.ana.RoleService;


@Service
public class UserCenterService {
	
	@Autowired
	UserDao userDao;

	@Autowired
	RoleDao roleDao;

	@Autowired
	RoleService roleService;
	
	@Autowired
	private TUserMapper TUserMapper;
	
	@Autowired
	private TUserRoleMapper TUserRoleMapper;
//	@Autowired
//	UserCaseDao userCaseDao;

	public User getUserByUserId(Long userId) {
		return userDao.getById(userId,false);
	}
	
//	public UserCase getUserCaseByUserCaseId(Long userId) {
//		return userCaseDao.getById(userId,false);
//	}
	

	@Transactional
//	public void editUser(User user, String roles) {
	public Long editUser(UserCase user) {

		TUser Tuser = new TUser();
		
		Tuser.setUserName(user.getName());
		Tuser.setUserId(Integer.parseInt(String.valueOf(user.getId())));
		Tuser.setStatus(user.getStatus());
		Tuser.setMemo(user.getMemo());
		Tuser.setExpirationDate(user.getExpirationDate());
		Tuser.setUpdateDatetime(new Date());
		
		TUserMapper.updateByPrimaryKeySelective(Tuser);
		
		TUserRoleExample example = new TUserRoleExample();
		sys.spvisor.core.entity.ana.TUserRoleExample.Criteria Criteria = example.createCriteria();
		Criteria.andUserIdEqualTo(Tuser.getUserId());
		
		TUserRoleMapper.deleteByExample(example);
		
		Long newUserId = user.getId();
		if(user.getRoles() != null){
			String[] roleIds = user.getRoles().split(";|,");
			for (String roleId : roleIds) {
//				userCaseDao.insertUserRole(user.getId(), Long.parseLong(roleId));
				TUserRole userrole = new TUserRole();
				userrole.setUserId(Tuser.getUserId());
				userrole.setRoleId(Integer.parseInt(roleId));
				TUserRoleMapper.insertSelective(userrole);
			}
		}
		return newUserId;
	}
}
