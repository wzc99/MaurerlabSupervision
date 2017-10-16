package sys.spvisor.core.service.ana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.criteria.ana.RoleCaseCriteria;
import sys.spvisor.core.criteria.ana.RoleCriteria;
import sys.spvisor.core.dao.ana.MenuDao;
import sys.spvisor.core.dao.ana.PermissionDao;
import sys.spvisor.core.dao.ana.RoleCaseDao;
import sys.spvisor.core.dao.ana.RoleDao;
import sys.spvisor.core.dao.ana.TRoleMapper;
import sys.spvisor.core.dao.ana.TRoleMenuMapper;
import sys.spvisor.core.dao.ana.TRolePermissionMapper;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.entity.ana.Menu;
import sys.spvisor.core.entity.ana.Permission;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.RoleCase;
import sys.spvisor.core.entity.ana.TRole;
import sys.spvisor.core.entity.ana.TRoleExample;
import sys.spvisor.core.entity.ana.TRoleMenu;
import sys.spvisor.core.entity.ana.TRolePermission;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.vo.ana.RoleConvertorCase;

@Service
public class RoleService {
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	PermissionDao permissionDao;
	
	@Autowired
	MenuDao menuDao;
	
	@Autowired
	RoleCaseDao roleCaseDao;
	
	@Autowired
	private TRoleMapper TRoleMapper;
	
	@Autowired
	private TRoleMenuMapper TRoleMenuMapper;
	
	@Autowired
	private TRolePermissionMapper TRolePermissionMapper;
	public List<Role> getRolesByModuleCode(String moduleCode) {
		return roleDao.getRolesByModuleCode(moduleCode);
	}

	public List<Role> getRolesByUserId(long userId) {
		return roleDao.getRolesByUserId(userId);
	}
	
	public List<RoleCase> getRolesByUserCaseId(long userId) {
		return roleCaseDao.getRolesByUserId(userId);
	}
	
	public List<Role> query(RoleCriteria criteria) {
		return roleDao.query(criteria);
	}
	
	public List<RoleCase> queryCheck(RoleCaseCriteria criteria) {
		return roleCaseDao.query(criteria);
	}
	
	public int queryCount(RoleCriteria criteria) {
		return roleDao.queryCount(criteria);
	}
	
	public int queryCheckCount(RoleCaseCriteria criteria) {
		return roleCaseDao.queryCount(criteria);
	}
	
	@Transactional
	public void addRole(Role role) {
		roleDao.insert(role);

		if(role.getMenuSelect()!= null ){
			System.out.println("role:"+role.getMenuSelect());
			String[] menuSelects = role.getMenuSelect().split(";|,");
			for (String menuId : menuSelects) {
				roleDao.insertRoleMenu(role.getId(), Long.parseLong(menuId));
			}
		}
		if(role.getRolePermission() != null){
			String[] rolePermissions = role.getRolePermission().split(";|,");
			
			for (String permissionId : rolePermissions) {
				roleDao.insertRolePermission(role.getId(), Long.parseLong(permissionId));
			}
		}
	}
	
	@Transactional
	public Long editRole(RoleCase role) {
		
		TRole Trole = new TRole();
		
		Trole.setRoleId(Integer.parseInt(String.valueOf(role.getId())));
		Trole.setRoleDesc(role.getDesc());
		Trole.setRoleName(role.getName());
		Trole.setStatus(role.getStatus());
		
		TRoleMapper.updateByPrimaryKeySelective(Trole);
					
		roleDao.deleteAllRoleMenu(role.getId());
		roleDao.deleteAllRolePermission(role.getId());
			
		Long newRoleId = role.getId();
		if(role.getMenuSelect()!= null ){
			String[] menuSelects = role.getMenuSelect().split(";|,");
			for (String menuId : menuSelects) {
				
				TRoleMenu rolemenu = new TRoleMenu();
				rolemenu.setRoleId(Trole.getRoleId());
				rolemenu.setMenuId(Integer.parseInt(menuId));
				TRoleMenuMapper.insertSelective(rolemenu);

			}
		}
		if(role.getRolePermission() != null){
			String[] rolePermissions = role.getRolePermission().split(";|,");
			
			for (String permissionId : rolePermissions) {
				TRolePermission TRolePermission = new TRolePermission();
				TRolePermission.setRoleId(Trole.getRoleId());
				TRolePermission.setPermissionId(Integer.parseInt(permissionId));
				TRolePermissionMapper.insertSelective(TRolePermission);
			}
		}
		return newRoleId;
	}
	
	@Transactional
	public void checkRole(RoleCase tempRole) throws Exception{
		if(!tempRole.getJudgement().equals("C")){
			RoleCase roleCase = roleCaseDao.getById(tempRole.getId(), false);
			//关闭这条数据
			roleCase.setCaseOpenStatus("C");
			roleCaseDao.update(roleCase);
			if(tempRole.getJudgement().equals("A")){
				//同意
				Role role = new RoleConvertorCase().convert(roleCase);
				role.setCheckStatus("O");
				if(roleCase.getCaseStatus().equals("IW")){
					//新增同意
					roleCase.setCaseStatus("IA");
					roleDao.insert(role);
				}else{
					//修改同意
					roleCase.setCaseStatus("UA");
					roleDao.update(role);
				}
				
				//从roleMenuCase表中取出对应的值，插入roleMenu表中
				List<Menu> usedMenus = menuDao.getUsedMenusByUserCaseId(roleCase.getId());
				for(Menu m: usedMenus){
					roleDao.insertRoleMenu(role.getId(), m.getId());
				}
				
				//从rolePermissionCase表中取出对应的值，插入rolePermission表中
				List<Permission> permissions = permissionDao.getPermissionByRoleCaseId(roleCase.getId());
				for(Permission p: permissions){
					roleDao.insertRolePermission(role.getId(), p.getId());
				}
			}else{
				//拒绝
				if(roleCase.getCaseStatus().equals("IW")){
					roleCase.setCaseStatus("IR");
				}else{
					roleCase.setCaseStatus("UR");
				}
			}
			
			//保存到roleCase表中
			roleCase.setCaseOwnerId(roleCase.getCaseUserId());
			roleCase.setCaseUserId(tempRole.getCaseUserId());
			roleCase.setCaseJudgment(tempRole.getCaseJudgment());
			roleCase.setCaseOpenStatus(tempRole.getCaseOpenStatus());
			roleCase.setLastCompanyCaseId(roleCase.getId());
			roleCase.setId(null);
			roleCaseDao.insert(roleCase);
		}
	}
	
	public Role getRoleByRoleId(Long roleId) {
		return roleDao.getById(roleId,false);
	}
	
	public RoleCase getRoleCaseByRoleId(Long roleId) {
		return roleCaseDao.getById(roleId,false);
	}
	
	public List<Permission> getPermissionByRoleId(long roleId) {
		return permissionDao.getPermissionByRoleId(roleId);
	}
	
	public List<Permission> getPermissionByRoleCaseId(long roleId) {
		System.out.println("roleId:"+roleId);
		List<Permission> permissions = permissionDao.getPermissionByRoleCaseId(roleId);
		System.out.println("size:"+permissions.size());
		return permissions;
	}
	
	public List<Menu> getMenuByRoleId(long roleId){
		return menuDao.getUsedMenusByUserId(roleId);
	}
	
}
