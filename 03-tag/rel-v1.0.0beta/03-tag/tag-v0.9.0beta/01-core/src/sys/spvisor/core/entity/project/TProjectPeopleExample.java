package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class TProjectPeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProjectPeopleExample() {
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

        public Criteria andProjectPeopleIdIsNull() {
            addCriterion("project_people_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdIsNotNull() {
            addCriterion("project_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdEqualTo(Integer value) {
            addCriterion("project_people_id =", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdNotEqualTo(Integer value) {
            addCriterion("project_people_id <>", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdGreaterThan(Integer value) {
            addCriterion("project_people_id >", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_people_id >=", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdLessThan(Integer value) {
            addCriterion("project_people_id <", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_people_id <=", value, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdIn(List<Integer> values) {
            addCriterion("project_people_id in", values, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdNotIn(List<Integer> values) {
            addCriterion("project_people_id not in", values, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("project_people_id between", value1, value2, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_people_id not between", value1, value2, "projectPeopleId");
            return (Criteria) this;
        }

        public Criteria andPpProIdIsNull() {
            addCriterion("pp_pro_id is null");
            return (Criteria) this;
        }

        public Criteria andPpProIdIsNotNull() {
            addCriterion("pp_pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpProIdEqualTo(Integer value) {
            addCriterion("pp_pro_id =", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdNotEqualTo(Integer value) {
            addCriterion("pp_pro_id <>", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdGreaterThan(Integer value) {
            addCriterion("pp_pro_id >", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_pro_id >=", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdLessThan(Integer value) {
            addCriterion("pp_pro_id <", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_pro_id <=", value, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdIn(List<Integer> values) {
            addCriterion("pp_pro_id in", values, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdNotIn(List<Integer> values) {
            addCriterion("pp_pro_id not in", values, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_pro_id between", value1, value2, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_pro_id not between", value1, value2, "ppProId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdIsNull() {
            addCriterion("pp_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPpUserIdIsNotNull() {
            addCriterion("pp_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpUserIdEqualTo(Integer value) {
            addCriterion("pp_user_id =", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdNotEqualTo(Integer value) {
            addCriterion("pp_user_id <>", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdGreaterThan(Integer value) {
            addCriterion("pp_user_id >", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_user_id >=", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdLessThan(Integer value) {
            addCriterion("pp_user_id <", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_user_id <=", value, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdIn(List<Integer> values) {
            addCriterion("pp_user_id in", values, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdNotIn(List<Integer> values) {
            addCriterion("pp_user_id not in", values, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_user_id between", value1, value2, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_user_id not between", value1, value2, "ppUserId");
            return (Criteria) this;
        }

        public Criteria andPpStatusIsNull() {
            addCriterion("pp_status is null");
            return (Criteria) this;
        }

        public Criteria andPpStatusIsNotNull() {
            addCriterion("pp_status is not null");
            return (Criteria) this;
        }

        public Criteria andPpStatusEqualTo(String value) {
            addCriterion("pp_status =", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusNotEqualTo(String value) {
            addCriterion("pp_status <>", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusGreaterThan(String value) {
            addCriterion("pp_status >", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pp_status >=", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusLessThan(String value) {
            addCriterion("pp_status <", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusLessThanOrEqualTo(String value) {
            addCriterion("pp_status <=", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusLike(String value) {
            addCriterion("pp_status like", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusNotLike(String value) {
            addCriterion("pp_status not like", value, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusIn(List<String> values) {
            addCriterion("pp_status in", values, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusNotIn(List<String> values) {
            addCriterion("pp_status not in", values, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusBetween(String value1, String value2) {
            addCriterion("pp_status between", value1, value2, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpStatusNotBetween(String value1, String value2) {
            addCriterion("pp_status not between", value1, value2, "ppStatus");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeIsNull() {
            addCriterion("pp_in_pro_time is null");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeIsNotNull() {
            addCriterion("pp_in_pro_time is not null");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeEqualTo(Date value) {
            addCriterion("pp_in_pro_time =", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeNotEqualTo(Date value) {
            addCriterion("pp_in_pro_time <>", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeGreaterThan(Date value) {
            addCriterion("pp_in_pro_time >", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pp_in_pro_time >=", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeLessThan(Date value) {
            addCriterion("pp_in_pro_time <", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeLessThanOrEqualTo(Date value) {
            addCriterion("pp_in_pro_time <=", value, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeIn(List<Date> values) {
            addCriterion("pp_in_pro_time in", values, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeNotIn(List<Date> values) {
            addCriterion("pp_in_pro_time not in", values, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeBetween(Date value1, Date value2) {
            addCriterion("pp_in_pro_time between", value1, value2, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpInProTimeNotBetween(Date value1, Date value2) {
            addCriterion("pp_in_pro_time not between", value1, value2, "ppInProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeIsNull() {
            addCriterion("pp_out_pro_time is null");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeIsNotNull() {
            addCriterion("pp_out_pro_time is not null");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeEqualTo(Date value) {
            addCriterion("pp_out_pro_time =", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeNotEqualTo(Date value) {
            addCriterion("pp_out_pro_time <>", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeGreaterThan(Date value) {
            addCriterion("pp_out_pro_time >", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pp_out_pro_time >=", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeLessThan(Date value) {
            addCriterion("pp_out_pro_time <", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeLessThanOrEqualTo(Date value) {
            addCriterion("pp_out_pro_time <=", value, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeIn(List<Date> values) {
            addCriterion("pp_out_pro_time in", values, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeNotIn(List<Date> values) {
            addCriterion("pp_out_pro_time not in", values, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeBetween(Date value1, Date value2) {
            addCriterion("pp_out_pro_time between", value1, value2, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpOutProTimeNotBetween(Date value1, Date value2) {
            addCriterion("pp_out_pro_time not between", value1, value2, "ppOutProTime");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdIsNull() {
            addCriterion("pp_pro_role_id is null");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdIsNotNull() {
            addCriterion("pp_pro_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdEqualTo(Integer value) {
            addCriterion("pp_pro_role_id =", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdNotEqualTo(Integer value) {
            addCriterion("pp_pro_role_id <>", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdGreaterThan(Integer value) {
            addCriterion("pp_pro_role_id >", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pp_pro_role_id >=", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdLessThan(Integer value) {
            addCriterion("pp_pro_role_id <", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("pp_pro_role_id <=", value, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdIn(List<Integer> values) {
            addCriterion("pp_pro_role_id in", values, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdNotIn(List<Integer> values) {
            addCriterion("pp_pro_role_id not in", values, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("pp_pro_role_id between", value1, value2, "ppProRoleId");
            return (Criteria) this;
        }

        public Criteria andPpProRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pp_pro_role_id not between", value1, value2, "ppProRoleId");
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