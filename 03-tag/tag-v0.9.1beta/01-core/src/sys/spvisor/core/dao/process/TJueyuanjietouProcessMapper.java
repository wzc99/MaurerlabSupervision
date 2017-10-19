package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TGuanjianProcess;
import sys.spvisor.core.entity.process.TJueyuanjietouProcess;
import sys.spvisor.core.entity.process.TJueyuanjietouProcessExample;

public interface TJueyuanjietouProcessMapper {
    int countByExample(TJueyuanjietouProcessExample example);

    int deleteByExample(TJueyuanjietouProcessExample example);

    int deleteByPrimaryKey(Integer jueyuanId);

    int insert(TJueyuanjietouProcess record);

    int insertSelective(TJueyuanjietouProcess record);

    List<TJueyuanjietouProcess> selectByExample(TJueyuanjietouProcessExample example);

    TJueyuanjietouProcess selectByPrimaryKey(Integer jueyuanId);

    int updateByExampleSelective(@Param("record") TJueyuanjietouProcess record, @Param("example") TJueyuanjietouProcessExample example);

    int updateByExample(@Param("record") TJueyuanjietouProcess record, @Param("example") TJueyuanjietouProcessExample example);

    int updateByPrimaryKeySelective(TJueyuanjietouProcess record);

    int updateByPrimaryKey(TJueyuanjietouProcess record);
    
    List<TJueyuanjietouProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TJueyuanjietouProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}