package com.jy.service.product;

import com.github.pagehelper.PageHelper;
import com.jy.mapper.ProductMapper;
import com.jy.pojo.Product;
import com.jy.pojo.ProductExample;
import com.jy.pojo.ProductType;
import com.jy.request.product.ProductRequest;
import com.jy.response.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public QueryResult<Product> queryProductByProductType(ProductRequest request) {
        QueryResult<Product> result = new QueryResult<Product>();

        ProductExample example = new ProductExample();
        PageHelper.startPage(request.getPage(),request.getRows());
        ProductExample.Criteria criteria = example.createCriteria();
        criteria.andProductTypeIdEqualTo(request.getProductType());
        List<Product> list = productMapper.selectByExample(example);
        result.ok();
        result.setPage(request.getPage());
        result.setObj(list);
        result.setCount(list.size());
        return result;
    }
}
