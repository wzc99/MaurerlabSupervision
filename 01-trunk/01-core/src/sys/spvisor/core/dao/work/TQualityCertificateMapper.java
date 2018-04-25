package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TQualityCertificate;
import sys.spvisor.core.entity.work.TQualityCertificateExample;

public interface TQualityCertificateMapper {
    int countByExample(TQualityCertificateExample example);

    int deleteByExample(TQualityCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQualityCertificate record);

    int insertSelective(TQualityCertificate record);

    List<TQualityCertificate> selectByExample(TQualityCertificateExample example);

    TQualityCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQualityCertificate record, @Param("example") TQualityCertificateExample example);

    int updateByExample(@Param("record") TQualityCertificate record, @Param("example") TQualityCertificateExample example);

    int updateByPrimaryKeySelective(TQualityCertificate record);

    int updateByPrimaryKey(TQualityCertificate record);
}