package com.snail.chapter3;

/**
 * @Author Administrator
 * @Date 2023/4/27 23:40
 * @Version 1.0
 * Desc:
 */
public class AutoInc {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i:" +i); //1
        System.out.println("++i: " + ++i);// 2
        System.out.println("i++: " + i++);// 2
        System.out.println("i:"+i); //3

        System.out.println("--i:" + --i); //2
        System.out.println("i-- :" + i--); //2
        System.out.println("i:" + i);//1

    }
}
