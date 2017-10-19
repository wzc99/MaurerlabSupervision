package sys.spvisor.core.result.Message;

import java.sql.Date;

public class TMessageResult {
	private Integer msgId;

    private Integer msgSumitId;
    
    private String submitter;

    private Date msgSubmitTime;

    private String msgTitle;

    private String msgContent;

    private String msgNote;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getMsgSumitId() {
        return msgSumitId;
    }

    public void setMsgSumitId(Integer msgSumitId) {
        this.msgSumitId = msgSumitId;
    }

    public String getSubmitter() {
		return submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public Date getMsgSubmitTime() {
        return msgSubmitTime;
    }

    public void setMsgSubmitTime(Date msgSubmitTime) {
        this.msgSubmitTime = msgSubmitTime;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public String getMsgNote() {
        return msgNote;
    }

    public void setMsgNote(String msgNote) {
        this.msgNote = msgNote == null ? null : msgNote.trim();
    }
}
