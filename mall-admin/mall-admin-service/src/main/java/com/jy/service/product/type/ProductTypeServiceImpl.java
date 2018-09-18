package com.jy.service.product.type;


import com.jy.mapper.ProductTypeMapper;
import com.jy.pojo.ProductType;
import com.jy.pojo.ProductTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> getProductTypes() {
        ProductTypeExample example = new ProductTypeExample();
        List<ProductType> list = productTypeMapper.selectByExample(example);
        return list;
    }
}
