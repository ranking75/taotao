package com.jy.controller.product;

import com.jy.pojo.Product;
import com.jy.request.product.ProductRequest;
import com.jy.response.QueryResult;
import com.jy.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/queryProductByProductType",method = RequestMethod.POST)
    @ResponseBody
    public QueryResult<Product> queryProductByProductType(
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "rows",defaultValue = "20") int rows,
            int type){
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductType(type);
        productRequest.setPage(page);
        productRequest.setRows(rows);
        QueryResult<Product> productQueryResult = productService.queryProductByProductType(productRequest);
        return productQueryResult;
    }
}
