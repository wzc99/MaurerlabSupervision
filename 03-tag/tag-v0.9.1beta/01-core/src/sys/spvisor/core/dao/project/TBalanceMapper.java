package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TBalance;
import sys.spvisor.core.entity.project.TBalanceExample;

public interface TBalanceMapper {
    int countByExample(TBalanceExample example);

    int deleteByExample(TBalanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBalance record);

    int insertSelective(TBalance record);

    List<TBalance> selectByExample(TBalanceExample example);

    TBalance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBalance record, @Param("example") TBalanceExample example);

    int updateByExample(@Param("record") TBalance record, @Param("example") TBalanceExample example);

    int updateByPrimaryKeySelective(TBalance record);

    int updateByPrimaryKey(TBalance record);
}