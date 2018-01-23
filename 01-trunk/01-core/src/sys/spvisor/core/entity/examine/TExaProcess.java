package sys.spvisor.core.entity.examine;

import java.util.Date;

public class TExaProcess {
    private Integer id;

    private Integer examineId;

    private Integer exaOrder;

    private String nodeName;

    private Integer nodeStatus;

    private Integer proId;

    private Integer checker;

    private Date checkTime;

    private String note;

    private Integer proNodeStatus;

    private Integer isProType;

    private Boolean isLastNode;

    private Integer coperRole;

    private Integer checkerUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamineId() {
        return examineId;
    }

    public void setExamineId(Integer examineId) {
        this.examineId = examineId;
    }

    public Integer getExaOrder() {
        return exaOrder;
    }

    public void setExaOrder(Integer exaOrder) {
        this.exaOrder = exaOrder;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public Integer getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(Integer nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getChecker() {
        return checker;
    }

    public void setChecker(Integer checker) {
        this.checker = checker;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getProNodeStatus() {
        return proNodeStatus;
    }

    public void setProNodeStatus(Integer proNodeStatus) {
        this.proNodeStatus = proNodeStatus;
    }

    public Integer getIsProType() {
        return isProType;
    }

    public void setIsProType(Integer isProType) {
        this.isProType = isProType;
    }

    public Boolean getIsLastNode() {
        return isLastNode;
    }

    public void setIsLastNode(Boolean isLastNode) {
        this.isLastNode = isLastNode;
    }

    public Integer getCoperRole() {
        return coperRole;
    }

    public void setCoperRole(Integer coperRole) {
        this.coperRole = coperRole;
    }

    public Integer getCheckerUserId() {
        return checkerUserId;
    }

    public void setCheckerUserId(Integer checkerUserId) {
        this.checkerUserId = checkerUserId;
    }
}