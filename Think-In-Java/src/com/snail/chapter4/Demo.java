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
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();

        System.out.println("_______________________________________________________________________________________________________");
        House house = new House();
          house.f();

        System.out.println("--------------------------------------------------");
        Cuppoard cuppoard = new Cuppoard();
    }

}
