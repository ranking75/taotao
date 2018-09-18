package com.jy.controller.page;

import com.jy.aop.config.annoation.Config;
import com.jy.aop.config.annoation.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Login("admin")
public class PageController {

    @Config(path = "/xuyi/server")
    private String c;

    @RequestMapping(value = "/page/{url}",method = RequestMethod.GET)
    public String toPage(@PathVariable(value = "url")String url){
        return url;
    }
}
