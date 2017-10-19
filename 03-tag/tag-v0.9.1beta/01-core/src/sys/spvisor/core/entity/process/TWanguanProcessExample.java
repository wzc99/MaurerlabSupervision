package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TWanguanProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWanguanProcessExample() {
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

        public Criteria andWanguanIdIsNull() {
            addCriterion("wanguan_id is null");
            return (Criteria) this;
        }

        public Criteria andWanguanIdIsNotNull() {
            addCriterion("wanguan_id is not null");
            return (Criteria) this;
        }

        public Criteria andWanguanIdEqualTo(Integer value) {
            addCriterion("wanguan_id =", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdNotEqualTo(Integer value) {
            addCriterion("wanguan_id <>", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdGreaterThan(Integer value) {
            addCriterion("wanguan_id >", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wanguan_id >=", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdLessThan(Integer value) {
            addCriterion("wanguan_id <", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdLessThanOrEqualTo(Integer value) {
            addCriterion("wanguan_id <=", value, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdIn(List<Integer> values) {
            addCriterion("wanguan_id in", values, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdNotIn(List<Integer> values) {
            addCriterion("wanguan_id not in", values, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdBetween(Integer value1, Integer value2) {
            addCriterion("wanguan_id between", value1, value2, "wanguanId");
            return (Criteria) this;
        }

        public Criteria andWanguanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wanguan_id not between", value1, value2, "wanguanId");
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

        public Criteria andMuguandaoliaoZhiIsNull() {
            addCriterion("muguandaoliao_zhi is null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiIsNotNull() {
            addCriterion("muguandaoliao_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiEqualTo(Double value) {
            addCriterion("muguandaoliao_zhi =", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiNotEqualTo(Double value) {
            addCriterion("muguandaoliao_zhi <>", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiGreaterThan(Double value) {
            addCriterion("muguandaoliao_zhi >", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_zhi >=", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiLessThan(Double value) {
            addCriterion("muguandaoliao_zhi <", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiLessThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_zhi <=", value, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiIn(List<Double> values) {
            addCriterion("muguandaoliao_zhi in", values, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiNotIn(List<Double> values) {
            addCriterion("muguandaoliao_zhi not in", values, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_zhi between", value1, value2, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoZhiNotBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_zhi not between", value1, value2, "muguandaoliaoZhi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiIsNull() {
            addCriterion("muguandaoliao_mi is null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiIsNotNull() {
            addCriterion("muguandaoliao_mi is not null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiEqualTo(Double value) {
            addCriterion("muguandaoliao_mi =", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiNotEqualTo(Double value) {
            addCriterion("muguandaoliao_mi <>", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiGreaterThan(Double value) {
            addCriterion("muguandaoliao_mi >", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiGreaterThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_mi >=", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiLessThan(Double value) {
            addCriterion("muguandaoliao_mi <", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiLessThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_mi <=", value, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiIn(List<Double> values) {
            addCriterion("muguandaoliao_mi in", values, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiNotIn(List<Double> values) {
            addCriterion("muguandaoliao_mi not in", values, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_mi between", value1, value2, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoMiNotBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_mi not between", value1, value2, "muguandaoliaoMi");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunIsNull() {
            addCriterion("muguandaoliao_dun is null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunIsNotNull() {
            addCriterion("muguandaoliao_dun is not null");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunEqualTo(Double value) {
            addCriterion("muguandaoliao_dun =", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunNotEqualTo(Double value) {
            addCriterion("muguandaoliao_dun <>", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunGreaterThan(Double value) {
            addCriterion("muguandaoliao_dun >", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunGreaterThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_dun >=", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunLessThan(Double value) {
            addCriterion("muguandaoliao_dun <", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunLessThanOrEqualTo(Double value) {
            addCriterion("muguandaoliao_dun <=", value, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunIn(List<Double> values) {
            addCriterion("muguandaoliao_dun in", values, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunNotIn(List<Double> values) {
            addCriterion("muguandaoliao_dun not in", values, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_dun between", value1, value2, "muguandaoliaoDun");
            return (Criteria) this;
        }

        public Criteria andMuguandaoliaoDunNotBetween(Double value1, Double value2) {
            addCriterion("muguandaoliao_dun not between", value1, value2, "muguandaoliaoDun");
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

        public Criteria andChengxingEqualTo(Double value) {
            addCriterion("chengxing =", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotEqualTo(Double value) {
            addCriterion("chengxing <>", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingGreaterThan(Double value) {
            addCriterion("chengxing >", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingGreaterThanOrEqualTo(Double value) {
            addCriterion("chengxing >=", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingLessThan(Double value) {
            addCriterion("chengxing <", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingLessThanOrEqualTo(Double value) {
            addCriterion("chengxing <=", value, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingIn(List<Double> values) {
            addCriterion("chengxing in", values, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotIn(List<Double> values) {
            addCriterion("chengxing not in", values, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingBetween(Double value1, Double value2) {
            addCriterion("chengxing between", value1, value2, "chengxing");
            return (Criteria) this;
        }

        public Criteria andChengxingNotBetween(Double value1, Double value2) {
            addCriterion("chengxing not between", value1, value2, "chengxing");
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

        public Criteria andRechuliEqualTo(Double value) {
            addCriterion("rechuli =", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotEqualTo(Double value) {
            addCriterion("rechuli <>", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliGreaterThan(Double value) {
            addCriterion("rechuli >", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliGreaterThanOrEqualTo(Double value) {
            addCriterion("rechuli >=", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliLessThan(Double value) {
            addCriterion("rechuli <", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliLessThanOrEqualTo(Double value) {
            addCriterion("rechuli <=", value, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliIn(List<Double> values) {
            addCriterion("rechuli in", values, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotIn(List<Double> values) {
            addCriterion("rechuli not in", values, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliBetween(Double value1, Double value2) {
            addCriterion("rechuli between", value1, value2, "rechuli");
            return (Criteria) this;
        }

        public Criteria andRechuliNotBetween(Double value1, Double value2) {
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

        public Criteria andTufuZhiIsNull() {
            addCriterion("tufu_zhi is null");
            return (Criteria) this;
        }

        public Criteria andTufuZhiIsNotNull() {
            addCriterion("tufu_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andTufuZhiEqualTo(Double value) {
            addCriterion("tufu_zhi =", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotEqualTo(Double value) {
            addCriterion("tufu_zhi <>", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiGreaterThan(Double value) {
            addCriterion("tufu_zhi >", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("tufu_zhi >=", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiLessThan(Double value) {
            addCriterion("tufu_zhi <", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiLessThanOrEqualTo(Double value) {
            addCriterion("tufu_zhi <=", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiIn(List<Double> values) {
            addCriterion("tufu_zhi in", values, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotIn(List<Double> values) {
            addCriterion("tufu_zhi not in", values, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiBetween(Double value1, Double value2) {
            addCriterion("tufu_zhi between", value1, value2, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotBetween(Double value1, Double value2) {
            addCriterion("tufu_zhi not between", value1, value2, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuMiIsNull() {
            addCriterion("tufu_mi is null");
            return (Criteria) this;
        }

        public Criteria andTufuMiIsNotNull() {
            addCriterion("tufu_mi is not null");
            return (Criteria) this;
        }

        public Criteria andTufuMiEqualTo(Double value) {
            addCriterion("tufu_mi =", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiNotEqualTo(Double value) {
            addCriterion("tufu_mi <>", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiGreaterThan(Double value) {
            addCriterion("tufu_mi >", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiGreaterThanOrEqualTo(Double value) {
            addCriterion("tufu_mi >=", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiLessThan(Double value) {
            addCriterion("tufu_mi <", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiLessThanOrEqualTo(Double value) {
            addCriterion("tufu_mi <=", value, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiIn(List<Double> values) {
            addCriterion("tufu_mi in", values, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiNotIn(List<Double> values) {
            addCriterion("tufu_mi not in", values, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiBetween(Double value1, Double value2) {
            addCriterion("tufu_mi between", value1, value2, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuMiNotBetween(Double value1, Double value2) {
            addCriterion("tufu_mi not between", value1, value2, "tufuMi");
            return (Criteria) this;
        }

        public Criteria andTufuDunIsNull() {
            addCriterion("tufu_dun is null");
            return (Criteria) this;
        }

        public Criteria andTufuDunIsNotNull() {
            addCriterion("tufu_dun is not null");
            return (Criteria) this;
        }

        public Criteria andTufuDunEqualTo(Double value) {
            addCriterion("tufu_dun =", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunNotEqualTo(Double value) {
            addCriterion("tufu_dun <>", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunGreaterThan(Double value) {
            addCriterion("tufu_dun >", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunGreaterThanOrEqualTo(Double value) {
            addCriterion("tufu_dun >=", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunLessThan(Double value) {
            addCriterion("tufu_dun <", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunLessThanOrEqualTo(Double value) {
            addCriterion("tufu_dun <=", value, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunIn(List<Double> values) {
            addCriterion("tufu_dun in", values, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunNotIn(List<Double> values) {
            addCriterion("tufu_dun not in", values, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunBetween(Double value1, Double value2) {
            addCriterion("tufu_dun between", value1, value2, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andTufuDunNotBetween(Double value1, Double value2) {
            addCriterion("tufu_dun not between", value1, value2, "tufuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiIsNull() {
            addCriterion("fangfuguanruku_zhi is null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiIsNotNull() {
            addCriterion("fangfuguanruku_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiEqualTo(Double value) {
            addCriterion("fangfuguanruku_zhi =", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiNotEqualTo(Double value) {
            addCriterion("fangfuguanruku_zhi <>", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiGreaterThan(Double value) {
            addCriterion("fangfuguanruku_zhi >", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_zhi >=", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiLessThan(Double value) {
            addCriterion("fangfuguanruku_zhi <", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiLessThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_zhi <=", value, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiIn(List<Double> values) {
            addCriterion("fangfuguanruku_zhi in", values, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiNotIn(List<Double> values) {
            addCriterion("fangfuguanruku_zhi not in", values, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_zhi between", value1, value2, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuZhiNotBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_zhi not between", value1, value2, "fangfuguanrukuZhi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiIsNull() {
            addCriterion("fangfuguanruku_mi is null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiIsNotNull() {
            addCriterion("fangfuguanruku_mi is not null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiEqualTo(Double value) {
            addCriterion("fangfuguanruku_mi =", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiNotEqualTo(Double value) {
            addCriterion("fangfuguanruku_mi <>", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiGreaterThan(Double value) {
            addCriterion("fangfuguanruku_mi >", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiGreaterThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_mi >=", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiLessThan(Double value) {
            addCriterion("fangfuguanruku_mi <", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiLessThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_mi <=", value, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiIn(List<Double> values) {
            addCriterion("fangfuguanruku_mi in", values, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiNotIn(List<Double> values) {
            addCriterion("fangfuguanruku_mi not in", values, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_mi between", value1, value2, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuMiNotBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_mi not between", value1, value2, "fangfuguanrukuMi");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunIsNull() {
            addCriterion("fangfuguanruku_dun is null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunIsNotNull() {
            addCriterion("fangfuguanruku_dun is not null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunEqualTo(Double value) {
            addCriterion("fangfuguanruku_dun =", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunNotEqualTo(Double value) {
            addCriterion("fangfuguanruku_dun <>", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunGreaterThan(Double value) {
            addCriterion("fangfuguanruku_dun >", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunGreaterThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_dun >=", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunLessThan(Double value) {
            addCriterion("fangfuguanruku_dun <", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunLessThanOrEqualTo(Double value) {
            addCriterion("fangfuguanruku_dun <=", value, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunIn(List<Double> values) {
            addCriterion("fangfuguanruku_dun in", values, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunNotIn(List<Double> values) {
            addCriterion("fangfuguanruku_dun not in", values, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_dun between", value1, value2, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanrukuDunNotBetween(Double value1, Double value2) {
            addCriterion("fangfuguanruku_dun not between", value1, value2, "fangfuguanrukuDun");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangIsNull() {
            addCriterion("fangfuguanliufang is null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangIsNotNull() {
            addCriterion("fangfuguanliufang is not null");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangEqualTo(Double value) {
            addCriterion("fangfuguanliufang =", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangNotEqualTo(Double value) {
            addCriterion("fangfuguanliufang <>", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangGreaterThan(Double value) {
            addCriterion("fangfuguanliufang >", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangGreaterThanOrEqualTo(Double value) {
            addCriterion("fangfuguanliufang >=", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangLessThan(Double value) {
            addCriterion("fangfuguanliufang <", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangLessThanOrEqualTo(Double value) {
            addCriterion("fangfuguanliufang <=", value, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangIn(List<Double> values) {
            addCriterion("fangfuguanliufang in", values, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangNotIn(List<Double> values) {
            addCriterion("fangfuguanliufang not in", values, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangBetween(Double value1, Double value2) {
            addCriterion("fangfuguanliufang between", value1, value2, "fangfuguanliufang");
            return (Criteria) this;
        }

        public Criteria andFangfuguanliufangNotBetween(Double value1, Double value2) {
            addCriterion("fangfuguanliufang not between", value1, value2, "fangfuguanliufang");
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