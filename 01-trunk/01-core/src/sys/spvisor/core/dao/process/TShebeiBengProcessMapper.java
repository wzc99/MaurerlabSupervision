package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TJueyuanjietouProcess;
import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiBengProcessExample;

public interface TShebeiBengProcessMapper {
    int countByExample(TShebeiBengProcessExample example);

    int deleteByExample(TShebeiBengProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TShebeiBengProcess record);

    int insertSelective(TShebeiBengProcess record);

    List<TShebeiBengProcess> selectByExample(TShebeiBengProcessExample example);

    TShebeiBengProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TShebeiBengProcess record, @Param("example") TShebeiBengProcessExample example);

    int updateByExample(@Param("record") TShebeiBengProcess record, @Param("example") TShebeiBengProcessExample example);

    int updateByPrimaryKeySelective(TShebeiBengProcess record);

    int updateByPrimaryKey(TShebeiBengProcess record);
    
    List<TShebeiBengProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TShebeiBengProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}