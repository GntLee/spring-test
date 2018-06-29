package com.test;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Author Lee
 * @Date 2018/6/29 10:45
 */
public class UserTest {

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user);
//    }

    @Test
    void user() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.findAll();
        System.out.println(userDao.findAll().size());
    }

    @Test
    void save() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = new User("王五","123456","别姬","男",20);
        userDao.save(user);
    }

    @Test
    void t() {
        Integer a=1,b=1,c=129;int d=129;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
