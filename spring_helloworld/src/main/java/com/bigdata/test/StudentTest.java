package com.bigdata.test;

import com.bigdata.pojo.Person;
import com.bigdata.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Administrator
 * @Date 2022/8/19 23:40
 * @Version 1.0
 * Desc:
 */
public class StudentTest {
    @Test
    public void test(){
       ApplicationContext ioc  = new ClassPathXmlApplicationContext("applicationContext.xml");


        Student studentTwo = (Student) ioc.getBean("studentOne");

        System.out.println(studentTwo);

    }

}
