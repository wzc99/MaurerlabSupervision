package sys.spvisor.core.service.journal;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.journal.TJournalMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.attendance.TAttendance;
import sys.spvisor.core.entity.examine.ExamineInit;
import sys.spvisor.core.entity.journal.TJournal;
import sys.spvisor.core.entity.journal.TJournalExample;
import sys.spvisor.core.entity.journal.TJournalExample.Criteria;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.service.examine.ExamineService;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.util.Enumerations;

@Service
public class JournalService {
	@Autowired
	private TJournalMapper dao;

	@Autowired
	private UserService userService;

	@Autowired
	private ExamineService exaService;

	public int countJournal(int proId, int type, int status) {
		TJournalExample example = new TJournalExample();
		Criteria criteria = example.createCriteria();
		if (proId != 0) {
			criteria.andPidEqualTo(proId);
		}
		if (type != -1) {
			criteria.andTypeEqualTo(type);
		}
		if (status != -1) {
			criteria.andStatusEqualTo(status);
		}
		return dao.countByExample(example);

	}

	public TJournal getJournalById(int id) {
		return dao.selectByPrimaryKey(id);
	}

	@Transactional
	public int examineJournal(int jId, int submitId) throws Exception {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		TJournal ta = dao.selectByPrimaryKey(jId);
		if (ta.getStatus() != 0) {
			return result;
		}
		ExamineInit init = new ExamineInit();
		init.setSubmitId(submitId);
		init.setExaType(10);
		init.setExaTitle("日志文件审核");
		init.setExaContent(ta.getPname() + (ta.getType() == 0 ? "日报" + DatetimeUtil.date2StringDate(ta.getjTime())
				: "周报" + ta.getYearInt() + "年 第" + ta.getWeek() + "周"));
		init.setExaFileFlag(1);
		init.setExaFilePath(ta.getFile());
		init.setIsProType(1);
		init.setExaLinkId(jId);
		result = exaService.insertExamine(init);
		if (result == Enumerations.ServiceReturnCode.操作成功.getCode()) {
			ta = new TJournal();
			ta.setId(jId);
			ta.setStatus(1);
			dao.updateByPrimaryKeySelective(ta);
		}
		return result;

	}

	@Transactional
	public void insertJournal(TJournal journal) {
		dao.insert(journal);
	}

	@Transactional
	public void updateJournal(TJournal journal, int submitId) throws Exception {
		TJournal temp = dao.selectByPrimaryKey(journal.getId());
		if (temp.getStatus() == 0 || temp.getStatus() == 4) {
			dao.updateByPrimaryKeySelective(journal);
			examineJournal(journal.getId(), submitId);
		}
	}

	public void updateStatus(int id, int toStatus) {
		TJournal temp = dao.selectByPrimaryKey(id);
		if (toStatus == 1 || toStatus == 2) {
			if (temp.getStatus() == 1) {
				temp = new TJournal();
				temp.setId(id);
				temp.setStatus(toStatus + 1);
				dao.updateByPrimaryKeySelective(temp);
			}
		} else if (toStatus == 3) {
			if (temp.getStatus() == 1 || temp.getStatus() == 3) {
				temp = new TJournal();
				temp.setId(id);
				temp.setStatus(toStatus + 1);
				dao.updateByPrimaryKeySelective(temp);
			}
		}
	}

	@Transactional
	public boolean hasDailyJournal(int proId, String date) throws ParseException {
		boolean result = false;
		TJournalExample example = new TJournalExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(proId);
		criteria.andJTimeEqualTo(DatetimeUtil.string2Date(date));
		criteria.andTypeEqualTo(0);
		if (dao.countByExample(example) > 0) {
			result = true;
		}
		return result;
	}

	@Transactional
	public boolean hasWeeklyJournal(int proId, int year, int week) throws ParseException {
		boolean result = false;
		TJournalExample example = new TJournalExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(proId);
		criteria.andYearIntEqualTo(year);
		criteria.andWeekEqualTo(week);
		criteria.andTypeEqualTo(1);
		if (dao.countByExample(example) > 0) {
			result = true;
		}
		return result;
	}

	@Transactional
	public List<TJournal> listJournal(int proId, int type, int status, int limit, int index) {
		List<TJournal> result = null;
		TJournalExample example = new TJournalExample();
		Criteria criteria = example.createCriteria();
		if (proId != 0) {
			criteria.andPidEqualTo(proId);
		}
		if (type != -1) {
			criteria.andTypeEqualTo(type);
		}
		if (status != -1) {
			criteria.andStatusEqualTo(status);
		}

		example.setOrderByClause("id desc");
		if (limit != -1 && index != -1) {
			example.setLimit(limit);
			example.setOffset((index - 1) * limit);
		}
		result = dao.selectByExample(example);
		for (TJournal temp : result) {
			temp.setHandlerName(userService.getUserById(temp.getHandler().longValue()).getUserName());
		}
		return result;
	}

}
