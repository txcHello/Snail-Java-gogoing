package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/25 11:09
 * @Version 1.0
 * Desc:
 */
public class Demo {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();

        System.out.println(sup.dynamicGet());
        System.out.println();
        StaticSub sub = new StaticSub();
        System.out.println(sub.dynamicGet());
        System.out.println();

    }
}
