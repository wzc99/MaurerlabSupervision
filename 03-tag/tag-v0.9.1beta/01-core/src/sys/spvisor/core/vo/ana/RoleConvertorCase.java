package sys.spvisor.core.vo.ana;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.Length;

import sys.spvisor.core.entity.ana.Role;
import sys.spvisor.core.entity.ana.RoleCase;
import sys.spvisor.core.vo.VoConvertor;

public class RoleConvertorCase extends VoConvertor<Role, RoleCase> {

	@Override
	public Role convert(RoleCase bo) {
		if (bo == null)
			return null;
		Role vo = new Role();
		vo.setId(bo.getRealId());
		vo.setName(bo.getName());
		vo.setDesc(bo.getDesc());
		vo.setStatus(bo.getStatus());
		vo.setStatusName(bo.getStatusName());
		vo.setModuleCode(bo.getModuleCode());
		vo.setCreateDatetime(bo.getCreateDatetime());
		vo.setUpdateDatetime(bo.getUpdateDatetime());
		return vo;
	}

}
