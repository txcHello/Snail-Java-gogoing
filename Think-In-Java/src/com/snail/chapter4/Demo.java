package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/8 1:06
 * @Version 1.0
 * Desc:
 */
public class Demo {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        System.out.println(leaf.increment().increment().i);

         new Person().eat(new Apple());
        Flower flower = new Flower();
    }
}
