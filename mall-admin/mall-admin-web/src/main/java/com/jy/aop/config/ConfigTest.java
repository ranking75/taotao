package com.jy.aop.config;

import com.jy.aop.config.annoation.Config;
import org.springframework.stereotype.Component;

@Component
public class ConfigTest {
    @Config(path = "/xxx")
    private String t;
}
