package sys.spvisor.core.entity.attendance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAttendanceExample {
    protected String orderByClause;
    
    protected int limit=-1;
    
    protected int offset=-1;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAttendanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }
    
    

    public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
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
        limit = -1;
        offset = -1;
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

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andNote1IsNull() {
            addCriterion("note1 is null");
            return (Criteria) this;
        }

        public Criteria andNote1IsNotNull() {
            addCriterion("note1 is not null");
            return (Criteria) this;
        }

        public Criteria andNote1EqualTo(String value) {
            addCriterion("note1 =", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotEqualTo(String value) {
            addCriterion("note1 <>", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThan(String value) {
            addCriterion("note1 >", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThanOrEqualTo(String value) {
            addCriterion("note1 >=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThan(String value) {
            addCriterion("note1 <", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThanOrEqualTo(String value) {
            addCriterion("note1 <=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Like(String value) {
            addCriterion("note1 like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotLike(String value) {
            addCriterion("note1 not like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1In(List<String> values) {
            addCriterion("note1 in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotIn(List<String> values) {
            addCriterion("note1 not in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Between(String value1, String value2) {
            addCriterion("note1 between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotBetween(String value1, String value2) {
            addCriterion("note1 not between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andToStatusIdIsNull() {
            addCriterion("to_status_id is null");
            return (Criteria) this;
        }

        public Criteria andToStatusIdIsNotNull() {
            addCriterion("to_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andToStatusIdEqualTo(Integer value) {
            addCriterion("to_status_id =", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdNotEqualTo(Integer value) {
            addCriterion("to_status_id <>", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdGreaterThan(Integer value) {
            addCriterion("to_status_id >", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_status_id >=", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdLessThan(Integer value) {
            addCriterion("to_status_id <", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_status_id <=", value, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdIn(List<Integer> values) {
            addCriterion("to_status_id in", values, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdNotIn(List<Integer> values) {
            addCriterion("to_status_id not in", values, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("to_status_id between", value1, value2, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andToStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_status_id not between", value1, value2, "toStatusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusIsNull() {
            addCriterion("status_id_status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusIsNotNull() {
            addCriterion("status_id_status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusEqualTo(Integer value) {
            addCriterion("status_id_status =", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusNotEqualTo(Integer value) {
            addCriterion("status_id_status <>", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusGreaterThan(Integer value) {
            addCriterion("status_id_status >", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id_status >=", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusLessThan(Integer value) {
            addCriterion("status_id_status <", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status_id_status <=", value, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusIn(List<Integer> values) {
            addCriterion("status_id_status in", values, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusNotIn(List<Integer> values) {
            addCriterion("status_id_status not in", values, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusBetween(Integer value1, Integer value2) {
            addCriterion("status_id_status between", value1, value2, "statusIdStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id_status not between", value1, value2, "statusIdStatus");
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