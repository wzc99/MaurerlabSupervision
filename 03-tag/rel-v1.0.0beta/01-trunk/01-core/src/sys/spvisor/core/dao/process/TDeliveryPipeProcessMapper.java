package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TDeliveryPipeProcess;
import sys.spvisor.core.entity.process.TDeliveryPipeProcessExample;

public interface TDeliveryPipeProcessMapper {
    int countByExample(TDeliveryPipeProcessExample example);

    int deleteByExample(TDeliveryPipeProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDeliveryPipeProcess record);

    int insertSelective(TDeliveryPipeProcess record);

    List<TDeliveryPipeProcess> selectByExample(TDeliveryPipeProcessExample example);

    TDeliveryPipeProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDeliveryPipeProcess record, @Param("example") TDeliveryPipeProcessExample example);

    int updateByExample(@Param("record") TDeliveryPipeProcess record, @Param("example") TDeliveryPipeProcessExample example);

    int updateByPrimaryKeySelective(TDeliveryPipeProcess record);

    int updateByPrimaryKey(TDeliveryPipeProcess record);
    
    List<TDeliveryPipeProcess> accumulateScheduleByproId(int projectId);
    
    List<TDeliveryPipeProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}