package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TRolePermissionCase;
import sys.spvisor.core.entity.ana.TRolePermissionCaseExample;

public interface TRolePermissionCaseMapper {
    int countByExample(TRolePermissionCaseExample example);

    int deleteByExample(TRolePermissionCaseExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(TRolePermissionCase record);

    int insertSelective(TRolePermissionCase record);

    List<TRolePermissionCase> selectByExample(TRolePermissionCaseExample example);

    TRolePermissionCase selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") TRolePermissionCase record, @Param("example") TRolePermissionCaseExample example);

    int updateByExample(@Param("record") TRolePermissionCase record, @Param("example") TRolePermissionCaseExample example);

    int updateByPrimaryKeySelective(TRolePermissionCase record);

    int updateByPrimaryKey(TRolePermissionCase record);
}