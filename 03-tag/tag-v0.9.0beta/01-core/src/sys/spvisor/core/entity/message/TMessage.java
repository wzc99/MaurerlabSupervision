package sys.spvisor.core.entity.message;

import java.sql.Date;

public class TMessage {
    private Integer msgId;

    private Integer msgSumitId;

    private Date msgSubmitTime;

    private String msgTitle;

    private String msgContent;

    private String msgNote;

    private Integer msgType;

    private Integer msgLinkId;

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

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgLinkId() {
        return msgLinkId;
    }

    public void setMsgLinkId(Integer msgLinkId) {
        this.msgLinkId = msgLinkId;
    }
}