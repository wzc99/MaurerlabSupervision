package sys.spvisor.core.dao.work;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;
import sys.spvisor.core.entity.work.TQualityPeopleRecoderExample;

public interface TQualityPeopleRecoderMapper {
    int countByExample(TQualityPeopleRecoderExample example);

    int deleteByExample(TQualityPeopleRecoderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQualityPeopleRecoder record);

    int insertSelective(TQualityPeopleRecoder record);

    List<TQualityPeopleRecoder> selectByExample(TQualityPeopleRecoderExample example);

    TQualityPeopleRecoder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQualityPeopleRecoder record, @Param("example") TQualityPeopleRecoderExample example);

    int updateByExample(@Param("record") TQualityPeopleRecoder record, @Param("example") TQualityPeopleRecoderExample example);

    int updateByPrimaryKeySelective(TQualityPeopleRecoder record);

    int updateByPrimaryKey(TQualityPeopleRecoder record);
}