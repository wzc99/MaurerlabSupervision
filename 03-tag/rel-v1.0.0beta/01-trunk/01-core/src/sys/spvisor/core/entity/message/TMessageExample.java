package sys.spvisor.core.entity.message;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class TMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdIsNull() {
            addCriterion("msg_sumit_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdIsNotNull() {
            addCriterion("msg_sumit_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdEqualTo(Integer value) {
            addCriterion("msg_sumit_id =", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdNotEqualTo(Integer value) {
            addCriterion("msg_sumit_id <>", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdGreaterThan(Integer value) {
            addCriterion("msg_sumit_id >", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_sumit_id >=", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdLessThan(Integer value) {
            addCriterion("msg_sumit_id <", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_sumit_id <=", value, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdIn(List<Integer> values) {
            addCriterion("msg_sumit_id in", values, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdNotIn(List<Integer> values) {
            addCriterion("msg_sumit_id not in", values, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_sumit_id between", value1, value2, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSumitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_sumit_id not between", value1, value2, "msgSumitId");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeIsNull() {
            addCriterion("msg_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeIsNotNull() {
            addCriterion("msg_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeEqualTo(Date value) {
            addCriterion("msg_submit_time =", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeNotEqualTo(Date value) {
            addCriterion("msg_submit_time <>", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeGreaterThan(Date value) {
            addCriterion("msg_submit_time >", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("msg_submit_time >=", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeLessThan(Date value) {
            addCriterion("msg_submit_time <", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("msg_submit_time <=", value, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeIn(List<Date> values) {
            addCriterion("msg_submit_time in", values, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeNotIn(List<Date> values) {
            addCriterion("msg_submit_time not in", values, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("msg_submit_time between", value1, value2, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("msg_submit_time not between", value1, value2, "msgSubmitTime");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgNoteIsNull() {
            addCriterion("msg_note is null");
            return (Criteria) this;
        }

        public Criteria andMsgNoteIsNotNull() {
            addCriterion("msg_note is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNoteEqualTo(String value) {
            addCriterion("msg_note =", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteNotEqualTo(String value) {
            addCriterion("msg_note <>", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteGreaterThan(String value) {
            addCriterion("msg_note >", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteGreaterThanOrEqualTo(String value) {
            addCriterion("msg_note >=", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteLessThan(String value) {
            addCriterion("msg_note <", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteLessThanOrEqualTo(String value) {
            addCriterion("msg_note <=", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteLike(String value) {
            addCriterion("msg_note like", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteNotLike(String value) {
            addCriterion("msg_note not like", value, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteIn(List<String> values) {
            addCriterion("msg_note in", values, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteNotIn(List<String> values) {
            addCriterion("msg_note not in", values, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteBetween(String value1, String value2) {
            addCriterion("msg_note between", value1, value2, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgNoteNotBetween(String value1, String value2) {
            addCriterion("msg_note not between", value1, value2, "msgNote");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Integer value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Integer value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Integer value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Integer value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Integer> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Integer> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Integer value1, Integer value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdIsNull() {
            addCriterion("msg_link_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdIsNotNull() {
            addCriterion("msg_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdEqualTo(Integer value) {
            addCriterion("msg_link_id =", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdNotEqualTo(Integer value) {
            addCriterion("msg_link_id <>", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdGreaterThan(Integer value) {
            addCriterion("msg_link_id >", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_link_id >=", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdLessThan(Integer value) {
            addCriterion("msg_link_id <", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_link_id <=", value, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdIn(List<Integer> values) {
            addCriterion("msg_link_id in", values, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdNotIn(List<Integer> values) {
            addCriterion("msg_link_id not in", values, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_link_id between", value1, value2, "msgLinkId");
            return (Criteria) this;
        }

        public Criteria andMsgLinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_link_id not between", value1, value2, "msgLinkId");
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