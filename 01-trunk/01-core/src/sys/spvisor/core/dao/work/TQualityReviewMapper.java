package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TQualityReview;
import sys.spvisor.core.entity.work.TQualityReviewExample;

public interface TQualityReviewMapper {
    int countByExample(TQualityReviewExample example);

    int deleteByExample(TQualityReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQualityReview record);

    int insertSelective(TQualityReview record);

    List<TQualityReview> selectByExample(TQualityReviewExample example);

    TQualityReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQualityReview record, @Param("example") TQualityReviewExample example);

    int updateByExample(@Param("record") TQualityReview record, @Param("example") TQualityReviewExample example);

    int updateByPrimaryKeySelective(TQualityReview record);

    int updateByPrimaryKey(TQualityReview record);
}