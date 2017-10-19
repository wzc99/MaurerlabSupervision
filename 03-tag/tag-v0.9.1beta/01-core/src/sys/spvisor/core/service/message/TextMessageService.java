package sys.spvisor.core.service.message;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.ana.TUserMapper;
import sys.spvisor.core.dao.ana.TUserRoleMapper;
import sys.spvisor.core.dao.message.TMessageMapper;
import sys.spvisor.core.dao.message.TMessagePeopleMapMapper;
import sys.spvisor.core.dao.project.TProjectPeopleMapper;
import sys.spvisor.core.entity.ana.TUser;
import sys.spvisor.core.entity.ana.TUserRole;
import sys.spvisor.core.entity.ana.TUserRoleExample;
import sys.spvisor.core.entity.message.TMessage;
import sys.spvisor.core.entity.message.TMessagePeopleMap;
import sys.spvisor.core.entity.message.TMessagePeopleMapExample;
import sys.spvisor.core.entity.project.TProjectPeople;
import sys.spvisor.core.entity.project.TProjectPeopleExample;
import sys.spvisor.core.result.Message.TMessageResult;

@Service
public class TextMessageService {
	
	@Autowired
	TMessageMapper tMessageMapper;
	@Autowired
	TMessagePeopleMapMapper tMessagePeopleMapMapper;
	@Autowired
	TUserRoleMapper tUserRoleMapper;
	@Autowired
	TProjectPeopleMapper tProjectPeopleMapper;
	@Autowired
	TUserMapper tUserMapper;
	
