package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TShebeiProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShebeiProcessExample() {
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

        public Criteria andShebeiIdIsNull() {
            addCriterion("shebei_id is null");
            return (Criteria) this;
        }

        public Criteria andShebeiIdIsNotNull() {
            addCriterion("shebei_id is not null");
            return (Criteria) this;
        }

        public Criteria andShebeiIdEqualTo(Integer value) {
            addCriterion("shebei_id =", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdNotEqualTo(Integer value) {
            addCriterion("shebei_id <>", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdGreaterThan(Integer value) {
            addCriterion("shebei_id >", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shebei_id >=", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdLessThan(Integer value) {
            addCriterion("shebei_id <", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdLessThanOrEqualTo(Integer value) {
            addCriterion("shebei_id <=", value, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdIn(List<Integer> values) {
            addCriterion("shebei_id in", values, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdNotIn(List<Integer> values) {
            addCriterion("shebei_id not in", values, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdBetween(Integer value1, Integer value2) {
            addCriterion("shebei_id between", value1, value2, "shebeiId");
            return (Criteria) this;
        }

        public Criteria andShebeiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shebei_id not between", value1, value2, "shebeiId");
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

        public Criteria andProductNumberIsNull() {
            addCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(String value) {
            addCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(String value) {
            addCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(String value) {
            addCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(String value) {
            addCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(String value) {
            addCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(String value) {
            addCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLike(String value) {
            addCriterion("product_number like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotLike(String value) {
            addCriterion("product_number not like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<String> values) {
            addCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<String> values) {
            addCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(String value1, String value2) {
            addCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(String value1, String value2) {
            addCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoIsNull() {
            addCriterion("zhucaidaoliao is null");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoIsNotNull() {
            addCriterion("zhucaidaoliao is not null");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoEqualTo(Double value) {
            addCriterion("zhucaidaoliao =", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoNotEqualTo(Double value) {
            addCriterion("zhucaidaoliao <>", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoGreaterThan(Double value) {
            addCriterion("zhucaidaoliao >", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoGreaterThanOrEqualTo(Double value) {
            addCriterion("zhucaidaoliao >=", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoLessThan(Double value) {
            addCriterion("zhucaidaoliao <", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoLessThanOrEqualTo(Double value) {
            addCriterion("zhucaidaoliao <=", value, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoIn(List<Double> values) {
            addCriterion("zhucaidaoliao in", values, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoNotIn(List<Double> values) {
            addCriterion("zhucaidaoliao not in", values, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoBetween(Double value1, Double value2) {
            addCriterion("zhucaidaoliao between", value1, value2, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andZhucaidaoliaoNotBetween(Double value1, Double value2) {
            addCriterion("zhucaidaoliao not between", value1, value2, "zhucaidaoliao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoIsNull() {
            addCriterion("qiaotixialiao is null");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoIsNotNull() {
            addCriterion("qiaotixialiao is not null");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoEqualTo(Double value) {
            addCriterion("qiaotixialiao =", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoNotEqualTo(Double value) {
            addCriterion("qiaotixialiao <>", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoGreaterThan(Double value) {
            addCriterion("qiaotixialiao >", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoGreaterThanOrEqualTo(Double value) {
            addCriterion("qiaotixialiao >=", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoLessThan(Double value) {
            addCriterion("qiaotixialiao <", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoLessThanOrEqualTo(Double value) {
            addCriterion("qiaotixialiao <=", value, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoIn(List<Double> values) {
            addCriterion("qiaotixialiao in", values, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoNotIn(List<Double> values) {
            addCriterion("qiaotixialiao not in", values, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoBetween(Double value1, Double value2) {
            addCriterion("qiaotixialiao between", value1, value2, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andQiaotixialiaoNotBetween(Double value1, Double value2) {
            addCriterion("qiaotixialiao not between", value1, value2, "qiaotixialiao");
            return (Criteria) this;
        }

        public Criteria andFengtouIsNull() {
            addCriterion("fengtou is null");
            return (Criteria) this;
        }

        public Criteria andFengtouIsNotNull() {
            addCriterion("fengtou is not null");
            return (Criteria) this;
        }

        public Criteria andFengtouEqualTo(Double value) {
            addCriterion("fengtou =", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouNotEqualTo(Double value) {
            addCriterion("fengtou <>", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouGreaterThan(Double value) {
            addCriterion("fengtou >", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouGreaterThanOrEqualTo(Double value) {
            addCriterion("fengtou >=", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouLessThan(Double value) {
            addCriterion("fengtou <", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouLessThanOrEqualTo(Double value) {
            addCriterion("fengtou <=", value, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouIn(List<Double> values) {
            addCriterion("fengtou in", values, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouNotIn(List<Double> values) {
            addCriterion("fengtou not in", values, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouBetween(Double value1, Double value2) {
            addCriterion("fengtou between", value1, value2, "fengtou");
            return (Criteria) this;
        }

        public Criteria andFengtouNotBetween(Double value1, Double value2) {
            addCriterion("fengtou not between", value1, value2, "fengtou");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoIsNull() {
            addCriterion("qiaozhuangdizuo is null");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoIsNotNull() {
            addCriterion("qiaozhuangdizuo is not null");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoEqualTo(Double value) {
            addCriterion("qiaozhuangdizuo =", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoNotEqualTo(Double value) {
            addCriterion("qiaozhuangdizuo <>", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoGreaterThan(Double value) {
            addCriterion("qiaozhuangdizuo >", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoGreaterThanOrEqualTo(Double value) {
            addCriterion("qiaozhuangdizuo >=", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoLessThan(Double value) {
            addCriterion("qiaozhuangdizuo <", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoLessThanOrEqualTo(Double value) {
            addCriterion("qiaozhuangdizuo <=", value, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoIn(List<Double> values) {
            addCriterion("qiaozhuangdizuo in", values, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoNotIn(List<Double> values) {
            addCriterion("qiaozhuangdizuo not in", values, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoBetween(Double value1, Double value2) {
            addCriterion("qiaozhuangdizuo between", value1, value2, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andQiaozhuangdizuoNotBetween(Double value1, Double value2) {
            addCriterion("qiaozhuangdizuo not between", value1, value2, "qiaozhuangdizuo");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanIsNull() {
            addCriterion("jieguabfalan is null");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanIsNotNull() {
            addCriterion("jieguabfalan is not null");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanEqualTo(Double value) {
            addCriterion("jieguabfalan =", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanNotEqualTo(Double value) {
            addCriterion("jieguabfalan <>", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanGreaterThan(Double value) {
            addCriterion("jieguabfalan >", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanGreaterThanOrEqualTo(Double value) {
            addCriterion("jieguabfalan >=", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanLessThan(Double value) {
            addCriterion("jieguabfalan <", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanLessThanOrEqualTo(Double value) {
            addCriterion("jieguabfalan <=", value, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanIn(List<Double> values) {
            addCriterion("jieguabfalan in", values, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanNotIn(List<Double> values) {
            addCriterion("jieguabfalan not in", values, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanBetween(Double value1, Double value2) {
            addCriterion("jieguabfalan between", value1, value2, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andJieguabfalanNotBetween(Double value1, Double value2) {
            addCriterion("jieguabfalan not between", value1, value2, "jieguabfalan");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangIsNull() {
            addCriterion("qiaotizuzhuang is null");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangIsNotNull() {
            addCriterion("qiaotizuzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangEqualTo(Double value) {
            addCriterion("qiaotizuzhuang =", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangNotEqualTo(Double value) {
            addCriterion("qiaotizuzhuang <>", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangGreaterThan(Double value) {
            addCriterion("qiaotizuzhuang >", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangGreaterThanOrEqualTo(Double value) {
            addCriterion("qiaotizuzhuang >=", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangLessThan(Double value) {
            addCriterion("qiaotizuzhuang <", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangLessThanOrEqualTo(Double value) {
            addCriterion("qiaotizuzhuang <=", value, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangIn(List<Double> values) {
            addCriterion("qiaotizuzhuang in", values, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangNotIn(List<Double> values) {
            addCriterion("qiaotizuzhuang not in", values, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangBetween(Double value1, Double value2) {
            addCriterion("qiaotizuzhuang between", value1, value2, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andQiaotizuzhuangNotBetween(Double value1, Double value2) {
            addCriterion("qiaotizuzhuang not between", value1, value2, "qiaotizuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangIsNull() {
            addCriterion("jieguanzuzhuang is null");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangIsNotNull() {
            addCriterion("jieguanzuzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangEqualTo(Double value) {
            addCriterion("jieguanzuzhuang =", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangNotEqualTo(Double value) {
            addCriterion("jieguanzuzhuang <>", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangGreaterThan(Double value) {
            addCriterion("jieguanzuzhuang >", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangGreaterThanOrEqualTo(Double value) {
            addCriterion("jieguanzuzhuang >=", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangLessThan(Double value) {
            addCriterion("jieguanzuzhuang <", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangLessThanOrEqualTo(Double value) {
            addCriterion("jieguanzuzhuang <=", value, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangIn(List<Double> values) {
            addCriterion("jieguanzuzhuang in", values, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangNotIn(List<Double> values) {
            addCriterion("jieguanzuzhuang not in", values, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangBetween(Double value1, Double value2) {
            addCriterion("jieguanzuzhuang between", value1, value2, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andJieguanzuzhuangNotBetween(Double value1, Double value2) {
            addCriterion("jieguanzuzhuang not between", value1, value2, "jieguanzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangIsNull() {
            addCriterion("neijianzuzhuang is null");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangIsNotNull() {
            addCriterion("neijianzuzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangEqualTo(Double value) {
            addCriterion("neijianzuzhuang =", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangNotEqualTo(Double value) {
            addCriterion("neijianzuzhuang <>", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangGreaterThan(Double value) {
            addCriterion("neijianzuzhuang >", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangGreaterThanOrEqualTo(Double value) {
            addCriterion("neijianzuzhuang >=", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangLessThan(Double value) {
            addCriterion("neijianzuzhuang <", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangLessThanOrEqualTo(Double value) {
            addCriterion("neijianzuzhuang <=", value, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangIn(List<Double> values) {
            addCriterion("neijianzuzhuang in", values, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangNotIn(List<Double> values) {
            addCriterion("neijianzuzhuang not in", values, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangBetween(Double value1, Double value2) {
            addCriterion("neijianzuzhuang between", value1, value2, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andNeijianzuzhuangNotBetween(Double value1, Double value2) {
            addCriterion("neijianzuzhuang not between", value1, value2, "neijianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andYuhanjianIsNull() {
            addCriterion("yuhanjian is null");
            return (Criteria) this;
        }

        public Criteria andYuhanjianIsNotNull() {
            addCriterion("yuhanjian is not null");
            return (Criteria) this;
        }

        public Criteria andYuhanjianEqualTo(Double value) {
            addCriterion("yuhanjian =", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianNotEqualTo(Double value) {
            addCriterion("yuhanjian <>", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianGreaterThan(Double value) {
            addCriterion("yuhanjian >", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianGreaterThanOrEqualTo(Double value) {
            addCriterion("yuhanjian >=", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianLessThan(Double value) {
            addCriterion("yuhanjian <", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianLessThanOrEqualTo(Double value) {
            addCriterion("yuhanjian <=", value, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianIn(List<Double> values) {
            addCriterion("yuhanjian in", values, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianNotIn(List<Double> values) {
            addCriterion("yuhanjian not in", values, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianBetween(Double value1, Double value2) {
            addCriterion("yuhanjian between", value1, value2, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andYuhanjianNotBetween(Double value1, Double value2) {
            addCriterion("yuhanjian not between", value1, value2, "yuhanjian");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangIsNull() {
            addCriterion("guanxianzuzhuang is null");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangIsNotNull() {
            addCriterion("guanxianzuzhuang is not null");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangEqualTo(Double value) {
            addCriterion("guanxianzuzhuang =", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangNotEqualTo(Double value) {
            addCriterion("guanxianzuzhuang <>", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangGreaterThan(Double value) {
            addCriterion("guanxianzuzhuang >", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangGreaterThanOrEqualTo(Double value) {
            addCriterion("guanxianzuzhuang >=", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangLessThan(Double value) {
            addCriterion("guanxianzuzhuang <", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangLessThanOrEqualTo(Double value) {
            addCriterion("guanxianzuzhuang <=", value, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangIn(List<Double> values) {
            addCriterion("guanxianzuzhuang in", values, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangNotIn(List<Double> values) {
            addCriterion("guanxianzuzhuang not in", values, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangBetween(Double value1, Double value2) {
            addCriterion("guanxianzuzhuang between", value1, value2, "guanxianzuzhuang");
            return (Criteria) this;
        }

        public Criteria andGuanxianzuzhuangNotBetween(Double value1, Double value2) {
            addCriterion("guanxianzuzhuang not between", value1, value2, "guanxianzuzhuang");
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

        public Criteria andQiyashiyanIsNull() {
            addCriterion("qiyashiyan is null");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanIsNotNull() {
            addCriterion("qiyashiyan is not null");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanEqualTo(Double value) {
            addCriterion("qiyashiyan =", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanNotEqualTo(Double value) {
            addCriterion("qiyashiyan <>", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanGreaterThan(Double value) {
            addCriterion("qiyashiyan >", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanGreaterThanOrEqualTo(Double value) {
            addCriterion("qiyashiyan >=", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanLessThan(Double value) {
            addCriterion("qiyashiyan <", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanLessThanOrEqualTo(Double value) {
            addCriterion("qiyashiyan <=", value, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanIn(List<Double> values) {
            addCriterion("qiyashiyan in", values, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanNotIn(List<Double> values) {
            addCriterion("qiyashiyan not in", values, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanBetween(Double value1, Double value2) {
            addCriterion("qiyashiyan between", value1, value2, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andQiyashiyanNotBetween(Double value1, Double value2) {
            addCriterion("qiyashiyan not between", value1, value2, "qiyashiyan");
            return (Criteria) this;
        }

        public Criteria andZhuluIsNull() {
            addCriterion("zhulu is null");
            return (Criteria) this;
        }

        public Criteria andZhuluIsNotNull() {
            addCriterion("zhulu is not null");
            return (Criteria) this;
        }

        public Criteria andZhuluEqualTo(Double value) {
            addCriterion("zhulu =", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluNotEqualTo(Double value) {
            addCriterion("zhulu <>", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluGreaterThan(Double value) {
            addCriterion("zhulu >", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluGreaterThanOrEqualTo(Double value) {
            addCriterion("zhulu >=", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluLessThan(Double value) {
            addCriterion("zhulu <", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluLessThanOrEqualTo(Double value) {
            addCriterion("zhulu <=", value, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluIn(List<Double> values) {
            addCriterion("zhulu in", values, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluNotIn(List<Double> values) {
            addCriterion("zhulu not in", values, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluBetween(Double value1, Double value2) {
            addCriterion("zhulu between", value1, value2, "zhulu");
            return (Criteria) this;
        }

        public Criteria andZhuluNotBetween(Double value1, Double value2) {
            addCriterion("zhulu not between", value1, value2, "zhulu");
            return (Criteria) this;
        }

        public Criteria andBaowenIsNull() {
            addCriterion("baowen is null");
            return (Criteria) this;
        }

        public Criteria andBaowenIsNotNull() {
            addCriterion("baowen is not null");
            return (Criteria) this;
        }

        public Criteria andBaowenEqualTo(Double value) {
            addCriterion("baowen =", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenNotEqualTo(Double value) {
            addCriterion("baowen <>", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenGreaterThan(Double value) {
            addCriterion("baowen >", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenGreaterThanOrEqualTo(Double value) {
            addCriterion("baowen >=", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenLessThan(Double value) {
            addCriterion("baowen <", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenLessThanOrEqualTo(Double value) {
            addCriterion("baowen <=", value, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenIn(List<Double> values) {
            addCriterion("baowen in", values, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenNotIn(List<Double> values) {
            addCriterion("baowen not in", values, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenBetween(Double value1, Double value2) {
            addCriterion("baowen between", value1, value2, "baowen");
            return (Criteria) this;
        }

        public Criteria andBaowenNotBetween(Double value1, Double value2) {
            addCriterion("baowen not between", value1, value2, "baowen");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanIsNull() {
            addCriterion("tiaoshishiyan is null");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanIsNotNull() {
            addCriterion("tiaoshishiyan is not null");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanEqualTo(Double value) {
            addCriterion("tiaoshishiyan =", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanNotEqualTo(Double value) {
            addCriterion("tiaoshishiyan <>", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanGreaterThan(Double value) {
            addCriterion("tiaoshishiyan >", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanGreaterThanOrEqualTo(Double value) {
            addCriterion("tiaoshishiyan >=", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanLessThan(Double value) {
            addCriterion("tiaoshishiyan <", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanLessThanOrEqualTo(Double value) {
            addCriterion("tiaoshishiyan <=", value, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanIn(List<Double> values) {
            addCriterion("tiaoshishiyan in", values, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanNotIn(List<Double> values) {
            addCriterion("tiaoshishiyan not in", values, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanBetween(Double value1, Double value2) {
            addCriterion("tiaoshishiyan between", value1, value2, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andTiaoshishiyanNotBetween(Double value1, Double value2) {
            addCriterion("tiaoshishiyan not between", value1, value2, "tiaoshishiyan");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiIsNull() {
            addCriterion("youqibiaoshi is null");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiIsNotNull() {
            addCriterion("youqibiaoshi is not null");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiEqualTo(Double value) {
            addCriterion("youqibiaoshi =", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiNotEqualTo(Double value) {
            addCriterion("youqibiaoshi <>", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiGreaterThan(Double value) {
            addCriterion("youqibiaoshi >", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiGreaterThanOrEqualTo(Double value) {
            addCriterion("youqibiaoshi >=", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiLessThan(Double value) {
            addCriterion("youqibiaoshi <", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiLessThanOrEqualTo(Double value) {
            addCriterion("youqibiaoshi <=", value, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiIn(List<Double> values) {
            addCriterion("youqibiaoshi in", values, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiNotIn(List<Double> values) {
            addCriterion("youqibiaoshi not in", values, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiBetween(Double value1, Double value2) {
            addCriterion("youqibiaoshi between", value1, value2, "youqibiaoshi");
            return (Criteria) this;
        }

        public Criteria andYouqibiaoshiNotBetween(Double value1, Double value2) {
            addCriterion("youqibiaoshi not between", value1, value2, "youqibiaoshi");
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