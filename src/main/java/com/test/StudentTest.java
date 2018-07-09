package com.test;

import com.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Author Lee
 * @Date 2018/7/9 13:11
 */
public class StudentTest {

    @Test
    void c() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
        System.out.println(context.getBean("studentBean"));
    }
}
