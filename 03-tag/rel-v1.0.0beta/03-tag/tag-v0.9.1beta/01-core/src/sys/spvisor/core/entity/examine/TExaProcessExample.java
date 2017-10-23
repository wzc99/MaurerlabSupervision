package sys.spvisor.core.entity.examine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExaProcessExample {
    protected String orderByClause;
    
    protected int limit=-1;
    
    protected int offset=-1;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExaProcessExample() {
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
    
    public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
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
        limit = -1;
        offset = -1;
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

        public Criteria andExamineIdIsNull() {
            addCriterion("examine_id is null");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNotNull() {
            addCriterion("examine_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamineIdEqualTo(Integer value) {
            addCriterion("examine_id =", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotEqualTo(Integer value) {
            addCriterion("examine_id <>", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThan(Integer value) {
            addCriterion("examine_id >", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine_id >=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThan(Integer value) {
            addCriterion("examine_id <", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThanOrEqualTo(Integer value) {
            addCriterion("examine_id <=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdIn(List<Integer> values) {
            addCriterion("examine_id in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotIn(List<Integer> values) {
            addCriterion("examine_id not in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdBetween(Integer value1, Integer value2) {
            addCriterion("examine_id between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examine_id not between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExaOrderIsNull() {
            addCriterion("exa_order is null");
            return (Criteria) this;
        }

        public Criteria andExaOrderIsNotNull() {
            addCriterion("exa_order is not null");
            return (Criteria) this;
        }

        public Criteria andExaOrderEqualTo(Integer value) {
            addCriterion("exa_order =", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderNotEqualTo(Integer value) {
            addCriterion("exa_order <>", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderGreaterThan(Integer value) {
            addCriterion("exa_order >", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("exa_order >=", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderLessThan(Integer value) {
            addCriterion("exa_order <", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderLessThanOrEqualTo(Integer value) {
            addCriterion("exa_order <=", value, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderIn(List<Integer> values) {
            addCriterion("exa_order in", values, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderNotIn(List<Integer> values) {
            addCriterion("exa_order not in", values, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderBetween(Integer value1, Integer value2) {
            addCriterion("exa_order between", value1, value2, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andExaOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("exa_order not between", value1, value2, "exaOrder");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("node_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("node_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("node_name =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("node_name <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("node_name >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_name >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("node_name <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("node_name <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("node_name like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("node_name not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("node_name in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("node_name not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("node_name between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("node_name not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeStatusIsNull() {
            addCriterion("node_status is null");
            return (Criteria) this;
        }

        public Criteria andNodeStatusIsNotNull() {
            addCriterion("node_status is not null");
            return (Criteria) this;
        }

        public Criteria andNodeStatusEqualTo(Integer value) {
            addCriterion("node_status =", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotEqualTo(Integer value) {
            addCriterion("node_status <>", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusGreaterThan(Integer value) {
            addCriterion("node_status >", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_status >=", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusLessThan(Integer value) {
            addCriterion("node_status <", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("node_status <=", value, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusIn(List<Integer> values) {
            addCriterion("node_status in", values, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotIn(List<Integer> values) {
            addCriterion("node_status not in", values, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusBetween(Integer value1, Integer value2) {
            addCriterion("node_status between", value1, value2, "nodeStatus");
            return (Criteria) this;
        }

        public Criteria andNodeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("node_status not between", value1, value2, "nodeStatus");
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

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(Integer value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(Integer value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(Integer value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(Integer value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<Integer> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<Integer> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(Integer value1, Integer value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusIsNull() {
            addCriterion("pro_node_status is null");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusIsNotNull() {
            addCriterion("pro_node_status is not null");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusEqualTo(Integer value) {
            addCriterion("pro_node_status =", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusNotEqualTo(Integer value) {
            addCriterion("pro_node_status <>", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusGreaterThan(Integer value) {
            addCriterion("pro_node_status >", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_node_status >=", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusLessThan(Integer value) {
            addCriterion("pro_node_status <", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pro_node_status <=", value, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusIn(List<Integer> values) {
            addCriterion("pro_node_status in", values, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusNotIn(List<Integer> values) {
            addCriterion("pro_node_status not in", values, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusBetween(Integer value1, Integer value2) {
            addCriterion("pro_node_status between", value1, value2, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andProNodeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_node_status not between", value1, value2, "proNodeStatus");
            return (Criteria) this;
        }

        public Criteria andIsProTypeIsNull() {
            addCriterion("is_pro_type is null");
            return (Criteria) this;
        }

        public Criteria andIsProTypeIsNotNull() {
            addCriterion("is_pro_type is not null");
            return (Criteria) this;
        }

        public Criteria andIsProTypeEqualTo(Integer value) {
            addCriterion("is_pro_type =", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeNotEqualTo(Integer value) {
            addCriterion("is_pro_type <>", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeGreaterThan(Integer value) {
            addCriterion("is_pro_type >", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pro_type >=", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeLessThan(Integer value) {
            addCriterion("is_pro_type <", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeLessThanOrEqualTo(Integer value) {
            addCriterion("is_pro_type <=", value, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeIn(List<Integer> values) {
            addCriterion("is_pro_type in", values, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeNotIn(List<Integer> values) {
            addCriterion("is_pro_type not in", values, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeBetween(Integer value1, Integer value2) {
            addCriterion("is_pro_type between", value1, value2, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsProTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pro_type not between", value1, value2, "isProType");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeIsNull() {
            addCriterion("is_last_node is null");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeIsNotNull() {
            addCriterion("is_last_node is not null");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeEqualTo(Boolean value) {
            addCriterion("is_last_node =", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeNotEqualTo(Boolean value) {
            addCriterion("is_last_node <>", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeGreaterThan(Boolean value) {
            addCriterion("is_last_node >", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_last_node >=", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeLessThan(Boolean value) {
            addCriterion("is_last_node <", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_last_node <=", value, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeIn(List<Boolean> values) {
            addCriterion("is_last_node in", values, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeNotIn(List<Boolean> values) {
            addCriterion("is_last_node not in", values, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_last_node between", value1, value2, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andIsLastNodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_last_node not between", value1, value2, "isLastNode");
            return (Criteria) this;
        }

        public Criteria andCoperRoleIsNull() {
            addCriterion("coper_role is null");
            return (Criteria) this;
        }

        public Criteria andCoperRoleIsNotNull() {
            addCriterion("coper_role is not null");
            return (Criteria) this;
        }

        public Criteria andCoperRoleEqualTo(Integer value) {
            addCriterion("coper_role =", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleNotEqualTo(Integer value) {
            addCriterion("coper_role <>", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleGreaterThan(Integer value) {
            addCriterion("coper_role >", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("coper_role >=", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleLessThan(Integer value) {
            addCriterion("coper_role <", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleLessThanOrEqualTo(Integer value) {
            addCriterion("coper_role <=", value, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleIn(List<Integer> values) {
            addCriterion("coper_role in", values, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleNotIn(List<Integer> values) {
            addCriterion("coper_role not in", values, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleBetween(Integer value1, Integer value2) {
            addCriterion("coper_role between", value1, value2, "coperRole");
            return (Criteria) this;
        }

        public Criteria andCoperRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("coper_role not between", value1, value2, "coperRole");
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