	/**
	 * 插入文字消息
	 * @param tMessage 消息内容
	 * @param proId	项目id，同时也用于标注是否在项目里面,0就表示不在项目里面,用于标示是否是项目里面的角色
	 * @param isRole 是角色id还是userid，true是roleid，false是用户id
	 * @param URID    userid或者roleid的列表
	 * @return   表示是否插入成功
	 * @note 这里在项目里面的角色和项目里面的角色分批插入，所以调用的时候分批调用。如果是不是项目里面的角色proId的值设置为0
	 * 
	 * 用法，如果是项目里面的角色或者用户的话，把proId写上，如果给项目角色发消息，那么isRole为true，否则为false
	 * 如果不是项目里面的角色或者用户的话，那么proId=0，如果给角色发消息，那么isRole为true，否则为false
	 * 如果要同时给角色或者用户发消息的话，那么，请多次发送。。。。
	 */
	@Transactional
	public boolean insertTextMessage(TMessage tMessage,int proId,boolean isRole,List<Integer> URID) {
		boolean result = false;
		//tMessage.setMsgSubmitTime(new Date(new java.util.Date().getTime()));
		
		tMessageMapper.insert(tMessage);
		int msgId = tMessage.getMsgId();
		//更新消息人员映射表
		if(proId != 0) {
			//是项目里面的角色
			if(isRole) {
				//URID是角色id
				TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
				sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tPPcriteria = tProjectPeopleExample.createCriteria();
				tPPcriteria.andPpProIdEqualTo(proId);
				tPPcriteria.andPpProRoleIdIn(URID);
				tPPcriteria.andPpStatusNotEqualTo("C");
				//并且角色在没有彻底离开项目，暂离也要发送
				List<TProjectPeople> lists = tProjectPeopleMapper.selectByExample(tProjectPeopleExample);
				tProjectPeopleExample.clear();
				for (int i = 0; i < lists.size(); i++) {
					TMessagePeopleMap map = new TMessagePeopleMap();
					map.setMsgId(msgId);
					map.setMsgStatus(0);
					map.setUserId(lists.get(i).getPpUserId());
					tMessagePeopleMapMapper.insert(map);
				}
			}else {
				/*//URID是用户id
				TProjectPeopleExample tProjectPeopleExample = new TProjectPeopleExample();
				sys.spvisor.core.entity.project.TProjectPeopleExample.Criteria tPPcriteria = tProjectPeopleExample.createCriteria();
				tPPcriteria.andPpProIdEqualTo(proId);
				//tPPcriteria.andPpProRoleIdIn(URID);
				tPPcriteria.andPpUserIdIn(URID);
				tPPcriteria.andPpStatusNotEqualTo("C");
				//并且角色在没有彻底离开项目，暂离也要发送
				List<TProjectPeople> lists = tProjectPeopleMapper.selectByExample(tProjectPeopleExample);
				tProjectPeopleExample.clear();*/
				for (int i = 0; i < URID.size(); i++) {
					TMessagePeopleMap map = new TMessagePeopleMap();
					map.setMsgId(msgId);
					map.setMsgStatus(0);
					map.setUserId(URID.get(i));
					tMessagePeopleMapMapper.insert(map);
				}
			}
		}else {
			//不是项目里面的角色
			if(isRole) {
				//URID是角色id
				TUserRoleExample tUserRoleExample = new TUserRoleExample();
				sys.spvisor.core.entity.ana.TUserRoleExample.Criteria criteria = tUserRoleExample.createCriteria();
				criteria.andRoleIdIn(URID);
				List<TUserRole> lists = tUserRoleMapper.selectByExample(tUserRoleExample);
				tUserRoleExample.clear();
				for (int i = 0; i < lists.size(); i++) {
					TMessagePeopleMap map = new TMessagePeopleMap();
					map.setMsgId(msgId);
					map.setMsgStatus(0);
					map.setUserId(lists.get(i).getUserId());
					tMessagePeopleMapMapper.insert(map);
				}
			}else {
				//URID是用户id
				for (int i = 0; i < URID.size(); i++) {
					TMessagePeopleMap map = new TMessagePeopleMap();
					map.setMsgId(msgId);
					map.setMsgStatus(0);
					map.setUserId(URID.get(i));
					tMessagePeopleMapMapper.insert(map);
				}
			}
		}
		
		if(msgId!=0) {
			result = true;
		}
		return result;
	}
	
	
	/**
	 * 修改文字消息
	 * @param tMessage	文字消息
	 * @param nodeType  0表示未读，1表示已读，-1表示不可见
	 * @param userId    当前用户id
	 * @return 返回是否修改成功
	 */
	@Transactional
	public boolean updateTextMessage(int msgId,int nodeType,int userId) {
		TMessagePeopleMapExample tMessagePeopleMapExample = new TMessagePeopleMapExample();
		int rows = 0;
		//查询消息人员列表，找出这条消息，并且把这条消息的状态给改变
		sys.spvisor.core.entity.message.TMessagePeopleMapExample.Criteria criteria = tMessagePeopleMapExample.createCriteria();
		criteria.andMsgIdEqualTo(msgId);
		criteria.andUserIdEqualTo(userId);
		tMessagePeopleMapExample.setLimit(-1);
		List<TMessagePeopleMap> lists = tMessagePeopleMapMapper.selectByExample(tMessagePeopleMapExample);
		tMessagePeopleMapExample.clear();
		if(lists.size() != 0) {
			TMessagePeopleMap map = lists.get(0);
			map.setMsgStatus(nodeType);
			map.setReadTime(new Date(new java.util.Date().getTime()));
			rows = tMessagePeopleMapMapper.updateByPrimaryKey(map);
		}
		if(rows == 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * 获取我的消息
	 * @param userId	当前用户的id
	 * @param status	0表示未读，1表示已读，2表示出了不可见（-1），其余消息都可以获取
	 * @param pageSize  做分页时候每页显示多少条记录 -1表示不分页
	 * @param index     做分页时候第几页   -1表示不分页
	 * @return
	 */
	@Transactional
	public List<TMessageResult> getMyMessage(int userId,int status,int pageSize,int index) {
		TMessagePeopleMapExample tMessagePeopleMapExample = new TMessagePeopleMapExample();
		//查询消息人员列表，找出userID等于当前登录用户的id
		sys.spvisor.core.entity.message.TMessagePeopleMapExample.Criteria criteria = tMessagePeopleMapExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		if(status == 2) {
			criteria.andMsgStatusNotEqualTo(-1);
		}else {
			criteria.andMsgStatusEqualTo(status);
		}
		//最近的消息放在最前面
		tMessagePeopleMapExample.setOrderByClause("id desc");
		//分页
		//if(pageSize!= -1 && index != -1) {
			tMessagePeopleMapExample.setLimit(pageSize);
			tMessagePeopleMapExample.setOffset((index - 1) * pageSize);
		//}
		List<TMessagePeopleMap> lists = tMessagePeopleMapMapper.selectByExample(tMessagePeopleMapExample);
		List<TMessageResult> result = new ArrayList<TMessageResult>();
		for (int i = 0; i < lists.size(); i++) {
			TMessage message = tMessageMapper.selectByPrimaryKey(lists.get(i).getMsgId());
			TUser user = tUserMapper.selectByPrimaryKey(message.getMsgSumitId());
			TMessageResult messageResult = new TMessageResult();
			BeanUtils.copyProperties(message,messageResult);
			messageResult.setSubmitter(user.getUserName());
			result.add(messageResult);
		}
		return result;
	}
	
	@Transactional
	public TMessageResult getTMessageById(int msgId) {
		TMessage message = tMessageMapper.selectByPrimaryKey(msgId);
		TUser user = tUserMapper.selectByPrimaryKey(message.getMsgSumitId());
		TMessageResult messageResult = new TMessageResult();
		BeanUtils.copyProperties(message,messageResult);
		messageResult.setSubmitter(user.getUserName());
		return messageResult;
	}

}
