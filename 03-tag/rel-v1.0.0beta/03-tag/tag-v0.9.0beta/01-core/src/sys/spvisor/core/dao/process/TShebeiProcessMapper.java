package sys.spvisor.core.dao.process;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.entity.process.TShebeiBengProcess;
import sys.spvisor.core.entity.process.TShebeiProcess;
import sys.spvisor.core.entity.process.TShebeiProcessExample;

public interface TShebeiProcessMapper {
    int countByExample(TShebeiProcessExample example);

    int deleteByExample(TShebeiProcessExample example);

    int deleteByPrimaryKey(Integer shebeiId);

    int insert(TShebeiProcess record);

    int insertSelective(TShebeiProcess record);

    List<TShebeiProcess> selectByExample(TShebeiProcessExample example);

    TShebeiProcess selectByPrimaryKey(Integer shebeiId);

    int updateByExampleSelective(@Param("record") TShebeiProcess record, @Param("example") TShebeiProcessExample example);

    int updateByExample(@Param("record") TShebeiProcess record, @Param("example") TShebeiProcessExample example);

    int updateByPrimaryKeySelective(TShebeiProcess record);

    int updateByPrimaryKey(TShebeiProcess record);
    
    List<TShebeiProcess> accumulateScheduleByproId(Integer projectId);
    
    List<TShebeiProcess> weeklyScheduleByproId(@Param("projectId")int projectId,@Param("d0")Date d0,@Param("d1")Date d1);
}