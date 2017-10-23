package sys.spvisor.core.dao.message;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.message.TMessage;
import sys.spvisor.core.entity.message.TMessageExample;

public interface TMessageMapper {
    int countByExample(TMessageExample example);

    int deleteByExample(TMessageExample example);

    int deleteByPrimaryKey(Integer msgId);

    int insert(TMessage record);

    int insertSelective(TMessage record);

    List<TMessage> selectByExample(TMessageExample example);

    TMessage selectByPrimaryKey(Integer msgId);

    int updateByExampleSelective(@Param("record") TMessage record, @Param("example") TMessageExample example);

    int updateByExample(@Param("record") TMessage record, @Param("example") TMessageExample example);

    int updateByPrimaryKeySelective(TMessage record);

    int updateByPrimaryKey(TMessage record);
}