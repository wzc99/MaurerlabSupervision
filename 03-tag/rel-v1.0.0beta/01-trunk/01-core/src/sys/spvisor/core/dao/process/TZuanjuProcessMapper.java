package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TWanguanProcess;
import sys.spvisor.core.entity.process.TZuanjuProcess;
import sys.spvisor.core.entity.process.TZuanjuProcessExample;

public interface TZuanjuProcessMapper {
    int countByExample(TZuanjuProcessExample example);

    int deleteByExample(TZuanjuProcessExample example);

    int deleteByPrimaryKey(Integer zuanjuId);

    int insert(TZuanjuProcess record);

    int insertSelective(TZuanjuProcess record);

    List<TZuanjuProcess> selectByExample(TZuanjuProcessExample example);

    TZuanjuProcess selectByPrimaryKey(Integer zuanjuId);

    int updateByExampleSelective(@Param("record") TZuanjuProcess record, @Param("example") TZuanjuProcessExample example);

    int updateByExample(@Param("record") TZuanjuProcess record, @Param("example") TZuanjuProcessExample example);

    int updateByPrimaryKeySelective(TZuanjuProcess record);

    int updateByPrimaryKey(TZuanjuProcess record);
    
    List<TZuanjuProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TZuanjuProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}