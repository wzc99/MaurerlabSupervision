package sys.spvisor.core.entity.ana;

public class TPeoplePoststatus {
    private Integer postStatusId;

    private String postStatusDes;

    public Integer getPostStatusId() {
        return postStatusId;
    }

    public void setPostStatusId(Integer postStatusId) {
        this.postStatusId = postStatusId;
    }

    public String getPostStatusDes() {
        return postStatusDes;
    }

    public void setPostStatusDes(String postStatusDes) {
        this.postStatusDes = postStatusDes == null ? null : postStatusDes.trim();
    }
}