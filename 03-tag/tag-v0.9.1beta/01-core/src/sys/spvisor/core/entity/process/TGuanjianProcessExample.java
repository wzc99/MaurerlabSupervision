package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TGuanjianProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGuanjianProcessExample() {
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

        public Criteria andGuanjianIdIsNull() {
            addCriterion("guanjian_id is null");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdIsNotNull() {
            addCriterion("guanjian_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdEqualTo(Integer value) {
            addCriterion("guanjian_id =", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdNotEqualTo(Integer value) {
            addCriterion("guanjian_id <>", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdGreaterThan(Integer value) {
            addCriterion("guanjian_id >", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanjian_id >=", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdLessThan(Integer value) {
            addCriterion("guanjian_id <", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdLessThanOrEqualTo(Integer value) {
            addCriterion("guanjian_id <=", value, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdIn(List<Integer> values) {
            addCriterion("guanjian_id in", values, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdNotIn(List<Integer> values) {
            addCriterion("guanjian_id not in", values, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdBetween(Integer value1, Integer value2) {
            addCriterion("guanjian_id between", value1, value2, "guanjianId");
            return (Criteria) this;
        }

        public Criteria andGuanjianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guanjian_id not between", value1, value2, "guanjianId");
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

        public Criteria andXialiaoIsNull() {
            addCriterion("xialiao is null");
            return (Criteria) this;
        }

        public Criteria andXialiaoIsNotNull() {
            addCriterion("xialiao is not null");
            return (Criteria) this;
        }

        public Criteria andXialiaoEqualTo(String value) {
            addCriterion("xialiao =", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoNotEqualTo(String value) {
            addCriterion("xialiao <>", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoGreaterThan(String value) {
            addCriterion("xialiao >", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoGreaterThanOrEqualTo(String value) {
            addCriterion("xialiao >=", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoLessThan(String value) {
            addCriterion("xialiao <", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoLessThanOrEqualTo(String value) {
            addCriterion("xialiao <=", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoLike(String value) {
            addCriterion("xialiao like", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoNotLike(String value) {
            addCriterion("xialiao not like", value, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoIn(List<String> values) {
            addCriterion("xialiao in", values, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoNotIn(List<String> values) {
            addCriterion("xialiao not in", values, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoBetween(String value1, String value2) {
            addCriterion("xialiao between", value1, value2, "xialiao");
            return (Criteria) this;
        }

        public Criteria andXialiaoNotBetween(String value1, String value2) {
            addCriterion("xialiao not between", value1, value2, "xialiao");
            return (Criteria) this;
        }

        public Criteria andChengxingIsNull() {
            addCriterion("chengxing is null");
            return (Criteria) this;
        }

        public Criteria andChengxingIsNotNull() {
            addCriterion("chengxing is not null");
            return (Criteria) this;
        }

        public Criteria andChengxingEqualTo(String value) {
            addCriterion("chengxing =", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotEqualTo(String value) {
            addCriterion("chengxing <>", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingGreaterThan(String value) {
            addCriterion("chengxing >", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingGreaterThanOrEqualTo(String value) {
            addCriterion("chengxing >=", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingLessThan(String value) {
            addCriterion("chengxing <", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingLessThanOrEqualTo(String value) {
            addCriterion("chengxing <=", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingLike(String value) {
            addCriterion("chengxing like", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotLike(String value) {
            addCriterion("chengxing not like", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingIn(List<String> values) {
            addCriterion("chengxing in", values, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotIn(List<String> values) {
            addCriterion("chengxing not in", values, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingBetween(String value1, String value2) {
            addCriterion("chengxing between", value1, value2, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotBetween(String value1, String value2) {
            addCriterion("chengxing not between", value1, value2, "chengxing");
            return (Criteria) this;
        }

        public Criteria andHanjieIsNull() {
            addCriterion("hanjie is null");
            return (Criteria) this;
        }

        public Criteria andHanjieIsNotNull() {
            addCriterion("hanjie is not null");
            return (Criteria) this;
        }

        public Criteria andHanjieEqualTo(String value) {
            addCriterion("hanjie =", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieNotEqualTo(String value) {
            addCriterion("hanjie <>", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieGreaterThan(String value) {
            addCriterion("hanjie >", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieGreaterThanOrEqualTo(String value) {
            addCriterion("hanjie >=", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieLessThan(String value) {
            addCriterion("hanjie <", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieLessThanOrEqualTo(String value) {
            addCriterion("hanjie <=", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieLike(String value) {
            addCriterion("hanjie like", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieNotLike(String value) {
            addCriterion("hanjie not like", value, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieIn(List<String> values) {
            addCriterion("hanjie in", values, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieNotIn(List<String> values) {
            addCriterion("hanjie not in", values, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieBetween(String value1, String value2) {
            addCriterion("hanjie between", value1, value2, "hanjie");
            return (Criteria) this;
        }

        public Criteria andHanjieNotBetween(String value1, String value2) {
            addCriterion("hanjie not between", value1, value2, "hanjie");
            return (Criteria) this;
        }

        public Criteria andRechuliIsNull() {
            addCriterion("rechuli is null");
            return (Criteria) this;
        }

        public Criteria andRechuliIsNotNull() {
            addCriterion("rechuli is not null");
            return (Criteria) this;
        }

        public Criteria andRechuliEqualTo(String value) {
            addCriterion("rechuli =", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotEqualTo(String value) {
            addCriterion("rechuli <>", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliGreaterThan(String value) {
            addCriterion("rechuli >", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliGreaterThanOrEqualTo(String value) {
            addCriterion("rechuli >=", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliLessThan(String value) {
            addCriterion("rechuli <", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliLessThanOrEqualTo(String value) {
            addCriterion("rechuli <=", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliLike(String value) {
            addCriterion("rechuli like", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotLike(String value) {
            addCriterion("rechuli not like", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliIn(List<String> values) {
            addCriterion("rechuli in", values, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotIn(List<String> values) {
            addCriterion("rechuli not in", values, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliBetween(String value1, String value2) {
            addCriterion("rechuli between", value1, value2, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotBetween(String value1, String value2) {
            addCriterion("rechuli not between", value1, value2, "rechuli");
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

        public Criteria andWusunjianceEqualTo(String value) {
            addCriterion("wusunjiance =", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotEqualTo(String value) {
            addCriterion("wusunjiance <>", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceGreaterThan(String value) {
            addCriterion("wusunjiance >", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceGreaterThanOrEqualTo(String value) {
            addCriterion("wusunjiance >=", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceLessThan(String value) {
            addCriterion("wusunjiance <", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceLessThanOrEqualTo(String value) {
            addCriterion("wusunjiance <=", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceLike(String value) {
            addCriterion("wusunjiance like", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotLike(String value) {
            addCriterion("wusunjiance not like", value, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceIn(List<String> values) {
            addCriterion("wusunjiance in", values, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotIn(List<String> values) {
            addCriterion("wusunjiance not in", values, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceBetween(String value1, String value2) {
            addCriterion("wusunjiance between", value1, value2, "wusunjiance");
            return (Criteria) this;
        }

        public Criteria andWusunjianceNotBetween(String value1, String value2) {
            addCriterion("wusunjiance not between", value1, value2, "wusunjiance");
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