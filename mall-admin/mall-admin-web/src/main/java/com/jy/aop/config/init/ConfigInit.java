package com.jy.aop.config.init;

import com.jy.aop.config.annoation.Config;
import com.jy.aop.config.annoation.Login;
import com.jy.controller.page.PageController;
import com.jy.service.product.ProductService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConfigInit implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        Map<String, Object> serviceBeanMap = ctx.getBeansWithAnnotation(Config.class);
            for (Object serviceBean : serviceBeanMap.values()) {
                String path = serviceBean.getClass().getAnnotation(Config.class).path();
            }
    }
}
