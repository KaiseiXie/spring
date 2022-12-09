package com.syashiei.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testFirstSpringTest(){
        //第一步：获取spring对象
        //applicationcontext翻译为应用上下文,其实就是spring容器，是一个接口，接口下有很多实现类，其中有一个叫做classpathxmlapplicationcontext
        //这行代码只要执行，就相当于启动了spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");


        //第二部：根据beanid获取spring的bean对象，获取而非创建，因为上一步已创建
        Object userBean = applicationContext.getBean("userBean");
        System.out.println("HelloWorld!");
    }
}
