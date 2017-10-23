package sys.spvisor.core.service.people;

import org.springframework.beans.factory.annotation.Autowired;

import sys.spvisor.core.dao.ana.RoleDao;
import sys.spvisor.core.dao.ana.UserCaseDao;
import sys.spvisor.core.dao.ana.UserDao;
import sys.spvisor.core.service.ana.RoleService;

public class UserRoleManageService {

	@Autowired
	UserDao userDao;

	@Autowired
	RoleDao roleDao;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserCaseDao userCaseDao;
}
