package sys.spvisor.core.entity.project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class TFileFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFileFormExample() {
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

        public Criteria andFileFormIdIsNull() {
            addCriterion("file_form_id is null");
            return (Criteria) this;
        }

        public Criteria andFileFormIdIsNotNull() {
            addCriterion("file_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormIdEqualTo(Integer value) {
            addCriterion("file_form_id =", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdNotEqualTo(Integer value) {
            addCriterion("file_form_id <>", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdGreaterThan(Integer value) {
            addCriterion("file_form_id >", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_form_id >=", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdLessThan(Integer value) {
            addCriterion("file_form_id <", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_form_id <=", value, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdIn(List<Integer> values) {
            addCriterion("file_form_id in", values, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdNotIn(List<Integer> values) {
            addCriterion("file_form_id not in", values, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdBetween(Integer value1, Integer value2) {
            addCriterion("file_form_id between", value1, value2, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_form_id not between", value1, value2, "fileFormId");
            return (Criteria) this;
        }

        public Criteria andFileFormNameIsNull() {
            addCriterion("file_form_name is null");
            return (Criteria) this;
        }

        public Criteria andFileFormNameIsNotNull() {
            addCriterion("file_form_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormNameEqualTo(String value) {
            addCriterion("file_form_name =", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameNotEqualTo(String value) {
            addCriterion("file_form_name <>", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameGreaterThan(String value) {
            addCriterion("file_form_name >", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_name >=", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameLessThan(String value) {
            addCriterion("file_form_name <", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameLessThanOrEqualTo(String value) {
            addCriterion("file_form_name <=", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameLike(String value) {
            addCriterion("file_form_name like", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameNotLike(String value) {
            addCriterion("file_form_name not like", value, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameIn(List<String> values) {
            addCriterion("file_form_name in", values, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameNotIn(List<String> values) {
            addCriterion("file_form_name not in", values, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameBetween(String value1, String value2) {
            addCriterion("file_form_name between", value1, value2, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormNameNotBetween(String value1, String value2) {
            addCriterion("file_form_name not between", value1, value2, "fileFormName");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleIsNull() {
            addCriterion("file_form_people is null");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleIsNotNull() {
            addCriterion("file_form_people is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleEqualTo(String value) {
            addCriterion("file_form_people =", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleNotEqualTo(String value) {
            addCriterion("file_form_people <>", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleGreaterThan(String value) {
            addCriterion("file_form_people >", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_people >=", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleLessThan(String value) {
            addCriterion("file_form_people <", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleLessThanOrEqualTo(String value) {
            addCriterion("file_form_people <=", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleLike(String value) {
            addCriterion("file_form_people like", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleNotLike(String value) {
            addCriterion("file_form_people not like", value, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleIn(List<String> values) {
            addCriterion("file_form_people in", values, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleNotIn(List<String> values) {
            addCriterion("file_form_people not in", values, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleBetween(String value1, String value2) {
            addCriterion("file_form_people between", value1, value2, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormPeopleNotBetween(String value1, String value2) {
            addCriterion("file_form_people not between", value1, value2, "fileFormPeople");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdIsNull() {
            addCriterion("file_form_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdIsNotNull() {
            addCriterion("file_form_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdEqualTo(Integer value) {
            addCriterion("file_form_user_id =", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdNotEqualTo(Integer value) {
            addCriterion("file_form_user_id <>", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdGreaterThan(Integer value) {
            addCriterion("file_form_user_id >", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_form_user_id >=", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdLessThan(Integer value) {
            addCriterion("file_form_user_id <", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_form_user_id <=", value, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdIn(List<Integer> values) {
            addCriterion("file_form_user_id in", values, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdNotIn(List<Integer> values) {
            addCriterion("file_form_user_id not in", values, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdBetween(Integer value1, Integer value2) {
            addCriterion("file_form_user_id between", value1, value2, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_form_user_id not between", value1, value2, "fileFormUserId");
            return (Criteria) this;
        }

        public Criteria andFileFormDateIsNull() {
            addCriterion("file_form_date is null");
            return (Criteria) this;
        }

        public Criteria andFileFormDateIsNotNull() {
            addCriterion("file_form_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormDateEqualTo(Date value) {
            addCriterion("file_form_date =", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateNotEqualTo(Date value) {
            addCriterion("file_form_date <>", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateGreaterThan(Date value) {
            addCriterion("file_form_date >", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_form_date >=", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateLessThan(Date value) {
            addCriterion("file_form_date <", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateLessThanOrEqualTo(Date value) {
            addCriterion("file_form_date <=", value, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateIn(List<Date> values) {
            addCriterion("file_form_date in", values, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateNotIn(List<Date> values) {
            addCriterion("file_form_date not in", values, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateBetween(Date value1, Date value2) {
            addCriterion("file_form_date between", value1, value2, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormDateNotBetween(Date value1, Date value2) {
            addCriterion("file_form_date not between", value1, value2, "fileFormDate");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameIsNull() {
            addCriterion("file_form_filename is null");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameIsNotNull() {
            addCriterion("file_form_filename is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameEqualTo(String value) {
            addCriterion("file_form_filename =", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameNotEqualTo(String value) {
            addCriterion("file_form_filename <>", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameGreaterThan(String value) {
            addCriterion("file_form_filename >", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_filename >=", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameLessThan(String value) {
            addCriterion("file_form_filename <", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameLessThanOrEqualTo(String value) {
            addCriterion("file_form_filename <=", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameLike(String value) {
            addCriterion("file_form_filename like", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameNotLike(String value) {
            addCriterion("file_form_filename not like", value, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameIn(List<String> values) {
            addCriterion("file_form_filename in", values, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameNotIn(List<String> values) {
            addCriterion("file_form_filename not in", values, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameBetween(String value1, String value2) {
            addCriterion("file_form_filename between", value1, value2, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormFilenameNotBetween(String value1, String value2) {
            addCriterion("file_form_filename not between", value1, value2, "fileFormFilename");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdIsNull() {
            addCriterion("file_form_project_id is null");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdIsNotNull() {
            addCriterion("file_form_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdEqualTo(Integer value) {
            addCriterion("file_form_project_id =", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdNotEqualTo(Integer value) {
            addCriterion("file_form_project_id <>", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdGreaterThan(Integer value) {
            addCriterion("file_form_project_id >", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_form_project_id >=", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdLessThan(Integer value) {
            addCriterion("file_form_project_id <", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_form_project_id <=", value, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdIn(List<Integer> values) {
            addCriterion("file_form_project_id in", values, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdNotIn(List<Integer> values) {
            addCriterion("file_form_project_id not in", values, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("file_form_project_id between", value1, value2, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_form_project_id not between", value1, value2, "fileFormProjectId");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeIsNull() {
            addCriterion("file_form_type is null");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeIsNotNull() {
            addCriterion("file_form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeEqualTo(String value) {
            addCriterion("file_form_type =", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeNotEqualTo(String value) {
            addCriterion("file_form_type <>", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeGreaterThan(String value) {
            addCriterion("file_form_type >", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_type >=", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeLessThan(String value) {
            addCriterion("file_form_type <", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeLessThanOrEqualTo(String value) {
            addCriterion("file_form_type <=", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeLike(String value) {
            addCriterion("file_form_type like", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeNotLike(String value) {
            addCriterion("file_form_type not like", value, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeIn(List<String> values) {
            addCriterion("file_form_type in", values, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeNotIn(List<String> values) {
            addCriterion("file_form_type not in", values, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeBetween(String value1, String value2) {
            addCriterion("file_form_type between", value1, value2, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormTypeNotBetween(String value1, String value2) {
            addCriterion("file_form_type not between", value1, value2, "fileFormType");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusIsNull() {
            addCriterion("file_form_current_status is null");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusIsNotNull() {
            addCriterion("file_form_current_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusEqualTo(String value) {
            addCriterion("file_form_current_status =", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNotEqualTo(String value) {
            addCriterion("file_form_current_status <>", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusGreaterThan(String value) {
            addCriterion("file_form_current_status >", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_current_status >=", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusLessThan(String value) {
            addCriterion("file_form_current_status <", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("file_form_current_status <=", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusLike(String value) {
            addCriterion("file_form_current_status like", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNotLike(String value) {
            addCriterion("file_form_current_status not like", value, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusIn(List<String> values) {
            addCriterion("file_form_current_status in", values, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNotIn(List<String> values) {
            addCriterion("file_form_current_status not in", values, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusBetween(String value1, String value2) {
            addCriterion("file_form_current_status between", value1, value2, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("file_form_current_status not between", value1, value2, "fileFormCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumIsNull() {
            addCriterion("file_form_current_status_num is null");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumIsNotNull() {
            addCriterion("file_form_current_status_num is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumEqualTo(Integer value) {
            addCriterion("file_form_current_status_num =", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumNotEqualTo(Integer value) {
            addCriterion("file_form_current_status_num <>", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumGreaterThan(Integer value) {
            addCriterion("file_form_current_status_num >", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_form_current_status_num >=", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumLessThan(Integer value) {
            addCriterion("file_form_current_status_num <", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumLessThanOrEqualTo(Integer value) {
            addCriterion("file_form_current_status_num <=", value, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumIn(List<Integer> values) {
            addCriterion("file_form_current_status_num in", values, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumNotIn(List<Integer> values) {
            addCriterion("file_form_current_status_num not in", values, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumBetween(Integer value1, Integer value2) {
            addCriterion("file_form_current_status_num between", value1, value2, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormCurrentStatusNumNotBetween(Integer value1, Integer value2) {
            addCriterion("file_form_current_status_num not between", value1, value2, "fileFormCurrentStatusNum");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesIsNull() {
            addCriterion("file_form_notpass_times is null");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesIsNotNull() {
            addCriterion("file_form_notpass_times is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesEqualTo(Integer value) {
            addCriterion("file_form_notpass_times =", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesNotEqualTo(Integer value) {
            addCriterion("file_form_notpass_times <>", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesGreaterThan(Integer value) {
            addCriterion("file_form_notpass_times >", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_form_notpass_times >=", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesLessThan(Integer value) {
            addCriterion("file_form_notpass_times <", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesLessThanOrEqualTo(Integer value) {
            addCriterion("file_form_notpass_times <=", value, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesIn(List<Integer> values) {
            addCriterion("file_form_notpass_times in", values, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesNotIn(List<Integer> values) {
            addCriterion("file_form_notpass_times not in", values, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesBetween(Integer value1, Integer value2) {
            addCriterion("file_form_notpass_times between", value1, value2, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormNotpassTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("file_form_notpass_times not between", value1, value2, "fileFormNotpassTimes");
            return (Criteria) this;
        }

        public Criteria andFileFormPathIsNull() {
            addCriterion("file_form_path is null");
            return (Criteria) this;
        }

        public Criteria andFileFormPathIsNotNull() {
            addCriterion("file_form_path is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormPathEqualTo(String value) {
            addCriterion("file_form_path =", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathNotEqualTo(String value) {
            addCriterion("file_form_path <>", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathGreaterThan(String value) {
            addCriterion("file_form_path >", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathGreaterThanOrEqualTo(String value) {
            addCriterion("file_form_path >=", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathLessThan(String value) {
            addCriterion("file_form_path <", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathLessThanOrEqualTo(String value) {
            addCriterion("file_form_path <=", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathLike(String value) {
            addCriterion("file_form_path like", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathNotLike(String value) {
            addCriterion("file_form_path not like", value, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathIn(List<String> values) {
            addCriterion("file_form_path in", values, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathNotIn(List<String> values) {
            addCriterion("file_form_path not in", values, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathBetween(String value1, String value2) {
            addCriterion("file_form_path between", value1, value2, "fileFormPath");
            return (Criteria) this;
        }

        public Criteria andFileFormPathNotBetween(String value1, String value2) {
            addCriterion("file_form_path not between", value1, value2, "fileFormPath");
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