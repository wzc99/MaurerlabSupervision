package sys.spvisor.core.entity.project;

import java.util.Date;

public class TSendCard {
    private Integer tSendId;

    private Integer tSendNum;

    private Integer tSendProjectId;

    private String tSendQualityPlan;

    private String tSendTechFolder;

    private String tSendGoTime;
    
    private String submissions;
    
    private String remarks;

    private Integer tManagerLeader;

    private Integer tBianzhiId;

    private Integer tShenpiId;

    private Date tSubmitTime;

    private String tSendNumStr;

    public Integer gettSendId() {
        return tSendId;
    }

    public void settSendId(Integer tSendId) {
        this.tSendId = tSendId;
    }

    public Integer gettSendNum() {
        return tSendNum;
    }

    public void settSendNum(Integer tSendNum) {
        this.tSendNum = tSendNum;
    }

    public Integer gettSendProjectId() {
        return tSendProjectId;
    }

    public void settSendProjectId(Integer tSendProjectId) {
        this.tSendProjectId = tSendProjectId;
    }

    public String gettSendQualityPlan() {
        return tSendQualityPlan;
    }

    public void settSendQualityPlan(String tSendQualityPlan) {
        this.tSendQualityPlan = tSendQualityPlan == null ? null : tSendQualityPlan.trim();
    }

    public String gettSendTechFolder() {
        return tSendTechFolder;
    }

    public void settSendTechFolder(String tSendTechFolder) {
        this.tSendTechFolder = tSendTechFolder == null ? null : tSendTechFolder.trim();
    }

    public String gettSendGoTime() {
        return tSendGoTime;
    }

    public void settSendGoTime(String tSendGoTime) {
        this.tSendGoTime = tSendGoTime == null ? null : tSendGoTime.trim();
    }

    public Integer gettManagerLeader() {
        return tManagerLeader;
    }

    public void settManagerLeader(Integer tManagerLeader) {
        this.tManagerLeader = tManagerLeader;
    }

    public Integer gettBianzhiId() {
        return tBianzhiId;
    }

    public void settBianzhiId(Integer tBianzhiId) {
        this.tBianzhiId = tBianzhiId;
    }

    public Integer gettShenpiId() {
        return tShenpiId;
    }

    public void settShenpiId(Integer tShenpiId) {
        this.tShenpiId = tShenpiId;
    }
    public String getsubmissions() {
        return submissions;
    }

    public void setsubmissions(String submissions) {
        this.submissions = submissions == null ? null : submissions.trim();
    }
    
    public String getremarks() {
        return remarks;
    }
    
    public void setremarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date gettSubmitTime() {
        return tSubmitTime;
    }

    public void settSubmitTime(Date tSubmitTime) {
        this.tSubmitTime = tSubmitTime;
    }

    public String gettSendNumStr() {
        return tSendNumStr;
    }

    public void settSendNumStr(String tSendNumStr) {
        this.tSendNumStr = tSendNumStr == null ? null : tSendNumStr.trim();
    }
}