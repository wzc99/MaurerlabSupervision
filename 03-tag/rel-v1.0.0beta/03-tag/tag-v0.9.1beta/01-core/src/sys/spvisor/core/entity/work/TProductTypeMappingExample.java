package sys.spvisor.core.entity.work;

import java.util.ArrayList;
import java.util.List;

public class TProductTypeMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProductTypeMappingExample() {
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

        public Criteria andTypeMappingIdIsNull() {
            addCriterion("type_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdIsNotNull() {
            addCriterion("type_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdEqualTo(Integer value) {
            addCriterion("type_mapping_id =", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdNotEqualTo(Integer value) {
            addCriterion("type_mapping_id <>", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdGreaterThan(Integer value) {
            addCriterion("type_mapping_id >", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_mapping_id >=", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdLessThan(Integer value) {
            addCriterion("type_mapping_id <", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_mapping_id <=", value, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdIn(List<Integer> values) {
            addCriterion("type_mapping_id in", values, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdNotIn(List<Integer> values) {
            addCriterion("type_mapping_id not in", values, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdBetween(Integer value1, Integer value2) {
            addCriterion("type_mapping_id between", value1, value2, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andTypeMappingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_mapping_id not between", value1, value2, "typeMappingId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIsNull() {
            addCriterion("big_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIsNotNull() {
            addCriterion("big_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdEqualTo(Integer value) {
            addCriterion("big_type_id =", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotEqualTo(Integer value) {
            addCriterion("big_type_id <>", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdGreaterThan(Integer value) {
            addCriterion("big_type_id >", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_type_id >=", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdLessThan(Integer value) {
            addCriterion("big_type_id <", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("big_type_id <=", value, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdIn(List<Integer> values) {
            addCriterion("big_type_id in", values, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotIn(List<Integer> values) {
            addCriterion("big_type_id not in", values, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("big_type_id between", value1, value2, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("big_type_id not between", value1, value2, "bigTypeId");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameIsNull() {
            addCriterion("big_type_name is null");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameIsNotNull() {
            addCriterion("big_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameEqualTo(String value) {
            addCriterion("big_type_name =", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameNotEqualTo(String value) {
            addCriterion("big_type_name <>", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameGreaterThan(String value) {
            addCriterion("big_type_name >", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_type_name >=", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameLessThan(String value) {
            addCriterion("big_type_name <", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameLessThanOrEqualTo(String value) {
            addCriterion("big_type_name <=", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameLike(String value) {
            addCriterion("big_type_name like", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameNotLike(String value) {
            addCriterion("big_type_name not like", value, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameIn(List<String> values) {
            addCriterion("big_type_name in", values, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameNotIn(List<String> values) {
            addCriterion("big_type_name not in", values, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameBetween(String value1, String value2) {
            addCriterion("big_type_name between", value1, value2, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andBigTypeNameNotBetween(String value1, String value2) {
            addCriterion("big_type_name not between", value1, value2, "bigTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIsNull() {
            addCriterion("small_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIsNotNull() {
            addCriterion("small_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdEqualTo(Integer value) {
            addCriterion("small_type_id =", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotEqualTo(Integer value) {
            addCriterion("small_type_id <>", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdGreaterThan(Integer value) {
            addCriterion("small_type_id >", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("small_type_id >=", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdLessThan(Integer value) {
            addCriterion("small_type_id <", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("small_type_id <=", value, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdIn(List<Integer> values) {
            addCriterion("small_type_id in", values, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotIn(List<Integer> values) {
            addCriterion("small_type_id not in", values, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("small_type_id between", value1, value2, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("small_type_id not between", value1, value2, "smallTypeId");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameIsNull() {
            addCriterion("small_type_name is null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameIsNotNull() {
            addCriterion("small_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameEqualTo(String value) {
            addCriterion("small_type_name =", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameNotEqualTo(String value) {
            addCriterion("small_type_name <>", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameGreaterThan(String value) {
            addCriterion("small_type_name >", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("small_type_name >=", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameLessThan(String value) {
            addCriterion("small_type_name <", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameLessThanOrEqualTo(String value) {
            addCriterion("small_type_name <=", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameLike(String value) {
            addCriterion("small_type_name like", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameNotLike(String value) {
            addCriterion("small_type_name not like", value, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameIn(List<String> values) {
            addCriterion("small_type_name in", values, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameNotIn(List<String> values) {
            addCriterion("small_type_name not in", values, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameBetween(String value1, String value2) {
            addCriterion("small_type_name between", value1, value2, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNameNotBetween(String value1, String value2) {
            addCriterion("small_type_name not between", value1, value2, "smallTypeName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIsNull() {
            addCriterion("three_level_name is null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIsNotNull() {
            addCriterion("three_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameEqualTo(String value) {
            addCriterion("three_level_name =", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotEqualTo(String value) {
            addCriterion("three_level_name <>", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameGreaterThan(String value) {
            addCriterion("three_level_name >", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("three_level_name >=", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLessThan(String value) {
            addCriterion("three_level_name <", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLessThanOrEqualTo(String value) {
            addCriterion("three_level_name <=", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameLike(String value) {
            addCriterion("three_level_name like", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotLike(String value) {
            addCriterion("three_level_name not like", value, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameIn(List<String> values) {
            addCriterion("three_level_name in", values, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotIn(List<String> values) {
            addCriterion("three_level_name not in", values, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameBetween(String value1, String value2) {
            addCriterion("three_level_name between", value1, value2, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelNameNotBetween(String value1, String value2) {
            addCriterion("three_level_name not between", value1, value2, "threeLevelName");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdIsNull() {
            addCriterion("three_level_id is null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdIsNotNull() {
            addCriterion("three_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdEqualTo(Integer value) {
            addCriterion("three_level_id =", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdNotEqualTo(Integer value) {
            addCriterion("three_level_id <>", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdGreaterThan(Integer value) {
            addCriterion("three_level_id >", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_level_id >=", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdLessThan(Integer value) {
            addCriterion("three_level_id <", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("three_level_id <=", value, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdIn(List<Integer> values) {
            addCriterion("three_level_id in", values, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdNotIn(List<Integer> values) {
            addCriterion("three_level_id not in", values, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("three_level_id between", value1, value2, "threeLevelId");
            return (Criteria) this;
        }

        public Criteria andThreeLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("three_level_id not between", value1, value2, "threeLevelId");
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