package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiProcess;
import sys.spvisor.core.entity.process.TShiyouProcess;
import sys.spvisor.core.entity.process.TShiyouProcessExample;

public interface TShiyouProcessMapper {
    int countByExample(TShiyouProcessExample example);

    int deleteByExample(TShiyouProcessExample example);

    int deleteByPrimaryKey(Integer shiyouId);

    int insert(TShiyouProcess record);

    int insertSelective(TShiyouProcess record);

    List<TShiyouProcess> selectByExample(TShiyouProcessExample example);

    TShiyouProcess selectByPrimaryKey(Integer shiyouId);

    int updateByExampleSelective(@Param("record") TShiyouProcess record, @Param("example") TShiyouProcessExample example);

    int updateByExample(@Param("record") TShiyouProcess record, @Param("example") TShiyouProcessExample example);

    int updateByPrimaryKeySelective(TShiyouProcess record);

    int updateByPrimaryKey(TShiyouProcess record);
    
    List<TShiyouProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TShiyouProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}