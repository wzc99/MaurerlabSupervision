package sys.spvisor.core.entity.work;

import java.sql.Date;

public class TQualityPeopleRecoder {
    private Integer id;

    private Integer proId;

    private Integer userId;

    private Date postTime;

    private String userName;

    private String job;

    private String zhengshuName;

    private String num;

    private String licenseUnit;

    private String fileName;

    private String fileRecoderName;

    private String path;

    private String validDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getZhengshuName() {
        return zhengshuName;
    }

    public void setZhengshuName(String zhengshuName) {
        this.zhengshuName = zhengshuName == null ? null : zhengshuName.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getLicenseUnit() {
        return licenseUnit;
    }

    public void setLicenseUnit(String licenseUnit) {
        this.licenseUnit = licenseUnit == null ? null : licenseUnit.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileRecoderName() {
        return fileRecoderName;
    }

    public void setFileRecoderName(String fileRecoderName) {
        this.fileRecoderName = fileRecoderName == null ? null : fileRecoderName.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }
}