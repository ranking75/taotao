package com.jy.request.product;

import com.jy.request.BaseRequest;

import java.io.Serializable;

public class ProductRequest extends BaseRequest implements Serializable {


    private static final long serialVersionUID = -2106102331722129999L;
    //商品类型id
    private int productType;

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }
}
