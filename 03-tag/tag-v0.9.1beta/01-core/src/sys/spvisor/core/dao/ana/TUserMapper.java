package sys.spvisor.core.dao.ana;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.criteria.people.PeopleManageCriteria;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExampleWithBLOBs(TUserExample example);

    List<TUser> selectByExample(TUserExample example);
    
    List<TUser> queryUserByCondition(PeopleManageCriteria user);
    
    List<TUser> queryUserByConditionCount(PeopleManageCriteria user);

    TUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExampleWithBLOBs(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKeyWithBLOBs(TUser record);

    int updateByPrimaryKey(TUser record);
}