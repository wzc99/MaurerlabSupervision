package sys.spvisor.core.entity.process;

public class TScheduleNode {
    private Integer nodeId;

    private Integer proId;

    private Integer typeId;

    private String nodeidstr;

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getNodeidstr() {
        return nodeidstr;
    }

    public void setNodeidstr(String nodeidstr) {
        this.nodeidstr = nodeidstr == null ? null : nodeidstr.trim();
    }
}