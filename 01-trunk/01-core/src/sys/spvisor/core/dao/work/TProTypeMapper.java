package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TProType;
import sys.spvisor.core.entity.work.TProTypeExample;

public interface TProTypeMapper {
    int countByExample(TProTypeExample example);

    int deleteByExample(TProTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProType record);

    int insertSelective(TProType record);

    List<TProType> selectByExample(TProTypeExample example);

    TProType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProType record, @Param("example") TProTypeExample example);

    int updateByExample(@Param("record") TProType record, @Param("example") TProTypeExample example);

    int updateByPrimaryKeySelective(TProType record);

    int updateByPrimaryKey(TProType record);
}