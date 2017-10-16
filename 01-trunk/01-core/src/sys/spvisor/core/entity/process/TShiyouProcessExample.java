package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TShiyouProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShiyouProcessExample() {
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

        public Criteria andShiyouIdIsNull() {
            addCriterion("shiyou_id is null");
            return (Criteria) this;
        }

        public Criteria andShiyouIdIsNotNull() {
            addCriterion("shiyou_id is not null");
            return (Criteria) this;
        }

        public Criteria andShiyouIdEqualTo(Integer value) {
            addCriterion("shiyou_id =", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdNotEqualTo(Integer value) {
            addCriterion("shiyou_id <>", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdGreaterThan(Integer value) {
            addCriterion("shiyou_id >", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shiyou_id >=", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdLessThan(Integer value) {
            addCriterion("shiyou_id <", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdLessThanOrEqualTo(Integer value) {
            addCriterion("shiyou_id <=", value, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdIn(List<Integer> values) {
            addCriterion("shiyou_id in", values, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdNotIn(List<Integer> values) {
            addCriterion("shiyou_id not in", values, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdBetween(Integer value1, Integer value2) {
            addCriterion("shiyou_id between", value1, value2, "shiyouId");
            return (Criteria) this;
        }

        public Criteria andShiyouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shiyou_id not between", value1, value2, "shiyouId");
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

        public Criteria andGangguanchengxingshuliangIsNull() {
            addCriterion("gangguanchengxingshuliang is null");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangIsNotNull() {
            addCriterion("gangguanchengxingshuliang is not null");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangEqualTo(Double value) {
            addCriterion("gangguanchengxingshuliang =", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangNotEqualTo(Double value) {
            addCriterion("gangguanchengxingshuliang <>", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangGreaterThan(Double value) {
            addCriterion("gangguanchengxingshuliang >", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangGreaterThanOrEqualTo(Double value) {
            addCriterion("gangguanchengxingshuliang >=", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangLessThan(Double value) {
            addCriterion("gangguanchengxingshuliang <", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangLessThanOrEqualTo(Double value) {
            addCriterion("gangguanchengxingshuliang <=", value, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangIn(List<Double> values) {
            addCriterion("gangguanchengxingshuliang in", values, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangNotIn(List<Double> values) {
            addCriterion("gangguanchengxingshuliang not in", values, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangBetween(Double value1, Double value2) {
            addCriterion("gangguanchengxingshuliang between", value1, value2, "gangguanchengxingshuliang");
            return (Criteria) this;
        }

        public Criteria andGangguanchengxingshuliangNotBetween(Double value1, Double value2) {
            addCriterion("gangguanchengxingshuliang not between", value1, value2, "gangguanchengxingshuliang");
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

        public Criteria andGangguanchicunjianyanIsNull() {
            addCriterion("gangguanchicunjianyan is null");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanIsNotNull() {
            addCriterion("gangguanchicunjianyan is not null");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanEqualTo(Double value) {
            addCriterion("gangguanchicunjianyan =", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanNotEqualTo(Double value) {
            addCriterion("gangguanchicunjianyan <>", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanGreaterThan(Double value) {
            addCriterion("gangguanchicunjianyan >", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanGreaterThanOrEqualTo(Double value) {
            addCriterion("gangguanchicunjianyan >=", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanLessThan(Double value) {
            addCriterion("gangguanchicunjianyan <", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanLessThanOrEqualTo(Double value) {
            addCriterion("gangguanchicunjianyan <=", value, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanIn(List<Double> values) {
            addCriterion("gangguanchicunjianyan in", values, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanNotIn(List<Double> values) {
            addCriterion("gangguanchicunjianyan not in", values, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanBetween(Double value1, Double value2) {
            addCriterion("gangguanchicunjianyan between", value1, value2, "gangguanchicunjianyan");
            return (Criteria) this;
        }

        public Criteria andGangguanchicunjianyanNotBetween(Double value1, Double value2) {
            addCriterion("gangguanchicunjianyan not between", value1, value2, "gangguanchicunjianyan");
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

        public Criteria andShuiyaIsNull() {
            addCriterion("shuiya is null");
            return (Criteria) this;
        }

        public Criteria andShuiyaIsNotNull() {
            addCriterion("shuiya is not null");
            return (Criteria) this;
        }

        public Criteria andShuiyaEqualTo(Double value) {
            addCriterion("shuiya =", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaNotEqualTo(Double value) {
            addCriterion("shuiya <>", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaGreaterThan(Double value) {
            addCriterion("shuiya >", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaGreaterThanOrEqualTo(Double value) {
            addCriterion("shuiya >=", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaLessThan(Double value) {
            addCriterion("shuiya <", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaLessThanOrEqualTo(Double value) {
            addCriterion("shuiya <=", value, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaIn(List<Double> values) {
            addCriterion("shuiya in", values, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaNotIn(List<Double> values) {
            addCriterion("shuiya not in", values, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaBetween(Double value1, Double value2) {
            addCriterion("shuiya between", value1, value2, "shuiya");
            return (Criteria) this;
        }

        public Criteria andShuiyaNotBetween(Double value1, Double value2) {
            addCriterion("shuiya not between", value1, value2, "shuiya");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiIsNull() {
            addCriterion("chengpinruku_zhi is null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiIsNotNull() {
            addCriterion("chengpinruku_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiEqualTo(Double value) {
            addCriterion("chengpinruku_zhi =", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiNotEqualTo(Double value) {
            addCriterion("chengpinruku_zhi <>", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiGreaterThan(Double value) {
            addCriterion("chengpinruku_zhi >", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_zhi >=", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiLessThan(Double value) {
            addCriterion("chengpinruku_zhi <", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiLessThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_zhi <=", value, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiIn(List<Double> values) {
            addCriterion("chengpinruku_zhi in", values, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiNotIn(List<Double> values) {
            addCriterion("chengpinruku_zhi not in", values, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_zhi between", value1, value2, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuZhiNotBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_zhi not between", value1, value2, "chengpinrukuZhi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiIsNull() {
            addCriterion("chengpinruku_mi is null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiIsNotNull() {
            addCriterion("chengpinruku_mi is not null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiEqualTo(Double value) {
            addCriterion("chengpinruku_mi =", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiNotEqualTo(Double value) {
            addCriterion("chengpinruku_mi <>", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiGreaterThan(Double value) {
            addCriterion("chengpinruku_mi >", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiGreaterThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_mi >=", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiLessThan(Double value) {
            addCriterion("chengpinruku_mi <", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiLessThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_mi <=", value, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiIn(List<Double> values) {
            addCriterion("chengpinruku_mi in", values, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiNotIn(List<Double> values) {
            addCriterion("chengpinruku_mi not in", values, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_mi between", value1, value2, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuMiNotBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_mi not between", value1, value2, "chengpinrukuMi");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunIsNull() {
            addCriterion("chengpinruku_dun is null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunIsNotNull() {
            addCriterion("chengpinruku_dun is not null");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunEqualTo(Double value) {
            addCriterion("chengpinruku_dun =", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunNotEqualTo(Double value) {
            addCriterion("chengpinruku_dun <>", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunGreaterThan(Double value) {
            addCriterion("chengpinruku_dun >", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunGreaterThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_dun >=", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunLessThan(Double value) {
            addCriterion("chengpinruku_dun <", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunLessThanOrEqualTo(Double value) {
            addCriterion("chengpinruku_dun <=", value, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunIn(List<Double> values) {
            addCriterion("chengpinruku_dun in", values, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunNotIn(List<Double> values) {
            addCriterion("chengpinruku_dun not in", values, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_dun between", value1, value2, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andChengpinrukuDunNotBetween(Double value1, Double value2) {
            addCriterion("chengpinruku_dun not between", value1, value2, "chengpinrukuDun");
            return (Criteria) this;
        }

        public Criteria andFayunZhiIsNull() {
            addCriterion("fayun_zhi is null");
            return (Criteria) this;
        }

        public Criteria andFayunZhiIsNotNull() {
            addCriterion("fayun_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andFayunZhiEqualTo(Double value) {
            addCriterion("fayun_zhi =", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiNotEqualTo(Double value) {
            addCriterion("fayun_zhi <>", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiGreaterThan(Double value) {
            addCriterion("fayun_zhi >", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("fayun_zhi >=", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiLessThan(Double value) {
            addCriterion("fayun_zhi <", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiLessThanOrEqualTo(Double value) {
            addCriterion("fayun_zhi <=", value, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiIn(List<Double> values) {
            addCriterion("fayun_zhi in", values, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiNotIn(List<Double> values) {
            addCriterion("fayun_zhi not in", values, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiBetween(Double value1, Double value2) {
            addCriterion("fayun_zhi between", value1, value2, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunZhiNotBetween(Double value1, Double value2) {
            addCriterion("fayun_zhi not between", value1, value2, "fayunZhi");
            return (Criteria) this;
        }

        public Criteria andFayunMiIsNull() {
            addCriterion("fayun_mi is null");
            return (Criteria) this;
        }

        public Criteria andFayunMiIsNotNull() {
            addCriterion("fayun_mi is not null");
            return (Criteria) this;
        }

        public Criteria andFayunMiEqualTo(Double value) {
            addCriterion("fayun_mi =", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiNotEqualTo(Double value) {
            addCriterion("fayun_mi <>", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiGreaterThan(Double value) {
            addCriterion("fayun_mi >", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiGreaterThanOrEqualTo(Double value) {
            addCriterion("fayun_mi >=", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiLessThan(Double value) {
            addCriterion("fayun_mi <", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiLessThanOrEqualTo(Double value) {
            addCriterion("fayun_mi <=", value, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiIn(List<Double> values) {
            addCriterion("fayun_mi in", values, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiNotIn(List<Double> values) {
            addCriterion("fayun_mi not in", values, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiBetween(Double value1, Double value2) {
            addCriterion("fayun_mi between", value1, value2, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunMiNotBetween(Double value1, Double value2) {
            addCriterion("fayun_mi not between", value1, value2, "fayunMi");
            return (Criteria) this;
        }

        public Criteria andFayunDunIsNull() {
            addCriterion("fayun_dun is null");
            return (Criteria) this;
        }

        public Criteria andFayunDunIsNotNull() {
            addCriterion("fayun_dun is not null");
            return (Criteria) this;
        }

        public Criteria andFayunDunEqualTo(Double value) {
            addCriterion("fayun_dun =", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunNotEqualTo(Double value) {
            addCriterion("fayun_dun <>", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunGreaterThan(Double value) {
            addCriterion("fayun_dun >", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunGreaterThanOrEqualTo(Double value) {
            addCriterion("fayun_dun >=", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunLessThan(Double value) {
            addCriterion("fayun_dun <", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunLessThanOrEqualTo(Double value) {
            addCriterion("fayun_dun <=", value, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunIn(List<Double> values) {
            addCriterion("fayun_dun in", values, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunNotIn(List<Double> values) {
            addCriterion("fayun_dun not in", values, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunBetween(Double value1, Double value2) {
            addCriterion("fayun_dun between", value1, value2, "fayunDun");
            return (Criteria) this;
        }

        public Criteria andFayunDunNotBetween(Double value1, Double value2) {
            addCriterion("fayun_dun not between", value1, value2, "fayunDun");
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

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date not between", value1, value2, "submitDate");
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