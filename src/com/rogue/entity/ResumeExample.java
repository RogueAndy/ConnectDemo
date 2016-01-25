package com.rogue.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeid is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeid is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(String value) {
            addCriterion("resumeid =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(String value) {
            addCriterion("resumeid <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(String value) {
            addCriterion("resumeid >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(String value) {
            addCriterion("resumeid >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(String value) {
            addCriterion("resumeid <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(String value) {
            addCriterion("resumeid <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLike(String value) {
            addCriterion("resumeid like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotLike(String value) {
            addCriterion("resumeid not like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<String> values) {
            addCriterion("resumeid in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<String> values) {
            addCriterion("resumeid not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(String value1, String value2) {
            addCriterion("resumeid between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(String value1, String value2) {
            addCriterion("resumeid not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andResumecontentIsNull() {
            addCriterion("resumecontent is null");
            return (Criteria) this;
        }

        public Criteria andResumecontentIsNotNull() {
            addCriterion("resumecontent is not null");
            return (Criteria) this;
        }

        public Criteria andResumecontentEqualTo(String value) {
            addCriterion("resumecontent =", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentNotEqualTo(String value) {
            addCriterion("resumecontent <>", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentGreaterThan(String value) {
            addCriterion("resumecontent >", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentGreaterThanOrEqualTo(String value) {
            addCriterion("resumecontent >=", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentLessThan(String value) {
            addCriterion("resumecontent <", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentLessThanOrEqualTo(String value) {
            addCriterion("resumecontent <=", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentLike(String value) {
            addCriterion("resumecontent like", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentNotLike(String value) {
            addCriterion("resumecontent not like", value, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentIn(List<String> values) {
            addCriterion("resumecontent in", values, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentNotIn(List<String> values) {
            addCriterion("resumecontent not in", values, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentBetween(String value1, String value2) {
            addCriterion("resumecontent between", value1, value2, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumecontentNotBetween(String value1, String value2) {
            addCriterion("resumecontent not between", value1, value2, "resumecontent");
            return (Criteria) this;
        }

        public Criteria andResumedateIsNull() {
            addCriterion("resumeDate is null");
            return (Criteria) this;
        }

        public Criteria andResumedateIsNotNull() {
            addCriterion("resumeDate is not null");
            return (Criteria) this;
        }

        public Criteria andResumedateEqualTo(Date value) {
            addCriterionForJDBCDate("resumeDate =", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("resumeDate <>", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateGreaterThan(Date value) {
            addCriterionForJDBCDate("resumeDate >", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeDate >=", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateLessThan(Date value) {
            addCriterionForJDBCDate("resumeDate <", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resumeDate <=", value, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateIn(List<Date> values) {
            addCriterionForJDBCDate("resumeDate in", values, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("resumeDate not in", values, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeDate between", value1, value2, "resumedate");
            return (Criteria) this;
        }

        public Criteria andResumedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resumeDate not between", value1, value2, "resumedate");
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