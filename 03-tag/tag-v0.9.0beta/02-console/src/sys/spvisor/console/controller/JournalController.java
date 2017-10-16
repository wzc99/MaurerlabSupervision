package sys.spvisor.console.controller;

import java.sql.Date;
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
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.entity.journal.JournalModel;
import sys.spvisor.core.entity.journal.TJournal;
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
				filePath = FileUtils.MaxFilesUpload_transferTo_spring(req, file, SystemConstants.tempJournalPicPath);
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
				filePath = FileUtils.MaxFilesUpload_transferTo_spring(req, file, SystemConstants.tempJournalPicPath);
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
