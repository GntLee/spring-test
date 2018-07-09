## Spring学习笔记

> Spring 注入方式

* 构造函数注入
* setter方法注入
* 注解注入(@Autowired|@Resource)

> Spring Bean 作用域

* singleton--默认
* prototype--每次返回新的实例
* request--每一个实例的作用域都为request范围
* session--每一个实例的作用域都为session范围

> 引入自定义properties
```
<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
    <property name="location">
        <value>mail.properties</value>
    </property>
</bean>
```

> Spring 表达式语言
* 通过注解@Value("xxx") @Value("#{xxx}")注入
* 通过xml注入

> 自动组件扫描注释类型
* @Component – 指示自动扫描组件。
* @Repository – 表示在持久层DAO组件。
* @Service – 表示在业务层服务组件。
* @Controller – 表示在表示层控制器组件。