package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TGoodsListsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsListsExample() {
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

        public Criteria andListSerialNumberIsNull() {
            addCriterion("list_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberIsNotNull() {
            addCriterion("list_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberEqualTo(Integer value) {
            addCriterion("list_serial_number =", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberNotEqualTo(Integer value) {
            addCriterion("list_serial_number <>", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberGreaterThan(Integer value) {
            addCriterion("list_serial_number >", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_serial_number >=", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberLessThan(Integer value) {
            addCriterion("list_serial_number <", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("list_serial_number <=", value, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberIn(List<Integer> values) {
            addCriterion("list_serial_number in", values, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberNotIn(List<Integer> values) {
            addCriterion("list_serial_number not in", values, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("list_serial_number between", value1, value2, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andListSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("list_serial_number not between", value1, value2, "listSerialNumber");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("good_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("good_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(String value) {
            addCriterion("good_type =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(String value) {
            addCriterion("good_type <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(String value) {
            addCriterion("good_type >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("good_type >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(String value) {
            addCriterion("good_type <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(String value) {
            addCriterion("good_type <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLike(String value) {
            addCriterion("good_type like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotLike(String value) {
            addCriterion("good_type not like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<String> values) {
            addCriterion("good_type in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<String> values) {
            addCriterion("good_type not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(String value1, String value2) {
            addCriterion("good_type between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(String value1, String value2) {
            addCriterion("good_type not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsIsNull() {
            addCriterion("good_specifications is null");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsIsNotNull() {
            addCriterion("good_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsEqualTo(String value) {
            addCriterion("good_specifications =", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsNotEqualTo(String value) {
            addCriterion("good_specifications <>", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsGreaterThan(String value) {
            addCriterion("good_specifications >", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("good_specifications >=", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsLessThan(String value) {
            addCriterion("good_specifications <", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("good_specifications <=", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsLike(String value) {
            addCriterion("good_specifications like", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsNotLike(String value) {
            addCriterion("good_specifications not like", value, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsIn(List<String> values) {
            addCriterion("good_specifications in", values, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsNotIn(List<String> values) {
            addCriterion("good_specifications not in", values, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsBetween(String value1, String value2) {
            addCriterion("good_specifications between", value1, value2, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodSpecificationsNotBetween(String value1, String value2) {
            addCriterion("good_specifications not between", value1, value2, "goodSpecifications");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumIsNull() {
            addCriterion("good_order_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumIsNotNull() {
            addCriterion("good_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumEqualTo(Integer value) {
            addCriterion("good_order_num =", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumNotEqualTo(Integer value) {
            addCriterion("good_order_num <>", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumGreaterThan(Integer value) {
            addCriterion("good_order_num >", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_order_num >=", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumLessThan(Integer value) {
            addCriterion("good_order_num <", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("good_order_num <=", value, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumIn(List<Integer> values) {
            addCriterion("good_order_num in", values, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumNotIn(List<Integer> values) {
            addCriterion("good_order_num not in", values, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("good_order_num between", value1, value2, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("good_order_num not between", value1, value2, "goodOrderNum");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNull() {
            addCriterion("good_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNotNull() {
            addCriterion("good_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitEqualTo(String value) {
            addCriterion("good_unit =", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotEqualTo(String value) {
            addCriterion("good_unit <>", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThan(String value) {
            addCriterion("good_unit >", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThanOrEqualTo(String value) {
            addCriterion("good_unit >=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThan(String value) {
            addCriterion("good_unit <", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThanOrEqualTo(String value) {
            addCriterion("good_unit <=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLike(String value) {
            addCriterion("good_unit like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotLike(String value) {
            addCriterion("good_unit not like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIn(List<String> values) {
            addCriterion("good_unit in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotIn(List<String> values) {
            addCriterion("good_unit not in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitBetween(String value1, String value2) {
            addCriterion("good_unit between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotBetween(String value1, String value2) {
            addCriterion("good_unit not between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodNoteIsNull() {
            addCriterion("good_note is null");
            return (Criteria) this;
        }

        public Criteria andGoodNoteIsNotNull() {
            addCriterion("good_note is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNoteEqualTo(String value) {
            addCriterion("good_note =", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteNotEqualTo(String value) {
            addCriterion("good_note <>", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteGreaterThan(String value) {
            addCriterion("good_note >", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteGreaterThanOrEqualTo(String value) {
            addCriterion("good_note >=", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteLessThan(String value) {
            addCriterion("good_note <", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteLessThanOrEqualTo(String value) {
            addCriterion("good_note <=", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteLike(String value) {
            addCriterion("good_note like", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteNotLike(String value) {
            addCriterion("good_note not like", value, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteIn(List<String> values) {
            addCriterion("good_note in", values, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteNotIn(List<String> values) {
            addCriterion("good_note not in", values, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteBetween(String value1, String value2) {
            addCriterion("good_note between", value1, value2, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodNoteNotBetween(String value1, String value2) {
            addCriterion("good_note not between", value1, value2, "goodNote");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
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

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
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