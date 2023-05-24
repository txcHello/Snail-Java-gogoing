package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/23 23:25
 * @Version 1.0
 * Desc:
 */
public class Cartoon extends Drawing{
    public  Cartoon(){
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
