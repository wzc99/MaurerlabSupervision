package sys.spvisor.core.dao.ana;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.ana.TUserCase;
import sys.spvisor.core.entity.ana.TUserCaseExample;

public interface TUserCaseMapper {
    int countByExample(TUserCaseExample example);

    int deleteByExample(TUserCaseExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TUserCase record);

    int insertSelective(TUserCase record);

    List<TUserCase> selectByExample(TUserCaseExample example);

    TUserCase selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TUserCase record, @Param("example") TUserCaseExample example);

    int updateByExample(@Param("record") TUserCase record, @Param("example") TUserCaseExample example);

    int updateByPrimaryKeySelective(TUserCase record);

    int updateByPrimaryKey(TUserCase record);
}