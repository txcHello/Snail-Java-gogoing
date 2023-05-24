package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 14:43
 * @Version 1.0
 * Desc:
 */
public class OverridingPrivate extends WithFinals{

    private final void f(){
        System.out.println("Overriding.f()");
    }
    private void g(){
        System.out.println("Overriding.g()");
    }
}
