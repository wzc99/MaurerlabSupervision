package sys.spvisor.core.dao.project;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.project.TGoodsListsExample;

public interface TGoodsListsMapper {
    int countByExample(TGoodsListsExample example);

    int deleteByExample(TGoodsListsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodsLists record);

    int insertSelective(TGoodsLists record);

    List<TGoodsLists> selectByExample(TGoodsListsExample example);

    TGoodsLists selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGoodsLists record, @Param("example") TGoodsListsExample example);

    int updateByExample(@Param("record") TGoodsLists record, @Param("example") TGoodsListsExample example);

    int updateByPrimaryKeySelective(TGoodsLists record);

    int updateByPrimaryKey(TGoodsLists record);
}