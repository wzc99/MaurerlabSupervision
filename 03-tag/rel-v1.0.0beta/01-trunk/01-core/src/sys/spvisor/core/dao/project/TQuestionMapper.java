package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TQuestion;
import sys.spvisor.core.entity.project.TQuestionExample;

public interface TQuestionMapper {
    int countByExample(TQuestionExample example);

    int deleteByExample(TQuestionExample example);

    int deleteByPrimaryKey(Integer qusId);

    int insert(TQuestion record);

    int insertSelective(TQuestion record);

    List<TQuestion> selectByExample(TQuestionExample example);

    TQuestion selectByPrimaryKey(Integer qusId);

    int updateByExampleSelective(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExample(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByPrimaryKeySelective(TQuestion record);

    int updateByPrimaryKey(TQuestion record);
}