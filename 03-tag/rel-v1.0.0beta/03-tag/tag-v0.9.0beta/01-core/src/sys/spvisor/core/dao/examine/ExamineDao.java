package sys.spvisor.core.dao.examine;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sys.spvisor.core.entity.examine.TExamine;

@Component
public class ExamineDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public SqlSessionTemplate getSqlSession(){
		return sqlSession;
	}
	
	public int insertAndReturnId(TExamine examine){
		 getSqlSession().insert("sys.spvisor.core.dao.examine.TExamineMapper.insertAndReturnId", examine);
		 return examine.getId();
	}
}
