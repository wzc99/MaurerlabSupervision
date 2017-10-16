package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TValveProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TValveProcessExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andValvePromiseDateIsNull() {
            addCriterion("valve_promise_date is null");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateIsNotNull() {
            addCriterion("valve_promise_date is not null");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateEqualTo(Date value) {
            addCriterionForJDBCDate("valve_promise_date =", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valve_promise_date <>", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("valve_promise_date >", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_promise_date >=", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateLessThan(Date value) {
            addCriterionForJDBCDate("valve_promise_date <", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_promise_date <=", value, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateIn(List<Date> values) {
            addCriterionForJDBCDate("valve_promise_date in", values, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valve_promise_date not in", values, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_promise_date between", value1, value2, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValvePromiseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_promise_date not between", value1, value2, "valvePromiseDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateIsNull() {
            addCriterion("valve_sumbit_date is null");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateIsNotNull() {
            addCriterion("valve_sumbit_date is not null");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateEqualTo(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date =", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date <>", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date >", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date >=", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateLessThan(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date <", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_sumbit_date <=", value, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateIn(List<Date> values) {
            addCriterionForJDBCDate("valve_sumbit_date in", values, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valve_sumbit_date not in", values, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_sumbit_date between", value1, value2, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValveSumbitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_sumbit_date not between", value1, value2, "valveSumbitDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateIsNull() {
            addCriterion("valve_plan_date is null");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateIsNotNull() {
            addCriterion("valve_plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("valve_plan_date =", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valve_plan_date <>", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("valve_plan_date >", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_plan_date >=", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateLessThan(Date value) {
            addCriterionForJDBCDate("valve_plan_date <", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valve_plan_date <=", value, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("valve_plan_date in", values, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valve_plan_date not in", values, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_plan_date between", value1, value2, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValvePlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valve_plan_date not between", value1, value2, "valvePlanDate");
            return (Criteria) this;
        }

        public Criteria andValveProductNormIsNull() {
            addCriterion("valve_product_norm is null");
            return (Criteria) this;
        }

        public Criteria andValveProductNormIsNotNull() {
            addCriterion("valve_product_norm is not null");
            return (Criteria) this;
        }

        public Criteria andValveProductNormEqualTo(String value) {
            addCriterion("valve_product_norm =", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormNotEqualTo(String value) {
            addCriterion("valve_product_norm <>", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormGreaterThan(String value) {
            addCriterion("valve_product_norm >", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormGreaterThanOrEqualTo(String value) {
            addCriterion("valve_product_norm >=", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormLessThan(String value) {
            addCriterion("valve_product_norm <", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormLessThanOrEqualTo(String value) {
            addCriterion("valve_product_norm <=", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormLike(String value) {
            addCriterion("valve_product_norm like", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormNotLike(String value) {
            addCriterion("valve_product_norm not like", value, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormIn(List<String> values) {
            addCriterion("valve_product_norm in", values, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormNotIn(List<String> values) {
            addCriterion("valve_product_norm not in", values, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormBetween(String value1, String value2) {
            addCriterion("valve_product_norm between", value1, value2, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveProductNormNotBetween(String value1, String value2) {
            addCriterion("valve_product_norm not between", value1, value2, "valveProductNorm");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveIsNull() {
            addCriterion("valve_body_arrive is null");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveIsNotNull() {
            addCriterion("valve_body_arrive is not null");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveEqualTo(Integer value) {
            addCriterion("valve_body_arrive =", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveNotEqualTo(Integer value) {
            addCriterion("valve_body_arrive <>", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveGreaterThan(Integer value) {
            addCriterion("valve_body_arrive >", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_body_arrive >=", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveLessThan(Integer value) {
            addCriterion("valve_body_arrive <", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveLessThanOrEqualTo(Integer value) {
            addCriterion("valve_body_arrive <=", value, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveIn(List<Integer> values) {
            addCriterion("valve_body_arrive in", values, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveNotIn(List<Integer> values) {
            addCriterion("valve_body_arrive not in", values, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_arrive between", value1, value2, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyArriveNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_arrive not between", value1, value2, "valveBodyArrive");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessIsNull() {
            addCriterion("valve_body_process is null");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessIsNotNull() {
            addCriterion("valve_body_process is not null");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessEqualTo(Integer value) {
            addCriterion("valve_body_process =", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessNotEqualTo(Integer value) {
            addCriterion("valve_body_process <>", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessGreaterThan(Integer value) {
            addCriterion("valve_body_process >", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_body_process >=", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessLessThan(Integer value) {
            addCriterion("valve_body_process <", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessLessThanOrEqualTo(Integer value) {
            addCriterion("valve_body_process <=", value, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessIn(List<Integer> values) {
            addCriterion("valve_body_process in", values, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessNotIn(List<Integer> values) {
            addCriterion("valve_body_process not in", values, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_process between", value1, value2, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveBodyProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_process not between", value1, value2, "valveBodyProcess");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyIsNull() {
            addCriterion("valve_final_assembly is null");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyIsNotNull() {
            addCriterion("valve_final_assembly is not null");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyEqualTo(Integer value) {
            addCriterion("valve_final_assembly =", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyNotEqualTo(Integer value) {
            addCriterion("valve_final_assembly <>", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyGreaterThan(Integer value) {
            addCriterion("valve_final_assembly >", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_final_assembly >=", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyLessThan(Integer value) {
            addCriterion("valve_final_assembly <", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyLessThanOrEqualTo(Integer value) {
            addCriterion("valve_final_assembly <=", value, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyIn(List<Integer> values) {
            addCriterion("valve_final_assembly in", values, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyNotIn(List<Integer> values) {
            addCriterion("valve_final_assembly not in", values, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyBetween(Integer value1, Integer value2) {
            addCriterion("valve_final_assembly between", value1, value2, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValveFinalAssemblyNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_final_assembly not between", value1, value2, "valveFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestIsNull() {
            addCriterion("valve_performance_test is null");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestIsNotNull() {
            addCriterion("valve_performance_test is not null");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestEqualTo(Integer value) {
            addCriterion("valve_performance_test =", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestNotEqualTo(Integer value) {
            addCriterion("valve_performance_test <>", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestGreaterThan(Integer value) {
            addCriterion("valve_performance_test >", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_performance_test >=", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestLessThan(Integer value) {
            addCriterion("valve_performance_test <", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestLessThanOrEqualTo(Integer value) {
            addCriterion("valve_performance_test <=", value, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestIn(List<Integer> values) {
            addCriterion("valve_performance_test in", values, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestNotIn(List<Integer> values) {
            addCriterion("valve_performance_test not in", values, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestBetween(Integer value1, Integer value2) {
            addCriterion("valve_performance_test between", value1, value2, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValvePerformanceTestNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_performance_test not between", value1, value2, "valvePerformanceTest");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintIsNull() {
            addCriterion("valve_oil_paint is null");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintIsNotNull() {
            addCriterion("valve_oil_paint is not null");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintEqualTo(Integer value) {
            addCriterion("valve_oil_paint =", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintNotEqualTo(Integer value) {
            addCriterion("valve_oil_paint <>", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintGreaterThan(Integer value) {
            addCriterion("valve_oil_paint >", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_oil_paint >=", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintLessThan(Integer value) {
            addCriterion("valve_oil_paint <", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintLessThanOrEqualTo(Integer value) {
            addCriterion("valve_oil_paint <=", value, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintIn(List<Integer> values) {
            addCriterion("valve_oil_paint in", values, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintNotIn(List<Integer> values) {
            addCriterion("valve_oil_paint not in", values, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintBetween(Integer value1, Integer value2) {
            addCriterion("valve_oil_paint between", value1, value2, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveOilPaintNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_oil_paint not between", value1, value2, "valveOilPaint");
            return (Criteria) this;
        }

        public Criteria andValveSendIsNull() {
            addCriterion("valve_send is null");
            return (Criteria) this;
        }

        public Criteria andValveSendIsNotNull() {
            addCriterion("valve_send is not null");
            return (Criteria) this;
        }

        public Criteria andValveSendEqualTo(Integer value) {
            addCriterion("valve_send =", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendNotEqualTo(Integer value) {
            addCriterion("valve_send <>", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendGreaterThan(Integer value) {
            addCriterion("valve_send >", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_send >=", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendLessThan(Integer value) {
            addCriterion("valve_send <", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendLessThanOrEqualTo(Integer value) {
            addCriterion("valve_send <=", value, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendIn(List<Integer> values) {
            addCriterion("valve_send in", values, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendNotIn(List<Integer> values) {
            addCriterion("valve_send not in", values, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendBetween(Integer value1, Integer value2) {
            addCriterion("valve_send between", value1, value2, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveSendNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_send not between", value1, value2, "valveSend");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldIsNull() {
            addCriterion("valve_body_weld is null");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldIsNotNull() {
            addCriterion("valve_body_weld is not null");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldEqualTo(Integer value) {
            addCriterion("valve_body_weld =", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldNotEqualTo(Integer value) {
            addCriterion("valve_body_weld <>", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldGreaterThan(Integer value) {
            addCriterion("valve_body_weld >", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldGreaterThanOrEqualTo(Integer value) {
            addCriterion("valve_body_weld >=", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldLessThan(Integer value) {
            addCriterion("valve_body_weld <", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldLessThanOrEqualTo(Integer value) {
            addCriterion("valve_body_weld <=", value, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldIn(List<Integer> values) {
            addCriterion("valve_body_weld in", values, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldNotIn(List<Integer> values) {
            addCriterion("valve_body_weld not in", values, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_weld between", value1, value2, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andValveBodyWeldNotBetween(Integer value1, Integer value2) {
            addCriterion("valve_body_weld not between", value1, value2, "valveBodyWeld");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIsNull() {
            addCriterion("non_des_check is null");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIsNotNull() {
            addCriterion("non_des_check is not null");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckEqualTo(Integer value) {
            addCriterion("non_des_check =", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotEqualTo(Integer value) {
            addCriterion("non_des_check <>", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckGreaterThan(Integer value) {
            addCriterion("non_des_check >", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("non_des_check >=", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckLessThan(Integer value) {
            addCriterion("non_des_check <", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckLessThanOrEqualTo(Integer value) {
            addCriterion("non_des_check <=", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIn(List<Integer> values) {
            addCriterion("non_des_check in", values, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotIn(List<Integer> values) {
            addCriterion("non_des_check not in", values, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckBetween(Integer value1, Integer value2) {
            addCriterion("non_des_check between", value1, value2, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("non_des_check not between", value1, value2, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentIsNull() {
            addCriterion("strength_experiment is null");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentIsNotNull() {
            addCriterion("strength_experiment is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentEqualTo(Integer value) {
            addCriterion("strength_experiment =", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentNotEqualTo(Integer value) {
            addCriterion("strength_experiment <>", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentGreaterThan(Integer value) {
            addCriterion("strength_experiment >", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentGreaterThanOrEqualTo(Integer value) {
            addCriterion("strength_experiment >=", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentLessThan(Integer value) {
            addCriterion("strength_experiment <", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentLessThanOrEqualTo(Integer value) {
            addCriterion("strength_experiment <=", value, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentIn(List<Integer> values) {
            addCriterion("strength_experiment in", values, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentNotIn(List<Integer> values) {
            addCriterion("strength_experiment not in", values, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentBetween(Integer value1, Integer value2) {
            addCriterion("strength_experiment between", value1, value2, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andStrengthExperimentNotBetween(Integer value1, Integer value2) {
            addCriterion("strength_experiment not between", value1, value2, "strengthExperiment");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingIsNull() {
            addCriterion("finishing_warehousing is null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingIsNotNull() {
            addCriterion("finishing_warehousing is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingEqualTo(Integer value) {
            addCriterion("finishing_warehousing =", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingNotEqualTo(Integer value) {
            addCriterion("finishing_warehousing <>", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingGreaterThan(Integer value) {
            addCriterion("finishing_warehousing >", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishing_warehousing >=", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingLessThan(Integer value) {
            addCriterion("finishing_warehousing <", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingLessThanOrEqualTo(Integer value) {
            addCriterion("finishing_warehousing <=", value, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingIn(List<Integer> values) {
            addCriterion("finishing_warehousing in", values, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingNotIn(List<Integer> values) {
            addCriterion("finishing_warehousing not in", values, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingBetween(Integer value1, Integer value2) {
            addCriterion("finishing_warehousing between", value1, value2, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingNotBetween(Integer value1, Integer value2) {
            addCriterion("finishing_warehousing not between", value1, value2, "finishingWarehousing");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNull() {
            addCriterion("complete_rate is null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNotNull() {
            addCriterion("complete_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateEqualTo(Double value) {
            addCriterion("complete_rate =", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotEqualTo(Double value) {
            addCriterion("complete_rate <>", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThan(Double value) {
            addCriterion("complete_rate >", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThanOrEqualTo(Double value) {
            addCriterion("complete_rate >=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThan(Double value) {
            addCriterion("complete_rate <", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThanOrEqualTo(Double value) {
            addCriterion("complete_rate <=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIn(List<Double> values) {
            addCriterion("complete_rate in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotIn(List<Double> values) {
            addCriterion("complete_rate not in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateBetween(Double value1, Double value2) {
            addCriterion("complete_rate between", value1, value2, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotBetween(Double value1, Double value2) {
            addCriterion("complete_rate not between", value1, value2, "completeRate");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andWhichDayIsNull() {
            addCriterion("which_day is null");
            return (Criteria) this;
        }

        public Criteria andWhichDayIsNotNull() {
            addCriterion("which_day is not null");
            return (Criteria) this;
        }

        public Criteria andWhichDayEqualTo(Date value) {
            addCriterionForJDBCDate("which_day =", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("which_day <>", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayGreaterThan(Date value) {
            addCriterionForJDBCDate("which_day >", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("which_day >=", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayLessThan(Date value) {
            addCriterionForJDBCDate("which_day <", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("which_day <=", value, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayIn(List<Date> values) {
            addCriterionForJDBCDate("which_day in", values, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("which_day not in", values, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("which_day between", value1, value2, "whichDay");
            return (Criteria) this;
        }

        public Criteria andWhichDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("which_day not between", value1, value2, "whichDay");
            return (Criteria) this;
        }

        public Criteria andValveProductNameIsNull() {
            addCriterion("valve_product_name is null");
            return (Criteria) this;
        }

        public Criteria andValveProductNameIsNotNull() {
            addCriterion("valve_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andValveProductNameEqualTo(String value) {
            addCriterion("valve_product_name =", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameNotEqualTo(String value) {
            addCriterion("valve_product_name <>", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameGreaterThan(String value) {
            addCriterion("valve_product_name >", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("valve_product_name >=", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameLessThan(String value) {
            addCriterion("valve_product_name <", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameLessThanOrEqualTo(String value) {
            addCriterion("valve_product_name <=", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameLike(String value) {
            addCriterion("valve_product_name like", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameNotLike(String value) {
            addCriterion("valve_product_name not like", value, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameIn(List<String> values) {
            addCriterion("valve_product_name in", values, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameNotIn(List<String> values) {
            addCriterion("valve_product_name not in", values, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameBetween(String value1, String value2) {
            addCriterion("valve_product_name between", value1, value2, "valveProductName");
            return (Criteria) this;
        }

        public Criteria andValveProductNameNotBetween(String value1, String value2) {
            addCriterion("valve_product_name not between", value1, value2, "valveProductName");
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