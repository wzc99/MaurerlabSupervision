package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.util.List;

public class TFileCheckProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFileCheckProcessExample() {
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

        public Criteria andFileCheckProcessIdIsNull() {
            addCriterion("file_check_process_id is null");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdIsNotNull() {
            addCriterion("file_check_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdEqualTo(Integer value) {
            addCriterion("file_check_process_id =", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdNotEqualTo(Integer value) {
            addCriterion("file_check_process_id <>", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdGreaterThan(Integer value) {
            addCriterion("file_check_process_id >", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_check_process_id >=", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdLessThan(Integer value) {
            addCriterion("file_check_process_id <", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_check_process_id <=", value, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdIn(List<Integer> values) {
            addCriterion("file_check_process_id in", values, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdNotIn(List<Integer> values) {
            addCriterion("file_check_process_id not in", values, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("file_check_process_id between", value1, value2, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileCheckProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_check_process_id not between", value1, value2, "fileCheckProcessId");
            return (Criteria) this;
        }

        public Criteria andFileBelongToIsNull() {
            addCriterion("file_belong_to is null");
            return (Criteria) this;
        }

        public Criteria andFileBelongToIsNotNull() {
            addCriterion("file_belong_to is not null");
            return (Criteria) this;
        }

        public Criteria andFileBelongToEqualTo(String value) {
            addCriterion("file_belong_to =", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToNotEqualTo(String value) {
            addCriterion("file_belong_to <>", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToGreaterThan(String value) {
            addCriterion("file_belong_to >", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToGreaterThanOrEqualTo(String value) {
            addCriterion("file_belong_to >=", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToLessThan(String value) {
            addCriterion("file_belong_to <", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToLessThanOrEqualTo(String value) {
            addCriterion("file_belong_to <=", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToLike(String value) {
            addCriterion("file_belong_to like", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToNotLike(String value) {
            addCriterion("file_belong_to not like", value, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToIn(List<String> values) {
            addCriterion("file_belong_to in", values, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToNotIn(List<String> values) {
            addCriterion("file_belong_to not in", values, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToBetween(String value1, String value2) {
            addCriterion("file_belong_to between", value1, value2, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileBelongToNotBetween(String value1, String value2) {
            addCriterion("file_belong_to not between", value1, value2, "fileBelongTo");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusIsNull() {
            addCriterion("file_current_status is null");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusIsNotNull() {
            addCriterion("file_current_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusEqualTo(Integer value) {
            addCriterion("file_current_status =", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusNotEqualTo(Integer value) {
            addCriterion("file_current_status <>", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusGreaterThan(Integer value) {
            addCriterion("file_current_status >", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_current_status >=", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusLessThan(Integer value) {
            addCriterion("file_current_status <", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("file_current_status <=", value, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusIn(List<Integer> values) {
            addCriterion("file_current_status in", values, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusNotIn(List<Integer> values) {
            addCriterion("file_current_status not in", values, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusBetween(Integer value1, Integer value2) {
            addCriterion("file_current_status between", value1, value2, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileCurrentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("file_current_status not between", value1, value2, "fileCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleIsNull() {
            addCriterion("file_operate_role is null");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleIsNotNull() {
            addCriterion("file_operate_role is not null");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleEqualTo(String value) {
            addCriterion("file_operate_role =", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleNotEqualTo(String value) {
            addCriterion("file_operate_role <>", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleGreaterThan(String value) {
            addCriterion("file_operate_role >", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleGreaterThanOrEqualTo(String value) {
            addCriterion("file_operate_role >=", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleLessThan(String value) {
            addCriterion("file_operate_role <", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleLessThanOrEqualTo(String value) {
            addCriterion("file_operate_role <=", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleLike(String value) {
            addCriterion("file_operate_role like", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleNotLike(String value) {
            addCriterion("file_operate_role not like", value, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleIn(List<String> values) {
            addCriterion("file_operate_role in", values, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleNotIn(List<String> values) {
            addCriterion("file_operate_role not in", values, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleBetween(String value1, String value2) {
            addCriterion("file_operate_role between", value1, value2, "fileOperateRole");
            return (Criteria) this;
        }

        public Criteria andFileOperateRoleNotBetween(String value1, String value2) {
            addCriterion("file_operate_role not between", value1, value2, "fileOperateRole");
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