package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TValveProcess;
import sys.spvisor.core.entity.process.TWanguanProcess;
import sys.spvisor.core.entity.process.TWanguanProcessExample;

public interface TWanguanProcessMapper {
    int countByExample(TWanguanProcessExample example);

    int deleteByExample(TWanguanProcessExample example);

    int deleteByPrimaryKey(Integer wanguanId);

    int insert(TWanguanProcess record);

    int insertSelective(TWanguanProcess record);

    List<TWanguanProcess> selectByExample(TWanguanProcessExample example);

    TWanguanProcess selectByPrimaryKey(Integer wanguanId);

    int updateByExampleSelective(@Param("record") TWanguanProcess record, @Param("example") TWanguanProcessExample example);

    int updateByExample(@Param("record") TWanguanProcess record, @Param("example") TWanguanProcessExample example);

    int updateByPrimaryKeySelective(TWanguanProcess record);

    int updateByPrimaryKey(TWanguanProcess record);
    
    List<TWanguanProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TWanguanProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}