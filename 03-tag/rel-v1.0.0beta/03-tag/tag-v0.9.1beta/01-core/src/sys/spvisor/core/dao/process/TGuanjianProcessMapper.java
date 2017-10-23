package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TFangfuProcess;
import sys.spvisor.core.entity.process.TGuanjianProcess;
import sys.spvisor.core.entity.process.TGuanjianProcessExample;

public interface TGuanjianProcessMapper {
    int countByExample(TGuanjianProcessExample example);

    int deleteByExample(TGuanjianProcessExample example);

    int deleteByPrimaryKey(Integer guanjianId);

    int insert(TGuanjianProcess record);

    int insertSelective(TGuanjianProcess record);

    List<TGuanjianProcess> selectByExample(TGuanjianProcessExample example);

    TGuanjianProcess selectByPrimaryKey(Integer guanjianId);

    int updateByExampleSelective(@Param("record") TGuanjianProcess record, @Param("example") TGuanjianProcessExample example);

    int updateByExample(@Param("record") TGuanjianProcess record, @Param("example") TGuanjianProcessExample example);

    int updateByPrimaryKeySelective(TGuanjianProcess record);

    int updateByPrimaryKey(TGuanjianProcess record);
    
    List<TGuanjianProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TGuanjianProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}