package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class TBigProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected int limit =-1;
    
    protected int offset =-1;

    public TBigProjectExample() {
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

        public Criteria andBigProjectIdIsNull() {
            addCriterion("big_project_id is null");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdIsNotNull() {
            addCriterion("big_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdEqualTo(Integer value) {
            addCriterion("big_project_id =", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdNotEqualTo(Integer value) {
            addCriterion("big_project_id <>", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdGreaterThan(Integer value) {
            addCriterion("big_project_id >", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_project_id >=", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdLessThan(Integer value) {
            addCriterion("big_project_id <", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("big_project_id <=", value, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdIn(List<Integer> values) {
            addCriterion("big_project_id in", values, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdNotIn(List<Integer> values) {
            addCriterion("big_project_id not in", values, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("big_project_id between", value1, value2, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("big_project_id not between", value1, value2, "bigProjectId");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameIsNull() {
            addCriterion("big_project_name is null");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameIsNotNull() {
            addCriterion("big_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameEqualTo(String value) {
            addCriterion("big_project_name =", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameNotEqualTo(String value) {
            addCriterion("big_project_name <>", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameGreaterThan(String value) {
            addCriterion("big_project_name >", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("big_project_name >=", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameLessThan(String value) {
            addCriterion("big_project_name <", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameLessThanOrEqualTo(String value) {
            addCriterion("big_project_name <=", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameLike(String value) {
            addCriterion("big_project_name like", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameNotLike(String value) {
            addCriterion("big_project_name not like", value, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameIn(List<String> values) {
            addCriterion("big_project_name in", values, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameNotIn(List<String> values) {
            addCriterion("big_project_name not in", values, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameBetween(String value1, String value2) {
            addCriterion("big_project_name between", value1, value2, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectNameNotBetween(String value1, String value2) {
            addCriterion("big_project_name not between", value1, value2, "bigProjectName");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeIsNull() {
            addCriterion("big_project_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeIsNotNull() {
            addCriterion("big_project_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeEqualTo(Date value) {
            addCriterion("big_project_create_time =", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeNotEqualTo(Date value) {
            addCriterion("big_project_create_time <>", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeGreaterThan(Date value) {
            addCriterion("big_project_create_time >", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("big_project_create_time >=", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeLessThan(Date value) {
            addCriterion("big_project_create_time <", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("big_project_create_time <=", value, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeIn(List<Date> values) {
            addCriterion("big_project_create_time in", values, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeNotIn(List<Date> values) {
            addCriterion("big_project_create_time not in", values, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeBetween(Date value1, Date value2) {
            addCriterion("big_project_create_time between", value1, value2, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("big_project_create_time not between", value1, value2, "bigProjectCreateTime");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIsNull() {
            addCriterion("big_project_create_people is null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIsNotNull() {
            addCriterion("big_project_create_people is not null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleEqualTo(String value) {
            addCriterion("big_project_create_people =", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleNotEqualTo(String value) {
            addCriterion("big_project_create_people <>", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleGreaterThan(String value) {
            addCriterion("big_project_create_people >", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("big_project_create_people >=", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleLessThan(String value) {
            addCriterion("big_project_create_people <", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleLessThanOrEqualTo(String value) {
            addCriterion("big_project_create_people <=", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleLike(String value) {
            addCriterion("big_project_create_people like", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleNotLike(String value) {
            addCriterion("big_project_create_people not like", value, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIn(List<String> values) {
            addCriterion("big_project_create_people in", values, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleNotIn(List<String> values) {
            addCriterion("big_project_create_people not in", values, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleBetween(String value1, String value2) {
            addCriterion("big_project_create_people between", value1, value2, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleNotBetween(String value1, String value2) {
            addCriterion("big_project_create_people not between", value1, value2, "bigProjectCreatePeople");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdIsNull() {
            addCriterion("big_project_create_people_id is null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdIsNotNull() {
            addCriterion("big_project_create_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdEqualTo(Integer value) {
            addCriterion("big_project_create_people_id =", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdNotEqualTo(Integer value) {
            addCriterion("big_project_create_people_id <>", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdGreaterThan(Integer value) {
            addCriterion("big_project_create_people_id >", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_project_create_people_id >=", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdLessThan(Integer value) {
            addCriterion("big_project_create_people_id <", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("big_project_create_people_id <=", value, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdIn(List<Integer> values) {
            addCriterion("big_project_create_people_id in", values, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdNotIn(List<Integer> values) {
            addCriterion("big_project_create_people_id not in", values, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("big_project_create_people_id between", value1, value2, "bigProjectCreatePeopleId");
            return (Criteria) this;
        }

        public Criteria andBigProjectCreatePeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("big_project_create_people_id not between", value1, value2, "bigProjectCreatePeopleId");
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