package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TZuanjuProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZuanjuProcessExample() {
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

        public Criteria andZuanjuIdIsNull() {
            addCriterion("zuanju_id is null");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdIsNotNull() {
            addCriterion("zuanju_id is not null");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdEqualTo(Integer value) {
            addCriterion("zuanju_id =", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdNotEqualTo(Integer value) {
            addCriterion("zuanju_id <>", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdGreaterThan(Integer value) {
            addCriterion("zuanju_id >", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zuanju_id >=", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdLessThan(Integer value) {
            addCriterion("zuanju_id <", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdLessThanOrEqualTo(Integer value) {
            addCriterion("zuanju_id <=", value, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdIn(List<Integer> values) {
            addCriterion("zuanju_id in", values, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdNotIn(List<Integer> values) {
            addCriterion("zuanju_id not in", values, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdBetween(Integer value1, Integer value2) {
            addCriterion("zuanju_id between", value1, value2, "zuanjuId");
            return (Criteria) this;
        }

        public Criteria andZuanjuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zuanju_id not between", value1, value2, "zuanjuId");
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNormIsNull() {
            addCriterion("product_norm is null");
            return (Criteria) this;
        }

        public Criteria andProductNormIsNotNull() {
            addCriterion("product_norm is not null");
            return (Criteria) this;
        }

        public Criteria andProductNormEqualTo(String value) {
            addCriterion("product_norm =", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormNotEqualTo(String value) {
            addCriterion("product_norm <>", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormGreaterThan(String value) {
            addCriterion("product_norm >", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormGreaterThanOrEqualTo(String value) {
            addCriterion("product_norm >=", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormLessThan(String value) {
            addCriterion("product_norm <", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormLessThanOrEqualTo(String value) {
            addCriterion("product_norm <=", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormLike(String value) {
            addCriterion("product_norm like", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormNotLike(String value) {
            addCriterion("product_norm not like", value, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormIn(List<String> values) {
            addCriterion("product_norm in", values, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormNotIn(List<String> values) {
            addCriterion("product_norm not in", values, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormBetween(String value1, String value2) {
            addCriterion("product_norm between", value1, value2, "productNorm");
            return (Criteria) this;
        }

        public Criteria andProductNormNotBetween(String value1, String value2) {
            addCriterion("product_norm not between", value1, value2, "productNorm");
            return (Criteria) this;
        }

        public Criteria andDaoliaoIsNull() {
            addCriterion("daoliao is null");
            return (Criteria) this;
        }

        public Criteria andDaoliaoIsNotNull() {
            addCriterion("daoliao is not null");
            return (Criteria) this;
        }

        public Criteria andDaoliaoEqualTo(Double value) {
            addCriterion("daoliao =", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoNotEqualTo(Double value) {
            addCriterion("daoliao <>", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoGreaterThan(Double value) {
            addCriterion("daoliao >", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoGreaterThanOrEqualTo(Double value) {
            addCriterion("daoliao >=", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoLessThan(Double value) {
            addCriterion("daoliao <", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoLessThanOrEqualTo(Double value) {
            addCriterion("daoliao <=", value, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoIn(List<Double> values) {
            addCriterion("daoliao in", values, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoNotIn(List<Double> values) {
            addCriterion("daoliao not in", values, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoBetween(Double value1, Double value2) {
            addCriterion("daoliao between", value1, value2, "daoliao");
            return (Criteria) this;
        }

        public Criteria andDaoliaoNotBetween(Double value1, Double value2) {
            addCriterion("daoliao not between", value1, value2, "daoliao");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiIsNull() {
            addCriterion("guantitiaozhi is null");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiIsNotNull() {
            addCriterion("guantitiaozhi is not null");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiEqualTo(Double value) {
            addCriterion("guantitiaozhi =", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiNotEqualTo(Double value) {
            addCriterion("guantitiaozhi <>", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiGreaterThan(Double value) {
            addCriterion("guantitiaozhi >", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiGreaterThanOrEqualTo(Double value) {
            addCriterion("guantitiaozhi >=", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiLessThan(Double value) {
            addCriterion("guantitiaozhi <", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiLessThanOrEqualTo(Double value) {
            addCriterion("guantitiaozhi <=", value, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiIn(List<Double> values) {
            addCriterion("guantitiaozhi in", values, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiNotIn(List<Double> values) {
            addCriterion("guantitiaozhi not in", values, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiBetween(Double value1, Double value2) {
            addCriterion("guantitiaozhi between", value1, value2, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andGuantitiaozhiNotBetween(Double value1, Double value2) {
            addCriterion("guantitiaozhi not between", value1, value2, "guantitiaozhi");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanIsNull() {
            addCriterion("zuankongcheyuan is null");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanIsNotNull() {
            addCriterion("zuankongcheyuan is not null");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanEqualTo(Double value) {
            addCriterion("zuankongcheyuan =", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanNotEqualTo(Double value) {
            addCriterion("zuankongcheyuan <>", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanGreaterThan(Double value) {
            addCriterion("zuankongcheyuan >", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanGreaterThanOrEqualTo(Double value) {
            addCriterion("zuankongcheyuan >=", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanLessThan(Double value) {
            addCriterion("zuankongcheyuan <", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanLessThanOrEqualTo(Double value) {
            addCriterion("zuankongcheyuan <=", value, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanIn(List<Double> values) {
            addCriterion("zuankongcheyuan in", values, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanNotIn(List<Double> values) {
            addCriterion("zuankongcheyuan not in", values, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanBetween(Double value1, Double value2) {
            addCriterion("zuankongcheyuan between", value1, value2, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andZuankongcheyuanNotBetween(Double value1, Double value2) {
            addCriterion("zuankongcheyuan not between", value1, value2, "zuankongcheyuan");
            return (Criteria) this;
        }

        public Criteria andMocahanjieIsNull() {
            addCriterion("mocahanjie is null");
            return (Criteria) this;
        }

        public Criteria andMocahanjieIsNotNull() {
            addCriterion("mocahanjie is not null");
            return (Criteria) this;
        }

        public Criteria andMocahanjieEqualTo(Double value) {
            addCriterion("mocahanjie =", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieNotEqualTo(Double value) {
            addCriterion("mocahanjie <>", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieGreaterThan(Double value) {
            addCriterion("mocahanjie >", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieGreaterThanOrEqualTo(Double value) {
            addCriterion("mocahanjie >=", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieLessThan(Double value) {
            addCriterion("mocahanjie <", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieLessThanOrEqualTo(Double value) {
            addCriterion("mocahanjie <=", value, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieIn(List<Double> values) {
            addCriterion("mocahanjie in", values, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieNotIn(List<Double> values) {
            addCriterion("mocahanjie not in", values, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieBetween(Double value1, Double value2) {
            addCriterion("mocahanjie between", value1, value2, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andMocahanjieNotBetween(Double value1, Double value2) {
            addCriterion("mocahanjie not between", value1, value2, "mocahanjie");
            return (Criteria) this;
        }

        public Criteria andWusunjianceIsNull() {
            addCriterion("wusunjiance is null");
            return (Criteria) this;
        }

        public Criteria andWusunjianceIsNotNull() {
            addCriterion("wusunjiance is not null");
            return (Criteria) this;
        }

        public Criteria andWusunjianceEqualTo(Double value) {
            addCriterion("wusunjiance =", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotEqualTo(Double value) {
            addCriterion("wusunjiance <>", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceGreaterThan(Double value) {
            addCriterion("wusunjiance >", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceGreaterThanOrEqualTo(Double value) {
            addCriterion("wusunjiance >=", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceLessThan(Double value) {
            addCriterion("wusunjiance <", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceLessThanOrEqualTo(Double value) {
            addCriterion("wusunjiance <=", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceIn(List<Double> values) {
            addCriterion("wusunjiance in", values, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotIn(List<Double> values) {
            addCriterion("wusunjiance not in", values, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceBetween(Double value1, Double value2) {
            addCriterion("wusunjiance between", value1, value2, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotBetween(Double value1, Double value2) {
            addCriterion("wusunjiance not between", value1, value2, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongIsNull() {
            addCriterion("luowenjiagong is null");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongIsNotNull() {
            addCriterion("luowenjiagong is not null");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongEqualTo(Double value) {
            addCriterion("luowenjiagong =", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongNotEqualTo(Double value) {
            addCriterion("luowenjiagong <>", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongGreaterThan(Double value) {
            addCriterion("luowenjiagong >", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongGreaterThanOrEqualTo(Double value) {
            addCriterion("luowenjiagong >=", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongLessThan(Double value) {
            addCriterion("luowenjiagong <", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongLessThanOrEqualTo(Double value) {
            addCriterion("luowenjiagong <=", value, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongIn(List<Double> values) {
            addCriterion("luowenjiagong in", values, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongNotIn(List<Double> values) {
            addCriterion("luowenjiagong not in", values, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongBetween(Double value1, Double value2) {
            addCriterion("luowenjiagong between", value1, value2, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andLuowenjiagongNotBetween(Double value1, Double value2) {
            addCriterion("luowenjiagong not between", value1, value2, "luowenjiagong");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanIsNull() {
            addCriterion("zuantingluoxuan is null");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanIsNotNull() {
            addCriterion("zuantingluoxuan is not null");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanEqualTo(Double value) {
            addCriterion("zuantingluoxuan =", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanNotEqualTo(Double value) {
            addCriterion("zuantingluoxuan <>", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanGreaterThan(Double value) {
            addCriterion("zuantingluoxuan >", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanGreaterThanOrEqualTo(Double value) {
            addCriterion("zuantingluoxuan >=", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanLessThan(Double value) {
            addCriterion("zuantingluoxuan <", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanLessThanOrEqualTo(Double value) {
            addCriterion("zuantingluoxuan <=", value, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanIn(List<Double> values) {
            addCriterion("zuantingluoxuan in", values, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanNotIn(List<Double> values) {
            addCriterion("zuantingluoxuan not in", values, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanBetween(Double value1, Double value2) {
            addCriterion("zuantingluoxuan between", value1, value2, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andZuantingluoxuanNotBetween(Double value1, Double value2) {
            addCriterion("zuantingluoxuan not between", value1, value2, "zuantingluoxuan");
            return (Criteria) this;
        }

        public Criteria andTufuIsNull() {
            addCriterion("tufu is null");
            return (Criteria) this;
        }

        public Criteria andTufuIsNotNull() {
            addCriterion("tufu is not null");
            return (Criteria) this;
        }

        public Criteria andTufuEqualTo(Double value) {
            addCriterion("tufu =", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuNotEqualTo(Double value) {
            addCriterion("tufu <>", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuGreaterThan(Double value) {
            addCriterion("tufu >", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuGreaterThanOrEqualTo(Double value) {
            addCriterion("tufu >=", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuLessThan(Double value) {
            addCriterion("tufu <", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuLessThanOrEqualTo(Double value) {
            addCriterion("tufu <=", value, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuIn(List<Double> values) {
            addCriterion("tufu in", values, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuNotIn(List<Double> values) {
            addCriterion("tufu not in", values, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuBetween(Double value1, Double value2) {
            addCriterion("tufu between", value1, value2, "tufu");
            return (Criteria) this;
        }

        public Criteria andTufuNotBetween(Double value1, Double value2) {
            addCriterion("tufu not between", value1, value2, "tufu");
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

        public Criteria andChengpinrukuEqualTo(Double value) {
            addCriterion("chengpinruku =", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotEqualTo(Double value) {
            addCriterion("chengpinruku <>", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuGreaterThan(Double value) {
            addCriterion("chengpinruku >", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuGreaterThanOrEqualTo(Double value) {
            addCriterion("chengpinruku >=", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuLessThan(Double value) {
            addCriterion("chengpinruku <", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuLessThanOrEqualTo(Double value) {
            addCriterion("chengpinruku <=", value, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuIn(List<Double> values) {
            addCriterion("chengpinruku in", values, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotIn(List<Double> values) {
            addCriterion("chengpinruku not in", values, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuBetween(Double value1, Double value2) {
            addCriterion("chengpinruku between", value1, value2, "chengpinruku");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuNotBetween(Double value1, Double value2) {
            addCriterion("chengpinruku not between", value1, value2, "chengpinruku");
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

        public Criteria andFayunEqualTo(Double value) {
            addCriterion("fayun =", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotEqualTo(Double value) {
            addCriterion("fayun <>", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunGreaterThan(Double value) {
            addCriterion("fayun >", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunGreaterThanOrEqualTo(Double value) {
            addCriterion("fayun >=", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunLessThan(Double value) {
            addCriterion("fayun <", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunLessThanOrEqualTo(Double value) {
            addCriterion("fayun <=", value, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunIn(List<Double> values) {
            addCriterion("fayun in", values, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotIn(List<Double> values) {
            addCriterion("fayun not in", values, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunBetween(Double value1, Double value2) {
            addCriterion("fayun between", value1, value2, "fayun");
            return (Criteria) this;
        }

        public Criteria andFayunNotBetween(Double value1, Double value2) {
            addCriterion("fayun not between", value1, value2, "fayun");
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