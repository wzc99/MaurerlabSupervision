package sys.spvisor.console.controller;

import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import sys.spvisor.core.common.BaseController;
import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.journal.JournalModel;
import sys.spvisor.core.entity.journal.TJournal;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.service.journal.JournalService;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.util.Enumerations;
import sys.spvisor.core.util.FileUtils;
import sys.spvisor.core.util.Page;
import sys.spvisor.core.util.ReturnDatas;
import sys.spvisor.core.util.SystemConstants;

@Controller
@RequestMapping("/journal")
public class JournalController extends BaseController {

	@Autowired
	private JournalService journalService;

	@Autowired
	private JournalCreateUtil journalUtil;

	@Autowired
	private TProjectMapper proDao;

	public TJournal initJournal(int type, int handler, int status, String path, int proId, String proName, Date jTime,
			int week, int weekYear, Timestamp first, Timestamp last) {
		TJournal temp = new TJournal();
		temp.setFile(path);
		temp.setType(type);
		temp.setHandler(handler);
		temp.setPid(proId);
		temp.setPname(proName);
		temp.setStatus(status);
		temp.setFirstTime(first);
		temp.setLastTime(last);
		if (type == 0) {
			temp.setjTime(jTime);
		} else {
			temp.setYearInt(weekYear);
			temp.setWeek(week);
		}

		return temp;
	}
	
