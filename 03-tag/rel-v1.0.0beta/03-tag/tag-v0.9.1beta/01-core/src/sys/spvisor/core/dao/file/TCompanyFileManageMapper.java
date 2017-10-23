package sys.spvisor.core.dao.file;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.file.TCompanyFileManage;
import sys.spvisor.core.entity.file.TCompanyFileManageExample;

public interface TCompanyFileManageMapper {
    int countByExample(TCompanyFileManageExample example);

    int deleteByExample(TCompanyFileManageExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(TCompanyFileManage record);

    int insertSelective(TCompanyFileManage record);

    List<TCompanyFileManage> selectByExample(TCompanyFileManageExample example);

    TCompanyFileManage selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") TCompanyFileManage record, @Param("example") TCompanyFileManageExample example);

    int updateByExample(@Param("record") TCompanyFileManage record, @Param("example") TCompanyFileManageExample example);

    int updateByPrimaryKeySelective(TCompanyFileManage record);

    int updateByPrimaryKey(TCompanyFileManage record);
}