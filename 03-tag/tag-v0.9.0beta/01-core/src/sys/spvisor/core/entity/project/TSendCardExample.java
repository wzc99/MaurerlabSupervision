package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSendCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSendCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTSendIdIsNull() {
            addCriterion("t_send_id is null");
            return (Criteria) this;
        }

        public Criteria andTSendIdIsNotNull() {
            addCriterion("t_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andTSendIdEqualTo(Integer value) {
            addCriterion("t_send_id =", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdNotEqualTo(Integer value) {
            addCriterion("t_send_id <>", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdGreaterThan(Integer value) {
            addCriterion("t_send_id >", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_send_id >=", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdLessThan(Integer value) {
            addCriterion("t_send_id <", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_send_id <=", value, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdIn(List<Integer> values) {
            addCriterion("t_send_id in", values, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdNotIn(List<Integer> values) {
            addCriterion("t_send_id not in", values, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdBetween(Integer value1, Integer value2) {
            addCriterion("t_send_id between", value1, value2, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_send_id not between", value1, value2, "tSendId");
            return (Criteria) this;
        }

        public Criteria andTSendNumIsNull() {
            addCriterion("t_send_num is null");
            return (Criteria) this;
        }

        public Criteria andTSendNumIsNotNull() {
            addCriterion("t_send_num is not null");
            return (Criteria) this;
        }

        public Criteria andTSendNumEqualTo(Integer value) {
            addCriterion("t_send_num =", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumNotEqualTo(Integer value) {
            addCriterion("t_send_num <>", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumGreaterThan(Integer value) {
            addCriterion("t_send_num >", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_send_num >=", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumLessThan(Integer value) {
            addCriterion("t_send_num <", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("t_send_num <=", value, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumIn(List<Integer> values) {
            addCriterion("t_send_num in", values, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumNotIn(List<Integer> values) {
            addCriterion("t_send_num not in", values, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumBetween(Integer value1, Integer value2) {
            addCriterion("t_send_num between", value1, value2, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("t_send_num not between", value1, value2, "tSendNum");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdIsNull() {
            addCriterion("t_send_project_id is null");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdIsNotNull() {
            addCriterion("t_send_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdEqualTo(Integer value) {
            addCriterion("t_send_project_id =", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdNotEqualTo(Integer value) {
            addCriterion("t_send_project_id <>", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdGreaterThan(Integer value) {
            addCriterion("t_send_project_id >", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_send_project_id >=", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdLessThan(Integer value) {
            addCriterion("t_send_project_id <", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_send_project_id <=", value, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdIn(List<Integer> values) {
            addCriterion("t_send_project_id in", values, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdNotIn(List<Integer> values) {
            addCriterion("t_send_project_id not in", values, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("t_send_project_id between", value1, value2, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_send_project_id not between", value1, value2, "tSendProjectId");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanIsNull() {
            addCriterion("t_send_quality_plan is null");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanIsNotNull() {
            addCriterion("t_send_quality_plan is not null");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanEqualTo(String value) {
            addCriterion("t_send_quality_plan =", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanNotEqualTo(String value) {
            addCriterion("t_send_quality_plan <>", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanGreaterThan(String value) {
            addCriterion("t_send_quality_plan >", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanGreaterThanOrEqualTo(String value) {
            addCriterion("t_send_quality_plan >=", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanLessThan(String value) {
            addCriterion("t_send_quality_plan <", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanLessThanOrEqualTo(String value) {
            addCriterion("t_send_quality_plan <=", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanLike(String value) {
            addCriterion("t_send_quality_plan like", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanNotLike(String value) {
            addCriterion("t_send_quality_plan not like", value, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanIn(List<String> values) {
            addCriterion("t_send_quality_plan in", values, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanNotIn(List<String> values) {
            addCriterion("t_send_quality_plan not in", values, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanBetween(String value1, String value2) {
            addCriterion("t_send_quality_plan between", value1, value2, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendQualityPlanNotBetween(String value1, String value2) {
            addCriterion("t_send_quality_plan not between", value1, value2, "tSendQualityPlan");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderIsNull() {
            addCriterion("t_send_tech_folder is null");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderIsNotNull() {
            addCriterion("t_send_tech_folder is not null");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderEqualTo(String value) {
            addCriterion("t_send_tech_folder =", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderNotEqualTo(String value) {
            addCriterion("t_send_tech_folder <>", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderGreaterThan(String value) {
            addCriterion("t_send_tech_folder >", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderGreaterThanOrEqualTo(String value) {
            addCriterion("t_send_tech_folder >=", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderLessThan(String value) {
            addCriterion("t_send_tech_folder <", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderLessThanOrEqualTo(String value) {
            addCriterion("t_send_tech_folder <=", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderLike(String value) {
            addCriterion("t_send_tech_folder like", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderNotLike(String value) {
            addCriterion("t_send_tech_folder not like", value, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderIn(List<String> values) {
            addCriterion("t_send_tech_folder in", values, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderNotIn(List<String> values) {
            addCriterion("t_send_tech_folder not in", values, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderBetween(String value1, String value2) {
            addCriterion("t_send_tech_folder between", value1, value2, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendTechFolderNotBetween(String value1, String value2) {
            addCriterion("t_send_tech_folder not between", value1, value2, "tSendTechFolder");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeIsNull() {
            addCriterion("t_send_go_time is null");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeIsNotNull() {
            addCriterion("t_send_go_time is not null");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeEqualTo(String value) {
            addCriterion("t_send_go_time =", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeNotEqualTo(String value) {
            addCriterion("t_send_go_time <>", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeGreaterThan(String value) {
            addCriterion("t_send_go_time >", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("t_send_go_time >=", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeLessThan(String value) {
            addCriterion("t_send_go_time <", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeLessThanOrEqualTo(String value) {
            addCriterion("t_send_go_time <=", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeLike(String value) {
            addCriterion("t_send_go_time like", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeNotLike(String value) {
            addCriterion("t_send_go_time not like", value, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeIn(List<String> values) {
            addCriterion("t_send_go_time in", values, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeNotIn(List<String> values) {
            addCriterion("t_send_go_time not in", values, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeBetween(String value1, String value2) {
            addCriterion("t_send_go_time between", value1, value2, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTSendGoTimeNotBetween(String value1, String value2) {
            addCriterion("t_send_go_time not between", value1, value2, "tSendGoTime");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderIsNull() {
            addCriterion("t_manager_leader is null");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderIsNotNull() {
            addCriterion("t_manager_leader is not null");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderEqualTo(Integer value) {
            addCriterion("t_manager_leader =", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderNotEqualTo(Integer value) {
            addCriterion("t_manager_leader <>", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderGreaterThan(Integer value) {
            addCriterion("t_manager_leader >", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_manager_leader >=", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderLessThan(Integer value) {
            addCriterion("t_manager_leader <", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("t_manager_leader <=", value, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderIn(List<Integer> values) {
            addCriterion("t_manager_leader in", values, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderNotIn(List<Integer> values) {
            addCriterion("t_manager_leader not in", values, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderBetween(Integer value1, Integer value2) {
            addCriterion("t_manager_leader between", value1, value2, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTManagerLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("t_manager_leader not between", value1, value2, "tManagerLeader");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdIsNull() {
            addCriterion("t_bianzhi_id is null");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdIsNotNull() {
            addCriterion("t_bianzhi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdEqualTo(Integer value) {
            addCriterion("t_bianzhi_id =", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdNotEqualTo(Integer value) {
            addCriterion("t_bianzhi_id <>", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdGreaterThan(Integer value) {
            addCriterion("t_bianzhi_id >", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_bianzhi_id >=", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdLessThan(Integer value) {
            addCriterion("t_bianzhi_id <", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_bianzhi_id <=", value, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdIn(List<Integer> values) {
            addCriterion("t_bianzhi_id in", values, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdNotIn(List<Integer> values) {
            addCriterion("t_bianzhi_id not in", values, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdBetween(Integer value1, Integer value2) {
            addCriterion("t_bianzhi_id between", value1, value2, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTBianzhiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_bianzhi_id not between", value1, value2, "tBianzhiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdIsNull() {
            addCriterion("t_shenpi_id is null");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdIsNotNull() {
            addCriterion("t_shenpi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdEqualTo(Integer value) {
            addCriterion("t_shenpi_id =", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdNotEqualTo(Integer value) {
            addCriterion("t_shenpi_id <>", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdGreaterThan(Integer value) {
            addCriterion("t_shenpi_id >", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_shenpi_id >=", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdLessThan(Integer value) {
            addCriterion("t_shenpi_id <", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_shenpi_id <=", value, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdIn(List<Integer> values) {
            addCriterion("t_shenpi_id in", values, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdNotIn(List<Integer> values) {
            addCriterion("t_shenpi_id not in", values, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdBetween(Integer value1, Integer value2) {
            addCriterion("t_shenpi_id between", value1, value2, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTShenpiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_shenpi_id not between", value1, value2, "tShenpiId");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeIsNull() {
            addCriterion("t_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeIsNotNull() {
            addCriterion("t_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeEqualTo(Date value) {
            addCriterion("t_submit_time =", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeNotEqualTo(Date value) {
            addCriterion("t_submit_time <>", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeGreaterThan(Date value) {
            addCriterion("t_submit_time >", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_submit_time >=", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeLessThan(Date value) {
            addCriterion("t_submit_time <", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_submit_time <=", value, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeIn(List<Date> values) {
            addCriterion("t_submit_time in", values, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeNotIn(List<Date> values) {
            addCriterion("t_submit_time not in", values, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("t_submit_time between", value1, value2, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_submit_time not between", value1, value2, "tSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrIsNull() {
            addCriterion("t_send_num_str is null");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrIsNotNull() {
            addCriterion("t_send_num_str is not null");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrEqualTo(String value) {
            addCriterion("t_send_num_str =", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrNotEqualTo(String value) {
            addCriterion("t_send_num_str <>", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrGreaterThan(String value) {
            addCriterion("t_send_num_str >", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrGreaterThanOrEqualTo(String value) {
            addCriterion("t_send_num_str >=", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrLessThan(String value) {
            addCriterion("t_send_num_str <", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrLessThanOrEqualTo(String value) {
            addCriterion("t_send_num_str <=", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrLike(String value) {
            addCriterion("t_send_num_str like", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrNotLike(String value) {
            addCriterion("t_send_num_str not like", value, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrIn(List<String> values) {
            addCriterion("t_send_num_str in", values, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrNotIn(List<String> values) {
            addCriterion("t_send_num_str not in", values, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrBetween(String value1, String value2) {
            addCriterion("t_send_num_str between", value1, value2, "tSendNumStr");
            return (Criteria) this;
        }

        public Criteria andTSendNumStrNotBetween(String value1, String value2) {
            addCriterion("t_send_num_str not between", value1, value2, "tSendNumStr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}