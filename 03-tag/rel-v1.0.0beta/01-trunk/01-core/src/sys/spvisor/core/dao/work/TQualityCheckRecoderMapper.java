package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TQualityCheckRecoder;
import sys.spvisor.core.entity.work.TQualityCheckRecoderExample;

public interface TQualityCheckRecoderMapper {
    int countByExample(TQualityCheckRecoderExample example);

    int deleteByExample(TQualityCheckRecoderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQualityCheckRecoder record);

    int insertSelective(TQualityCheckRecoder record);

    List<TQualityCheckRecoder> selectByExample(TQualityCheckRecoderExample example);

    TQualityCheckRecoder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQualityCheckRecoder record, @Param("example") TQualityCheckRecoderExample example);

    int updateByExample(@Param("record") TQualityCheckRecoder record, @Param("example") TQualityCheckRecoderExample example);

    int updateByPrimaryKeySelective(TQualityCheckRecoder record);

    int updateByPrimaryKey(TQualityCheckRecoder record);
}