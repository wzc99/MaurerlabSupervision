package sys.spvisor.core.dao.ana;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.dao.IGenericDao;
import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.RoleCase;

public interface RoleCaseDao extends IGenericDao<RoleCase, Long> {
	public List<RoleCase> getRolesByUserId(Long userId);
	public void insertRoleMenu(@Param("roleId")long roleId, @Param("menuId")long menuId);
	public void insertRolePermission(@Param("roleId")long roleId, @Param("permissionId")long permissionId);
	
	public void deleteAllRoleMenu(@Param("roleId")long roleId);
	public void deleteAllRolePermission(@Param("roleId")long roleId);
}
