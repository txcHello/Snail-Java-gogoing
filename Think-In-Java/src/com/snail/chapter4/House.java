package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/9 23:47
 * @Version 1.0
 * Desc:
 */
public class House {
    private Window w = new Window(1);

    House() {
        System.out.println("house()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
