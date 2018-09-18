package com.jy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long id;

    private Long productId;

    private String productName;

    private String productTitle;

    private String productPic;

    private Byte productStatus;

    private Double productOldPrice;

    private BigDecimal productNowPrice;

    private String productCountry;

    private Date productCreatetime;

    private Date productUpdatetime;

    private Integer productTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public Byte getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Byte productStatus) {
        this.productStatus = productStatus;
    }

    public Double getProductOldPrice() {
        return productOldPrice;
    }

    public void setProductOldPrice(Double productOldPrice) {
        this.productOldPrice = productOldPrice;
    }

    public BigDecimal getProductNowPrice() {
        return productNowPrice;
    }

    public void setProductNowPrice(BigDecimal productNowPrice) {
        this.productNowPrice = productNowPrice;
    }

    public String getProductCountry() {
        return productCountry;
    }

    public void setProductCountry(String productCountry) {
        this.productCountry = productCountry == null ? null : productCountry.trim();
    }

    public Date getProductCreatetime() {
        return productCreatetime;
    }

    public void setProductCreatetime(Date productCreatetime) {
        this.productCreatetime = productCreatetime;
    }

    public Date getProductUpdatetime() {
        return productUpdatetime;
    }

    public void setProductUpdatetime(Date productUpdatetime) {
        this.productUpdatetime = productUpdatetime;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}