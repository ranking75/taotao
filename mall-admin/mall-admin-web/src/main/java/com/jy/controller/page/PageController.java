package com.jy.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 视图跳转类
 */
@Controller
public class PageController {

    @RequestMapping(value = "/page/{url}",method = RequestMethod.GET)
    public String toPage(@PathVariable(value = "url")String url){
        return url;
    }
}
