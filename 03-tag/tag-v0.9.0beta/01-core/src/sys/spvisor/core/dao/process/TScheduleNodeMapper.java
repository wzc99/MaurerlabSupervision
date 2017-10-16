package sys.spvisor.core.dao.process;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.process.TScheduleNode;
import sys.spvisor.core.entity.process.TScheduleNodeExample;

public interface TScheduleNodeMapper {
    int countByExample(TScheduleNodeExample example);

    int deleteByExample(TScheduleNodeExample example);

    int deleteByPrimaryKey(Integer nodeId);

    int insert(TScheduleNode record);

    int insertSelective(TScheduleNode record);

    List<TScheduleNode> selectByExample(TScheduleNodeExample example);

    TScheduleNode selectByPrimaryKey(Integer nodeId);

    int updateByExampleSelective(@Param("record") TScheduleNode record, @Param("example") TScheduleNodeExample example);

    int updateByExample(@Param("record") TScheduleNode record, @Param("example") TScheduleNodeExample example);

    int updateByPrimaryKeySelective(TScheduleNode record);

    int updateByPrimaryKey(TScheduleNode record);
}