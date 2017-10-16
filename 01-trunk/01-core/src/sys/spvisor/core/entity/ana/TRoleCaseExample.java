package sys.spvisor.core.entity.ana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRoleCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRoleCaseExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNull() {
            addCriterion("role_desc is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNotNull() {
            addCriterion("role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescEqualTo(String value) {
            addCriterion("role_desc =", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotEqualTo(String value) {
            addCriterion("role_desc <>", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThan(String value) {
            addCriterion("role_desc >", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("role_desc >=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThan(String value) {
            addCriterion("role_desc <", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThanOrEqualTo(String value) {
            addCriterion("role_desc <=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLike(String value) {
            addCriterion("role_desc like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotLike(String value) {
            addCriterion("role_desc not like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescIn(List<String> values) {
            addCriterion("role_desc in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotIn(List<String> values) {
            addCriterion("role_desc not in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescBetween(String value1, String value2) {
            addCriterion("role_desc between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotBetween(String value1, String value2) {
            addCriterion("role_desc not between", value1, value2, "roleDesc");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNull() {
            addCriterion("module_code is null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNotNull() {
            addCriterion("module_code is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeEqualTo(String value) {
            addCriterion("module_code =", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotEqualTo(String value) {
            addCriterion("module_code <>", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThan(String value) {
            addCriterion("module_code >", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("module_code >=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThan(String value) {
            addCriterion("module_code <", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("module_code <=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLike(String value) {
            addCriterion("module_code like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotLike(String value) {
            addCriterion("module_code not like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIn(List<String> values) {
            addCriterion("module_code in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotIn(List<String> values) {
            addCriterion("module_code not in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeBetween(String value1, String value2) {
            addCriterion("module_code between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotBetween(String value1, String value2) {
            addCriterion("module_code not between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIsNull() {
            addCriterion("case_operator is null");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIsNotNull() {
            addCriterion("case_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorEqualTo(Integer value) {
            addCriterion("case_operator =", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotEqualTo(Integer value) {
            addCriterion("case_operator <>", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorGreaterThan(Integer value) {
            addCriterion("case_operator >", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_operator >=", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorLessThan(Integer value) {
            addCriterion("case_operator <", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("case_operator <=", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIn(List<Integer> values) {
            addCriterion("case_operator in", values, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotIn(List<Integer> values) {
            addCriterion("case_operator not in", values, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorBetween(Integer value1, Integer value2) {
            addCriterion("case_operator between", value1, value2, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("case_operator not between", value1, value2, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("case_status =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("case_status <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("case_status >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_status >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("case_status <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("case_status <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("case_status like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("case_status not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("case_status in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("case_status not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("case_status between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("case_status not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIsNull() {
            addCriterion("case_open_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIsNotNull() {
            addCriterion("case_open_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusEqualTo(String value) {
            addCriterion("case_open_status =", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotEqualTo(String value) {
            addCriterion("case_open_status <>", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusGreaterThan(String value) {
            addCriterion("case_open_status >", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_open_status >=", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLessThan(String value) {
            addCriterion("case_open_status <", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLessThanOrEqualTo(String value) {
            addCriterion("case_open_status <=", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLike(String value) {
            addCriterion("case_open_status like", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotLike(String value) {
            addCriterion("case_open_status not like", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIn(List<String> values) {
            addCriterion("case_open_status in", values, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotIn(List<String> values) {
            addCriterion("case_open_status not in", values, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusBetween(String value1, String value2) {
            addCriterion("case_open_status between", value1, value2, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotBetween(String value1, String value2) {
            addCriterion("case_open_status not between", value1, value2, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNull() {
            addCriterion("case_time is null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNotNull() {
            addCriterion("case_time is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeEqualTo(Date value) {
            addCriterion("case_time =", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotEqualTo(Date value) {
            addCriterion("case_time <>", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThan(Date value) {
            addCriterion("case_time >", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("case_time >=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThan(Date value) {
            addCriterion("case_time <", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("case_time <=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIn(List<Date> values) {
            addCriterion("case_time in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotIn(List<Date> values) {
            addCriterion("case_time not in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeBetween(Date value1, Date value2) {
            addCriterion("case_time between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("case_time not between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIsNull() {
            addCriterion("case_judgment is null");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIsNotNull() {
            addCriterion("case_judgment is not null");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentEqualTo(String value) {
            addCriterion("case_judgment =", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotEqualTo(String value) {
            addCriterion("case_judgment <>", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentGreaterThan(String value) {
            addCriterion("case_judgment >", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("case_judgment >=", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLessThan(String value) {
            addCriterion("case_judgment <", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLessThanOrEqualTo(String value) {
            addCriterion("case_judgment <=", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLike(String value) {
            addCriterion("case_judgment like", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotLike(String value) {
            addCriterion("case_judgment not like", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIn(List<String> values) {
            addCriterion("case_judgment in", values, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotIn(List<String> values) {
            addCriterion("case_judgment not in", values, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentBetween(String value1, String value2) {
            addCriterion("case_judgment between", value1, value2, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotBetween(String value1, String value2) {
            addCriterion("case_judgment not between", value1, value2, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNull() {
            addCriterion("real_id is null");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNotNull() {
            addCriterion("real_id is not null");
            return (Criteria) this;
        }

        public Criteria andRealIdEqualTo(Long value) {
            addCriterion("real_id =", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotEqualTo(Long value) {
            addCriterion("real_id <>", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThan(Long value) {
            addCriterion("real_id >", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("real_id >=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThan(Long value) {
            addCriterion("real_id <", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThanOrEqualTo(Long value) {
            addCriterion("real_id <=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdIn(List<Long> values) {
            addCriterion("real_id in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotIn(List<Long> values) {
            addCriterion("real_id not in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdBetween(Long value1, Long value2) {
            addCriterion("real_id between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotBetween(Long value1, Long value2) {
            addCriterion("real_id not between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIsNull() {
            addCriterion("last_company_case_id is null");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIsNotNull() {
            addCriterion("last_company_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdEqualTo(Integer value) {
            addCriterion("last_company_case_id =", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotEqualTo(Integer value) {
            addCriterion("last_company_case_id <>", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdGreaterThan(Integer value) {
            addCriterion("last_company_case_id >", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_company_case_id >=", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdLessThan(Integer value) {
            addCriterion("last_company_case_id <", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_company_case_id <=", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIn(List<Integer> values) {
            addCriterion("last_company_case_id in", values, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotIn(List<Integer> values) {
            addCriterion("last_company_case_id not in", values, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("last_company_case_id between", value1, value2, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_company_case_id not between", value1, value2, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIsNull() {
            addCriterion("case_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIsNotNull() {
            addCriterion("case_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdEqualTo(Integer value) {
            addCriterion("case_owner_id =", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotEqualTo(Integer value) {
            addCriterion("case_owner_id <>", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdGreaterThan(Integer value) {
            addCriterion("case_owner_id >", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_owner_id >=", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdLessThan(Integer value) {
            addCriterion("case_owner_id <", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_owner_id <=", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIn(List<Integer> values) {
            addCriterion("case_owner_id in", values, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotIn(List<Integer> values) {
            addCriterion("case_owner_id not in", values, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("case_owner_id between", value1, value2, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_owner_id not between", value1, value2, "caseOwnerId");
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