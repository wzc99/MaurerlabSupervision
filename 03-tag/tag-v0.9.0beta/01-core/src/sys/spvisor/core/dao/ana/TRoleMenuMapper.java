package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TRoleMenu;
import sys.spvisor.core.entity.ana.TRoleMenuExample;

public interface TRoleMenuMapper {
    int countByExample(TRoleMenuExample example);

    int deleteByExample(TRoleMenuExample example);

    int deleteByPrimaryKey(Integer roleMenuId);

    int insert(TRoleMenu record);

    int insertSelective(TRoleMenu record);

    List<TRoleMenu> selectByExample(TRoleMenuExample example);

    TRoleMenu selectByPrimaryKey(Integer roleMenuId);

    int updateByExampleSelective(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    int updateByExample(@Param("record") TRoleMenu record, @Param("example") TRoleMenuExample example);

    int updateByPrimaryKeySelective(TRoleMenu record);

    int updateByPrimaryKey(TRoleMenu record);
}