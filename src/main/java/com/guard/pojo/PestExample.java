package com.guard.pojo;

import java.util.ArrayList;
import java.util.List;

public class PestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PestExample() {
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

        public Criteria andPestidIsNull() {
            addCriterion("pestid is null");
            return (Criteria) this;
        }

        public Criteria andPestidIsNotNull() {
            addCriterion("pestid is not null");
            return (Criteria) this;
        }

        public Criteria andPestidEqualTo(Integer value) {
            addCriterion("pestid =", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidNotEqualTo(Integer value) {
            addCriterion("pestid <>", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidGreaterThan(Integer value) {
            addCriterion("pestid >", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pestid >=", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidLessThan(Integer value) {
            addCriterion("pestid <", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidLessThanOrEqualTo(Integer value) {
            addCriterion("pestid <=", value, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidIn(List<Integer> values) {
            addCriterion("pestid in", values, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidNotIn(List<Integer> values) {
            addCriterion("pestid not in", values, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidBetween(Integer value1, Integer value2) {
            addCriterion("pestid between", value1, value2, "pestid");
            return (Criteria) this;
        }

        public Criteria andPestidNotBetween(Integer value1, Integer value2) {
            addCriterion("pestid not between", value1, value2, "pestid");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Integer value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Integer value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Integer value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Integer value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Integer value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Integer> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Integer> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Integer value1, Integer value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Integer value1, Integer value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andInfourlIsNull() {
            addCriterion("infourl is null");
            return (Criteria) this;
        }

        public Criteria andInfourlIsNotNull() {
            addCriterion("infourl is not null");
            return (Criteria) this;
        }

        public Criteria andInfourlEqualTo(String value) {
            addCriterion("infourl =", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlNotEqualTo(String value) {
            addCriterion("infourl <>", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlGreaterThan(String value) {
            addCriterion("infourl >", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlGreaterThanOrEqualTo(String value) {
            addCriterion("infourl >=", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlLessThan(String value) {
            addCriterion("infourl <", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlLessThanOrEqualTo(String value) {
            addCriterion("infourl <=", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlLike(String value) {
            addCriterion("infourl like", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlNotLike(String value) {
            addCriterion("infourl not like", value, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlIn(List<String> values) {
            addCriterion("infourl in", values, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlNotIn(List<String> values) {
            addCriterion("infourl not in", values, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlBetween(String value1, String value2) {
            addCriterion("infourl between", value1, value2, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfourlNotBetween(String value1, String value2) {
            addCriterion("infourl not between", value1, value2, "infourl");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andBasicIsNull() {
            addCriterion("basic is null");
            return (Criteria) this;
        }

        public Criteria andBasicIsNotNull() {
            addCriterion("basic is not null");
            return (Criteria) this;
        }

        public Criteria andBasicEqualTo(String value) {
            addCriterion("basic =", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicNotEqualTo(String value) {
            addCriterion("basic <>", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicGreaterThan(String value) {
            addCriterion("basic >", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicGreaterThanOrEqualTo(String value) {
            addCriterion("basic >=", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicLessThan(String value) {
            addCriterion("basic <", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicLessThanOrEqualTo(String value) {
            addCriterion("basic <=", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicLike(String value) {
            addCriterion("basic like", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicNotLike(String value) {
            addCriterion("basic not like", value, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicIn(List<String> values) {
            addCriterion("basic in", values, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicNotIn(List<String> values) {
            addCriterion("basic not in", values, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicBetween(String value1, String value2) {
            addCriterion("basic between", value1, value2, "basic");
            return (Criteria) this;
        }

        public Criteria andBasicNotBetween(String value1, String value2) {
            addCriterion("basic not between", value1, value2, "basic");
            return (Criteria) this;
        }

        public Criteria andBioIsNull() {
            addCriterion("bio is null");
            return (Criteria) this;
        }

        public Criteria andBioIsNotNull() {
            addCriterion("bio is not null");
            return (Criteria) this;
        }

        public Criteria andBioEqualTo(String value) {
            addCriterion("bio =", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioNotEqualTo(String value) {
            addCriterion("bio <>", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioGreaterThan(String value) {
            addCriterion("bio >", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioGreaterThanOrEqualTo(String value) {
            addCriterion("bio >=", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioLessThan(String value) {
            addCriterion("bio <", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioLessThanOrEqualTo(String value) {
            addCriterion("bio <=", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioLike(String value) {
            addCriterion("bio like", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioNotLike(String value) {
            addCriterion("bio not like", value, "bio");
            return (Criteria) this;
        }

        public Criteria andBioIn(List<String> values) {
            addCriterion("bio in", values, "bio");
            return (Criteria) this;
        }

        public Criteria andBioNotIn(List<String> values) {
            addCriterion("bio not in", values, "bio");
            return (Criteria) this;
        }

        public Criteria andBioBetween(String value1, String value2) {
            addCriterion("bio between", value1, value2, "bio");
            return (Criteria) this;
        }

        public Criteria andBioNotBetween(String value1, String value2) {
            addCriterion("bio not between", value1, value2, "bio");
            return (Criteria) this;
        }

        public Criteria andAgrIsNull() {
            addCriterion("agr is null");
            return (Criteria) this;
        }

        public Criteria andAgrIsNotNull() {
            addCriterion("agr is not null");
            return (Criteria) this;
        }

        public Criteria andAgrEqualTo(String value) {
            addCriterion("agr =", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrNotEqualTo(String value) {
            addCriterion("agr <>", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrGreaterThan(String value) {
            addCriterion("agr >", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrGreaterThanOrEqualTo(String value) {
            addCriterion("agr >=", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrLessThan(String value) {
            addCriterion("agr <", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrLessThanOrEqualTo(String value) {
            addCriterion("agr <=", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrLike(String value) {
            addCriterion("agr like", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrNotLike(String value) {
            addCriterion("agr not like", value, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrIn(List<String> values) {
            addCriterion("agr in", values, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrNotIn(List<String> values) {
            addCriterion("agr not in", values, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrBetween(String value1, String value2) {
            addCriterion("agr between", value1, value2, "agr");
            return (Criteria) this;
        }

        public Criteria andAgrNotBetween(String value1, String value2) {
            addCriterion("agr not between", value1, value2, "agr");
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