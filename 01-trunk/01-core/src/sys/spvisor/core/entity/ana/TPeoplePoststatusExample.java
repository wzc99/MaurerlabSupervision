package sys.spvisor.core.entity.ana;

import java.util.ArrayList;
import java.util.List;

public class TPeoplePoststatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPeoplePoststatusExample() {
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

        public Criteria andPostStatusIdIsNull() {
            addCriterion("post_status_id is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdIsNotNull() {
            addCriterion("post_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdEqualTo(Integer value) {
            addCriterion("post_status_id =", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdNotEqualTo(Integer value) {
            addCriterion("post_status_id <>", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdGreaterThan(Integer value) {
            addCriterion("post_status_id >", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_status_id >=", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdLessThan(Integer value) {
            addCriterion("post_status_id <", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_status_id <=", value, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdIn(List<Integer> values) {
            addCriterion("post_status_id in", values, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdNotIn(List<Integer> values) {
            addCriterion("post_status_id not in", values, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("post_status_id between", value1, value2, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_status_id not between", value1, value2, "postStatusId");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesIsNull() {
            addCriterion("post_status_des is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesIsNotNull() {
            addCriterion("post_status_des is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesEqualTo(String value) {
            addCriterion("post_status_des =", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesNotEqualTo(String value) {
            addCriterion("post_status_des <>", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesGreaterThan(String value) {
            addCriterion("post_status_des >", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesGreaterThanOrEqualTo(String value) {
            addCriterion("post_status_des >=", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesLessThan(String value) {
            addCriterion("post_status_des <", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesLessThanOrEqualTo(String value) {
            addCriterion("post_status_des <=", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesLike(String value) {
            addCriterion("post_status_des like", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesNotLike(String value) {
            addCriterion("post_status_des not like", value, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesIn(List<String> values) {
            addCriterion("post_status_des in", values, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesNotIn(List<String> values) {
            addCriterion("post_status_des not in", values, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesBetween(String value1, String value2) {
            addCriterion("post_status_des between", value1, value2, "postStatusDes");
            return (Criteria) this;
        }

        public Criteria andPostStatusDesNotBetween(String value1, String value2) {
            addCriterion("post_status_des not between", value1, value2, "postStatusDes");
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