package sys.spvisor.core.service.ana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserExample;

@Service
public class TestService {
	
	@Autowired
	TUserMapper mapper;
	
	@Transactional
	public  List<TUser> queryByExample() {
		TUserExample example = new TUserExample();
		example.or().andUserNameLike("管理");
		List<TUser> user = mapper.selectByExample(example);
		return user;
	}

}
