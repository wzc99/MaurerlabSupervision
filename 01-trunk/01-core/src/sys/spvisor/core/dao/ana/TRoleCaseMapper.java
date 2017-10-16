package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TRoleCase;
import sys.spvisor.core.entity.ana.TRoleCaseExample;

public interface TRoleCaseMapper {
    int countByExample(TRoleCaseExample example);

    int deleteByExample(TRoleCaseExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(TRoleCase record);

    int insertSelective(TRoleCase record);

    List<TRoleCase> selectByExample(TRoleCaseExample example);

    TRoleCase selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") TRoleCase record, @Param("example") TRoleCaseExample example);

    int updateByExample(@Param("record") TRoleCase record, @Param("example") TRoleCaseExample example);

    int updateByPrimaryKeySelective(TRoleCase record);

    int updateByPrimaryKey(TRoleCase record);
}