package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TPeoplePoststatus;
import sys.spvisor.core.entity.ana.TPeoplePoststatusExample;

public interface TPeoplePoststatusMapper {
    int countByExample(TPeoplePoststatusExample example);

    int deleteByExample(TPeoplePoststatusExample example);

    int deleteByPrimaryKey(Integer postStatusId);

    int insert(TPeoplePoststatus record);

    int insertSelective(TPeoplePoststatus record);

    List<TPeoplePoststatus> selectByExample(TPeoplePoststatusExample example);

    TPeoplePoststatus selectByPrimaryKey(Integer postStatusId);

    int updateByExampleSelective(@Param("record") TPeoplePoststatus record, @Param("example") TPeoplePoststatusExample example);

    int updateByExample(@Param("record") TPeoplePoststatus record, @Param("example") TPeoplePoststatusExample example);

    int updateByPrimaryKeySelective(TPeoplePoststatus record);

    int updateByPrimaryKey(TPeoplePoststatus record);
}