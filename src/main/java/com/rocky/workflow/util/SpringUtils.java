package com.rocky.workflow.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext ;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       SpringUtils.applicationContext = applicationContext ;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String beanId){
        return getApplicationContext().getBean(beanId);
    }
}
