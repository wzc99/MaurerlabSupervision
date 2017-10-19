package sys.spvisor.core.dao.message;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.message.TMessagePeopleMap;
import sys.spvisor.core.entity.message.TMessagePeopleMapExample;

public interface TMessagePeopleMapMapper {
    int countByExample(TMessagePeopleMapExample example);

    int deleteByExample(TMessagePeopleMapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMessagePeopleMap record);

    int insertSelective(TMessagePeopleMap record);

    List<TMessagePeopleMap> selectByExample(TMessagePeopleMapExample example);

    TMessagePeopleMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMessagePeopleMap record, @Param("example") TMessagePeopleMapExample example);

    int updateByExample(@Param("record") TMessagePeopleMap record, @Param("example") TMessagePeopleMapExample example);

    int updateByPrimaryKeySelective(TMessagePeopleMap record);

    int updateByPrimaryKey(TMessagePeopleMap record);
}