package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TSendCard;
import sys.spvisor.core.entity.project.TSendCardExample;

public interface TSendCardMapper {
    int countByExample(TSendCardExample example);

    int deleteByExample(TSendCardExample example);

    int deleteByPrimaryKey(Integer tSendId);

    int insert(TSendCard record);

    int insertSelective(TSendCard record);

    List<TSendCard> selectByExample(TSendCardExample example);

    TSendCard selectByPrimaryKey(Integer tSendId);

    int updateByExampleSelective(@Param("record") TSendCard record, @Param("example") TSendCardExample example);

    int updateByExample(@Param("record") TSendCard record, @Param("example") TSendCardExample example);

    int updateByPrimaryKeySelective(TSendCard record);

    int updateByPrimaryKey(TSendCard record);
}