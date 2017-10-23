package sys.spvisor.core.entity.work;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TQualityCheckRecoderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQualityCheckRecoderExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andPostTimeIsNull() {
            addCriterion("post_time is null");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNotNull() {
            addCriterion("post_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostTimeEqualTo(Date value) {
            addCriterionForJDBCTime("post_time =", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("post_time <>", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("post_time >", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("post_time >=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThan(Date value) {
            addCriterionForJDBCTime("post_time <", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("post_time <=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeIn(List<Date> values) {
            addCriterionForJDBCTime("post_time in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("post_time not in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("post_time between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("post_time not between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangIsNull() {
            addCriterion("yunxing_qingkuang is null");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangIsNotNull() {
            addCriterion("yunxing_qingkuang is not null");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangEqualTo(String value) {
            addCriterion("yunxing_qingkuang =", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangNotEqualTo(String value) {
            addCriterion("yunxing_qingkuang <>", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangGreaterThan(String value) {
            addCriterion("yunxing_qingkuang >", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("yunxing_qingkuang >=", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangLessThan(String value) {
            addCriterion("yunxing_qingkuang <", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangLessThanOrEqualTo(String value) {
            addCriterion("yunxing_qingkuang <=", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangLike(String value) {
            addCriterion("yunxing_qingkuang like", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangNotLike(String value) {
            addCriterion("yunxing_qingkuang not like", value, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangIn(List<String> values) {
            addCriterion("yunxing_qingkuang in", values, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangNotIn(List<String> values) {
            addCriterion("yunxing_qingkuang not in", values, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangBetween(String value1, String value2) {
            addCriterion("yunxing_qingkuang between", value1, value2, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andYunxingQingkuangNotBetween(String value1, String value2) {
            addCriterion("yunxing_qingkuang not between", value1, value2, "yunxingQingkuang");
            return (Criteria) this;
        }

        public Criteria andProductFactoryIsNull() {
            addCriterion("product_factory is null");
            return (Criteria) this;
        }

        public Criteria andProductFactoryIsNotNull() {
            addCriterion("product_factory is not null");
            return (Criteria) this;
        }

        public Criteria andProductFactoryEqualTo(String value) {
            addCriterion("product_factory =", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryNotEqualTo(String value) {
            addCriterion("product_factory <>", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryGreaterThan(String value) {
            addCriterion("product_factory >", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("product_factory >=", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryLessThan(String value) {
            addCriterion("product_factory <", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryLessThanOrEqualTo(String value) {
            addCriterion("product_factory <=", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryLike(String value) {
            addCriterion("product_factory like", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryNotLike(String value) {
            addCriterion("product_factory not like", value, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryIn(List<String> values) {
            addCriterion("product_factory in", values, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryNotIn(List<String> values) {
            addCriterion("product_factory not in", values, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryBetween(String value1, String value2) {
            addCriterion("product_factory between", value1, value2, "productFactory");
            return (Criteria) this;
        }

        public Criteria andProductFactoryNotBetween(String value1, String value2) {
            addCriterion("product_factory not between", value1, value2, "productFactory");
            return (Criteria) this;
        }

        public Criteria andBookNoIsNull() {
            addCriterion("book_no is null");
            return (Criteria) this;
        }

        public Criteria andBookNoIsNotNull() {
            addCriterion("book_no is not null");
            return (Criteria) this;
        }

        public Criteria andBookNoEqualTo(String value) {
            addCriterion("book_no =", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotEqualTo(String value) {
            addCriterion("book_no <>", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThan(String value) {
            addCriterion("book_no >", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThanOrEqualTo(String value) {
            addCriterion("book_no >=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThan(String value) {
            addCriterion("book_no <", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThanOrEqualTo(String value) {
            addCriterion("book_no <=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLike(String value) {
            addCriterion("book_no like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotLike(String value) {
            addCriterion("book_no not like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoIn(List<String> values) {
            addCriterion("book_no in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotIn(List<String> values) {
            addCriterion("book_no not in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoBetween(String value1, String value2) {
            addCriterion("book_no between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotBetween(String value1, String value2) {
            addCriterion("book_no not between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameIsNull() {
            addCriterion("file_save_name is null");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameIsNotNull() {
            addCriterion("file_save_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameEqualTo(String value) {
            addCriterion("file_save_name =", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameNotEqualTo(String value) {
            addCriterion("file_save_name <>", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameGreaterThan(String value) {
            addCriterion("file_save_name >", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_name >=", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameLessThan(String value) {
            addCriterion("file_save_name <", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameLessThanOrEqualTo(String value) {
            addCriterion("file_save_name <=", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameLike(String value) {
            addCriterion("file_save_name like", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameNotLike(String value) {
            addCriterion("file_save_name not like", value, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameIn(List<String> values) {
            addCriterion("file_save_name in", values, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameNotIn(List<String> values) {
            addCriterion("file_save_name not in", values, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameBetween(String value1, String value2) {
            addCriterion("file_save_name between", value1, value2, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andFileSaveNameNotBetween(String value1, String value2) {
            addCriterion("file_save_name not between", value1, value2, "fileSaveName");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("valid_date like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("valid_date not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
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