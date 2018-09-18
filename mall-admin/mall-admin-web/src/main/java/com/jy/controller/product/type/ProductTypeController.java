package com.jy.controller.product.type;

import com.jy.pojo.ProductType;
import com.jy.response.Result;
import com.jy.service.product.type.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping(value = "/getAllProductType",method = RequestMethod.GET)
    @ResponseBody
    public Result<ProductType> getAllProductType(){
        Result<ProductType> result = new Result<ProductType>();
        List<ProductType> list = productTypeService.getProductTypes();
        result.setObjs(list);
        result.ok();
        return result;
    }
}
