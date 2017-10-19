package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;

public interface TProjectPeopleMapper {
    int countByExample(TProjectPeopleExample example);

    int deleteByExample(TProjectPeopleExample example);

    int deleteByPrimaryKey(Integer projectPeopleId);

    int insert(TProjectPeople record);

    int insertSelective(TProjectPeople record);

    List<TProjectPeople> selectByExample(TProjectPeopleExample example);

    TProjectPeople selectByPrimaryKey(Integer projectPeopleId);

    int updateByExampleSelective(@Param("record") TProjectPeople record, @Param("example") TProjectPeopleExample example);

    int updateByExample(@Param("record") TProjectPeople record, @Param("example") TProjectPeopleExample example);

    int updateByPrimaryKeySelective(TProjectPeople record);

    int updateByPrimaryKey(TProjectPeople record);
}