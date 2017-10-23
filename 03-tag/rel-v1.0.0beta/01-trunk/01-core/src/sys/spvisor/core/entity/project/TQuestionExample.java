package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class TQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionExample() {
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

        public Criteria andQusIdIsNull() {
            addCriterion("qus_id is null");
            return (Criteria) this;
        }

        public Criteria andQusIdIsNotNull() {
            addCriterion("qus_id is not null");
            return (Criteria) this;
        }

        public Criteria andQusIdEqualTo(Integer value) {
            addCriterion("qus_id =", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdNotEqualTo(Integer value) {
            addCriterion("qus_id <>", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdGreaterThan(Integer value) {
            addCriterion("qus_id >", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qus_id >=", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdLessThan(Integer value) {
            addCriterion("qus_id <", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdLessThanOrEqualTo(Integer value) {
            addCriterion("qus_id <=", value, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdIn(List<Integer> values) {
            addCriterion("qus_id in", values, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdNotIn(List<Integer> values) {
            addCriterion("qus_id not in", values, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdBetween(Integer value1, Integer value2) {
            addCriterion("qus_id between", value1, value2, "qusId");
            return (Criteria) this;
        }

        public Criteria andQusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qus_id not between", value1, value2, "qusId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andFindTimeIsNull() {
            addCriterion("find_time is null");
            return (Criteria) this;
        }

        public Criteria andFindTimeIsNotNull() {
            addCriterion("find_time is not null");
            return (Criteria) this;
        }

        public Criteria andFindTimeEqualTo(Date value) {
            addCriterion("find_time =", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotEqualTo(Date value) {
            addCriterion("find_time <>", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeGreaterThan(Date value) {
            addCriterion("find_time >", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("find_time >=", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeLessThan(Date value) {
            addCriterion("find_time <", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeLessThanOrEqualTo(Date value) {
            addCriterion("find_time <=", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeIn(List<Date> values) {
            addCriterion("find_time in", values, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotIn(List<Date> values) {
            addCriterion("find_time not in", values, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeBetween(Date value1, Date value2) {
            addCriterion("find_time between", value1, value2, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotBetween(Date value1, Date value2) {
            addCriterion("find_time not between", value1, value2, "findTime");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionIsNull() {
            addCriterion("ques_description is null");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionIsNotNull() {
            addCriterion("ques_description is not null");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionEqualTo(String value) {
            addCriterion("ques_description =", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionNotEqualTo(String value) {
            addCriterion("ques_description <>", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionGreaterThan(String value) {
            addCriterion("ques_description >", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ques_description >=", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionLessThan(String value) {
            addCriterion("ques_description <", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ques_description <=", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionLike(String value) {
            addCriterion("ques_description like", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionNotLike(String value) {
            addCriterion("ques_description not like", value, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionIn(List<String> values) {
            addCriterion("ques_description in", values, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionNotIn(List<String> values) {
            addCriterion("ques_description not in", values, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionBetween(String value1, String value2) {
            addCriterion("ques_description between", value1, value2, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesDescriptionNotBetween(String value1, String value2) {
            addCriterion("ques_description not between", value1, value2, "quesDescription");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisIsNull() {
            addCriterion("ques_no_suit_basis is null");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisIsNotNull() {
            addCriterion("ques_no_suit_basis is not null");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisEqualTo(String value) {
            addCriterion("ques_no_suit_basis =", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisNotEqualTo(String value) {
            addCriterion("ques_no_suit_basis <>", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisGreaterThan(String value) {
            addCriterion("ques_no_suit_basis >", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisGreaterThanOrEqualTo(String value) {
            addCriterion("ques_no_suit_basis >=", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisLessThan(String value) {
            addCriterion("ques_no_suit_basis <", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisLessThanOrEqualTo(String value) {
            addCriterion("ques_no_suit_basis <=", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisLike(String value) {
            addCriterion("ques_no_suit_basis like", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisNotLike(String value) {
            addCriterion("ques_no_suit_basis not like", value, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisIn(List<String> values) {
            addCriterion("ques_no_suit_basis in", values, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisNotIn(List<String> values) {
            addCriterion("ques_no_suit_basis not in", values, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisBetween(String value1, String value2) {
            addCriterion("ques_no_suit_basis between", value1, value2, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andQuesNoSuitBasisNotBetween(String value1, String value2) {
            addCriterion("ques_no_suit_basis not between", value1, value2, "quesNoSuitBasis");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionIsNull() {
            addCriterion("update_process_description is null");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionIsNotNull() {
            addCriterion("update_process_description is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionEqualTo(String value) {
            addCriterion("update_process_description =", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionNotEqualTo(String value) {
            addCriterion("update_process_description <>", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionGreaterThan(String value) {
            addCriterion("update_process_description >", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("update_process_description >=", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionLessThan(String value) {
            addCriterion("update_process_description <", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionLessThanOrEqualTo(String value) {
            addCriterion("update_process_description <=", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionLike(String value) {
            addCriterion("update_process_description like", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionNotLike(String value) {
            addCriterion("update_process_description not like", value, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionIn(List<String> values) {
            addCriterion("update_process_description in", values, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionNotIn(List<String> values) {
            addCriterion("update_process_description not in", values, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionBetween(String value1, String value2) {
            addCriterion("update_process_description between", value1, value2, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUpdateProcessDescriptionNotBetween(String value1, String value2) {
            addCriterion("update_process_description not between", value1, value2, "updateProcessDescription");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNull() {
            addCriterion("post_time is null");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNotNull() {
            addCriterion("post_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostTimeEqualTo(Date value) {
            addCriterion("post_time =", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterion("post_time <>", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterion("post_time >", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_time >=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThan(Date value) {
            addCriterion("post_time <", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterion("post_time <=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeIn(List<Date> values) {
            addCriterion("post_time in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterion("post_time not in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterion("post_time between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterion("post_time not between", value1, value2, "postTime");
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