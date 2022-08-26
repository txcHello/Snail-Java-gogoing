package com.bigdata.test;

import com.bigdata.pojo.Clazz;
import com.bigdata.pojo.HelloWorld;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Administrator
 * @Date 2022/8/19 1:02
 * @Version 1.0
 * Desc:
 */
public class HelloWorldTest {

    @Test
    public void test(){
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloworld = (HelloWorld)ioc.getBean("helloWorld");
        helloworld.sayHello();

        Clazz clazzone = ioc.getBean("clazzone", Clazz.class);

        System.out.println(clazzone);

    }
}
