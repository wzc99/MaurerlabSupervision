package sys.spvisor.core.dao.process;

import java.util.List;

import sys.spvisor.core.criteria.project.ProcessCriteria;

public interface ProcessCriteriaMapper {
	
    public List<ProcessCriteria> getSearchProcess(ProcessCriteria params);
    
    public int getSearchCount(ProcessCriteria params);

}