	/**
	 * 日报周报上传接口
	 * @param file 上传的文件
	 * @param session 
	 * @param req
	 * @param proId 项目ID
	 * @param jType 日志类型 0:日报 1:周报
	 * @param jTime jType为0时有效 年月日类型
	 * @param jYear jType为1时有效 
	 * @param jWeek jType为1时有效 
	 * @param processType 0:第一次上传 1:修改
	 * @param journalId processType为1时有效 为修改的journalID
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/uploadWeekJournal.ajax")
	public ReturnDatas uploadWeekJournal(@RequestParam(value = "file", required = false) MultipartFile file,
			HttpSession session, HttpServletRequest req, @RequestParam("proId") int proId,
			@RequestParam("jType") int jType, @RequestParam("yearDate") int yearDate,@RequestParam("weekDate") int weekDate,@RequestParam("processType") int processType,
			@RequestParam("journalId") int journalId) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			Long userId = (Long) session.getAttribute("USER_ID");
			String filePath = FileUtils.FilesUpload_transferTo_springOutProject(req, file,
					SystemConstants.journaleTempFilesPath);
			TProject project = proDao.selectByPrimaryKey(proId);
			if (processType == 0) {
				journalService.insertJournal(
						initJournal(jType, userId.intValue(), 0, filePath, proId, project.getProjectName(), null,
								weekDate, yearDate, DatetimeUtil.getCurrentTimestamp(), DatetimeUtil.getCurrentTimestamp()));
			} else {
				TJournal temp = new TJournal();
				temp.setId(journalId);
				temp.setFile(filePath);
				temp.setStatus(0);
				temp.setHandler(userId.intValue());
				temp.setLastTime(DatetimeUtil.getCurrentTimestamp());
				journalService.updateJournal(temp, userId.intValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 日报周报上传接口
	 * @param file 上传的文件
	 * @param session 
	 * @param req
	 * @param proId 项目ID
	 * @param jType 日志类型 0:日报 1:周报
	 * @param jTime jType为0时有效 年月日类型
	 * @param jYear jType为1时有效 
	 * @param jWeek jType为1时有效 
	 * @param processType 0:第一次上传 1:修改
	 * @param journalId processType为1时有效 为修改的journalID
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/uploadJournal.ajax")
	public ReturnDatas uploadJournal(@RequestParam(value = "file", required = false) MultipartFile file,
			HttpSession session, HttpServletRequest req, @RequestParam("proId") int proId,
			@RequestParam("jType") int jType, @RequestParam("dailyDate") Date dailyDate,@RequestParam("processType") int processType,
			@RequestParam("journalId") int journalId) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			Long userId = (Long) session.getAttribute("USER_ID");
			String filePath = FileUtils.FilesUpload_transferTo_springOutProject(req, file,
					SystemConstants.journaleTempFilesPath);
			TProject project = proDao.selectByPrimaryKey(proId);
			if (processType == 0) {
				journalService.insertJournal(
						initJournal(jType, userId.intValue(), 0, filePath, proId, project.getProjectName(), dailyDate,
								0, 0, DatetimeUtil.getCurrentTimestamp(), DatetimeUtil.getCurrentTimestamp()));
			} else {
				TJournal temp = new TJournal();
				temp.setId(journalId);
				temp.setFile(filePath);
				temp.setStatus(0);
				temp.setHandler(userId.intValue());
				temp.setLastTime(DatetimeUtil.getCurrentTimestamp());
				journalService.updateJournal(temp, userId.intValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 
	 * @param session
	 * @param req
	 * @param targetDay
	 * @param proId
	 * @param type
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addDailyJournal.ajax")
	public ReturnDatas createDailyJournal(@RequestParam(value = "file", required = false) MultipartFile file[],
			HttpSession session, HttpServletRequest req, JournalModel journalModel,
			@RequestParam("processType") int processType, @RequestParam("journalId") int journalId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			String[] filePath = null;
			if (file != null) {
				filePath = FileUtils.MaxFilesUpload_transferTo_spring(req, file,
						SystemConstants.journaleTempFilesPath + FileUtils.getDataPath() + File.separator + "pic");
			}

			if (journalModel.getPicDescription() != null && filePath != null) {
				journalModel.setPicPath(filePath);
				String[] temp = journalModel.getPicDescription().split("&");
				journalModel.setPicDes(temp);
			} else {
				journalModel.setPicPath(new String[0]);
				journalModel.setPicDes(new String[0]);
			}
			if (journalModel.getPicDes().length != journalModel.getPicPath().length) {
				return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.参数格式错误.getCode(), "参数格式错误");
			}

			journalModel.setPicDescription("");
			journalUtil.createDailyJournal(userId.intValue(), journalModel,
					FileUtils.getServerPath(req, SystemConstants.tempFilesPath), FileUtils.getServerPath(req, ""),
					FileUtils.getServerPath(req, SystemConstants.journalsPath), processType, journalId);
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/listJournal.ajax")
	public ReturnDatas listJournal(HttpSession session, HttpServletRequest req, @RequestParam("proId") int proId,
			@RequestParam("type") int type, @RequestParam("status") int status, @RequestParam("pageSize") int pageSize,
			@RequestParam("index") int index) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			List<TJournal> result = journalService.listJournal(proId, type, status, pageSize, index);
			returnData.setData(result);
			int totalCount = journalService.countJournal(proId, type, status);
			Page page = new Page(index, pageSize, totalCount);
			returnData.setPage(page);
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/addWeeklyJournal.ajax")
	public ReturnDatas createWeeklyJournal(@RequestParam(value = "file", required = false) MultipartFile file[],
			HttpSession session, HttpServletRequest req, JournalModel journalModel,
			@RequestParam("processType") int processType, @RequestParam("journalId") int journalId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			String[] filePath = null;
			if (file != null) {
				filePath = FileUtils.MaxFilesUpload_transferTo_spring(req, file,
						SystemConstants.journaleTempFilesPath + FileUtils.getDataPath() + File.separator + "pic");
			}

			if (journalModel.getPicDescription() != null && filePath != null) {
				journalModel.setPicPath(filePath);
				String[] temp = journalModel.getPicDescription().split("&");
				journalModel.setPicDes(temp);
			} else {
				journalModel.setPicPath(new String[0]);
				journalModel.setPicDes(new String[0]);
			}
			if (journalModel.getPicDes().length != journalModel.getPicPath().length) {
				return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.参数格式错误.getCode(), "参数格式错误");
			}

			journalModel.setPicDescription("");
			journalUtil.createWeeklyJournal(userId.intValue(), journalModel,
					FileUtils.getServerPath(req, SystemConstants.tempFilesPath), FileUtils.getServerPath(req, ""),
					FileUtils.getServerPath(req, SystemConstants.journalsPath), processType, journalId);
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/hasWeeklyJournal.ajax")
	public ReturnDatas hasWeeklyJournal(HttpSession session, HttpServletRequest req, @RequestParam("year") int year,
			@RequestParam("week") int week, @RequestParam("proId") int proId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			boolean result = journalService.hasWeeklyJournal(proId, year, week);
			returnData.setData(result);
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/hasDailyJournal.ajax")
	public ReturnDatas hasDailyJournal(HttpSession session, HttpServletRequest req, @RequestParam("date") Date date,
			@RequestParam("proId") int proId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			boolean result = journalService.hasDailyJournal(proId, DatetimeUtil.utilDate2StringDate(date));
			returnData.setData(result);
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/examineJournal.ajax")
	public ReturnDatas examineJournal(HttpSession session, HttpServletRequest req, @RequestParam("jId") int jId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int result = journalService.examineJournal(jId, userId.intValue());
			if (result != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	@ResponseBody
	@RequestMapping("/getJournalById.ajax")
	public ReturnDatas getJournalById(HttpSession session, HttpServletRequest req, @RequestParam("jId") int jId) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			returnData.setData(journalService.getJournalById(jId));
		} catch (Exception e) {
			e.printStackTrace();
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

}
