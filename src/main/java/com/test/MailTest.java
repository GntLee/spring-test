package com.test;

import com.mail.MailBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Lee
 * @Date 2018/6/29 18:57
 */
public class MailTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mail.xml");
        MailBean mm = (MailBean) context.getBean("mailMail");
        System.out.println(mm);
        mm.sendMail("mail@first-blood.cn",
                "342418262@qq.com",
                "spring mail",
                "spring mail \n\n 这是一封测试邮件");
    }
}
