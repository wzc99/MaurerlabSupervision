package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProjectExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNull() {
            addCriterion("pro_unit is null");
            return (Criteria) this;
        }

        public Criteria andProUnitIsNotNull() {
            addCriterion("pro_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProUnitEqualTo(String value) {
            addCriterion("pro_unit =", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotEqualTo(String value) {
            addCriterion("pro_unit <>", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThan(String value) {
            addCriterion("pro_unit >", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitGreaterThanOrEqualTo(String value) {
            addCriterion("pro_unit >=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThan(String value) {
            addCriterion("pro_unit <", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLessThanOrEqualTo(String value) {
            addCriterion("pro_unit <=", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitLike(String value) {
            addCriterion("pro_unit like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotLike(String value) {
            addCriterion("pro_unit not like", value, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitIn(List<String> values) {
            addCriterion("pro_unit in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotIn(List<String> values) {
            addCriterion("pro_unit not in", values, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitBetween(String value1, String value2) {
            addCriterion("pro_unit between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProUnitNotBetween(String value1, String value2) {
            addCriterion("pro_unit not between", value1, value2, "proUnit");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeIsNull() {
            addCriterion("pro_entrust_time is null");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeIsNotNull() {
            addCriterion("pro_entrust_time is not null");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pro_entrust_time =", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_entrust_time <>", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_entrust_time >", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_entrust_time >=", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeLessThan(Date value) {
            addCriterionForJDBCDate("pro_entrust_time <", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_entrust_time <=", value, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pro_entrust_time in", values, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_entrust_time not in", values, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_entrust_time between", value1, value2, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProEntrustTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_entrust_time not between", value1, value2, "proEntrustTime");
            return (Criteria) this;
        }

        public Criteria andProNumIsNull() {
            addCriterion("pro_num is null");
            return (Criteria) this;
        }

        public Criteria andProNumIsNotNull() {
            addCriterion("pro_num is not null");
            return (Criteria) this;
        }

        public Criteria andProNumEqualTo(String value) {
            addCriterion("pro_num =", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotEqualTo(String value) {
            addCriterion("pro_num <>", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThan(String value) {
            addCriterion("pro_num >", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumGreaterThanOrEqualTo(String value) {
            addCriterion("pro_num >=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThan(String value) {
            addCriterion("pro_num <", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLessThanOrEqualTo(String value) {
            addCriterion("pro_num <=", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumLike(String value) {
            addCriterion("pro_num like", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotLike(String value) {
            addCriterion("pro_num not like", value, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumIn(List<String> values) {
            addCriterion("pro_num in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotIn(List<String> values) {
            addCriterion("pro_num not in", values, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumBetween(String value1, String value2) {
            addCriterion("pro_num between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProNumNotBetween(String value1, String value2) {
            addCriterion("pro_num not between", value1, value2, "proNum");
            return (Criteria) this;
        }

        public Criteria andProConpeopleIsNull() {
            addCriterion("pro_conpeople is null");
            return (Criteria) this;
        }

        public Criteria andProConpeopleIsNotNull() {
            addCriterion("pro_conpeople is not null");
            return (Criteria) this;
        }

        public Criteria andProConpeopleEqualTo(String value) {
            addCriterion("pro_conpeople =", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleNotEqualTo(String value) {
            addCriterion("pro_conpeople <>", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleGreaterThan(String value) {
            addCriterion("pro_conpeople >", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("pro_conpeople >=", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleLessThan(String value) {
            addCriterion("pro_conpeople <", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleLessThanOrEqualTo(String value) {
            addCriterion("pro_conpeople <=", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleLike(String value) {
            addCriterion("pro_conpeople like", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleNotLike(String value) {
            addCriterion("pro_conpeople not like", value, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleIn(List<String> values) {
            addCriterion("pro_conpeople in", values, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleNotIn(List<String> values) {
            addCriterion("pro_conpeople not in", values, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleBetween(String value1, String value2) {
            addCriterion("pro_conpeople between", value1, value2, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConpeopleNotBetween(String value1, String value2) {
            addCriterion("pro_conpeople not between", value1, value2, "proConpeople");
            return (Criteria) this;
        }

        public Criteria andProConntelIsNull() {
            addCriterion("pro_conntel is null");
            return (Criteria) this;
        }

        public Criteria andProConntelIsNotNull() {
            addCriterion("pro_conntel is not null");
            return (Criteria) this;
        }

        public Criteria andProConntelEqualTo(String value) {
            addCriterion("pro_conntel =", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelNotEqualTo(String value) {
            addCriterion("pro_conntel <>", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelGreaterThan(String value) {
            addCriterion("pro_conntel >", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelGreaterThanOrEqualTo(String value) {
            addCriterion("pro_conntel >=", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelLessThan(String value) {
            addCriterion("pro_conntel <", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelLessThanOrEqualTo(String value) {
            addCriterion("pro_conntel <=", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelLike(String value) {
            addCriterion("pro_conntel like", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelNotLike(String value) {
            addCriterion("pro_conntel not like", value, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelIn(List<String> values) {
            addCriterion("pro_conntel in", values, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelNotIn(List<String> values) {
            addCriterion("pro_conntel not in", values, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelBetween(String value1, String value2) {
            addCriterion("pro_conntel between", value1, value2, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProConntelNotBetween(String value1, String value2) {
            addCriterion("pro_conntel not between", value1, value2, "proConntel");
            return (Criteria) this;
        }

        public Criteria andProGoodsIsNull() {
            addCriterion("pro_goods is null");
            return (Criteria) this;
        }

        public Criteria andProGoodsIsNotNull() {
            addCriterion("pro_goods is not null");
            return (Criteria) this;
        }

        public Criteria andProGoodsEqualTo(String value) {
            addCriterion("pro_goods =", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsNotEqualTo(String value) {
            addCriterion("pro_goods <>", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsGreaterThan(String value) {
            addCriterion("pro_goods >", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("pro_goods >=", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsLessThan(String value) {
            addCriterion("pro_goods <", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsLessThanOrEqualTo(String value) {
            addCriterion("pro_goods <=", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsLike(String value) {
            addCriterion("pro_goods like", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsNotLike(String value) {
            addCriterion("pro_goods not like", value, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsIn(List<String> values) {
            addCriterion("pro_goods in", values, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsNotIn(List<String> values) {
            addCriterion("pro_goods not in", values, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsBetween(String value1, String value2) {
            addCriterion("pro_goods between", value1, value2, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProGoodsNotBetween(String value1, String value2) {
            addCriterion("pro_goods not between", value1, value2, "proGoods");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("pro_type is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("pro_type is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("pro_type =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("pro_type <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("pro_type >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_type >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("pro_type <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_type <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("pro_type like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("pro_type not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("pro_type in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("pro_type not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("pro_type between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("pro_type not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProFactoryIsNull() {
            addCriterion("pro_factory is null");
            return (Criteria) this;
        }

        public Criteria andProFactoryIsNotNull() {
            addCriterion("pro_factory is not null");
            return (Criteria) this;
        }

        public Criteria andProFactoryEqualTo(String value) {
            addCriterion("pro_factory =", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryNotEqualTo(String value) {
            addCriterion("pro_factory <>", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryGreaterThan(String value) {
            addCriterion("pro_factory >", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("pro_factory >=", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryLessThan(String value) {
            addCriterion("pro_factory <", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryLessThanOrEqualTo(String value) {
            addCriterion("pro_factory <=", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryLike(String value) {
            addCriterion("pro_factory like", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryNotLike(String value) {
            addCriterion("pro_factory not like", value, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryIn(List<String> values) {
            addCriterion("pro_factory in", values, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryNotIn(List<String> values) {
            addCriterion("pro_factory not in", values, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryBetween(String value1, String value2) {
            addCriterion("pro_factory between", value1, value2, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryNotBetween(String value1, String value2) {
            addCriterion("pro_factory not between", value1, value2, "proFactory");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleIsNull() {
            addCriterion("pro_factoryconnpeople is null");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleIsNotNull() {
            addCriterion("pro_factoryconnpeople is not null");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleEqualTo(String value) {
            addCriterion("pro_factoryconnpeople =", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleNotEqualTo(String value) {
            addCriterion("pro_factoryconnpeople <>", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleGreaterThan(String value) {
            addCriterion("pro_factoryconnpeople >", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("pro_factoryconnpeople >=", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleLessThan(String value) {
            addCriterion("pro_factoryconnpeople <", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleLessThanOrEqualTo(String value) {
            addCriterion("pro_factoryconnpeople <=", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleLike(String value) {
            addCriterion("pro_factoryconnpeople like", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleNotLike(String value) {
            addCriterion("pro_factoryconnpeople not like", value, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleIn(List<String> values) {
            addCriterion("pro_factoryconnpeople in", values, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleNotIn(List<String> values) {
            addCriterion("pro_factoryconnpeople not in", values, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleBetween(String value1, String value2) {
            addCriterion("pro_factoryconnpeople between", value1, value2, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconnpeopleNotBetween(String value1, String value2) {
            addCriterion("pro_factoryconnpeople not between", value1, value2, "proFactoryconnpeople");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelIsNull() {
            addCriterion("pro_factoryconntel is null");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelIsNotNull() {
            addCriterion("pro_factoryconntel is not null");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelEqualTo(String value) {
            addCriterion("pro_factoryconntel =", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelNotEqualTo(String value) {
            addCriterion("pro_factoryconntel <>", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelGreaterThan(String value) {
            addCriterion("pro_factoryconntel >", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelGreaterThanOrEqualTo(String value) {
            addCriterion("pro_factoryconntel >=", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelLessThan(String value) {
            addCriterion("pro_factoryconntel <", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelLessThanOrEqualTo(String value) {
            addCriterion("pro_factoryconntel <=", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelLike(String value) {
            addCriterion("pro_factoryconntel like", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelNotLike(String value) {
            addCriterion("pro_factoryconntel not like", value, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelIn(List<String> values) {
            addCriterion("pro_factoryconntel in", values, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelNotIn(List<String> values) {
            addCriterion("pro_factoryconntel not in", values, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelBetween(String value1, String value2) {
            addCriterion("pro_factoryconntel between", value1, value2, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProFactoryconntelNotBetween(String value1, String value2) {
            addCriterion("pro_factoryconntel not between", value1, value2, "proFactoryconntel");
            return (Criteria) this;
        }

        public Criteria andProBasisIsNull() {
            addCriterion("pro_basis is null");
            return (Criteria) this;
        }

        public Criteria andProBasisIsNotNull() {
            addCriterion("pro_basis is not null");
            return (Criteria) this;
        }

        public Criteria andProBasisEqualTo(String value) {
            addCriterion("pro_basis =", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisNotEqualTo(String value) {
            addCriterion("pro_basis <>", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisGreaterThan(String value) {
            addCriterion("pro_basis >", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisGreaterThanOrEqualTo(String value) {
            addCriterion("pro_basis >=", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisLessThan(String value) {
            addCriterion("pro_basis <", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisLessThanOrEqualTo(String value) {
            addCriterion("pro_basis <=", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisLike(String value) {
            addCriterion("pro_basis like", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisNotLike(String value) {
            addCriterion("pro_basis not like", value, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisIn(List<String> values) {
            addCriterion("pro_basis in", values, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisNotIn(List<String> values) {
            addCriterion("pro_basis not in", values, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisBetween(String value1, String value2) {
            addCriterion("pro_basis between", value1, value2, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProBasisNotBetween(String value1, String value2) {
            addCriterion("pro_basis not between", value1, value2, "proBasis");
            return (Criteria) this;
        }

        public Criteria andProReportwayIsNull() {
            addCriterion("pro_reportway is null");
            return (Criteria) this;
        }

        public Criteria andProReportwayIsNotNull() {
            addCriterion("pro_reportway is not null");
            return (Criteria) this;
        }

        public Criteria andProReportwayEqualTo(String value) {
            addCriterion("pro_reportway =", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayNotEqualTo(String value) {
            addCriterion("pro_reportway <>", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayGreaterThan(String value) {
            addCriterion("pro_reportway >", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayGreaterThanOrEqualTo(String value) {
            addCriterion("pro_reportway >=", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayLessThan(String value) {
            addCriterion("pro_reportway <", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayLessThanOrEqualTo(String value) {
            addCriterion("pro_reportway <=", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayLike(String value) {
            addCriterion("pro_reportway like", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayNotLike(String value) {
            addCriterion("pro_reportway not like", value, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayIn(List<String> values) {
            addCriterion("pro_reportway in", values, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayNotIn(List<String> values) {
            addCriterion("pro_reportway not in", values, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayBetween(String value1, String value2) {
            addCriterion("pro_reportway between", value1, value2, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportwayNotBetween(String value1, String value2) {
            addCriterion("pro_reportway not between", value1, value2, "proReportway");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameIsNull() {
            addCriterion("pro_reportfilename is null");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameIsNotNull() {
            addCriterion("pro_reportfilename is not null");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameEqualTo(String value) {
            addCriterion("pro_reportfilename =", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameNotEqualTo(String value) {
            addCriterion("pro_reportfilename <>", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameGreaterThan(String value) {
            addCriterion("pro_reportfilename >", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_reportfilename >=", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameLessThan(String value) {
            addCriterion("pro_reportfilename <", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameLessThanOrEqualTo(String value) {
            addCriterion("pro_reportfilename <=", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameLike(String value) {
            addCriterion("pro_reportfilename like", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameNotLike(String value) {
            addCriterion("pro_reportfilename not like", value, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameIn(List<String> values) {
            addCriterion("pro_reportfilename in", values, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameNotIn(List<String> values) {
            addCriterion("pro_reportfilename not in", values, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameBetween(String value1, String value2) {
            addCriterion("pro_reportfilename between", value1, value2, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProReportfilenameNotBetween(String value1, String value2) {
            addCriterion("pro_reportfilename not between", value1, value2, "proReportfilename");
            return (Criteria) this;
        }

        public Criteria andProEndtimeIsNull() {
            addCriterion("pro_endtime is null");
            return (Criteria) this;
        }

        public Criteria andProEndtimeIsNotNull() {
            addCriterion("pro_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andProEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("pro_endtime =", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_endtime <>", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_endtime >", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_endtime >=", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("pro_endtime <", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_endtime <=", value, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("pro_endtime in", values, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_endtime not in", values, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_endtime between", value1, value2, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_endtime not between", value1, value2, "proEndtime");
            return (Criteria) this;
        }

        public Criteria andProProducttypeIsNull() {
            addCriterion("pro_producttype is null");
            return (Criteria) this;
        }

        public Criteria andProProducttypeIsNotNull() {
            addCriterion("pro_producttype is not null");
            return (Criteria) this;
        }

        public Criteria andProProducttypeEqualTo(String value) {
            addCriterion("pro_producttype =", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeNotEqualTo(String value) {
            addCriterion("pro_producttype <>", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeGreaterThan(String value) {
            addCriterion("pro_producttype >", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_producttype >=", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeLessThan(String value) {
            addCriterion("pro_producttype <", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeLessThanOrEqualTo(String value) {
            addCriterion("pro_producttype <=", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeLike(String value) {
            addCriterion("pro_producttype like", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeNotLike(String value) {
            addCriterion("pro_producttype not like", value, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeIn(List<String> values) {
            addCriterion("pro_producttype in", values, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeNotIn(List<String> values) {
            addCriterion("pro_producttype not in", values, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeBetween(String value1, String value2) {
            addCriterion("pro_producttype between", value1, value2, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProProducttypeNotBetween(String value1, String value2) {
            addCriterion("pro_producttype not between", value1, value2, "proProducttype");
            return (Criteria) this;
        }

        public Criteria andProReporttimeIsNull() {
            addCriterion("pro_reporttime is null");
            return (Criteria) this;
        }

        public Criteria andProReporttimeIsNotNull() {
            addCriterion("pro_reporttime is not null");
            return (Criteria) this;
        }

        public Criteria andProReporttimeEqualTo(String value) {
            addCriterion("pro_reporttime =", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeNotEqualTo(String value) {
            addCriterion("pro_reporttime <>", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeGreaterThan(String value) {
            addCriterion("pro_reporttime >", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_reporttime >=", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeLessThan(String value) {
            addCriterion("pro_reporttime <", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeLessThanOrEqualTo(String value) {
            addCriterion("pro_reporttime <=", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeLike(String value) {
            addCriterion("pro_reporttime like", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeNotLike(String value) {
            addCriterion("pro_reporttime not like", value, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeIn(List<String> values) {
            addCriterion("pro_reporttime in", values, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeNotIn(List<String> values) {
            addCriterion("pro_reporttime not in", values, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeBetween(String value1, String value2) {
            addCriterion("pro_reporttime between", value1, value2, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProReporttimeNotBetween(String value1, String value2) {
            addCriterion("pro_reporttime not between", value1, value2, "proReporttime");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdIsNull() {
            addCriterion("pro_create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdIsNotNull() {
            addCriterion("pro_create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdEqualTo(Integer value) {
            addCriterion("pro_create_user_id =", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdNotEqualTo(Integer value) {
            addCriterion("pro_create_user_id <>", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdGreaterThan(Integer value) {
            addCriterion("pro_create_user_id >", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_create_user_id >=", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdLessThan(Integer value) {
            addCriterion("pro_create_user_id <", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_create_user_id <=", value, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdIn(List<Integer> values) {
            addCriterion("pro_create_user_id in", values, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdNotIn(List<Integer> values) {
            addCriterion("pro_create_user_id not in", values, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_create_user_id between", value1, value2, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_create_user_id not between", value1, value2, "proCreateUserId");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIsNull() {
            addCriterion("pro_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIsNotNull() {
            addCriterion("pro_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeEqualTo(Date value) {
            addCriterion("pro_create_time =", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotEqualTo(Date value) {
            addCriterion("pro_create_time <>", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeGreaterThan(Date value) {
            addCriterion("pro_create_time >", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_create_time >=", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeLessThan(Date value) {
            addCriterion("pro_create_time <", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("pro_create_time <=", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIn(List<Date> values) {
            addCriterion("pro_create_time in", values, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotIn(List<Date> values) {
            addCriterion("pro_create_time not in", values, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeBetween(Date value1, Date value2) {
            addCriterion("pro_create_time between", value1, value2, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("pro_create_time not between", value1, value2, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeIsNull() {
            addCriterion("pro_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeIsNotNull() {
            addCriterion("pro_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeEqualTo(Date value) {
            addCriterion("pro_last_update_time =", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("pro_last_update_time <>", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeGreaterThan(Date value) {
            addCriterion("pro_last_update_time >", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_last_update_time >=", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeLessThan(Date value) {
            addCriterion("pro_last_update_time <", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("pro_last_update_time <=", value, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeIn(List<Date> values) {
            addCriterion("pro_last_update_time in", values, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("pro_last_update_time not in", values, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("pro_last_update_time between", value1, value2, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("pro_last_update_time not between", value1, value2, "proLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdIsNull() {
            addCriterion("pro_big_project_id is null");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdIsNotNull() {
            addCriterion("pro_big_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdEqualTo(Integer value) {
            addCriterion("pro_big_project_id =", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdNotEqualTo(Integer value) {
            addCriterion("pro_big_project_id <>", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdGreaterThan(Integer value) {
            addCriterion("pro_big_project_id >", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_big_project_id >=", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdLessThan(Integer value) {
            addCriterion("pro_big_project_id <", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_big_project_id <=", value, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdIn(List<Integer> values) {
            addCriterion("pro_big_project_id in", values, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdNotIn(List<Integer> values) {
            addCriterion("pro_big_project_id not in", values, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_big_project_id between", value1, value2, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProBigProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_big_project_id not between", value1, value2, "proBigProjectId");
            return (Criteria) this;
        }

        public Criteria andProReportRateIsNull() {
            addCriterion("pro_report_rate is null");
            return (Criteria) this;
        }

        public Criteria andProReportRateIsNotNull() {
            addCriterion("pro_report_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProReportRateEqualTo(String value) {
            addCriterion("pro_report_rate =", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateNotEqualTo(String value) {
            addCriterion("pro_report_rate <>", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateGreaterThan(String value) {
            addCriterion("pro_report_rate >", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateGreaterThanOrEqualTo(String value) {
            addCriterion("pro_report_rate >=", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateLessThan(String value) {
            addCriterion("pro_report_rate <", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateLessThanOrEqualTo(String value) {
            addCriterion("pro_report_rate <=", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateLike(String value) {
            addCriterion("pro_report_rate like", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateNotLike(String value) {
            addCriterion("pro_report_rate not like", value, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateIn(List<String> values) {
            addCriterion("pro_report_rate in", values, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateNotIn(List<String> values) {
            addCriterion("pro_report_rate not in", values, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateBetween(String value1, String value2) {
            addCriterion("pro_report_rate between", value1, value2, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProReportRateNotBetween(String value1, String value2) {
            addCriterion("pro_report_rate not between", value1, value2, "proReportRate");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(String value) {
            addCriterion("pro_status =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(String value) {
            addCriterion("pro_status <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(String value) {
            addCriterion("pro_status >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pro_status >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(String value) {
            addCriterion("pro_status <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(String value) {
            addCriterion("pro_status <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLike(String value) {
            addCriterion("pro_status like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotLike(String value) {
            addCriterion("pro_status not like", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<String> values) {
            addCriterion("pro_status in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<String> values) {
            addCriterion("pro_status not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(String value1, String value2) {
            addCriterion("pro_status between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(String value1, String value2) {
            addCriterion("pro_status not between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStartTimeIsNull() {
            addCriterion("pro_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProStartTimeIsNotNull() {
            addCriterion("pro_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProStartTimeEqualTo(Date value) {
            addCriterion("pro_start_time =", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeNotEqualTo(Date value) {
            addCriterion("pro_start_time <>", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeGreaterThan(Date value) {
            addCriterion("pro_start_time >", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_start_time >=", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeLessThan(Date value) {
            addCriterion("pro_start_time <", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("pro_start_time <=", value, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeIn(List<Date> values) {
            addCriterion("pro_start_time in", values, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeNotIn(List<Date> values) {
            addCriterion("pro_start_time not in", values, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeBetween(Date value1, Date value2) {
            addCriterion("pro_start_time between", value1, value2, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("pro_start_time not between", value1, value2, "proStartTime");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameIsNull() {
            addCriterion("pro_big_project_name is null");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameIsNotNull() {
            addCriterion("pro_big_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameEqualTo(String value) {
            addCriterion("pro_big_project_name =", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameNotEqualTo(String value) {
            addCriterion("pro_big_project_name <>", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameGreaterThan(String value) {
            addCriterion("pro_big_project_name >", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_big_project_name >=", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameLessThan(String value) {
            addCriterion("pro_big_project_name <", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameLessThanOrEqualTo(String value) {
            addCriterion("pro_big_project_name <=", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameLike(String value) {
            addCriterion("pro_big_project_name like", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameNotLike(String value) {
            addCriterion("pro_big_project_name not like", value, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameIn(List<String> values) {
            addCriterion("pro_big_project_name in", values, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameNotIn(List<String> values) {
            addCriterion("pro_big_project_name not in", values, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameBetween(String value1, String value2) {
            addCriterion("pro_big_project_name between", value1, value2, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProBigProjectNameNotBetween(String value1, String value2) {
            addCriterion("pro_big_project_name not between", value1, value2, "proBigProjectName");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumIsNull() {
            addCriterion("pro_goodsnum is null");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumIsNotNull() {
            addCriterion("pro_goodsnum is not null");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumEqualTo(String value) {
            addCriterion("pro_goodsnum =", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumNotEqualTo(String value) {
            addCriterion("pro_goodsnum <>", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumGreaterThan(String value) {
            addCriterion("pro_goodsnum >", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumGreaterThanOrEqualTo(String value) {
            addCriterion("pro_goodsnum >=", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumLessThan(String value) {
            addCriterion("pro_goodsnum <", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumLessThanOrEqualTo(String value) {
            addCriterion("pro_goodsnum <=", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumLike(String value) {
            addCriterion("pro_goodsnum like", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumNotLike(String value) {
            addCriterion("pro_goodsnum not like", value, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumIn(List<String> values) {
            addCriterion("pro_goodsnum in", values, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumNotIn(List<String> values) {
            addCriterion("pro_goodsnum not in", values, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumBetween(String value1, String value2) {
            addCriterion("pro_goodsnum between", value1, value2, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProGoodsnumNotBetween(String value1, String value2) {
            addCriterion("pro_goodsnum not between", value1, value2, "proGoodsnum");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeIsNull() {
            addCriterion("pro_small_product_type is null");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeIsNotNull() {
            addCriterion("pro_small_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeEqualTo(String value) {
            addCriterion("pro_small_product_type =", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeNotEqualTo(String value) {
            addCriterion("pro_small_product_type <>", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeGreaterThan(String value) {
            addCriterion("pro_small_product_type >", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_small_product_type >=", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeLessThan(String value) {
            addCriterion("pro_small_product_type <", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_small_product_type <=", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeLike(String value) {
            addCriterion("pro_small_product_type like", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeNotLike(String value) {
            addCriterion("pro_small_product_type not like", value, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeIn(List<String> values) {
            addCriterion("pro_small_product_type in", values, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeNotIn(List<String> values) {
            addCriterion("pro_small_product_type not in", values, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeBetween(String value1, String value2) {
            addCriterion("pro_small_product_type between", value1, value2, "proSmallProductType");
            return (Criteria) this;
        }

        public Criteria andProSmallProductTypeNotBetween(String value1, String value2) {
            addCriterion("pro_small_product_type not between", value1, value2, "proSmallProductType");
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