package sys.spvisor.core.dao.people;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import sys.spvisor.core.criteria.people.PeopleCriteria;
import sys.spvisor.core.dao.IGenericDao;
import sys.spvisor.core.entity.people.PeopleToday;

public interface PeopleDao extends IGenericDao<PeopleToday, Long> {
	
	
	public List<PeopleToday>  getAllPeople();
	public List<PeopleToday>  queryAllUserByCondition(PeopleCriteria params);
	public List<PeopleToday> queryAllUserByConditionCount(PeopleCriteria params);
}
