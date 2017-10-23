package sys.spvisor.core.dao.attendance;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.attendance.TAttendance;
import sys.spvisor.core.entity.attendance.TAttendanceExample;

public interface TAttendanceMapper {
    int countByExample(TAttendanceExample example);

    int deleteByExample(TAttendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAttendance record);

    int insertSelective(TAttendance record);

    List<TAttendance> selectByExample(TAttendanceExample example);

    TAttendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAttendance record, @Param("example") TAttendanceExample example);

    int updateByExample(@Param("record") TAttendance record, @Param("example") TAttendanceExample example);

    int updateByPrimaryKeySelective(TAttendance record);

    int updateByPrimaryKey(TAttendance record);
}