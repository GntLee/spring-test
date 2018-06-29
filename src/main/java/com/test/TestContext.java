package com.test;

import com.bean.T1;
import com.bean.T2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Author Lee
 * @Date 2018/6/29 16:23
 */
public class TestContext {

    @Test
    void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-auto.xml");

        T2 t2 = (T2) context.getBean("t2");
        System.out.println(t2);
    }
}
