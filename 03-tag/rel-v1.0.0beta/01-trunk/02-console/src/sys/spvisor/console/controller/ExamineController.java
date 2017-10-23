package sys.spvisor.console.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.common.BaseController;
import sys.spvisor.core.entity.examine.TExamine;
import sys.spvisor.core.service.examine.ExamineService;
import sys.spvisor.core.util.Enumerations;
import sys.spvisor.core.util.Page;
import sys.spvisor.core.util.ReturnDatas;

@Controller
@RequestMapping("/examine")
public class ExamineController extends BaseController {
	@Autowired
	private ExamineService exaService;

	/**
	 * 获取审核的相关条目数量
	 * 
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getExamineCount.ajax")
	public ReturnDatas getExamineCount(HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int myExaCount = exaService.getMyExamineCount(userId.intValue(), 4);
			int exaByMeCount = exaService.getExamineByMeCount(userId.intValue());
			int exaByMeRecordCount = exaService.getExamineByMeRecordCount(userId.intValue(), 3);
			HashMap<String, Integer> result = new HashMap<>();
			result.put("myExaCount", myExaCount);
			result.put("exaByMeCount", exaByMeCount);
			result.put("exaByMeRecordCount", exaByMeRecordCount);
			returnData.setData(result);

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 根据审核Id获取审核条目
	 * 
	 * @param exaId
	 *            审核Id
	 * @param session
	 * @param req
	 * @return ReturnDatas
	 */
	@ResponseBody
	@RequestMapping("/getExamineById.ajax")
	public ReturnDatas getExamineById(@Param("exaId") int exaId, HttpSession session, HttpServletRequest req) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		TExamine result = exaService.getExamineById(exaId);
		if (result == null) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.安全验证不合法.getCode(), "安全验证不合法");
		} else {
			returnData.setData(result);
		}

		return returnData;
	}

	/**
	 * 获取我提交的审核列表
	 * 
	 * @param status
	 * @param pageSize
	 * @param index
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getMyExamineList.ajax")
	public ReturnDatas getMyExamineList(@Param("exaStatus") int status, @Param("pageSize") int pageSize,
			@Param("index") int index, HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			List<TExamine> result = exaService.getMyExamineList(userId.intValue(), status, pageSize, index);
			returnData.setData(result);
			int totalCount = exaService.getMyExamineCount(userId.intValue(), status);
			Page page = new Page(index, pageSize, totalCount);
			returnData.setPage(page);

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 获取由我审核的列表
	 * 
	 * @param pageSize
	 * @param index
	 * @param session
	 * @param req
	 * @return
	 */

	@ResponseBody
	@RequestMapping("/getExamineByMeList.ajax")
	public ReturnDatas getExamineByMeList(@Param("pageSize") int pageSize, @Param("index") int index,
			HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			List<HashMap<String, Object>> result = exaService.getExamineByMeList(userId.intValue(), pageSize, index);
			returnData.setData(result);
			int totalCount = exaService.getExamineByMeCount(userId.intValue());
			Page page = new Page(index, pageSize, totalCount);
			returnData.setPage(page);
		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 获取由我审核中的记录详情
	 * 
	 * @param processId
	 *            流程中的Id
	 * @param type
	 *            0:从由我审核进入 1:从由我审核记录中记录
	 * @param session
	 * @param req
	 * @return
	 */

	@ResponseBody
	@RequestMapping("/getExamineByMeById.ajax")
	public ReturnDatas getExamineByMeById(@Param("processId") int processId, @Param("type") int type,
			HttpSession session, HttpServletRequest req) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			HashMap<String, Object> result = exaService.getExamineByMeById(processId, type);
			if (result == null) {
				return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.执行失败.getCode(), "执行失败");
			} else {
				returnData.setData(result);
			}

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 获取由我审核的记录列表
	 * 
	 * @param status
	 *            1:通过 2:未通过 10:通过用户撤销 12:未通过用户撤销 3：包括1、2、10、12
	 * @param pageSize
	 * @param index
	 *            从1开始
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getExamineByMeRecordList.ajax")
	public ReturnDatas getExamineByMeRecordList(@Param("exaStatus") int status, @Param("pageSize") int pageSize,
			@Param("index") int index, HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			List<HashMap<String, Object>> result = exaService.getExamineByMeRecordList(userId.intValue(), status,
					pageSize, index);
			returnData.setData(result);
			int totalCount = exaService.getExamineByMeRecordCount(userId.intValue(), status);
			Page page = new Page(index, pageSize, totalCount);
			returnData.setPage(page);
		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;

	}

	/**
	 * 条目不可见 权限(0:审核提交者 要从1 3状态到－1状态 1:审核者 要从 1、2到－1）
	 * 
	 * @param id
	 *            根据type决定 审核条目id 或者 审核流程id
	 * @param type
	 *            0:提交者移除 1:审核者移除
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/toInvisibleExamineOrProcess.ajax")
	public ReturnDatas toInvisibleExamineOrProcess(@Param("id") int id, @Param("type") int type, HttpSession session,
			HttpServletRequest req) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int result = exaService.ToInvisibleExamineOrProcess(id, type);
			if (result != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(result);
			}

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 撤销审核条目 由提交者操作 状态0、2到3 （状态1为审核通过 流程结束不可以再撤销）
	 * 
	 * @param exaId
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/toPullBackExamine.ajax")
	public ReturnDatas toPullBackExamine(@Param("exaId") int exaId, HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int result = exaService.ToPullBackExamine(exaId, userId.intValue());
			if (result != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(result);
			}

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 修改审核条目 修改要从 3状态开始 到0状态结束 ：重新插入新的条目 以前的不变
	 * 
	 * @param exaId
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/toFixExamine.ajax")
	public ReturnDatas ToFixExamine(@Param("exaId") int exaId, @Param("exaTitle") String exaTitle,
			@Param("exaContent") String exaContent, @Param("exaFilePath") String exaFilePath,
			@RequestParam(value = "exaFileFlag", required = false) Integer exaFileFlag, HttpSession session,
			HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int result = exaService.ToFixExamine(exaId, userId.intValue(), exaTitle, exaContent, exaFilePath,
					exaFileFlag == null || exaFileFlag == 0 ? 0 : exaFileFlag);
			if (result != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(result);
			}

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 审核操作 由审核着操作 状态0到1、2 同步操作：审核流程表：节点状态、时间、备注 如果节点状态为2 或者节点状态为1并且为流程最后一个节点
	 * 修改审核表的status 同步操作：修改 审核提交者的审核内容表 ：例如：岗位状态以及用户岗位状态
	 * 
	 * @param processId
	 * @param toNodeStatus
	 *            1，2状态
	 * @param note
	 *            备注
	 * @param session
	 * @param req
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@ResponseBody
	@RequestMapping("/toDoExamine.ajax")
	public ReturnDatas toDoExamine(@Param("processId") int processId, @Param("toNodeStatus") int toNodeStatus,
			HttpSession session, @Param("note") String note, HttpServletRequest req)
			throws UnsupportedEncodingException {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		note = note != null ? URLDecoder.decode(note, "UTF-8") : null;
		try {
			int result = exaService.ToDoExamine(processId, toNodeStatus, note);
			if (result != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(result);
			}

		} catch (Exception e) {
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}
}
