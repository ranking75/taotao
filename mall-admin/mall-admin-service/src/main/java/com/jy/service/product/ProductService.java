package com.jy.service.product;

import com.jy.pojo.Product;
import com.jy.request.product.ProductRequest;
import com.jy.response.QueryResult;

import java.util.List;

public interface ProductService {
    QueryResult<Product> queryProductByProductType(ProductRequest productRequest);
}
