package sys.spvisor.core.service.examine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import sys.spvisor.core.dao.project.TFileFormMapper;
import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.service.journal.JournalService;

@Component
public class ExamineCallBack {
	@Autowired
	TFileFormMapper tFileFormMapper;
	
	@Autowired
	private JournalService jService;
	
	
	
	@Transactional
	public void exaAttendanceCall(int linkId, String status) {
		System.out.println(linkId + " " + status);
	}
	/**
	 * 
	 * @param linkId
	 * @param status 1:通过 2:未通过 3:撤销 :
	 */
	@Transactional
	public void journalCall(int linkId, int status) {
		jService.updateStatus(linkId, status);
	}
	
	/**
	 * 
	 * @param id		exa_link_id	这个是t-file-form里面的主键
	 * @param status	文件当前状态 D：已上传  W：待审核   N：审核未通过  P：审核通过
	 * 					文件当前状态 0：已上传 0：待审核   1：审核未通过  2：审核通过
	 * 					这里只能传1或者2，通过和未通过
	 */
	@Transactional
	public void exaFileCall(int exaLinkId, int status) {
		TFileForm form = tFileFormMapper.selectByPrimaryKey(exaLinkId);
		if(status == 1) {
			form.setFileFormCurrentStatus("N");
			tFileFormMapper.updateByPrimaryKey(form);
		}else if(status == 2) {
			form.setFileFormCurrentStatus("P");
			tFileFormMapper.updateByPrimaryKey(form);
		}
	}
}
