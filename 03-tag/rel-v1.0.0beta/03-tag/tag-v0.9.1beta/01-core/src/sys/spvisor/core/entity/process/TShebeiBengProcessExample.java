package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TShebeiBengProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShebeiBengProcessExample() {
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

        public Criteria andPumpProductNameIsNull() {
            addCriterion("pump_product_name is null");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameIsNotNull() {
            addCriterion("pump_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameEqualTo(String value) {
            addCriterion("pump_product_name =", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameNotEqualTo(String value) {
            addCriterion("pump_product_name <>", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameGreaterThan(String value) {
            addCriterion("pump_product_name >", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("pump_product_name >=", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameLessThan(String value) {
            addCriterion("pump_product_name <", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameLessThanOrEqualTo(String value) {
            addCriterion("pump_product_name <=", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameLike(String value) {
            addCriterion("pump_product_name like", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameNotLike(String value) {
            addCriterion("pump_product_name not like", value, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameIn(List<String> values) {
            addCriterion("pump_product_name in", values, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameNotIn(List<String> values) {
            addCriterion("pump_product_name not in", values, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameBetween(String value1, String value2) {
            addCriterion("pump_product_name between", value1, value2, "pumpProductName");
            return (Criteria) this;
        }

        public Criteria andPumpProductNameNotBetween(String value1, String value2) {
            addCriterion("pump_product_name not between", value1, value2, "pumpProductName");
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

        public Criteria andPromiseDateIsNull() {
            addCriterion("promise_date is null");
            return (Criteria) this;
        }

        public Criteria andPromiseDateIsNotNull() {
            addCriterion("promise_date is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseDateEqualTo(Date value) {
            addCriterionForJDBCDate("promise_date =", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("promise_date <>", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("promise_date >", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promise_date >=", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateLessThan(Date value) {
            addCriterionForJDBCDate("promise_date <", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("promise_date <=", value, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateIn(List<Date> values) {
            addCriterionForJDBCDate("promise_date in", values, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("promise_date not in", values, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promise_date between", value1, value2, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andPromiseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("promise_date not between", value1, value2, "promiseDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateIsNull() {
            addCriterion("sumbit_date is null");
            return (Criteria) this;
        }

        public Criteria andSumbitDateIsNotNull() {
            addCriterion("sumbit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSumbitDateEqualTo(Date value) {
            addCriterionForJDBCDate("sumbit_date =", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sumbit_date <>", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sumbit_date >", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sumbit_date >=", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateLessThan(Date value) {
            addCriterionForJDBCDate("sumbit_date <", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sumbit_date <=", value, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateIn(List<Date> values) {
            addCriterionForJDBCDate("sumbit_date in", values, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sumbit_date not in", values, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sumbit_date between", value1, value2, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andSumbitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sumbit_date not between", value1, value2, "sumbitDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationIsNull() {
            addCriterion("beng_product_specification is null");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationIsNotNull() {
            addCriterion("beng_product_specification is not null");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationEqualTo(String value) {
            addCriterion("beng_product_specification =", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationNotEqualTo(String value) {
            addCriterion("beng_product_specification <>", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationGreaterThan(String value) {
            addCriterion("beng_product_specification >", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("beng_product_specification >=", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationLessThan(String value) {
            addCriterion("beng_product_specification <", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationLessThanOrEqualTo(String value) {
            addCriterion("beng_product_specification <=", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationLike(String value) {
            addCriterion("beng_product_specification like", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationNotLike(String value) {
            addCriterion("beng_product_specification not like", value, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationIn(List<String> values) {
            addCriterion("beng_product_specification in", values, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationNotIn(List<String> values) {
            addCriterion("beng_product_specification not in", values, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationBetween(String value1, String value2) {
            addCriterion("beng_product_specification between", value1, value2, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengProductSpecificationNotBetween(String value1, String value2) {
            addCriterion("beng_product_specification not between", value1, value2, "bengProductSpecification");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumIsNull() {
            addCriterion("beng_order_num is null");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumIsNotNull() {
            addCriterion("beng_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumEqualTo(Double value) {
            addCriterion("beng_order_num =", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumNotEqualTo(Double value) {
            addCriterion("beng_order_num <>", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumGreaterThan(Double value) {
            addCriterion("beng_order_num >", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumGreaterThanOrEqualTo(Double value) {
            addCriterion("beng_order_num >=", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumLessThan(Double value) {
            addCriterion("beng_order_num <", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumLessThanOrEqualTo(Double value) {
            addCriterion("beng_order_num <=", value, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumIn(List<Double> values) {
            addCriterion("beng_order_num in", values, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumNotIn(List<Double> values) {
            addCriterion("beng_order_num not in", values, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumBetween(Double value1, Double value2) {
            addCriterion("beng_order_num between", value1, value2, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengOrderNumNotBetween(Double value1, Double value2) {
            addCriterion("beng_order_num not between", value1, value2, "bengOrderNum");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckIsNull() {
            addCriterion("beng_body_process_check is null");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckIsNotNull() {
            addCriterion("beng_body_process_check is not null");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckEqualTo(Integer value) {
            addCriterion("beng_body_process_check =", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckNotEqualTo(Integer value) {
            addCriterion("beng_body_process_check <>", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckGreaterThan(Integer value) {
            addCriterion("beng_body_process_check >", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_body_process_check >=", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckLessThan(Integer value) {
            addCriterion("beng_body_process_check <", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckLessThanOrEqualTo(Integer value) {
            addCriterion("beng_body_process_check <=", value, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckIn(List<Integer> values) {
            addCriterion("beng_body_process_check in", values, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckNotIn(List<Integer> values) {
            addCriterion("beng_body_process_check not in", values, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckBetween(Integer value1, Integer value2) {
            addCriterion("beng_body_process_check between", value1, value2, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengBodyProcessCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_body_process_check not between", value1, value2, "bengBodyProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckIsNull() {
            addCriterion("beng_spindle_process_check is null");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckIsNotNull() {
            addCriterion("beng_spindle_process_check is not null");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckEqualTo(Integer value) {
            addCriterion("beng_spindle_process_check =", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckNotEqualTo(Integer value) {
            addCriterion("beng_spindle_process_check <>", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckGreaterThan(Integer value) {
            addCriterion("beng_spindle_process_check >", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_spindle_process_check >=", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckLessThan(Integer value) {
            addCriterion("beng_spindle_process_check <", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckLessThanOrEqualTo(Integer value) {
            addCriterion("beng_spindle_process_check <=", value, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckIn(List<Integer> values) {
            addCriterion("beng_spindle_process_check in", values, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckNotIn(List<Integer> values) {
            addCriterion("beng_spindle_process_check not in", values, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckBetween(Integer value1, Integer value2) {
            addCriterion("beng_spindle_process_check between", value1, value2, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengSpindleProcessCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_spindle_process_check not between", value1, value2, "bengSpindleProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckIsNull() {
            addCriterion("beng_impeller_process_check is null");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckIsNotNull() {
            addCriterion("beng_impeller_process_check is not null");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckEqualTo(Integer value) {
            addCriterion("beng_impeller_process_check =", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckNotEqualTo(Integer value) {
            addCriterion("beng_impeller_process_check <>", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckGreaterThan(Integer value) {
            addCriterion("beng_impeller_process_check >", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_impeller_process_check >=", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckLessThan(Integer value) {
            addCriterion("beng_impeller_process_check <", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckLessThanOrEqualTo(Integer value) {
            addCriterion("beng_impeller_process_check <=", value, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckIn(List<Integer> values) {
            addCriterion("beng_impeller_process_check in", values, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckNotIn(List<Integer> values) {
            addCriterion("beng_impeller_process_check not in", values, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckBetween(Integer value1, Integer value2) {
            addCriterion("beng_impeller_process_check between", value1, value2, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengImpellerProcessCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_impeller_process_check not between", value1, value2, "bengImpellerProcessCheck");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyIsNull() {
            addCriterion("beng_final_assembly is null");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyIsNotNull() {
            addCriterion("beng_final_assembly is not null");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyEqualTo(Integer value) {
            addCriterion("beng_final_assembly =", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyNotEqualTo(Integer value) {
            addCriterion("beng_final_assembly <>", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyGreaterThan(Integer value) {
            addCriterion("beng_final_assembly >", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_final_assembly >=", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyLessThan(Integer value) {
            addCriterion("beng_final_assembly <", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyLessThanOrEqualTo(Integer value) {
            addCriterion("beng_final_assembly <=", value, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyIn(List<Integer> values) {
            addCriterion("beng_final_assembly in", values, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyNotIn(List<Integer> values) {
            addCriterion("beng_final_assembly not in", values, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyBetween(Integer value1, Integer value2) {
            addCriterion("beng_final_assembly between", value1, value2, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengFinalAssemblyNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_final_assembly not between", value1, value2, "bengFinalAssembly");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestIsNull() {
            addCriterion("beng_performance_test is null");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestIsNotNull() {
            addCriterion("beng_performance_test is not null");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestEqualTo(Integer value) {
            addCriterion("beng_performance_test =", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestNotEqualTo(Integer value) {
            addCriterion("beng_performance_test <>", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestGreaterThan(Integer value) {
            addCriterion("beng_performance_test >", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_performance_test >=", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestLessThan(Integer value) {
            addCriterion("beng_performance_test <", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestLessThanOrEqualTo(Integer value) {
            addCriterion("beng_performance_test <=", value, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestIn(List<Integer> values) {
            addCriterion("beng_performance_test in", values, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestNotIn(List<Integer> values) {
            addCriterion("beng_performance_test not in", values, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestBetween(Integer value1, Integer value2) {
            addCriterion("beng_performance_test between", value1, value2, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPerformanceTestNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_performance_test not between", value1, value2, "bengPerformanceTest");
            return (Criteria) this;
        }

        public Criteria andBengPaintIsNull() {
            addCriterion("beng_paint is null");
            return (Criteria) this;
        }

        public Criteria andBengPaintIsNotNull() {
            addCriterion("beng_paint is not null");
            return (Criteria) this;
        }

        public Criteria andBengPaintEqualTo(Integer value) {
            addCriterion("beng_paint =", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintNotEqualTo(Integer value) {
            addCriterion("beng_paint <>", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintGreaterThan(Integer value) {
            addCriterion("beng_paint >", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintGreaterThanOrEqualTo(Integer value) {
            addCriterion("beng_paint >=", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintLessThan(Integer value) {
            addCriterion("beng_paint <", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintLessThanOrEqualTo(Integer value) {
            addCriterion("beng_paint <=", value, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintIn(List<Integer> values) {
            addCriterion("beng_paint in", values, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintNotIn(List<Integer> values) {
            addCriterion("beng_paint not in", values, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintBetween(Integer value1, Integer value2) {
            addCriterion("beng_paint between", value1, value2, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andBengPaintNotBetween(Integer value1, Integer value2) {
            addCriterion("beng_paint not between", value1, value2, "bengPaint");
            return (Criteria) this;
        }

        public Criteria andFayunIsNull() {
            addCriterion("fayun is null");
            return (Criteria) this;
        }

        public Criteria andFayunIsNotNull() {
            addCriterion("fayun is not null");
            return (Criteria) this;
        }

        public Criteria andFayunEqualTo(Integer value) {
            addCriterion("fayun =", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotEqualTo(Integer value) {
            addCriterion("fayun <>", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunGreaterThan(Integer value) {
            addCriterion("fayun >", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunGreaterThanOrEqualTo(Integer value) {
            addCriterion("fayun >=", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunLessThan(Integer value) {
            addCriterion("fayun <", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunLessThanOrEqualTo(Integer value) {
            addCriterion("fayun <=", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunIn(List<Integer> values) {
            addCriterion("fayun in", values, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotIn(List<Integer> values) {
            addCriterion("fayun not in", values, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunBetween(Integer value1, Integer value2) {
            addCriterion("fayun between", value1, value2, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotBetween(Integer value1, Integer value2) {
            addCriterion("fayun not between", value1, value2, "fayun");
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

        public Criteria andChengpinrukuIsNull() {
            addCriterion("chengpinruku is null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuIsNotNull() {
            addCriterion("chengpinruku is not null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuEqualTo(Integer value) {
            addCriterion("chengpinruku =", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotEqualTo(Integer value) {
            addCriterion("chengpinruku <>", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuGreaterThan(Integer value) {
            addCriterion("chengpinruku >", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuGreaterThanOrEqualTo(Integer value) {
            addCriterion("chengpinruku >=", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuLessThan(Integer value) {
            addCriterion("chengpinruku <", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuLessThanOrEqualTo(Integer value) {
            addCriterion("chengpinruku <=", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuIn(List<Integer> values) {
            addCriterion("chengpinruku in", values, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotIn(List<Integer> values) {
            addCriterion("chengpinruku not in", values, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuBetween(Integer value1, Integer value2) {
            addCriterion("chengpinruku between", value1, value2, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotBetween(Integer value1, Integer value2) {
            addCriterion("chengpinruku not between", value1, value2, "chengpinruku");
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

        public Criteria andCompleteRateTodayIsNull() {
            addCriterion("complete_rate_today is null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayIsNotNull() {
            addCriterion("complete_rate_today is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayEqualTo(Double value) {
            addCriterion("complete_rate_today =", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayNotEqualTo(Double value) {
            addCriterion("complete_rate_today <>", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayGreaterThan(Double value) {
            addCriterion("complete_rate_today >", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayGreaterThanOrEqualTo(Double value) {
            addCriterion("complete_rate_today >=", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayLessThan(Double value) {
            addCriterion("complete_rate_today <", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayLessThanOrEqualTo(Double value) {
            addCriterion("complete_rate_today <=", value, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayIn(List<Double> values) {
            addCriterion("complete_rate_today in", values, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayNotIn(List<Double> values) {
            addCriterion("complete_rate_today not in", values, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayBetween(Double value1, Double value2) {
            addCriterion("complete_rate_today between", value1, value2, "completeRateToday");
            return (Criteria) this;
        }

        public Criteria andCompleteRateTodayNotBetween(Double value1, Double value2) {
            addCriterion("complete_rate_today not between", value1, value2, "completeRateToday");
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