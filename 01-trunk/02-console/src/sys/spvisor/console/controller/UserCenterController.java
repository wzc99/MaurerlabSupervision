package sys.spvisor.console.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sys.spvisor.core.common.BaseController;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.attendance.TAttendance;
import sys.spvisor.core.service.ana.UserService;
import sys.spvisor.core.service.attendance.AttendanceService;
import sys.spvisor.core.util.Enumerations;
import sys.spvisor.core.util.FileUtils;
import sys.spvisor.core.util.Page;
import sys.spvisor.core.util.ReturnDatas;
import sys.spvisor.core.util.SystemConstants;

@Controller
@RequestMapping("/user/center")
public class UserCenterController extends BaseController {

	@Autowired
	UserService userService;
	@Autowired
	AttendanceService attService;

	/**
	 * 获取用户信息
	 * 
	 * @param session
	 * @param req
	 * @return 进行组装 包括岗位状态 和个人签名信息 userSignature：签名地址 statusIdStatus：0:岗位正常
	 *         1:岗位申请 2:过期状态（备用） toStatusId：可用条件：statusIdStatus 为1
	 *         statusName:状态名 targetStatusName:目标状态名 StatusLinkId TAttendance ID
	 */
	@ResponseBody
	@RequestMapping("/getUserInfo.ajax")
	public ReturnDatas getUserInfo(HttpSession session, HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			TUser user = userService.getUserById(userId);
			TAttendance att = attService.getAttendance(userId.intValue());

			user.setUserLoginPassword("");
			if (att == null) {
				att = new TAttendance();
				att.setId(0);
				att.setStatusIdStatus(0);
			} else if (att.getStatusIdStatus() == 1) {
				user.setToStatusId(att.getToStatusId());
			}
			user.setStatusLinkId(att.getId());
			user.setStatusIdStatus(att.getStatusIdStatus());
			returnData.setData(user);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}

		return returnData;

	}

	/**
	 * 编辑用户信息 时间格式要求 yyyy-MM-dd HH:mm:ss yyyy-MM-dd yyyy-MM yyyy
	 * 
	 * @param user
	 * @param session
	 * @param req
	 * @param res
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/editUserInfo.ajax", method = RequestMethod.POST)
	public ReturnDatas editUserInfo(TUser user, HttpSession session, HttpServletRequest req, HttpServletResponse res) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			user.setUserWorkStatusId(null);
			int flag = userService.updateUserById(user, userId);
			if (flag != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(flag);

			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 更改岗位状态
	 * 
	 * @param targetStatus
	 *            目标状态
	 * @param title
	 *            标题
	 * @param content
	 *            内容
	 * @param linkId
	 *            attId
	 * @param session
	 * @param req
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editAddentance.ajax")
	public ReturnDatas editAddentance(@Param("targetStatus") int targetStatus, @Param("title") String title,
			@Param("content") String content, @Param("linkId") int linkId, HttpSession session,
			HttpServletRequest req) {
		Long userId = (Long) session.getAttribute("USER_ID");
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		try {
			int flag = attService.changeAttendance(userId.intValue(), targetStatus, title, content, linkId);
			if (flag != Enumerations.ServiceReturnCode.操作成功.getCode()) {
				return Enumerations.getReturnDatasByServiceCode(flag);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 上传编辑签名文件 不会删除以前的
	 * 
	 * @param session
	 * @param request
	 * @param multipartFile
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/editUserSignature.ajax")
	public ReturnDatas editUserSignature(HttpSession session, HttpServletRequest request,
			@RequestParam(value = "signature", required = false) MultipartFile multipartFile) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		Long userId = (Long) session.getAttribute("USER_ID");
		try {
			String filePath = FileUtils.FilesUpload_transferTo_spring(request, multipartFile,
					SystemConstants.userSignaturePath);

			if (StringUtils.isEmpty(filePath)) {
				return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
			} else {

				TUser user = new TUser();
				user.setUserId(userId.intValue());
				user.setUserSignature(filePath);
				int flag = userService.updateUserById(user, userId);
				if (flag != Enumerations.ServiceReturnCode.操作成功.getCode()) {
					return Enumerations.getReturnDatasByServiceCode(flag);
				} else {
					returnData.setData(filePath);
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

	/**
	 * 考勤列表
	 * 
	 * 
	 */
	@ResponseBody
	@RequestMapping("/getAttendanceById.ajax")
	public ReturnDatas getAttendanceById(@Param("pageSize") int limit, @Param("index") int index, HttpSession session,
			HttpServletRequest request) {
		ReturnDatas returnData = ReturnDatas.getSuccessReturnDatas();
		Long userId = (Long) session.getAttribute("USER_ID");
		try {
			int total = attService.getAttendanceCount(userId.intValue());
			returnData.setData(attService.getAttendanceList(userId.intValue(), limit, index));
			Page page = new Page(index, limit, total);
			returnData.setPage(page);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ReturnDatas.getErrorReturnDatas(Enumerations.ReturnCode.服务器错误.getCode(), "服务器错误");
		}
		return returnData;
	}

}
