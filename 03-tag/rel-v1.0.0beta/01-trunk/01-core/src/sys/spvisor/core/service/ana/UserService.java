package sys.spvisor.core.service.ana;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.criteria.ana.UserCaseCriteria;
import sys.spvisor.core.criteria.ana.UserCriteria;
import sys.spvisor.core.dao.ana.RoleDao;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.ana.UserCaseDao;
import sys.spvisor.core.dao.ana.UserDao;
import sys.spvisor.core.entity.ana.RoleCase;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.ana.User;
import sys.spvisor.core.entity.ana.UserCase;
import sys.spvisor.core.util.Enumerations;
import sys.spvisor.core.util.SecurityUtil;
import sys.spvisor.core.vo.ana.UserConvertorCase;

@Service
public class UserService {

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
	// @Autowired
	// UserCaseDao userCaseDao;

	public User getUserByUserId(Long userId) {
		return userDao.getById(userId, false);
	}

	// public UserCase getUserCaseByUserCaseId(Long userId) {
	// return userCaseDao.getById(userId,false);
	// }

	@Transactional
	// public void editUser(User user, String roles) {
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
		if (user.getRoles() != null) {
			String[] roleIds = user.getRoles().split(";|,");
			for (String roleId : roleIds) {
				// userCaseDao.insertUserRole(user.getId(),
				// Long.parseLong(roleId));
				TUserRole userrole = new TUserRole();
				userrole.setUserId(Tuser.getUserId());
				userrole.setRoleId(Integer.parseInt(roleId));
				TUserRoleMapper.insert(userrole);
			}
		}
		return newUserId;
	}

	public TUser getUserMessage(Long userId) {
		return TUserMapper.selectByPrimaryKey(userId.intValue());
	}

	public List<User> query(UserCriteria criteria) {
		return userDao.query(criteria);
	}

	public int queryCount(UserCriteria criteria) {
		return userDao.queryCount(criteria);
	}

	public void changePassword(long userId, String newPassword) {
		User user = (User) userDao.getById(userId, false);
		user.setLoginPassword(newPassword);
		setMaskedPassword(user);
		userDao.updatePassword(userId, user.getLoginPassword());
	}

	public void changePasswordForLoginUser(long userId, String password, String newPassword) {
		User user = (User) userDao.getById(userId, false);

		String selkey = user.getLoginName();
		String sel = SecurityUtil.genSalt(selkey);

		boolean success = SecurityUtil.matchPassword(user.getLoginPassword(), sel, password);
		if (false == success) {
			throw new RuntimeException("原始密码错误");
		}
		user.setLoginPassword(newPassword);
		setMaskedPassword(user);
		userDao.updatePassword(userId, user.getLoginPassword());
	}

	public String setMaskedPassword(User user) {
		String password = user.getLoginPassword();
		String selkey = user.getLoginName();
		String sel = SecurityUtil.genSalt(selkey);
		String maskedPassword = SecurityUtil.calcMaskedPassword(sel, password);
		user.setLoginPassword(maskedPassword);
		return maskedPassword;
	}

	public String setMaskedPasswordUserCase(UserCase user) {
		String password = user.getLoginPassword();
		String selkey = user.getLoginName();
		String sel = SecurityUtil.genSalt(selkey);
		String maskedPassword = SecurityUtil.calcMaskedPassword(sel, password);
		user.setLoginPassword(maskedPassword);
		return maskedPassword;
	}

	/**
	 * 编辑用户资料 不包括岗位状态、用户签名 通过TUserMapper
	 * 
	 * @param user
	 *            更行TUser 可多个更新
	 * @param userId
	 *            用户ID
	 * @return 0为错误:尝试修改不可编辑内容 1:修改成功
	 */
	@Transactional
	public int updateUserById(TUser user, Long userId) {
		
		user.setUserId(Integer.valueOf(String.valueOf(userId)));
		TUserMapper.updateByPrimaryKeySelective(user);
		return Enumerations.ServiceReturnCode.操作成功.getCode();

	}

	/**
	 * 获取用户信息 通过TUserMapper
	 * 
	 * @param userId
	 * @return
	 */
	@Transactional
	public TUser getUserById(Long userId) {

		return TUserMapper.selectByPrimaryKey(userId.intValue());

	}

}
