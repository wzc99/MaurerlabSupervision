package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TProductTypeMapping;
import sys.spvisor.core.entity.work.TProductTypeMappingExample;
import sys.spvisor.core.result.work.CriteriaType;
import sys.spvisor.core.result.work.TypeIdResult;
import sys.spvisor.core.result.work.TypeResult;

public interface TProductTypeMappingMapper {
    int countByExample(TProductTypeMappingExample example);

    int deleteByExample(TProductTypeMappingExample example);

    int deleteByPrimaryKey(Integer typeMappingId);

    int insert(TProductTypeMapping record);

    int insertSelective(TProductTypeMapping record);

    List<TProductTypeMapping> selectByExample(TProductTypeMappingExample example);

    TProductTypeMapping selectByPrimaryKey(Integer typeMappingId);

    int updateByExampleSelective(@Param("record") TProductTypeMapping record, @Param("example") TProductTypeMappingExample example);

    int updateByExample(@Param("record") TProductTypeMapping record, @Param("example") TProductTypeMappingExample example);

    int updateByPrimaryKeySelective(TProductTypeMapping record);

    int updateByPrimaryKey(TProductTypeMapping record);
    
    List<TypeResult> getLevelOneName();
    
    List<TypeResult> getLevelTwoName(String bigTypeName);
    
    List<TypeIdResult> getLevelOneId(@Param("bigTypeName")String bigTypeName);
    
    List<TypeIdResult> getLevelTwoId (@Param("bigTypeName")String bigTypeName);
    
    List<TypeIdResult> getLevelThreeId(CriteriaType type);
}