package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TFangfuProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFangfuProcessExample() {
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

        public Criteria andFangfuIdIsNull() {
            addCriterion("fangfu_id is null");
            return (Criteria) this;
        }

        public Criteria andFangfuIdIsNotNull() {
            addCriterion("fangfu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFangfuIdEqualTo(Integer value) {
            addCriterion("fangfu_id =", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdNotEqualTo(Integer value) {
            addCriterion("fangfu_id <>", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdGreaterThan(Integer value) {
            addCriterion("fangfu_id >", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fangfu_id >=", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdLessThan(Integer value) {
            addCriterion("fangfu_id <", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdLessThanOrEqualTo(Integer value) {
            addCriterion("fangfu_id <=", value, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdIn(List<Integer> values) {
            addCriterion("fangfu_id in", values, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdNotIn(List<Integer> values) {
            addCriterion("fangfu_id not in", values, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdBetween(Integer value1, Integer value2) {
            addCriterion("fangfu_id between", value1, value2, "fangfuId");
            return (Criteria) this;
        }

        public Criteria andFangfuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fangfu_id not between", value1, value2, "fangfuId");
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

        public Criteria andGangguanjieshouZhiIsNull() {
            addCriterion("gangguanjieshou_zhi is null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiIsNotNull() {
            addCriterion("gangguanjieshou_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiEqualTo(Double value) {
            addCriterion("gangguanjieshou_zhi =", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiNotEqualTo(Double value) {
            addCriterion("gangguanjieshou_zhi <>", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiGreaterThan(Double value) {
            addCriterion("gangguanjieshou_zhi >", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_zhi >=", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiLessThan(Double value) {
            addCriterion("gangguanjieshou_zhi <", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiLessThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_zhi <=", value, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiIn(List<Double> values) {
            addCriterion("gangguanjieshou_zhi in", values, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiNotIn(List<Double> values) {
            addCriterion("gangguanjieshou_zhi not in", values, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_zhi between", value1, value2, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouZhiNotBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_zhi not between", value1, value2, "gangguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiIsNull() {
            addCriterion("gangguanjieshou_mi is null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiIsNotNull() {
            addCriterion("gangguanjieshou_mi is not null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiEqualTo(Double value) {
            addCriterion("gangguanjieshou_mi =", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiNotEqualTo(Double value) {
            addCriterion("gangguanjieshou_mi <>", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiGreaterThan(Double value) {
            addCriterion("gangguanjieshou_mi >", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiGreaterThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_mi >=", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiLessThan(Double value) {
            addCriterion("gangguanjieshou_mi <", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiLessThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_mi <=", value, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiIn(List<Double> values) {
            addCriterion("gangguanjieshou_mi in", values, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiNotIn(List<Double> values) {
            addCriterion("gangguanjieshou_mi not in", values, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_mi between", value1, value2, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouMiNotBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_mi not between", value1, value2, "gangguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunIsNull() {
            addCriterion("gangguanjieshou_dun is null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunIsNotNull() {
            addCriterion("gangguanjieshou_dun is not null");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunEqualTo(Double value) {
            addCriterion("gangguanjieshou_dun =", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunNotEqualTo(Double value) {
            addCriterion("gangguanjieshou_dun <>", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunGreaterThan(Double value) {
            addCriterion("gangguanjieshou_dun >", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunGreaterThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_dun >=", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunLessThan(Double value) {
            addCriterion("gangguanjieshou_dun <", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunLessThanOrEqualTo(Double value) {
            addCriterion("gangguanjieshou_dun <=", value, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunIn(List<Double> values) {
            addCriterion("gangguanjieshou_dun in", values, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunNotIn(List<Double> values) {
            addCriterion("gangguanjieshou_dun not in", values, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_dun between", value1, value2, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andGangguanjieshouDunNotBetween(Double value1, Double value2) {
            addCriterion("gangguanjieshou_dun not between", value1, value2, "gangguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiIsNull() {
            addCriterion("wanguanjieshou_zhi is null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiIsNotNull() {
            addCriterion("wanguanjieshou_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiEqualTo(Double value) {
            addCriterion("wanguanjieshou_zhi =", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiNotEqualTo(Double value) {
            addCriterion("wanguanjieshou_zhi <>", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiGreaterThan(Double value) {
            addCriterion("wanguanjieshou_zhi >", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiGreaterThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_zhi >=", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiLessThan(Double value) {
            addCriterion("wanguanjieshou_zhi <", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiLessThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_zhi <=", value, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiIn(List<Double> values) {
            addCriterion("wanguanjieshou_zhi in", values, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiNotIn(List<Double> values) {
            addCriterion("wanguanjieshou_zhi not in", values, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_zhi between", value1, value2, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouZhiNotBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_zhi not between", value1, value2, "wanguanjieshouZhi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiIsNull() {
            addCriterion("wanguanjieshou_mi is null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiIsNotNull() {
            addCriterion("wanguanjieshou_mi is not null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiEqualTo(Double value) {
            addCriterion("wanguanjieshou_mi =", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiNotEqualTo(Double value) {
            addCriterion("wanguanjieshou_mi <>", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiGreaterThan(Double value) {
            addCriterion("wanguanjieshou_mi >", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiGreaterThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_mi >=", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiLessThan(Double value) {
            addCriterion("wanguanjieshou_mi <", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiLessThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_mi <=", value, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiIn(List<Double> values) {
            addCriterion("wanguanjieshou_mi in", values, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiNotIn(List<Double> values) {
            addCriterion("wanguanjieshou_mi not in", values, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_mi between", value1, value2, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouMiNotBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_mi not between", value1, value2, "wanguanjieshouMi");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunIsNull() {
            addCriterion("wanguanjieshou_dun is null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunIsNotNull() {
            addCriterion("wanguanjieshou_dun is not null");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunEqualTo(Double value) {
            addCriterion("wanguanjieshou_dun =", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunNotEqualTo(Double value) {
            addCriterion("wanguanjieshou_dun <>", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunGreaterThan(Double value) {
            addCriterion("wanguanjieshou_dun >", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunGreaterThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_dun >=", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunLessThan(Double value) {
            addCriterion("wanguanjieshou_dun <", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunLessThanOrEqualTo(Double value) {
            addCriterion("wanguanjieshou_dun <=", value, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunIn(List<Double> values) {
            addCriterion("wanguanjieshou_dun in", values, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunNotIn(List<Double> values) {
            addCriterion("wanguanjieshou_dun not in", values, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_dun between", value1, value2, "wanguanjieshouDun");
            return (Criteria) this;
        }

        public Criteria andWanguanjieshouDunNotBetween(Double value1, Double value2) {
            addCriterion("wanguanjieshou_dun not between", value1, value2, "wanguanjieshouDun");
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