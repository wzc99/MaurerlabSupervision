package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TFileFormExample;

public interface TFileFormMapper {
    int countByExample(TFileFormExample example);

    int deleteByExample(TFileFormExample example);

    int deleteByPrimaryKey(Integer fileFormId);

    int insert(TFileForm record);

    int insertSelective(TFileForm record);

    List<TFileForm> selectByExample(TFileFormExample example);

    TFileForm selectByPrimaryKey(Integer fileFormId);

    int updateByExampleSelective(@Param("record") TFileForm record, @Param("example") TFileFormExample example);

    int updateByExample(@Param("record") TFileForm record, @Param("example") TFileFormExample example);

    int updateByPrimaryKeySelective(TFileForm record);

    int updateByPrimaryKey(TFileForm record);
}