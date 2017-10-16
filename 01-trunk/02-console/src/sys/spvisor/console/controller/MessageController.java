package sys.spvisor.console.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.spvisor.core.result.Message.TMessageResult;
import sys.spvisor.core.service.message.TextMessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	TextMessageService messageService;
	
	//获取未读消息列表分页的数据
	@RequestMapping(value="/getUnreadMessage.ajax", method = { RequestMethod.POST,RequestMethod.GET })
	public @ResponseBody Map<String,Object> getUnreadMessage(HttpSession session,boolean paging,int limit,int offset) {
		Map<String,Object> result = new HashMap<String,Object>(3);
		Long userId = (Long) session.getAttribute("USER_ID");
		List<TMessageResult> list = messageService.getMyMessage(userId.intValue(), 0,limit,offset);
		int total = messageService.getMyMessage(userId.intValue(), 0,-1,-1).size();
		System.out.println(total);
		result.put("total", total);
		result.put("rows", list);
		return result;
	}
	
	//获取未读消息的条目
	@RequestMapping("/getUnreadMessageTotal.ajax")
	public@ResponseBody Map<String,Object> getUnreadMessageTotal(HttpSession session) {
		Map<String,Object> result = new HashMap<String,Object>(2);
		Long userId = (Long) session.getAttribute("USER_ID");
		List<TMessageResult> list = messageService.getMyMessage(userId.intValue(), 0,-1,-1);
		result.put("length", list.size());
		return result;
	}
	
	@RequestMapping("/getTMessageById.ajax")
	public @ResponseBody TMessageResult getTMessageById(int msgId) {
		return messageService.getTMessageById(msgId);
	}
	
	@RequestMapping("/updateTextMessage.ajax")
	public @ResponseBody Map<String,Object> updateTextMessage(HttpSession session,int msgId,int nodeType) {
		Map<String,Object> result = new HashMap<String,Object>(1);
		Long userId = (Long) session.getAttribute("USER_ID");
		boolean isSuccess = messageService.updateTextMessage(msgId, nodeType, userId.intValue());
		if(isSuccess) {
			result.put("success", true);
		}else {
			result.put("success", false);
		}
		return result;
		
	}
}
