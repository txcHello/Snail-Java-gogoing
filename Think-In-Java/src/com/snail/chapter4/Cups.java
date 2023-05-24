package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 15:44
 * @Version 1.0
 * Desc:
 */
public class Cups {
    static Cup  cup ;
    static Cup cup1 ;
    static {
        cup = new Cup(1);
        cup1 =new Cup(2);
    }
    Cups(){
        System.out.println("Cups");
    }
}
