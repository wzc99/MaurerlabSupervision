package sys.spvisor.core.entity.project;

public class TQuestionFileForm {
    private Integer id;

    private Integer tProblemId;

    private Integer tType;

    private Integer tFileFormId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettProblemId() {
        return tProblemId;
    }

    public void settProblemId(Integer tProblemId) {
        this.tProblemId = tProblemId;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public Integer gettFileFormId() {
        return tFileFormId;
    }

    public void settFileFormId(Integer tFileFormId) {
        this.tFileFormId = tFileFormId;
    }
}