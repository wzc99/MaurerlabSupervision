package sys.spvisor.core.dao.journal;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sys.spvisor.core.entity.journal.TJournal;
import sys.spvisor.core.entity.journal.TJournalExample;

public interface TJournalMapper {
    int countByExample(TJournalExample example);

    int deleteByExample(TJournalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TJournal record);

    int insertSelective(TJournal record);

    List<TJournal> selectByExample(TJournalExample example);

    TJournal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TJournal record, @Param("example") TJournalExample example);

    int updateByExample(@Param("record") TJournal record, @Param("example") TJournalExample example);

    int updateByPrimaryKeySelective(TJournal record);

    int updateByPrimaryKey(TJournal record);
}