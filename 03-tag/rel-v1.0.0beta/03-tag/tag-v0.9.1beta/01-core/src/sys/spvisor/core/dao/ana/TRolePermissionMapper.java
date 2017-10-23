package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TRolePermission;
import sys.spvisor.core.entity.ana.TRolePermissionExample;

public interface TRolePermissionMapper {
    int countByExample(TRolePermissionExample example);

    int deleteByExample(TRolePermissionExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(TRolePermission record);

    int insertSelective(TRolePermission record);

    List<TRolePermission> selectByExample(TRolePermissionExample example);

    TRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);

    int updateByExample(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);

    int updateByPrimaryKeySelective(TRolePermission record);

    int updateByPrimaryKey(TRolePermission record);
}