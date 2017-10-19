package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.util.List;

public class TQuestionFileFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionFileFormExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTProblemIdIsNull() {
            addCriterion("t_problem_id is null");
            return (Criteria) this;
        }

        public Criteria andTProblemIdIsNotNull() {
            addCriterion("t_problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andTProblemIdEqualTo(Integer value) {
            addCriterion("t_problem_id =", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdNotEqualTo(Integer value) {
            addCriterion("t_problem_id <>", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdGreaterThan(Integer value) {
            addCriterion("t_problem_id >", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_problem_id >=", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdLessThan(Integer value) {
            addCriterion("t_problem_id <", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_problem_id <=", value, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdIn(List<Integer> values) {
            addCriterion("t_problem_id in", values, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdNotIn(List<Integer> values) {
            addCriterion("t_problem_id not in", values, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("t_problem_id between", value1, value2, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_problem_id not between", value1, value2, "tProblemId");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("t_type is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("t_type is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(Integer value) {
            addCriterion("t_type =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(Integer value) {
            addCriterion("t_type <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(Integer value) {
            addCriterion("t_type >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_type >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(Integer value) {
            addCriterion("t_type <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(Integer value) {
            addCriterion("t_type <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<Integer> values) {
            addCriterion("t_type in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<Integer> values) {
            addCriterion("t_type not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(Integer value1, Integer value2) {
            addCriterion("t_type between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_type not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdIsNull() {
            addCriterion("t_file_form_id is null");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdIsNotNull() {
            addCriterion("t_file_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdEqualTo(Integer value) {
            addCriterion("t_file_form_id =", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdNotEqualTo(Integer value) {
            addCriterion("t_file_form_id <>", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdGreaterThan(Integer value) {
            addCriterion("t_file_form_id >", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_file_form_id >=", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdLessThan(Integer value) {
            addCriterion("t_file_form_id <", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_file_form_id <=", value, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdIn(List<Integer> values) {
            addCriterion("t_file_form_id in", values, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdNotIn(List<Integer> values) {
            addCriterion("t_file_form_id not in", values, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdBetween(Integer value1, Integer value2) {
            addCriterion("t_file_form_id between", value1, value2, "tFileFormId");
            return (Criteria) this;
        }

        public Criteria andTFileFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_file_form_id not between", value1, value2, "tFileFormId");
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