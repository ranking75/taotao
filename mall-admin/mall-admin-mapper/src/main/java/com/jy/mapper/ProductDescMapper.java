package com.jy.mapper;

import java.util.List;

import com.jy.pojo.ProductDesc;
import com.jy.pojo.ProductDescExample;
import org.apache.ibatis.annotations.Param;

public interface ProductDescMapper {
    int countByExample(ProductDescExample example);

    int deleteByExample(ProductDescExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    List<ProductDesc> selectByExample(ProductDescExample example);

    ProductDesc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}