package sys.spvisor.core.entity.project;

import java.sql.Date;

public class TFileForm {
    private Integer fileFormId;

    private String fileFormName;

    private String fileFormPeople;

    private Integer fileFormUserId;

    private Date fileFormDate;

    private String fileFormFilename;

    private Integer fileFormProjectId;

    private String fileFormType;

    private String fileFormCurrentStatus;

    private Integer fileFormCurrentStatusNum;

    private Integer fileFormNotpassTimes;

    private String fileFormPath;

    public Integer getFileFormId() {
        return fileFormId;
    }

    public void setFileFormId(Integer fileFormId) {
        this.fileFormId = fileFormId;
    }

    public String getFileFormName() {
        return fileFormName;
    }

    public void setFileFormName(String fileFormName) {
        this.fileFormName = fileFormName == null ? null : fileFormName.trim();
    }

    public String getFileFormPeople() {
        return fileFormPeople;
    }

    public void setFileFormPeople(String fileFormPeople) {
        this.fileFormPeople = fileFormPeople == null ? null : fileFormPeople.trim();
    }

    public Integer getFileFormUserId() {
        return fileFormUserId;
    }

    public void setFileFormUserId(Integer fileFormUserId) {
        this.fileFormUserId = fileFormUserId;
    }

    public Date getFileFormDate() {
        return fileFormDate;
    }

    public void setFileFormDate(Date fileFormDate) {
        this.fileFormDate = fileFormDate;
    }

    public String getFileFormFilename() {
        return fileFormFilename;
    }

    public void setFileFormFilename(String fileFormFilename) {
        this.fileFormFilename = fileFormFilename == null ? null : fileFormFilename.trim();
    }

    public Integer getFileFormProjectId() {
        return fileFormProjectId;
    }

    public void setFileFormProjectId(Integer fileFormProjectId) {
        this.fileFormProjectId = fileFormProjectId;
    }

    public String getFileFormType() {
        return fileFormType;
    }

    public void setFileFormType(String fileFormType) {
        this.fileFormType = fileFormType == null ? null : fileFormType.trim();
    }

    public String getFileFormCurrentStatus() {
        return fileFormCurrentStatus;
    }

    public void setFileFormCurrentStatus(String fileFormCurrentStatus) {
        this.fileFormCurrentStatus = fileFormCurrentStatus == null ? null : fileFormCurrentStatus.trim();
    }

    public Integer getFileFormCurrentStatusNum() {
        return fileFormCurrentStatusNum;
    }

    public void setFileFormCurrentStatusNum(Integer fileFormCurrentStatusNum) {
        this.fileFormCurrentStatusNum = fileFormCurrentStatusNum;
    }

    public Integer getFileFormNotpassTimes() {
        return fileFormNotpassTimes;
    }

    public void setFileFormNotpassTimes(Integer fileFormNotpassTimes) {
        this.fileFormNotpassTimes = fileFormNotpassTimes;
    }

    public String getFileFormPath() {
        return fileFormPath;
    }

    public void setFileFormPath(String fileFormPath) {
        this.fileFormPath = fileFormPath == null ? null : fileFormPath.trim();
    }
}