package com.snail.chapter6;

/**
 * @Author Administrator
 * @Date 2023/5/11 0:05
 * @Version 1.0
 * Desc:
 */
public class Lunch {
    void testPrivate(){
    //     new Soup1();
    }

    void  testStatic(){
        Soup1.createSoup1();  //返回对象的引用
    }
    void  testSingleton(){
        Soup2.access().f();
    }
}
