package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.criteria.project.ProjectCriteria;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.project.TProjectExample;

public interface TProjectMapper {
    int countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(Integer proId);

    int insert(TProject record);

    int insertSelective(TProject record);

    List<TProject> selectByExample(TProjectExample example);

    TProject selectByPrimaryKey(Integer proId);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);
    
    List<TProject> getSearchProjects(ProjectCriteria params);
    
    List<TProject> getSearchCount(ProjectCriteria params);
}