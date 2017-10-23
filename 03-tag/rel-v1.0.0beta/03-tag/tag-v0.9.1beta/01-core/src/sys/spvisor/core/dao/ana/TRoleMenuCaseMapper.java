package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TRoleMenuCase;
import sys.spvisor.core.entity.ana.TRoleMenuCaseExample;

public interface TRoleMenuCaseMapper {
    int countByExample(TRoleMenuCaseExample example);

    int deleteByExample(TRoleMenuCaseExample example);

    int deleteByPrimaryKey(Integer roleMenuId);

    int insert(TRoleMenuCase record);

    int insertSelective(TRoleMenuCase record);

    List<TRoleMenuCase> selectByExample(TRoleMenuCaseExample example);

    TRoleMenuCase selectByPrimaryKey(Integer roleMenuId);

    int updateByExampleSelective(@Param("record") TRoleMenuCase record, @Param("example") TRoleMenuCaseExample example);

    int updateByExample(@Param("record") TRoleMenuCase record, @Param("example") TRoleMenuCaseExample example);

    int updateByPrimaryKeySelective(TRoleMenuCase record);

    int updateByPrimaryKey(TRoleMenuCase record);
}