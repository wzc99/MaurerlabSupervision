package sys.spvisor.core.dao.examine;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.journal.TJournal;

@Component
public class ExamineDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public SqlSessionTemplate getSqlSession(){
		return sqlSession;
	}
	
	public int insertAndReturnId(TExamine examine){
		 getSqlSession().insert("sys.spvisor.core.dao.examine.TExamineMapper.insert", examine);
		 return examine.getId();
	}
	
//	public int insertAndReturnId(TJournal journal){
//		 getSqlSession().insert("sys.spvisor.core.dao.journal.TJournalMapper.insert", journal);
//		 return journal.getId();
//	}
}
