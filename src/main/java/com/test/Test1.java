package com.test;

import com.dao.Test1Dao;
import com.service.impl.Test1Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.testng.annotations.Test;

/**
 * @Author Lee
 * @Date 2018/6/29 17:16
 */
public class Test1 {

    @Bean(name = "test1Bean")
    public Test1Dao test1Dao() {
        return new Test1Impl();
    }


    @Test
    void say() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test1.class);
        Test1Dao obj = (Test1Dao) context.getBean("test1Bean");
        obj.say();
    }
}
