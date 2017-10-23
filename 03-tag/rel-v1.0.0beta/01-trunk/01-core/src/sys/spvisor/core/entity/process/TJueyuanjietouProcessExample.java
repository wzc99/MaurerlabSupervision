package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TJueyuanjietouProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJueyuanjietouProcessExample() {
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

        public Criteria andJueyuanIdIsNull() {
            addCriterion("jueyuan_id is null");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdIsNotNull() {
            addCriterion("jueyuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdEqualTo(Integer value) {
            addCriterion("jueyuan_id =", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdNotEqualTo(Integer value) {
            addCriterion("jueyuan_id <>", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdGreaterThan(Integer value) {
            addCriterion("jueyuan_id >", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jueyuan_id >=", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdLessThan(Integer value) {
            addCriterion("jueyuan_id <", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("jueyuan_id <=", value, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdIn(List<Integer> values) {
            addCriterion("jueyuan_id in", values, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdNotIn(List<Integer> values) {
            addCriterion("jueyuan_id not in", values, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdBetween(Integer value1, Integer value2) {
            addCriterion("jueyuan_id between", value1, value2, "jueyuanId");
            return (Criteria) this;
        }

        public Criteria andJueyuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jueyuan_id not between", value1, value2, "jueyuanId");
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

        public Criteria andYuancailiaoIsNull() {
            addCriterion("yuancailiao is null");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoIsNotNull() {
            addCriterion("yuancailiao is not null");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoEqualTo(Double value) {
            addCriterion("yuancailiao =", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoNotEqualTo(Double value) {
            addCriterion("yuancailiao <>", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoGreaterThan(Double value) {
            addCriterion("yuancailiao >", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoGreaterThanOrEqualTo(Double value) {
            addCriterion("yuancailiao >=", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoLessThan(Double value) {
            addCriterion("yuancailiao <", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoLessThanOrEqualTo(Double value) {
            addCriterion("yuancailiao <=", value, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoIn(List<Double> values) {
            addCriterion("yuancailiao in", values, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoNotIn(List<Double> values) {
            addCriterion("yuancailiao not in", values, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoBetween(Double value1, Double value2) {
            addCriterion("yuancailiao between", value1, value2, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andYuancailiaoNotBetween(Double value1, Double value2) {
            addCriterion("yuancailiao not between", value1, value2, "yuancailiao");
            return (Criteria) this;
        }

        public Criteria andZuoyouIsNull() {
            addCriterion("zuoyou is null");
            return (Criteria) this;
        }

        public Criteria andZuoyouIsNotNull() {
            addCriterion("zuoyou is not null");
            return (Criteria) this;
        }

        public Criteria andZuoyouEqualTo(Double value) {
            addCriterion("zuoyou =", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouNotEqualTo(Double value) {
            addCriterion("zuoyou <>", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouGreaterThan(Double value) {
            addCriterion("zuoyou >", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouGreaterThanOrEqualTo(Double value) {
            addCriterion("zuoyou >=", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouLessThan(Double value) {
            addCriterion("zuoyou <", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouLessThanOrEqualTo(Double value) {
            addCriterion("zuoyou <=", value, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouIn(List<Double> values) {
            addCriterion("zuoyou in", values, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouNotIn(List<Double> values) {
            addCriterion("zuoyou not in", values, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouBetween(Double value1, Double value2) {
            addCriterion("zuoyou between", value1, value2, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andZuoyouNotBetween(Double value1, Double value2) {
            addCriterion("zuoyou not between", value1, value2, "zuoyou");
            return (Criteria) this;
        }

        public Criteria andShangxiaIsNull() {
            addCriterion("shangxia is null");
            return (Criteria) this;
        }

        public Criteria andShangxiaIsNotNull() {
            addCriterion("shangxia is not null");
            return (Criteria) this;
        }

        public Criteria andShangxiaEqualTo(Double value) {
            addCriterion("shangxia =", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaNotEqualTo(Double value) {
            addCriterion("shangxia <>", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaGreaterThan(Double value) {
            addCriterion("shangxia >", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaGreaterThanOrEqualTo(Double value) {
            addCriterion("shangxia >=", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaLessThan(Double value) {
            addCriterion("shangxia <", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaLessThanOrEqualTo(Double value) {
            addCriterion("shangxia <=", value, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaIn(List<Double> values) {
            addCriterion("shangxia in", values, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaNotIn(List<Double> values) {
            addCriterion("shangxia not in", values, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaBetween(Double value1, Double value2) {
            addCriterion("shangxia between", value1, value2, "shangxia");
            return (Criteria) this;
        }

        public Criteria andShangxiaNotBetween(Double value1, Double value2) {
            addCriterion("shangxia not between", value1, value2, "shangxia");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieIsNull() {
            addCriterion("zuzhuanghanjie is null");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieIsNotNull() {
            addCriterion("zuzhuanghanjie is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieEqualTo(Double value) {
            addCriterion("zuzhuanghanjie =", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieNotEqualTo(Double value) {
            addCriterion("zuzhuanghanjie <>", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieGreaterThan(Double value) {
            addCriterion("zuzhuanghanjie >", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieGreaterThanOrEqualTo(Double value) {
            addCriterion("zuzhuanghanjie >=", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieLessThan(Double value) {
            addCriterion("zuzhuanghanjie <", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieLessThanOrEqualTo(Double value) {
            addCriterion("zuzhuanghanjie <=", value, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieIn(List<Double> values) {
            addCriterion("zuzhuanghanjie in", values, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieNotIn(List<Double> values) {
            addCriterion("zuzhuanghanjie not in", values, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieBetween(Double value1, Double value2) {
            addCriterion("zuzhuanghanjie between", value1, value2, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andZuzhuanghanjieNotBetween(Double value1, Double value2) {
            addCriterion("zuzhuanghanjie not between", value1, value2, "zuzhuanghanjie");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceIsNull() {
            addCriterion("hanfengjiance is null");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceIsNotNull() {
            addCriterion("hanfengjiance is not null");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceEqualTo(Double value) {
            addCriterion("hanfengjiance =", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceNotEqualTo(Double value) {
            addCriterion("hanfengjiance <>", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceGreaterThan(Double value) {
            addCriterion("hanfengjiance >", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceGreaterThanOrEqualTo(Double value) {
            addCriterion("hanfengjiance >=", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceLessThan(Double value) {
            addCriterion("hanfengjiance <", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceLessThanOrEqualTo(Double value) {
            addCriterion("hanfengjiance <=", value, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceIn(List<Double> values) {
            addCriterion("hanfengjiance in", values, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceNotIn(List<Double> values) {
            addCriterion("hanfengjiance not in", values, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceBetween(Double value1, Double value2) {
            addCriterion("hanfengjiance between", value1, value2, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andHanfengjianceNotBetween(Double value1, Double value2) {
            addCriterion("hanfengjiance not between", value1, value2, "hanfengjiance");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanIsNull() {
            addCriterion("shuiyashiyan is null");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanIsNotNull() {
            addCriterion("shuiyashiyan is not null");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanEqualTo(Double value) {
            addCriterion("shuiyashiyan =", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanNotEqualTo(Double value) {
            addCriterion("shuiyashiyan <>", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanGreaterThan(Double value) {
            addCriterion("shuiyashiyan >", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanGreaterThanOrEqualTo(Double value) {
            addCriterion("shuiyashiyan >=", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanLessThan(Double value) {
            addCriterion("shuiyashiyan <", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanLessThanOrEqualTo(Double value) {
            addCriterion("shuiyashiyan <=", value, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanIn(List<Double> values) {
            addCriterion("shuiyashiyan in", values, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanNotIn(List<Double> values) {
            addCriterion("shuiyashiyan not in", values, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanBetween(Double value1, Double value2) {
            addCriterion("shuiyashiyan between", value1, value2, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyashiyanNotBetween(Double value1, Double value2) {
            addCriterion("shuiyashiyan not between", value1, value2, "shuiyashiyan");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuIsNull() {
            addCriterion("shuiyajiawanju is null");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuIsNotNull() {
            addCriterion("shuiyajiawanju is not null");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuEqualTo(Double value) {
            addCriterion("shuiyajiawanju =", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuNotEqualTo(Double value) {
            addCriterion("shuiyajiawanju <>", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuGreaterThan(Double value) {
            addCriterion("shuiyajiawanju >", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuGreaterThanOrEqualTo(Double value) {
            addCriterion("shuiyajiawanju >=", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuLessThan(Double value) {
            addCriterion("shuiyajiawanju <", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuLessThanOrEqualTo(Double value) {
            addCriterion("shuiyajiawanju <=", value, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuIn(List<Double> values) {
            addCriterion("shuiyajiawanju in", values, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuNotIn(List<Double> values) {
            addCriterion("shuiyajiawanju not in", values, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuBetween(Double value1, Double value2) {
            addCriterion("shuiyajiawanju between", value1, value2, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andShuiyajiawanjuNotBetween(Double value1, Double value2) {
            addCriterion("shuiyajiawanju not between", value1, value2, "shuiyajiawanju");
            return (Criteria) this;
        }

        public Criteria andQimixingIsNull() {
            addCriterion("qimixing is null");
            return (Criteria) this;
        }

        public Criteria andQimixingIsNotNull() {
            addCriterion("qimixing is not null");
            return (Criteria) this;
        }

        public Criteria andQimixingEqualTo(Double value) {
            addCriterion("qimixing =", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingNotEqualTo(Double value) {
            addCriterion("qimixing <>", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingGreaterThan(Double value) {
            addCriterion("qimixing >", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingGreaterThanOrEqualTo(Double value) {
            addCriterion("qimixing >=", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingLessThan(Double value) {
            addCriterion("qimixing <", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingLessThanOrEqualTo(Double value) {
            addCriterion("qimixing <=", value, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingIn(List<Double> values) {
            addCriterion("qimixing in", values, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingNotIn(List<Double> values) {
            addCriterion("qimixing not in", values, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingBetween(Double value1, Double value2) {
            addCriterion("qimixing between", value1, value2, "qimixing");
            return (Criteria) this;
        }

        public Criteria andQimixingNotBetween(Double value1, Double value2) {
            addCriterion("qimixing not between", value1, value2, "qimixing");
            return (Criteria) this;
        }

        public Criteria andJueyuanIsNull() {
            addCriterion("jueyuan is null");
            return (Criteria) this;
        }

        public Criteria andJueyuanIsNotNull() {
            addCriterion("jueyuan is not null");
            return (Criteria) this;
        }

        public Criteria andJueyuanEqualTo(Double value) {
            addCriterion("jueyuan =", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanNotEqualTo(Double value) {
            addCriterion("jueyuan <>", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanGreaterThan(Double value) {
            addCriterion("jueyuan >", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanGreaterThanOrEqualTo(Double value) {
            addCriterion("jueyuan >=", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanLessThan(Double value) {
            addCriterion("jueyuan <", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanLessThanOrEqualTo(Double value) {
            addCriterion("jueyuan <=", value, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanIn(List<Double> values) {
            addCriterion("jueyuan in", values, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanNotIn(List<Double> values) {
            addCriterion("jueyuan not in", values, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanBetween(Double value1, Double value2) {
            addCriterion("jueyuan between", value1, value2, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andJueyuanNotBetween(Double value1, Double value2) {
            addCriterion("jueyuan not between", value1, value2, "jueyuan");
            return (Criteria) this;
        }

        public Criteria andFangfutucengIsNull() {
            addCriterion("fangfutuceng is null");
            return (Criteria) this;
        }

        public Criteria andFangfutucengIsNotNull() {
            addCriterion("fangfutuceng is not null");
            return (Criteria) this;
        }

        public Criteria andFangfutucengEqualTo(Double value) {
            addCriterion("fangfutuceng =", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengNotEqualTo(Double value) {
            addCriterion("fangfutuceng <>", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengGreaterThan(Double value) {
            addCriterion("fangfutuceng >", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengGreaterThanOrEqualTo(Double value) {
            addCriterion("fangfutuceng >=", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengLessThan(Double value) {
            addCriterion("fangfutuceng <", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengLessThanOrEqualTo(Double value) {
            addCriterion("fangfutuceng <=", value, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengIn(List<Double> values) {
            addCriterion("fangfutuceng in", values, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengNotIn(List<Double> values) {
            addCriterion("fangfutuceng not in", values, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengBetween(Double value1, Double value2) {
            addCriterion("fangfutuceng between", value1, value2, "fangfutuceng");
            return (Criteria) this;
        }

        public Criteria andFangfutucengNotBetween(Double value1, Double value2) {
            addCriterion("fangfutuceng not between", value1, value2, "fangfutuceng");
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