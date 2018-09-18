package com.jy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andProductTitleIsNull() {
            addCriterion("product_title is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("product_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("product_title =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("product_title <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("product_title >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_title >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("product_title <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("product_title <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("product_title like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("product_title not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("product_title in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("product_title not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("product_title between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("product_title not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNull() {
            addCriterion("product_pic is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNotNull() {
            addCriterion("product_pic is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicEqualTo(String value) {
            addCriterion("product_pic =", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotEqualTo(String value) {
            addCriterion("product_pic <>", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThan(String value) {
            addCriterion("product_pic >", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThanOrEqualTo(String value) {
            addCriterion("product_pic >=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThan(String value) {
            addCriterion("product_pic <", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThanOrEqualTo(String value) {
            addCriterion("product_pic <=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLike(String value) {
            addCriterion("product_pic like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotLike(String value) {
            addCriterion("product_pic not like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicIn(List<String> values) {
            addCriterion("product_pic in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotIn(List<String> values) {
            addCriterion("product_pic not in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicBetween(String value1, String value2) {
            addCriterion("product_pic between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotBetween(String value1, String value2) {
            addCriterion("product_pic not between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Byte value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Byte value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Byte value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Byte value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Byte value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Byte> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Byte> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Byte value1, Byte value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceIsNull() {
            addCriterion("product_old_price is null");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceIsNotNull() {
            addCriterion("product_old_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceEqualTo(Double value) {
            addCriterion("product_old_price =", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceNotEqualTo(Double value) {
            addCriterion("product_old_price <>", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceGreaterThan(Double value) {
            addCriterion("product_old_price >", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_old_price >=", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceLessThan(Double value) {
            addCriterion("product_old_price <", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_old_price <=", value, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceIn(List<Double> values) {
            addCriterion("product_old_price in", values, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceNotIn(List<Double> values) {
            addCriterion("product_old_price not in", values, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceBetween(Double value1, Double value2) {
            addCriterion("product_old_price between", value1, value2, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductOldPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_old_price not between", value1, value2, "productOldPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIsNull() {
            addCriterion("product_now_price is null");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIsNotNull() {
            addCriterion("product_now_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceEqualTo(BigDecimal value) {
            addCriterion("product_now_price =", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_now_price <>", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceGreaterThan(BigDecimal value) {
            addCriterion("product_now_price >", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_now_price >=", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceLessThan(BigDecimal value) {
            addCriterion("product_now_price <", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_now_price <=", value, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceIn(List<BigDecimal> values) {
            addCriterion("product_now_price in", values, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_now_price not in", values, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_now_price between", value1, value2, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductNowPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_now_price not between", value1, value2, "productNowPrice");
            return (Criteria) this;
        }

        public Criteria andProductCountryIsNull() {
            addCriterion("product_country is null");
            return (Criteria) this;
        }

        public Criteria andProductCountryIsNotNull() {
            addCriterion("product_country is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountryEqualTo(String value) {
            addCriterion("product_country =", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryNotEqualTo(String value) {
            addCriterion("product_country <>", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryGreaterThan(String value) {
            addCriterion("product_country >", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryGreaterThanOrEqualTo(String value) {
            addCriterion("product_country >=", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryLessThan(String value) {
            addCriterion("product_country <", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryLessThanOrEqualTo(String value) {
            addCriterion("product_country <=", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryLike(String value) {
            addCriterion("product_country like", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryNotLike(String value) {
            addCriterion("product_country not like", value, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryIn(List<String> values) {
            addCriterion("product_country in", values, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryNotIn(List<String> values) {
            addCriterion("product_country not in", values, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryBetween(String value1, String value2) {
            addCriterion("product_country between", value1, value2, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCountryNotBetween(String value1, String value2) {
            addCriterion("product_country not between", value1, value2, "productCountry");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNull() {
            addCriterion("product_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNotNull() {
            addCriterion("product_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeEqualTo(Date value) {
            addCriterion("product_createtime =", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotEqualTo(Date value) {
            addCriterion("product_createtime <>", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThan(Date value) {
            addCriterion("product_createtime >", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_createtime >=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThan(Date value) {
            addCriterion("product_createtime <", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_createtime <=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIn(List<Date> values) {
            addCriterion("product_createtime in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotIn(List<Date> values) {
            addCriterion("product_createtime not in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeBetween(Date value1, Date value2) {
            addCriterion("product_createtime between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_createtime not between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNull() {
            addCriterion("product_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNotNull() {
            addCriterion("product_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeEqualTo(Date value) {
            addCriterion("product_updatetime =", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotEqualTo(Date value) {
            addCriterion("product_updatetime <>", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThan(Date value) {
            addCriterion("product_updatetime >", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_updatetime >=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThan(Date value) {
            addCriterion("product_updatetime <", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("product_updatetime <=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIn(List<Date> values) {
            addCriterion("product_updatetime in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotIn(List<Date> values) {
            addCriterion("product_updatetime not in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("product_updatetime between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("product_updatetime not between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
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