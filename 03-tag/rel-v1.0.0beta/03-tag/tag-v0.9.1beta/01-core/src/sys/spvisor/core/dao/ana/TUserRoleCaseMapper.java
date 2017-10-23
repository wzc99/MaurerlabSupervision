package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TUserRoleCase;
import sys.spvisor.core.entity.ana.TUserRoleCaseExample;

public interface TUserRoleCaseMapper {
    int countByExample(TUserRoleCaseExample example);

    int deleteByExample(TUserRoleCaseExample example);

    int deleteByPrimaryKey(Integer userRoleId);

    int insert(TUserRoleCase record);

    int insertSelective(TUserRoleCase record);

    List<TUserRoleCase> selectByExample(TUserRoleCaseExample example);

    TUserRoleCase selectByPrimaryKey(Integer userRoleId);

    int updateByExampleSelective(@Param("record") TUserRoleCase record, @Param("example") TUserRoleCaseExample example);

    int updateByExample(@Param("record") TUserRoleCase record, @Param("example") TUserRoleCaseExample example);

    int updateByPrimaryKeySelective(TUserRoleCase record);

    int updateByPrimaryKey(TUserRoleCase record);
}