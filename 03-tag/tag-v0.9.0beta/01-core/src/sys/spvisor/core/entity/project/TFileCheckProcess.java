package sys.spvisor.core.entity.project;

public class TFileCheckProcess {
    private Integer fileCheckProcessId;

    private String fileBelongTo;

    private String fileName;

    private Integer fileCurrentStatus;

    private String fileOperateRole;

    public Integer getFileCheckProcessId() {
        return fileCheckProcessId;
    }

    public void setFileCheckProcessId(Integer fileCheckProcessId) {
        this.fileCheckProcessId = fileCheckProcessId;
    }

    public String getFileBelongTo() {
        return fileBelongTo;
    }

    public void setFileBelongTo(String fileBelongTo) {
        this.fileBelongTo = fileBelongTo == null ? null : fileBelongTo.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getFileCurrentStatus() {
        return fileCurrentStatus;
    }

    public void setFileCurrentStatus(Integer fileCurrentStatus) {
        this.fileCurrentStatus = fileCurrentStatus;
    }

    public String getFileOperateRole() {
        return fileOperateRole;
    }

    public void setFileOperateRole(String fileOperateRole) {
        this.fileOperateRole = fileOperateRole == null ? null : fileOperateRole.trim();
    }
}