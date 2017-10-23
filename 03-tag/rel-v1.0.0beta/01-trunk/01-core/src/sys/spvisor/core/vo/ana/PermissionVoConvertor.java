package sys.spvisor.core.vo.ana;

import sys.spvisor.core.entity.ana.Permission;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.vo.VoConvertor;

public class PermissionVoConvertor extends VoConvertor<PermissionVo, Permission> {

	@Override
	public PermissionVo convert(Permission bo) {
		
		PermissionVo vo = new PermissionVo();
		
		vo.setId(String.valueOf(bo.getId()));
		vo.setName(bo.getName());
		vo.setCode(bo.getCode());
		vo.setModuleCode(bo.getModuleCode());
		vo.setPermissionCode(bo.getPermissionCode());
		vo.setUrlFilter(bo.getUrlFilter());
		vo.setStatus(bo.getStatus());
		vo.setStatusName(bo.getStatusName());
		vo.setCreateDatetime(DatetimeUtil.timestamp2StringDatetime(bo.getCreateDatetime()));
		vo.setUpdateDatetime(DatetimeUtil.timestamp2StringDatetime(bo.getUpdateDatetime()));
		
		return vo;
	}
	

}
