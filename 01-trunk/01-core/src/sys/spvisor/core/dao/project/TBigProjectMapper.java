package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TBigProject;
import sys.spvisor.core.entity.project.TBigProjectExample;

public interface TBigProjectMapper {
    int countByExample(TBigProjectExample example);

    int deleteByExample(TBigProjectExample example);

    int deleteByPrimaryKey(Integer bigProjectId);

    int insert(TBigProject record);

    int insertSelective(TBigProject record);

    List<TBigProject> selectByExample(TBigProjectExample example);

    TBigProject selectByPrimaryKey(Integer bigProjectId);

    int updateByExampleSelective(@Param("record") TBigProject record, @Param("example") TBigProjectExample example);

    int updateByExample(@Param("record") TBigProject record, @Param("example") TBigProjectExample example);

    int updateByPrimaryKeySelective(TBigProject record);

    int updateByPrimaryKey(TBigProject record);
}