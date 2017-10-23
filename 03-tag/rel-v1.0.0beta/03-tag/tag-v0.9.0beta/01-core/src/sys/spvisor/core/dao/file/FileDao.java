package sys.spvisor.core.dao.file;

import java.util.List;

import org.springframework.stereotype.Component;

import sys.spvisor.core.criteria.file.FileCriteria;
import sys.spvisor.core.dao.IGenericDao;
import sys.spvisor.core.entity.file.FileInfo;

@Component
public interface FileDao extends IGenericDao<FileInfo, Long>{
	
	
	public List<FileInfo>  query(FileCriteria params);
	public List<FileInfo> queryCount(FileCriteria params);

}
