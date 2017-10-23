package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TQualityFileRecoder;
import sys.spvisor.core.entity.work.TQualityFileRecoderExample;

public interface TQualityFileRecoderMapper {
    int countByExample(TQualityFileRecoderExample example);

    int deleteByExample(TQualityFileRecoderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQualityFileRecoder record);

    int insertSelective(TQualityFileRecoder record);

    List<TQualityFileRecoder> selectByExample(TQualityFileRecoderExample example);

    TQualityFileRecoder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQualityFileRecoder record, @Param("example") TQualityFileRecoderExample example);

    int updateByExample(@Param("record") TQualityFileRecoder record, @Param("example") TQualityFileRecoderExample example);

    int updateByPrimaryKeySelective(TQualityFileRecoder record);

    int updateByPrimaryKey(TQualityFileRecoder record);
}