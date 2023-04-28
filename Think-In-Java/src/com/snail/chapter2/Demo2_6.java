package com.snail.chapter2;

/**
 * @Author Administrator
 * @Date 2023/4/27 21:07
 * @Version 1.0
 * Desc:
 * stasticTest1、stasticTest、StasticTest 都指向同一份内存。
 */
public class Demo2_6 {
    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest = staticTest1;
        int i = staticTest.i;
        int i1 = staticTest1.i;

//        System.out.println(i);
//        System.out.println(i1);
//        System.out.println(StaticTest.i++);
//        int i2 = staticTest.i;
//        int i3 = staticTest1.i;
//        System.out.println(i2);
//        System.out.println(i3);
//        System.out.println(StaticTest.i++);

        Incrementable.increment();
    }
}
