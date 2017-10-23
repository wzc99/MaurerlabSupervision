package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TFileCheckProcess;
import sys.spvisor.core.entity.project.TFileCheckProcessExample;

public interface TFileCheckProcessMapper {
    int countByExample(TFileCheckProcessExample example);

    int deleteByExample(TFileCheckProcessExample example);

    int deleteByPrimaryKey(Integer fileCheckProcessId);

    int insert(TFileCheckProcess record);

    int insertSelective(TFileCheckProcess record);

    List<TFileCheckProcess> selectByExample(TFileCheckProcessExample example);

    TFileCheckProcess selectByPrimaryKey(Integer fileCheckProcessId);

    int updateByExampleSelective(@Param("record") TFileCheckProcess record, @Param("example") TFileCheckProcessExample example);

    int updateByExample(@Param("record") TFileCheckProcess record, @Param("example") TFileCheckProcessExample example);

    int updateByPrimaryKeySelective(TFileCheckProcess record);

    int updateByPrimaryKey(TFileCheckProcess record);
}