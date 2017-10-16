package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TQuestionFileForm;
import sys.spvisor.core.entity.project.TQuestionFileFormExample;

public interface TQuestionFileFormMapper {
    int countByExample(TQuestionFileFormExample example);

    int deleteByExample(TQuestionFileFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQuestionFileForm record);

    int insertSelective(TQuestionFileForm record);

    List<TQuestionFileForm> selectByExample(TQuestionFileFormExample example);

    TQuestionFileForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQuestionFileForm record, @Param("example") TQuestionFileFormExample example);

    int updateByExample(@Param("record") TQuestionFileForm record, @Param("example") TQuestionFileFormExample example);

    int updateByPrimaryKeySelective(TQuestionFileForm record);

    int updateByPrimaryKey(TQuestionFileForm record);
}