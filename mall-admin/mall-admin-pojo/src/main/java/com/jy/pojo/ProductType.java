package com.jy.pojo;

public class ProductType {
    private Integer id;

    private Integer productTypeId;

    private Integer productTypeParentId;

    private String name;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getProductTypeParentId() {
        return productTypeParentId;
    }

    public void setProductTypeParentId(Integer productTypeParentId) {
        this.productTypeParentId = productTypeParentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
