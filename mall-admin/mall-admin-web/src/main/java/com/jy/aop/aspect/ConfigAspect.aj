package com.jy.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConfigAspect {

    @Pointcut("@annotation(com.jy.aop.config.annoation.Config)")
    public void logPointCut() {
    }


}
