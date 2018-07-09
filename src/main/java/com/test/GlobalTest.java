package com.test;

import com.service.GlobalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Author Lee
 * @Date 2018/7/9 12:00
 */
public class GlobalTest {

    @Test
    void s() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-global.xml");
        GlobalService globalService = (GlobalService) context.getBean("globalService");
        globalService.setMessage("测试注入。。。");
        System.out.println(globalService.getMessage());

        GlobalService globalService1 = (GlobalService) context.getBean("globalService");
        globalService1.setMessage("测试注入1。。。");
        System.out.println(globalService1.getMessage());
    }
}
