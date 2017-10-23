package sys.spvisor.core.entity.work;

public class TProductTypeMapping {
    private Integer typeMappingId;

    private Integer bigTypeId;

    private String bigTypeName;

    private Integer smallTypeId;

    private String smallTypeName;

    private String threeLevelName;

    private Integer threeLevelId;

    public Integer getTypeMappingId() {
        return typeMappingId;
    }

    public void setTypeMappingId(Integer typeMappingId) {
        this.typeMappingId = typeMappingId;
    }

    public Integer getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(Integer bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    public String getBigTypeName() {
        return bigTypeName;
    }

    public void setBigTypeName(String bigTypeName) {
        this.bigTypeName = bigTypeName == null ? null : bigTypeName.trim();
    }

    public Integer getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(Integer smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    public String getSmallTypeName() {
        return smallTypeName;
    }

    public void setSmallTypeName(String smallTypeName) {
        this.smallTypeName = smallTypeName == null ? null : smallTypeName.trim();
    }

    public String getThreeLevelName() {
        return threeLevelName;
    }

    public void setThreeLevelName(String threeLevelName) {
        this.threeLevelName = threeLevelName == null ? null : threeLevelName.trim();
    }

    public Integer getThreeLevelId() {
        return threeLevelId;
    }

    public void setThreeLevelId(Integer threeLevelId) {
        this.threeLevelId = threeLevelId;
    }
}