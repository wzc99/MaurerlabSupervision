package sys.spvisor.core.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sys.spvisor.core.common.PermissionException;
import sys.spvisor.core.dao.ana.TRoleMapper;
import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.entity.ana.TRole;
import sys.spvisor.core.entity.ana.TRoleExample;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.ana.TUserExample.Criteria;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;

public class RolePermission {
	@Autowired
	static
	TUserRoleMapper tUserRoleMapper;
	@Autowired
	static
	TRoleMapper tRoleMapper;
	@Autowired
	static
	TUserMapper tUserMapper;
	@Autowired
	static
	TProjectPeopleMapper projectPeopleMapper;
	
	public
	static String[] getCurrentRoleAndDutyInProjectId(Integer projectId, long userId) throws PermissionException{
		String temp = "";
		
		TUserRoleExample tUserRoleExample = new TUserRoleExample();
		sys.spvisor.core.entity.ana.TUserRoleExample.Criteria criteria = tUserRoleExample.createCriteria();
		criteria.andUserIdEqualTo((int)userId);
		List<TUserRole> userRoles = tUserRoleMapper.selectByExample(tUserRoleExample);
		tUserRoleExample.clear();
	    TUserExample tUserExample = new TUserExample();
		for(TUserRole userRole : userRoles){
			TRoleExample tRoleExample = new TRoleExample();
			sys.spvisor.core.entity.ana.TRoleExample.Criteria tRoleCriteria = tRoleExample.createCriteria();
			tRoleCriteria.andRoleIdEqualTo(userRole.getRoleId());
			List<TRole> roles = tRoleMapper.selectByExample(tRoleExample);
			tUserExample.clear();
			if(roles.size() > 0){
				//如果角色为监理人员
				if(roles.get(0).getRoleName().equals("supervisor")){
					//
					TUserExample tPeopleExample = new TUserExample();
					Criteria tPeopleCriteria = tPeopleExample.createCriteria();
					tPeopleCriteria.andUserIdEqualTo((int)userId);
					List<TUser> tPeoples = tUserMapper.selectByExample(tPeopleExample);
					tPeopleExample.clear();
					if(tPeoples.size() > 0){
						TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
						sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tProjectPeopleCriteria = tProjectPeopleExample.createCriteria();
						tProjectPeopleCriteria.andProjectPeopleIdEqualTo(tPeoples.get(0).getUserId());
						List<TProjectPeople>  tProjectPeoples = projectPeopleMapper.selectByExample(tProjectPeopleExample);
						for(TProjectPeople tProjectPeople : tProjectPeoples){
							temp += tProjectPeople.getPpProRoleId() + ",";
						}
						
					}
				}
				//如果角色为非监理人员
				else{
					temp += roles.get(0).getRoleDesc() + ",";
				}
			}
		}
		if(temp.length() == 0)
			throw new PermissionException("您没有被赋予角色，请联系管理员。");
		temp = temp.substring(0, temp.length() - 1);
		String[] roleNames = temp.split(",");
		return roleNames;
	}
	
}
