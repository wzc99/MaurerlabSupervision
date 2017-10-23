package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TFangfuProcess;
import sys.spvisor.core.entity.process.TFangfuProcessExample;

public interface TFangfuProcessMapper {
    int countByExample(TFangfuProcessExample example);

    int deleteByExample(TFangfuProcessExample example);

    int deleteByPrimaryKey(Integer fangfuId);

    int insert(TFangfuProcess record);

    int insertSelective(TFangfuProcess record);

    List<TFangfuProcess> selectByExample(TFangfuProcessExample example);

    TFangfuProcess selectByPrimaryKey(Integer fangfuId);

    int updateByExampleSelective(@Param("record") TFangfuProcess record, @Param("example") TFangfuProcessExample example);

    int updateByExample(@Param("record") TFangfuProcess record, @Param("example") TFangfuProcessExample example);

    int updateByPrimaryKeySelective(TFangfuProcess record);

    int updateByPrimaryKey(TFangfuProcess record);
    
    List<TFangfuProcess> accumulateScheduleByproId(int projectId);
    
    List<TFangfuProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}