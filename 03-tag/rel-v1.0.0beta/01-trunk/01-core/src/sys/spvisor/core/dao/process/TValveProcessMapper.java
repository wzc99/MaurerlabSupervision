package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TShiyouProcess;
import sys.spvisor.core.entity.process.TValveProcess;
import sys.spvisor.core.entity.process.TValveProcessExample;

public interface TValveProcessMapper {
    int countByExample(TValveProcessExample example);

    int deleteByExample(TValveProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TValveProcess record);

    int insertSelective(TValveProcess record);

    List<TValveProcess> selectByExample(TValveProcessExample example);

    TValveProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TValveProcess record, @Param("example") TValveProcessExample example);

    int updateByExample(@Param("record") TValveProcess record, @Param("example") TValveProcessExample example);

    int updateByPrimaryKeySelective(TValveProcess record);

    int updateByPrimaryKey(TValveProcess record);
    
    List<TValveProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TValveProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}