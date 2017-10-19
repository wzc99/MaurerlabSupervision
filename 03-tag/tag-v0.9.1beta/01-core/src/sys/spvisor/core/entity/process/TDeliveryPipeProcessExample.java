package sys.spvisor.core.entity.process;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

public class TDeliveryPipeProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDeliveryPipeProcessExample() {
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

        public Criteria andPipeArriveJuanIsNull() {
            addCriterion("pipe_arrive_juan is null");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanIsNotNull() {
            addCriterion("pipe_arrive_juan is not null");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanEqualTo(Double value) {
            addCriterion("pipe_arrive_juan =", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanNotEqualTo(Double value) {
            addCriterion("pipe_arrive_juan <>", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanGreaterThan(Double value) {
            addCriterion("pipe_arrive_juan >", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_arrive_juan >=", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanLessThan(Double value) {
            addCriterion("pipe_arrive_juan <", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanLessThanOrEqualTo(Double value) {
            addCriterion("pipe_arrive_juan <=", value, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanIn(List<Double> values) {
            addCriterion("pipe_arrive_juan in", values, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanNotIn(List<Double> values) {
            addCriterion("pipe_arrive_juan not in", values, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanBetween(Double value1, Double value2) {
            addCriterion("pipe_arrive_juan between", value1, value2, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveJuanNotBetween(Double value1, Double value2) {
            addCriterion("pipe_arrive_juan not between", value1, value2, "pipeArriveJuan");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunIsNull() {
            addCriterion("pipe_arrive_dun is null");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunIsNotNull() {
            addCriterion("pipe_arrive_dun is not null");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunEqualTo(Double value) {
            addCriterion("pipe_arrive_dun =", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunNotEqualTo(Double value) {
            addCriterion("pipe_arrive_dun <>", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunGreaterThan(Double value) {
            addCriterion("pipe_arrive_dun >", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_arrive_dun >=", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunLessThan(Double value) {
            addCriterion("pipe_arrive_dun <", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunLessThanOrEqualTo(Double value) {
            addCriterion("pipe_arrive_dun <=", value, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunIn(List<Double> values) {
            addCriterion("pipe_arrive_dun in", values, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunNotIn(List<Double> values) {
            addCriterion("pipe_arrive_dun not in", values, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunBetween(Double value1, Double value2) {
            addCriterion("pipe_arrive_dun between", value1, value2, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeArriveDunNotBetween(Double value1, Double value2) {
            addCriterion("pipe_arrive_dun not between", value1, value2, "pipeArriveDun");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingIsNull() {
            addCriterion("pipe_rolling_drawing is null");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingIsNotNull() {
            addCriterion("pipe_rolling_drawing is not null");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingEqualTo(Integer value) {
            addCriterion("pipe_rolling_drawing =", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingNotEqualTo(Integer value) {
            addCriterion("pipe_rolling_drawing <>", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingGreaterThan(Integer value) {
            addCriterion("pipe_rolling_drawing >", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipe_rolling_drawing >=", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingLessThan(Integer value) {
            addCriterion("pipe_rolling_drawing <", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingLessThanOrEqualTo(Integer value) {
            addCriterion("pipe_rolling_drawing <=", value, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingIn(List<Integer> values) {
            addCriterion("pipe_rolling_drawing in", values, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingNotIn(List<Integer> values) {
            addCriterion("pipe_rolling_drawing not in", values, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingBetween(Integer value1, Integer value2) {
            addCriterion("pipe_rolling_drawing between", value1, value2, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andPipeRollingDrawingNotBetween(Integer value1, Integer value2) {
            addCriterion("pipe_rolling_drawing not between", value1, value2, "pipeRollingDrawing");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingIsNull() {
            addCriterion("forming_welding is null");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingIsNotNull() {
            addCriterion("forming_welding is not null");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingEqualTo(Integer value) {
            addCriterion("forming_welding =", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingNotEqualTo(Integer value) {
            addCriterion("forming_welding <>", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingGreaterThan(Integer value) {
            addCriterion("forming_welding >", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingGreaterThanOrEqualTo(Integer value) {
            addCriterion("forming_welding >=", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingLessThan(Integer value) {
            addCriterion("forming_welding <", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingLessThanOrEqualTo(Integer value) {
            addCriterion("forming_welding <=", value, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingIn(List<Integer> values) {
            addCriterion("forming_welding in", values, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingNotIn(List<Integer> values) {
            addCriterion("forming_welding not in", values, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingBetween(Integer value1, Integer value2) {
            addCriterion("forming_welding between", value1, value2, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andFormingWeldingNotBetween(Integer value1, Integer value2) {
            addCriterion("forming_welding not between", value1, value2, "formingWelding");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIsNull() {
            addCriterion("non_des_check is null");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIsNotNull() {
            addCriterion("non_des_check is not null");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckEqualTo(Integer value) {
            addCriterion("non_des_check =", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotEqualTo(Integer value) {
            addCriterion("non_des_check <>", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckGreaterThan(Integer value) {
            addCriterion("non_des_check >", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("non_des_check >=", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckLessThan(Integer value) {
            addCriterion("non_des_check <", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckLessThanOrEqualTo(Integer value) {
            addCriterion("non_des_check <=", value, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckIn(List<Integer> values) {
            addCriterion("non_des_check in", values, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotIn(List<Integer> values) {
            addCriterion("non_des_check not in", values, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckBetween(Integer value1, Integer value2) {
            addCriterion("non_des_check between", value1, value2, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andNonDesCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("non_des_check not between", value1, value2, "nonDesCheck");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentIsNull() {
            addCriterion("water_press_experoment is null");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentIsNotNull() {
            addCriterion("water_press_experoment is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentEqualTo(Integer value) {
            addCriterion("water_press_experoment =", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentNotEqualTo(Integer value) {
            addCriterion("water_press_experoment <>", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentGreaterThan(Integer value) {
            addCriterion("water_press_experoment >", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_press_experoment >=", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentLessThan(Integer value) {
            addCriterion("water_press_experoment <", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentLessThanOrEqualTo(Integer value) {
            addCriterion("water_press_experoment <=", value, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentIn(List<Integer> values) {
            addCriterion("water_press_experoment in", values, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentNotIn(List<Integer> values) {
            addCriterion("water_press_experoment not in", values, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentBetween(Integer value1, Integer value2) {
            addCriterion("water_press_experoment between", value1, value2, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andWaterPressExperomentNotBetween(Integer value1, Integer value2) {
            addCriterion("water_press_experoment not between", value1, value2, "waterPressExperoment");
            return (Criteria) this;
        }

        public Criteria andDemotionIsNull() {
            addCriterion("demotion is null");
            return (Criteria) this;
        }

        public Criteria andDemotionIsNotNull() {
            addCriterion("demotion is not null");
            return (Criteria) this;
        }

        public Criteria andDemotionEqualTo(Integer value) {
            addCriterion("demotion =", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionNotEqualTo(Integer value) {
            addCriterion("demotion <>", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionGreaterThan(Integer value) {
            addCriterion("demotion >", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("demotion >=", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionLessThan(Integer value) {
            addCriterion("demotion <", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionLessThanOrEqualTo(Integer value) {
            addCriterion("demotion <=", value, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionIn(List<Integer> values) {
            addCriterion("demotion in", values, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionNotIn(List<Integer> values) {
            addCriterion("demotion not in", values, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionBetween(Integer value1, Integer value2) {
            addCriterion("demotion between", value1, value2, "demotion");
            return (Criteria) this;
        }

        public Criteria andDemotionNotBetween(Integer value1, Integer value2) {
            addCriterion("demotion not between", value1, value2, "demotion");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiIsNull() {
            addCriterion("finishing_warehousing_zhi is null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiIsNotNull() {
            addCriterion("finishing_warehousing_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiEqualTo(Integer value) {
            addCriterion("finishing_warehousing_zhi =", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiNotEqualTo(Integer value) {
            addCriterion("finishing_warehousing_zhi <>", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiGreaterThan(Integer value) {
            addCriterion("finishing_warehousing_zhi >", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishing_warehousing_zhi >=", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiLessThan(Integer value) {
            addCriterion("finishing_warehousing_zhi <", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiLessThanOrEqualTo(Integer value) {
            addCriterion("finishing_warehousing_zhi <=", value, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiIn(List<Integer> values) {
            addCriterion("finishing_warehousing_zhi in", values, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiNotIn(List<Integer> values) {
            addCriterion("finishing_warehousing_zhi not in", values, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiBetween(Integer value1, Integer value2) {
            addCriterion("finishing_warehousing_zhi between", value1, value2, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingZhiNotBetween(Integer value1, Integer value2) {
            addCriterion("finishing_warehousing_zhi not between", value1, value2, "finishingWarehousingZhi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiIsNull() {
            addCriterion("finishing_warehousing_mi is null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiIsNotNull() {
            addCriterion("finishing_warehousing_mi is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiEqualTo(Double value) {
            addCriterion("finishing_warehousing_mi =", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiNotEqualTo(Double value) {
            addCriterion("finishing_warehousing_mi <>", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiGreaterThan(Double value) {
            addCriterion("finishing_warehousing_mi >", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiGreaterThanOrEqualTo(Double value) {
            addCriterion("finishing_warehousing_mi >=", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiLessThan(Double value) {
            addCriterion("finishing_warehousing_mi <", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiLessThanOrEqualTo(Double value) {
            addCriterion("finishing_warehousing_mi <=", value, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiIn(List<Double> values) {
            addCriterion("finishing_warehousing_mi in", values, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiNotIn(List<Double> values) {
            addCriterion("finishing_warehousing_mi not in", values, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiBetween(Double value1, Double value2) {
            addCriterion("finishing_warehousing_mi between", value1, value2, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingMiNotBetween(Double value1, Double value2) {
            addCriterion("finishing_warehousing_mi not between", value1, value2, "finishingWarehousingMi");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunIsNull() {
            addCriterion("finishing_warehousing_dun is null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunIsNotNull() {
            addCriterion("finishing_warehousing_dun is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunEqualTo(Double value) {
            addCriterion("finishing_warehousing_dun =", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunNotEqualTo(Double value) {
            addCriterion("finishing_warehousing_dun <>", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunGreaterThan(Double value) {
            addCriterion("finishing_warehousing_dun >", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunGreaterThanOrEqualTo(Double value) {
            addCriterion("finishing_warehousing_dun >=", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunLessThan(Double value) {
            addCriterion("finishing_warehousing_dun <", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunLessThanOrEqualTo(Double value) {
            addCriterion("finishing_warehousing_dun <=", value, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunIn(List<Double> values) {
            addCriterion("finishing_warehousing_dun in", values, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunNotIn(List<Double> values) {
            addCriterion("finishing_warehousing_dun not in", values, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunBetween(Double value1, Double value2) {
            addCriterion("finishing_warehousing_dun between", value1, value2, "finishingWarehousingDun");
            return (Criteria) this;
        }

        public Criteria andFinishingWarehousingDunNotBetween(Double value1, Double value2) {
            addCriterion("finishing_warehousing_dun not between", value1, value2, "finishingWarehousingDun");
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

        public Criteria andTufuZhiEqualTo(Integer value) {
            addCriterion("tufu_zhi =", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotEqualTo(Integer value) {
            addCriterion("tufu_zhi <>", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiGreaterThan(Integer value) {
            addCriterion("tufu_zhi >", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("tufu_zhi >=", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiLessThan(Integer value) {
            addCriterion("tufu_zhi <", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiLessThanOrEqualTo(Integer value) {
            addCriterion("tufu_zhi <=", value, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiIn(List<Integer> values) {
            addCriterion("tufu_zhi in", values, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotIn(List<Integer> values) {
            addCriterion("tufu_zhi not in", values, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiBetween(Integer value1, Integer value2) {
            addCriterion("tufu_zhi between", value1, value2, "tufuZhi");
            return (Criteria) this;
        }

        public Criteria andTufuZhiNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPipeRukuZhiIsNull() {
            addCriterion("pipe_ruku_zhi is null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiIsNotNull() {
            addCriterion("pipe_ruku_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiEqualTo(Integer value) {
            addCriterion("pipe_ruku_zhi =", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiNotEqualTo(Integer value) {
            addCriterion("pipe_ruku_zhi <>", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiGreaterThan(Integer value) {
            addCriterion("pipe_ruku_zhi >", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipe_ruku_zhi >=", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiLessThan(Integer value) {
            addCriterion("pipe_ruku_zhi <", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiLessThanOrEqualTo(Integer value) {
            addCriterion("pipe_ruku_zhi <=", value, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiIn(List<Integer> values) {
            addCriterion("pipe_ruku_zhi in", values, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiNotIn(List<Integer> values) {
            addCriterion("pipe_ruku_zhi not in", values, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiBetween(Integer value1, Integer value2) {
            addCriterion("pipe_ruku_zhi between", value1, value2, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuZhiNotBetween(Integer value1, Integer value2) {
            addCriterion("pipe_ruku_zhi not between", value1, value2, "pipeRukuZhi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiIsNull() {
            addCriterion("pipe_ruku_mi is null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiIsNotNull() {
            addCriterion("pipe_ruku_mi is not null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiEqualTo(Double value) {
            addCriterion("pipe_ruku_mi =", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiNotEqualTo(Double value) {
            addCriterion("pipe_ruku_mi <>", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiGreaterThan(Double value) {
            addCriterion("pipe_ruku_mi >", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_ruku_mi >=", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiLessThan(Double value) {
            addCriterion("pipe_ruku_mi <", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiLessThanOrEqualTo(Double value) {
            addCriterion("pipe_ruku_mi <=", value, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiIn(List<Double> values) {
            addCriterion("pipe_ruku_mi in", values, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiNotIn(List<Double> values) {
            addCriterion("pipe_ruku_mi not in", values, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiBetween(Double value1, Double value2) {
            addCriterion("pipe_ruku_mi between", value1, value2, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuMiNotBetween(Double value1, Double value2) {
            addCriterion("pipe_ruku_mi not between", value1, value2, "pipeRukuMi");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunIsNull() {
            addCriterion("pipe_ruku_dun is null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunIsNotNull() {
            addCriterion("pipe_ruku_dun is not null");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunEqualTo(Double value) {
            addCriterion("pipe_ruku_dun =", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunNotEqualTo(Double value) {
            addCriterion("pipe_ruku_dun <>", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunGreaterThan(Double value) {
            addCriterion("pipe_ruku_dun >", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_ruku_dun >=", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunLessThan(Double value) {
            addCriterion("pipe_ruku_dun <", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunLessThanOrEqualTo(Double value) {
            addCriterion("pipe_ruku_dun <=", value, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunIn(List<Double> values) {
            addCriterion("pipe_ruku_dun in", values, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunNotIn(List<Double> values) {
            addCriterion("pipe_ruku_dun not in", values, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunBetween(Double value1, Double value2) {
            addCriterion("pipe_ruku_dun between", value1, value2, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeRukuDunNotBetween(Double value1, Double value2) {
            addCriterion("pipe_ruku_dun not between", value1, value2, "pipeRukuDun");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangIsNull() {
            addCriterion("pipe_liufang is null");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangIsNotNull() {
            addCriterion("pipe_liufang is not null");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangEqualTo(Integer value) {
            addCriterion("pipe_liufang =", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangNotEqualTo(Integer value) {
            addCriterion("pipe_liufang <>", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangGreaterThan(Integer value) {
            addCriterion("pipe_liufang >", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipe_liufang >=", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangLessThan(Integer value) {
            addCriterion("pipe_liufang <", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangLessThanOrEqualTo(Integer value) {
            addCriterion("pipe_liufang <=", value, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangIn(List<Integer> values) {
            addCriterion("pipe_liufang in", values, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangNotIn(List<Integer> values) {
            addCriterion("pipe_liufang not in", values, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangBetween(Integer value1, Integer value2) {
            addCriterion("pipe_liufang between", value1, value2, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeLiufangNotBetween(Integer value1, Integer value2) {
            addCriterion("pipe_liufang not between", value1, value2, "pipeLiufang");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiIsNull() {
            addCriterion("pipe_falaing_zhi is null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiIsNotNull() {
            addCriterion("pipe_falaing_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiEqualTo(Integer value) {
            addCriterion("pipe_falaing_zhi =", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiNotEqualTo(Integer value) {
            addCriterion("pipe_falaing_zhi <>", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiGreaterThan(Integer value) {
            addCriterion("pipe_falaing_zhi >", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipe_falaing_zhi >=", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiLessThan(Integer value) {
            addCriterion("pipe_falaing_zhi <", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiLessThanOrEqualTo(Integer value) {
            addCriterion("pipe_falaing_zhi <=", value, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiIn(List<Integer> values) {
            addCriterion("pipe_falaing_zhi in", values, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiNotIn(List<Integer> values) {
            addCriterion("pipe_falaing_zhi not in", values, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiBetween(Integer value1, Integer value2) {
            addCriterion("pipe_falaing_zhi between", value1, value2, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingZhiNotBetween(Integer value1, Integer value2) {
            addCriterion("pipe_falaing_zhi not between", value1, value2, "pipeFalaingZhi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiIsNull() {
            addCriterion("pipe_falaing_mi is null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiIsNotNull() {
            addCriterion("pipe_falaing_mi is not null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiEqualTo(Double value) {
            addCriterion("pipe_falaing_mi =", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiNotEqualTo(Double value) {
            addCriterion("pipe_falaing_mi <>", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiGreaterThan(Double value) {
            addCriterion("pipe_falaing_mi >", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_falaing_mi >=", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiLessThan(Double value) {
            addCriterion("pipe_falaing_mi <", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiLessThanOrEqualTo(Double value) {
            addCriterion("pipe_falaing_mi <=", value, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiIn(List<Double> values) {
            addCriterion("pipe_falaing_mi in", values, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiNotIn(List<Double> values) {
            addCriterion("pipe_falaing_mi not in", values, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiBetween(Double value1, Double value2) {
            addCriterion("pipe_falaing_mi between", value1, value2, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingMiNotBetween(Double value1, Double value2) {
            addCriterion("pipe_falaing_mi not between", value1, value2, "pipeFalaingMi");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunIsNull() {
            addCriterion("pipe_falaing_dun is null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunIsNotNull() {
            addCriterion("pipe_falaing_dun is not null");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunEqualTo(Double value) {
            addCriterion("pipe_falaing_dun =", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunNotEqualTo(Double value) {
            addCriterion("pipe_falaing_dun <>", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunGreaterThan(Double value) {
            addCriterion("pipe_falaing_dun >", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunGreaterThanOrEqualTo(Double value) {
            addCriterion("pipe_falaing_dun >=", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunLessThan(Double value) {
            addCriterion("pipe_falaing_dun <", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunLessThanOrEqualTo(Double value) {
            addCriterion("pipe_falaing_dun <=", value, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunIn(List<Double> values) {
            addCriterion("pipe_falaing_dun in", values, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunNotIn(List<Double> values) {
            addCriterion("pipe_falaing_dun not in", values, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunBetween(Double value1, Double value2) {
            addCriterion("pipe_falaing_dun between", value1, value2, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andPipeFalaingDunNotBetween(Double value1, Double value2) {
            addCriterion("pipe_falaing_dun not between", value1, value2, "pipeFalaingDun");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNull() {
            addCriterion("complete_rate is null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNotNull() {
            addCriterion("complete_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateEqualTo(Double value) {
            addCriterion("complete_rate =", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotEqualTo(Double value) {
            addCriterion("complete_rate <>", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThan(Double value) {
            addCriterion("complete_rate >", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThanOrEqualTo(Double value) {
            addCriterion("complete_rate >=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThan(Double value) {
            addCriterion("complete_rate <", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThanOrEqualTo(Double value) {
            addCriterion("complete_rate <=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIn(List<Double> values) {
            addCriterion("complete_rate in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotIn(List<Double> values) {
            addCriterion("complete_rate not in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateBetween(Double value1, Double value2) {
            addCriterion("complete_rate between", value1, value2, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotBetween(Double value1, Double value2) {
            addCriterion("complete_rate not between", value1, value2, "completeRate");
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

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date not between", value1, value2, "submitDate");
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