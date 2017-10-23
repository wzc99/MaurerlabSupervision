package sys.spvisor.core.entity.ana;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserCaseExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("user_login_name is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("user_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("user_login_name =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("user_login_name <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("user_login_name >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_name >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("user_login_name <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("user_login_name <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("user_login_name like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("user_login_name not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("user_login_name in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("user_login_name not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("user_login_name between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("user_login_name not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNull() {
            addCriterion("user_login_password is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNotNull() {
            addCriterion("user_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordEqualTo(String value) {
            addCriterion("user_login_password =", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotEqualTo(String value) {
            addCriterion("user_login_password <>", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThan(String value) {
            addCriterion("user_login_password >", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_password >=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThan(String value) {
            addCriterion("user_login_password <", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_login_password <=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLike(String value) {
            addCriterion("user_login_password like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotLike(String value) {
            addCriterion("user_login_password not like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIn(List<String> values) {
            addCriterion("user_login_password in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotIn(List<String> values) {
            addCriterion("user_login_password not in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordBetween(String value1, String value2) {
            addCriterion("user_login_password between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("user_login_password not between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoIsNull() {
            addCriterion("dkey_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoIsNotNull() {
            addCriterion("dkey_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoEqualTo(String value) {
            addCriterion("dkey_serial_no =", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoNotEqualTo(String value) {
            addCriterion("dkey_serial_no <>", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoGreaterThan(String value) {
            addCriterion("dkey_serial_no >", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("dkey_serial_no >=", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoLessThan(String value) {
            addCriterion("dkey_serial_no <", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoLessThanOrEqualTo(String value) {
            addCriterion("dkey_serial_no <=", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoLike(String value) {
            addCriterion("dkey_serial_no like", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoNotLike(String value) {
            addCriterion("dkey_serial_no not like", value, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoIn(List<String> values) {
            addCriterion("dkey_serial_no in", values, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoNotIn(List<String> values) {
            addCriterion("dkey_serial_no not in", values, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoBetween(String value1, String value2) {
            addCriterion("dkey_serial_no between", value1, value2, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andDkeySerialNoNotBetween(String value1, String value2) {
            addCriterion("dkey_serial_no not between", value1, value2, "dkeySerialNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntIsNull() {
            addCriterion("pwd_err_cnt is null");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntIsNotNull() {
            addCriterion("pwd_err_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntEqualTo(Integer value) {
            addCriterion("pwd_err_cnt =", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntNotEqualTo(Integer value) {
            addCriterion("pwd_err_cnt <>", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntGreaterThan(Integer value) {
            addCriterion("pwd_err_cnt >", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwd_err_cnt >=", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntLessThan(Integer value) {
            addCriterion("pwd_err_cnt <", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntLessThanOrEqualTo(Integer value) {
            addCriterion("pwd_err_cnt <=", value, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntIn(List<Integer> values) {
            addCriterion("pwd_err_cnt in", values, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntNotIn(List<Integer> values) {
            addCriterion("pwd_err_cnt not in", values, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntBetween(Integer value1, Integer value2) {
            addCriterion("pwd_err_cnt between", value1, value2, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andPwdErrCntNotBetween(Integer value1, Integer value2) {
            addCriterion("pwd_err_cnt not between", value1, value2, "pwdErrCnt");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIsNull() {
            addCriterion("case_operator is null");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIsNotNull() {
            addCriterion("case_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorEqualTo(Integer value) {
            addCriterion("case_operator =", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotEqualTo(Integer value) {
            addCriterion("case_operator <>", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorGreaterThan(Integer value) {
            addCriterion("case_operator >", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_operator >=", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorLessThan(Integer value) {
            addCriterion("case_operator <", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("case_operator <=", value, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorIn(List<Integer> values) {
            addCriterion("case_operator in", values, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotIn(List<Integer> values) {
            addCriterion("case_operator not in", values, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorBetween(Integer value1, Integer value2) {
            addCriterion("case_operator between", value1, value2, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("case_operator not between", value1, value2, "caseOperator");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("case_status =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("case_status <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("case_status >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_status >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("case_status <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("case_status <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("case_status like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("case_status not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("case_status in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("case_status not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("case_status between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("case_status not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIsNull() {
            addCriterion("case_open_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIsNotNull() {
            addCriterion("case_open_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusEqualTo(String value) {
            addCriterion("case_open_status =", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotEqualTo(String value) {
            addCriterion("case_open_status <>", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusGreaterThan(String value) {
            addCriterion("case_open_status >", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_open_status >=", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLessThan(String value) {
            addCriterion("case_open_status <", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLessThanOrEqualTo(String value) {
            addCriterion("case_open_status <=", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusLike(String value) {
            addCriterion("case_open_status like", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotLike(String value) {
            addCriterion("case_open_status not like", value, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusIn(List<String> values) {
            addCriterion("case_open_status in", values, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotIn(List<String> values) {
            addCriterion("case_open_status not in", values, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusBetween(String value1, String value2) {
            addCriterion("case_open_status between", value1, value2, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseOpenStatusNotBetween(String value1, String value2) {
            addCriterion("case_open_status not between", value1, value2, "caseOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNull() {
            addCriterion("case_time is null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIsNotNull() {
            addCriterion("case_time is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTimeEqualTo(Date value) {
            addCriterion("case_time =", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotEqualTo(Date value) {
            addCriterion("case_time <>", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThan(Date value) {
            addCriterion("case_time >", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("case_time >=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThan(Date value) {
            addCriterion("case_time <", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("case_time <=", value, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeIn(List<Date> values) {
            addCriterion("case_time in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotIn(List<Date> values) {
            addCriterion("case_time not in", values, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeBetween(Date value1, Date value2) {
            addCriterion("case_time between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("case_time not between", value1, value2, "caseTime");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIsNull() {
            addCriterion("case_judgment is null");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIsNotNull() {
            addCriterion("case_judgment is not null");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentEqualTo(String value) {
            addCriterion("case_judgment =", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotEqualTo(String value) {
            addCriterion("case_judgment <>", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentGreaterThan(String value) {
            addCriterion("case_judgment >", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("case_judgment >=", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLessThan(String value) {
            addCriterion("case_judgment <", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLessThanOrEqualTo(String value) {
            addCriterion("case_judgment <=", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentLike(String value) {
            addCriterion("case_judgment like", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotLike(String value) {
            addCriterion("case_judgment not like", value, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentIn(List<String> values) {
            addCriterion("case_judgment in", values, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotIn(List<String> values) {
            addCriterion("case_judgment not in", values, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentBetween(String value1, String value2) {
            addCriterion("case_judgment between", value1, value2, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andCaseJudgmentNotBetween(String value1, String value2) {
            addCriterion("case_judgment not between", value1, value2, "caseJudgment");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNull() {
            addCriterion("real_id is null");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNotNull() {
            addCriterion("real_id is not null");
            return (Criteria) this;
        }

        public Criteria andRealIdEqualTo(Long value) {
            addCriterion("real_id =", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotEqualTo(Long value) {
            addCriterion("real_id <>", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThan(Long value) {
            addCriterion("real_id >", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("real_id >=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThan(Long value) {
            addCriterion("real_id <", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThanOrEqualTo(Long value) {
            addCriterion("real_id <=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdIn(List<Long> values) {
            addCriterion("real_id in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotIn(List<Long> values) {
            addCriterion("real_id not in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdBetween(Long value1, Long value2) {
            addCriterion("real_id between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotBetween(Long value1, Long value2) {
            addCriterion("real_id not between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIsNull() {
            addCriterion("last_company_case_id is null");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIsNotNull() {
            addCriterion("last_company_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdEqualTo(Integer value) {
            addCriterion("last_company_case_id =", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotEqualTo(Integer value) {
            addCriterion("last_company_case_id <>", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdGreaterThan(Integer value) {
            addCriterion("last_company_case_id >", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_company_case_id >=", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdLessThan(Integer value) {
            addCriterion("last_company_case_id <", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_company_case_id <=", value, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdIn(List<Integer> values) {
            addCriterion("last_company_case_id in", values, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotIn(List<Integer> values) {
            addCriterion("last_company_case_id not in", values, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("last_company_case_id between", value1, value2, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andLastCompanyCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_company_case_id not between", value1, value2, "lastCompanyCaseId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIsNull() {
            addCriterion("case_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIsNotNull() {
            addCriterion("case_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdEqualTo(Integer value) {
            addCriterion("case_owner_id =", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotEqualTo(Integer value) {
            addCriterion("case_owner_id <>", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdGreaterThan(Integer value) {
            addCriterion("case_owner_id >", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_owner_id >=", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdLessThan(Integer value) {
            addCriterion("case_owner_id <", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_owner_id <=", value, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdIn(List<Integer> values) {
            addCriterion("case_owner_id in", values, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotIn(List<Integer> values) {
            addCriterion("case_owner_id not in", values, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("case_owner_id between", value1, value2, "caseOwnerId");
            return (Criteria) this;
        }

        public Criteria andCaseOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_owner_id not between", value1, value2, "caseOwnerId");
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