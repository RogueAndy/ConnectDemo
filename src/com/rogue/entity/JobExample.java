package com.rogue.entity;

import java.util.ArrayList;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("jobid like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("jobid not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(String value) {
            addCriterion("jobtitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(String value) {
            addCriterion("jobtitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(String value) {
            addCriterion("jobtitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("jobtitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(String value) {
            addCriterion("jobtitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(String value) {
            addCriterion("jobtitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLike(String value) {
            addCriterion("jobtitle like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotLike(String value) {
            addCriterion("jobtitle not like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<String> values) {
            addCriterion("jobtitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<String> values) {
            addCriterion("jobtitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(String value1, String value2) {
            addCriterion("jobtitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(String value1, String value2) {
            addCriterion("jobtitle not between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobcontentIsNull() {
            addCriterion("jobcontent is null");
            return (Criteria) this;
        }

        public Criteria andJobcontentIsNotNull() {
            addCriterion("jobcontent is not null");
            return (Criteria) this;
        }

        public Criteria andJobcontentEqualTo(String value) {
            addCriterion("jobcontent =", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentNotEqualTo(String value) {
            addCriterion("jobcontent <>", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentGreaterThan(String value) {
            addCriterion("jobcontent >", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentGreaterThanOrEqualTo(String value) {
            addCriterion("jobcontent >=", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentLessThan(String value) {
            addCriterion("jobcontent <", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentLessThanOrEqualTo(String value) {
            addCriterion("jobcontent <=", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentLike(String value) {
            addCriterion("jobcontent like", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentNotLike(String value) {
            addCriterion("jobcontent not like", value, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentIn(List<String> values) {
            addCriterion("jobcontent in", values, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentNotIn(List<String> values) {
            addCriterion("jobcontent not in", values, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentBetween(String value1, String value2) {
            addCriterion("jobcontent between", value1, value2, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobcontentNotBetween(String value1, String value2) {
            addCriterion("jobcontent not between", value1, value2, "jobcontent");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanIsNull() {
            addCriterion("jobsignhuman is null");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanIsNotNull() {
            addCriterion("jobsignhuman is not null");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanEqualTo(String value) {
            addCriterion("jobsignhuman =", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanNotEqualTo(String value) {
            addCriterion("jobsignhuman <>", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanGreaterThan(String value) {
            addCriterion("jobsignhuman >", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanGreaterThanOrEqualTo(String value) {
            addCriterion("jobsignhuman >=", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanLessThan(String value) {
            addCriterion("jobsignhuman <", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanLessThanOrEqualTo(String value) {
            addCriterion("jobsignhuman <=", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanLike(String value) {
            addCriterion("jobsignhuman like", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanNotLike(String value) {
            addCriterion("jobsignhuman not like", value, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanIn(List<String> values) {
            addCriterion("jobsignhuman in", values, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanNotIn(List<String> values) {
            addCriterion("jobsignhuman not in", values, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanBetween(String value1, String value2) {
            addCriterion("jobsignhuman between", value1, value2, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobsignhumanNotBetween(String value1, String value2) {
            addCriterion("jobsignhuman not between", value1, value2, "jobsignhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanIsNull() {
            addCriterion("jobworkhuman is null");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanIsNotNull() {
            addCriterion("jobworkhuman is not null");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanEqualTo(String value) {
            addCriterion("jobworkhuman =", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanNotEqualTo(String value) {
            addCriterion("jobworkhuman <>", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanGreaterThan(String value) {
            addCriterion("jobworkhuman >", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanGreaterThanOrEqualTo(String value) {
            addCriterion("jobworkhuman >=", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanLessThan(String value) {
            addCriterion("jobworkhuman <", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanLessThanOrEqualTo(String value) {
            addCriterion("jobworkhuman <=", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanLike(String value) {
            addCriterion("jobworkhuman like", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanNotLike(String value) {
            addCriterion("jobworkhuman not like", value, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanIn(List<String> values) {
            addCriterion("jobworkhuman in", values, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanNotIn(List<String> values) {
            addCriterion("jobworkhuman not in", values, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanBetween(String value1, String value2) {
            addCriterion("jobworkhuman between", value1, value2, "jobworkhuman");
            return (Criteria) this;
        }

        public Criteria andJobworkhumanNotBetween(String value1, String value2) {
            addCriterion("jobworkhuman not between", value1, value2, "jobworkhuman");
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