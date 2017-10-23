package sys.spvisor.core.dao.examine;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.examine.TExamineExample;

public interface TExamineMapper {
    int countByExample(TExamineExample example);

    int deleteByExample(TExamineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExamine record);

    int insertSelective(TExamine record);

    List<TExamine> selectByExample(TExamineExample example);

    TExamine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExamine record, @Param("example") TExamineExample example);

    int updateByExample(@Param("record") TExamine record, @Param("example") TExamineExample example);

    int updateByPrimaryKeySelective(TExamine record);

    int updateByPrimaryKey(TExamine record);
    
    int insertAndReturnId(TExamine record);
    
    
}