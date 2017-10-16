package sys.spvisor.core.entity.file;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCompanyFileManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCompanyFileManageExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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

        public Criteria andFileContentIntroductionIsNull() {
            addCriterion("file_content_introduction is null");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionIsNotNull() {
            addCriterion("file_content_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionEqualTo(String value) {
            addCriterion("file_content_introduction =", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionNotEqualTo(String value) {
            addCriterion("file_content_introduction <>", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionGreaterThan(String value) {
            addCriterion("file_content_introduction >", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("file_content_introduction >=", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionLessThan(String value) {
            addCriterion("file_content_introduction <", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionLessThanOrEqualTo(String value) {
            addCriterion("file_content_introduction <=", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionLike(String value) {
            addCriterion("file_content_introduction like", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionNotLike(String value) {
            addCriterion("file_content_introduction not like", value, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionIn(List<String> values) {
            addCriterion("file_content_introduction in", values, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionNotIn(List<String> values) {
            addCriterion("file_content_introduction not in", values, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionBetween(String value1, String value2) {
            addCriterion("file_content_introduction between", value1, value2, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andFileContentIntroductionNotBetween(String value1, String value2) {
            addCriterion("file_content_introduction not between", value1, value2, "fileContentIntroduction");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIsNull() {
            addCriterion("release_organization is null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIsNotNull() {
            addCriterion("release_organization is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationEqualTo(String value) {
            addCriterion("release_organization =", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotEqualTo(String value) {
            addCriterion("release_organization <>", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationGreaterThan(String value) {
            addCriterion("release_organization >", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("release_organization >=", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLessThan(String value) {
            addCriterion("release_organization <", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLessThanOrEqualTo(String value) {
            addCriterion("release_organization <=", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLike(String value) {
            addCriterion("release_organization like", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotLike(String value) {
            addCriterion("release_organization not like", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIn(List<String> values) {
            addCriterion("release_organization in", values, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotIn(List<String> values) {
            addCriterion("release_organization not in", values, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationBetween(String value1, String value2) {
            addCriterion("release_organization between", value1, value2, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotBetween(String value1, String value2) {
            addCriterion("release_organization not between", value1, value2, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
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

        public Criteria andValidDateEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterionForJDBCDate("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterionForJDBCDate("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterionForJDBCDate("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNull() {
            addCriterion("post_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIsNotNull() {
            addCriterion("post_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdEqualTo(Integer value) {
            addCriterion("post_user_id =", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotEqualTo(Integer value) {
            addCriterion("post_user_id <>", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThan(Integer value) {
            addCriterion("post_user_id >", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_user_id >=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThan(Integer value) {
            addCriterion("post_user_id <", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_user_id <=", value, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdIn(List<Integer> values) {
            addCriterion("post_user_id in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotIn(List<Integer> values) {
            addCriterion("post_user_id not in", values, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdBetween(Integer value1, Integer value2) {
            addCriterion("post_user_id between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_user_id not between", value1, value2, "postUserId");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNull() {
            addCriterion("post_date is null");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNotNull() {
            addCriterion("post_date is not null");
            return (Criteria) this;
        }

        public Criteria andPostDateEqualTo(Date value) {
            addCriterionForJDBCDate("post_date =", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("post_date <>", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThan(Date value) {
            addCriterionForJDBCDate("post_date >", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("post_date >=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThan(Date value) {
            addCriterionForJDBCDate("post_date <", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("post_date <=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateIn(List<Date> values) {
            addCriterionForJDBCDate("post_date in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("post_date not in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("post_date between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("post_date not between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostPathIsNull() {
            addCriterion("post_path is null");
            return (Criteria) this;
        }

        public Criteria andPostPathIsNotNull() {
            addCriterion("post_path is not null");
            return (Criteria) this;
        }

        public Criteria andPostPathEqualTo(String value) {
            addCriterion("post_path =", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathNotEqualTo(String value) {
            addCriterion("post_path <>", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathGreaterThan(String value) {
            addCriterion("post_path >", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathGreaterThanOrEqualTo(String value) {
            addCriterion("post_path >=", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathLessThan(String value) {
            addCriterion("post_path <", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathLessThanOrEqualTo(String value) {
            addCriterion("post_path <=", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathLike(String value) {
            addCriterion("post_path like", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathNotLike(String value) {
            addCriterion("post_path not like", value, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathIn(List<String> values) {
            addCriterion("post_path in", values, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathNotIn(List<String> values) {
            addCriterion("post_path not in", values, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathBetween(String value1, String value2) {
            addCriterion("post_path between", value1, value2, "postPath");
            return (Criteria) this;
        }

        public Criteria andPostPathNotBetween(String value1, String value2) {
            addCriterion("post_path not between", value1, value2, "postPath");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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