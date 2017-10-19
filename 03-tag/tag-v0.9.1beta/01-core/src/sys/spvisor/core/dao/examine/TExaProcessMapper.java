package sys.spvisor.core.dao.examine;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.examine.TExaProcess;
import sys.spvisor.core.entity.examine.TExaProcessExample;

public interface TExaProcessMapper {
    int countByExample(TExaProcessExample example);

    int deleteByExample(TExaProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExaProcess record);

    int insertSelective(TExaProcess record);

    List<TExaProcess> selectByExample(TExaProcessExample example);

    TExaProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExaProcess record, @Param("example") TExaProcessExample example);

    int updateByExample(@Param("record") TExaProcess record, @Param("example") TExaProcessExample example);

    int updateByPrimaryKeySelective(TExaProcess record);

    int updateByPrimaryKey(TExaProcess record);
}