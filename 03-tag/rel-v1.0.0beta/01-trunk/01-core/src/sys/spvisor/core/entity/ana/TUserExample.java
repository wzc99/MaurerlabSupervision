package sys.spvisor.core.entity.ana;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("check_status like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("check_status not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNull() {
            addCriterion("user_unit is null");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNotNull() {
            addCriterion("user_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnitEqualTo(String value) {
            addCriterion("user_unit =", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotEqualTo(String value) {
            addCriterion("user_unit <>", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThan(String value) {
            addCriterion("user_unit >", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThanOrEqualTo(String value) {
            addCriterion("user_unit >=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThan(String value) {
            addCriterion("user_unit <", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThanOrEqualTo(String value) {
            addCriterion("user_unit <=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLike(String value) {
            addCriterion("user_unit like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotLike(String value) {
            addCriterion("user_unit not like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitIn(List<String> values) {
            addCriterion("user_unit in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotIn(List<String> values) {
            addCriterion("user_unit not in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitBetween(String value1, String value2) {
            addCriterion("user_unit between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotBetween(String value1, String value2) {
            addCriterion("user_unit not between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNull() {
            addCriterion("user_identity_card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNotNull() {
            addCriterion("user_identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardEqualTo(String value) {
            addCriterion("user_identity_card =", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotEqualTo(String value) {
            addCriterion("user_identity_card <>", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThan(String value) {
            addCriterion("user_identity_card >", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_identity_card >=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThan(String value) {
            addCriterion("user_identity_card <", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("user_identity_card <=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLike(String value) {
            addCriterion("user_identity_card like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotLike(String value) {
            addCriterion("user_identity_card not like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIn(List<String> values) {
            addCriterion("user_identity_card in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotIn(List<String> values) {
            addCriterion("user_identity_card not in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardBetween(String value1, String value2) {
            addCriterion("user_identity_card between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotBetween(String value1, String value2) {
            addCriterion("user_identity_card not between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdIsNull() {
            addCriterion("user_work_status_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdIsNotNull() {
            addCriterion("user_work_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdEqualTo(Integer value) {
            addCriterion("user_work_status_id =", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdNotEqualTo(Integer value) {
            addCriterion("user_work_status_id <>", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdGreaterThan(Integer value) {
            addCriterion("user_work_status_id >", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_work_status_id >=", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdLessThan(Integer value) {
            addCriterion("user_work_status_id <", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_work_status_id <=", value, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdIn(List<Integer> values) {
            addCriterion("user_work_status_id in", values, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdNotIn(List<Integer> values) {
            addCriterion("user_work_status_id not in", values, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("user_work_status_id between", value1, value2, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserWorkStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_work_status_id not between", value1, value2, "userWorkStatusId");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesIsNull() {
            addCriterion("user_location_des is null");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesIsNotNull() {
            addCriterion("user_location_des is not null");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesEqualTo(String value) {
            addCriterion("user_location_des =", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesNotEqualTo(String value) {
            addCriterion("user_location_des <>", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesGreaterThan(String value) {
            addCriterion("user_location_des >", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesGreaterThanOrEqualTo(String value) {
            addCriterion("user_location_des >=", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesLessThan(String value) {
            addCriterion("user_location_des <", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesLessThanOrEqualTo(String value) {
            addCriterion("user_location_des <=", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesLike(String value) {
            addCriterion("user_location_des like", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesNotLike(String value) {
            addCriterion("user_location_des not like", value, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesIn(List<String> values) {
            addCriterion("user_location_des in", values, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesNotIn(List<String> values) {
            addCriterion("user_location_des not in", values, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesBetween(String value1, String value2) {
            addCriterion("user_location_des between", value1, value2, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLocationDesNotBetween(String value1, String value2) {
            addCriterion("user_location_des not between", value1, value2, "userLocationDes");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeIsNull() {
            addCriterion("user_latest_work_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeIsNotNull() {
            addCriterion("user_latest_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("user_latest_work_time =", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_latest_work_time <>", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("user_latest_work_time >", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_latest_work_time >=", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("user_latest_work_time <", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_latest_work_time <=", value, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("user_latest_work_time in", values, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_latest_work_time not in", values, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_latest_work_time between", value1, value2, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserLatestWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_latest_work_time not between", value1, value2, "userLatestWorkTime");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIsNull() {
            addCriterion("user_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIsNotNull() {
            addCriterion("user_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate =", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate <>", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthdate >", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate >=", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("user_birthdate <", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthdate <=", value, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthdate in", values, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthdate not in", values, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthdate between", value1, value2, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthdate not between", value1, value2, "userBirthdate");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNull() {
            addCriterion("user_education is null");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNotNull() {
            addCriterion("user_education is not null");
            return (Criteria) this;
        }

        public Criteria andUserEducationEqualTo(String value) {
            addCriterion("user_education =", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotEqualTo(String value) {
            addCriterion("user_education <>", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThan(String value) {
            addCriterion("user_education >", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("user_education >=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThan(String value) {
            addCriterion("user_education <", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThanOrEqualTo(String value) {
            addCriterion("user_education <=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLike(String value) {
            addCriterion("user_education like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotLike(String value) {
            addCriterion("user_education not like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationIn(List<String> values) {
            addCriterion("user_education in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotIn(List<String> values) {
            addCriterion("user_education not in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationBetween(String value1, String value2) {
            addCriterion("user_education between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotBetween(String value1, String value2) {
            addCriterion("user_education not between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserMajorIsNull() {
            addCriterion("user_major is null");
            return (Criteria) this;
        }

        public Criteria andUserMajorIsNotNull() {
            addCriterion("user_major is not null");
            return (Criteria) this;
        }

        public Criteria andUserMajorEqualTo(String value) {
            addCriterion("user_major =", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorNotEqualTo(String value) {
            addCriterion("user_major <>", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorGreaterThan(String value) {
            addCriterion("user_major >", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorGreaterThanOrEqualTo(String value) {
            addCriterion("user_major >=", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorLessThan(String value) {
            addCriterion("user_major <", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorLessThanOrEqualTo(String value) {
            addCriterion("user_major <=", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorLike(String value) {
            addCriterion("user_major like", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorNotLike(String value) {
            addCriterion("user_major not like", value, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorIn(List<String> values) {
            addCriterion("user_major in", values, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorNotIn(List<String> values) {
            addCriterion("user_major not in", values, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorBetween(String value1, String value2) {
            addCriterion("user_major between", value1, value2, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserMajorNotBetween(String value1, String value2) {
            addCriterion("user_major not between", value1, value2, "userMajor");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationIsNull() {
            addCriterion("user_professional_qualification is null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationIsNotNull() {
            addCriterion("user_professional_qualification is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationEqualTo(String value) {
            addCriterion("user_professional_qualification =", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationNotEqualTo(String value) {
            addCriterion("user_professional_qualification <>", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationGreaterThan(String value) {
            addCriterion("user_professional_qualification >", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("user_professional_qualification >=", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationLessThan(String value) {
            addCriterion("user_professional_qualification <", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationLessThanOrEqualTo(String value) {
            addCriterion("user_professional_qualification <=", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationLike(String value) {
            addCriterion("user_professional_qualification like", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationNotLike(String value) {
            addCriterion("user_professional_qualification not like", value, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationIn(List<String> values) {
            addCriterion("user_professional_qualification in", values, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationNotIn(List<String> values) {
            addCriterion("user_professional_qualification not in", values, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationBetween(String value1, String value2) {
            addCriterion("user_professional_qualification between", value1, value2, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalQualificationNotBetween(String value1, String value2) {
            addCriterion("user_professional_qualification not between", value1, value2, "userProfessionalQualification");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleIsNull() {
            addCriterion("user_professional_title is null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleIsNotNull() {
            addCriterion("user_professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleEqualTo(String value) {
            addCriterion("user_professional_title =", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleNotEqualTo(String value) {
            addCriterion("user_professional_title <>", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleGreaterThan(String value) {
            addCriterion("user_professional_title >", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("user_professional_title >=", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleLessThan(String value) {
            addCriterion("user_professional_title <", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleLessThanOrEqualTo(String value) {
            addCriterion("user_professional_title <=", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleLike(String value) {
            addCriterion("user_professional_title like", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleNotLike(String value) {
            addCriterion("user_professional_title not like", value, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleIn(List<String> values) {
            addCriterion("user_professional_title in", values, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleNotIn(List<String> values) {
            addCriterion("user_professional_title not in", values, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleBetween(String value1, String value2) {
            addCriterion("user_professional_title between", value1, value2, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserProfessionalTitleNotBetween(String value1, String value2) {
            addCriterion("user_professional_title not between", value1, value2, "userProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationIsNull() {
            addCriterion("user_career_qualification is null");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationIsNotNull() {
            addCriterion("user_career_qualification is not null");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationEqualTo(String value) {
            addCriterion("user_career_qualification =", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationNotEqualTo(String value) {
            addCriterion("user_career_qualification <>", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationGreaterThan(String value) {
            addCriterion("user_career_qualification >", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("user_career_qualification >=", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationLessThan(String value) {
            addCriterion("user_career_qualification <", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationLessThanOrEqualTo(String value) {
            addCriterion("user_career_qualification <=", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationLike(String value) {
            addCriterion("user_career_qualification like", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationNotLike(String value) {
            addCriterion("user_career_qualification not like", value, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationIn(List<String> values) {
            addCriterion("user_career_qualification in", values, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationNotIn(List<String> values) {
            addCriterion("user_career_qualification not in", values, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationBetween(String value1, String value2) {
            addCriterion("user_career_qualification between", value1, value2, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserCareerQualificationNotBetween(String value1, String value2) {
            addCriterion("user_career_qualification not between", value1, value2, "userCareerQualification");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagIsNull() {
            addCriterion("user_role_flag is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagIsNotNull() {
            addCriterion("user_role_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagEqualTo(Integer value) {
            addCriterion("user_role_flag =", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagNotEqualTo(Integer value) {
            addCriterion("user_role_flag <>", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagGreaterThan(Integer value) {
            addCriterion("user_role_flag >", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role_flag >=", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagLessThan(Integer value) {
            addCriterion("user_role_flag <", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagLessThanOrEqualTo(Integer value) {
            addCriterion("user_role_flag <=", value, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagIn(List<Integer> values) {
            addCriterion("user_role_flag in", values, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagNotIn(List<Integer> values) {
            addCriterion("user_role_flag not in", values, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagBetween(Integer value1, Integer value2) {
            addCriterion("user_role_flag between", value1, value2, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserRoleFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role_flag not between", value1, value2, "userRoleFlag");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
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