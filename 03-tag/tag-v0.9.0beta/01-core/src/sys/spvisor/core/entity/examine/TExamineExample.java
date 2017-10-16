package sys.spvisor.core.entity.examine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExamineExample {
    protected String orderByClause;
    
    protected int limit =-1;
    
    protected int offset =-1;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExamineExample() {
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

        public Criteria andSubmitIdIsNull() {
            addCriterion("submit_id is null");
            return (Criteria) this;
        }

        public Criteria andSubmitIdIsNotNull() {
            addCriterion("submit_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitIdEqualTo(Integer value) {
            addCriterion("submit_id =", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdNotEqualTo(Integer value) {
            addCriterion("submit_id <>", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdGreaterThan(Integer value) {
            addCriterion("submit_id >", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit_id >=", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdLessThan(Integer value) {
            addCriterion("submit_id <", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdLessThanOrEqualTo(Integer value) {
            addCriterion("submit_id <=", value, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdIn(List<Integer> values) {
            addCriterion("submit_id in", values, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdNotIn(List<Integer> values) {
            addCriterion("submit_id not in", values, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdBetween(Integer value1, Integer value2) {
            addCriterion("submit_id between", value1, value2, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("submit_id not between", value1, value2, "submitId");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExaTypeIsNull() {
            addCriterion("exa_type is null");
            return (Criteria) this;
        }

        public Criteria andExaTypeIsNotNull() {
            addCriterion("exa_type is not null");
            return (Criteria) this;
        }

        public Criteria andExaTypeEqualTo(Integer value) {
            addCriterion("exa_type =", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeNotEqualTo(Integer value) {
            addCriterion("exa_type <>", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeGreaterThan(Integer value) {
            addCriterion("exa_type >", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exa_type >=", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeLessThan(Integer value) {
            addCriterion("exa_type <", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("exa_type <=", value, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeIn(List<Integer> values) {
            addCriterion("exa_type in", values, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeNotIn(List<Integer> values) {
            addCriterion("exa_type not in", values, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeBetween(Integer value1, Integer value2) {
            addCriterion("exa_type between", value1, value2, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("exa_type not between", value1, value2, "exaType");
            return (Criteria) this;
        }

        public Criteria andExaTitleIsNull() {
            addCriterion("exa_title is null");
            return (Criteria) this;
        }

        public Criteria andExaTitleIsNotNull() {
            addCriterion("exa_title is not null");
            return (Criteria) this;
        }

        public Criteria andExaTitleEqualTo(String value) {
            addCriterion("exa_title =", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleNotEqualTo(String value) {
            addCriterion("exa_title <>", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleGreaterThan(String value) {
            addCriterion("exa_title >", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("exa_title >=", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleLessThan(String value) {
            addCriterion("exa_title <", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleLessThanOrEqualTo(String value) {
            addCriterion("exa_title <=", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleLike(String value) {
            addCriterion("exa_title like", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleNotLike(String value) {
            addCriterion("exa_title not like", value, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleIn(List<String> values) {
            addCriterion("exa_title in", values, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleNotIn(List<String> values) {
            addCriterion("exa_title not in", values, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleBetween(String value1, String value2) {
            addCriterion("exa_title between", value1, value2, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaTitleNotBetween(String value1, String value2) {
            addCriterion("exa_title not between", value1, value2, "exaTitle");
            return (Criteria) this;
        }

        public Criteria andExaContentIsNull() {
            addCriterion("exa_content is null");
            return (Criteria) this;
        }

        public Criteria andExaContentIsNotNull() {
            addCriterion("exa_content is not null");
            return (Criteria) this;
        }

        public Criteria andExaContentEqualTo(String value) {
            addCriterion("exa_content =", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentNotEqualTo(String value) {
            addCriterion("exa_content <>", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentGreaterThan(String value) {
            addCriterion("exa_content >", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentGreaterThanOrEqualTo(String value) {
            addCriterion("exa_content >=", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentLessThan(String value) {
            addCriterion("exa_content <", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentLessThanOrEqualTo(String value) {
            addCriterion("exa_content <=", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentLike(String value) {
            addCriterion("exa_content like", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentNotLike(String value) {
            addCriterion("exa_content not like", value, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentIn(List<String> values) {
            addCriterion("exa_content in", values, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentNotIn(List<String> values) {
            addCriterion("exa_content not in", values, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentBetween(String value1, String value2) {
            addCriterion("exa_content between", value1, value2, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaContentNotBetween(String value1, String value2) {
            addCriterion("exa_content not between", value1, value2, "exaContent");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagIsNull() {
            addCriterion("exa_file_flag is null");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagIsNotNull() {
            addCriterion("exa_file_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagEqualTo(Integer value) {
            addCriterion("exa_file_flag =", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagNotEqualTo(Integer value) {
            addCriterion("exa_file_flag <>", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagGreaterThan(Integer value) {
            addCriterion("exa_file_flag >", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("exa_file_flag >=", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagLessThan(Integer value) {
            addCriterion("exa_file_flag <", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagLessThanOrEqualTo(Integer value) {
            addCriterion("exa_file_flag <=", value, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagIn(List<Integer> values) {
            addCriterion("exa_file_flag in", values, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagNotIn(List<Integer> values) {
            addCriterion("exa_file_flag not in", values, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagBetween(Integer value1, Integer value2) {
            addCriterion("exa_file_flag between", value1, value2, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFileFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("exa_file_flag not between", value1, value2, "exaFileFlag");
            return (Criteria) this;
        }

        public Criteria andExaFilePathIsNull() {
            addCriterion("exa_file_path is null");
            return (Criteria) this;
        }

        public Criteria andExaFilePathIsNotNull() {
            addCriterion("exa_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andExaFilePathEqualTo(String value) {
            addCriterion("exa_file_path =", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathNotEqualTo(String value) {
            addCriterion("exa_file_path <>", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathGreaterThan(String value) {
            addCriterion("exa_file_path >", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("exa_file_path >=", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathLessThan(String value) {
            addCriterion("exa_file_path <", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathLessThanOrEqualTo(String value) {
            addCriterion("exa_file_path <=", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathLike(String value) {
            addCriterion("exa_file_path like", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathNotLike(String value) {
            addCriterion("exa_file_path not like", value, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathIn(List<String> values) {
            addCriterion("exa_file_path in", values, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathNotIn(List<String> values) {
            addCriterion("exa_file_path not in", values, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathBetween(String value1, String value2) {
            addCriterion("exa_file_path between", value1, value2, "exaFilePath");
            return (Criteria) this;
        }

        public Criteria andExaFilePathNotBetween(String value1, String value2) {
            addCriterion("exa_file_path not between", value1, value2, "exaFilePath");
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