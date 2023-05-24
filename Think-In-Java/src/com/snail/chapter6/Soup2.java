package com.snail.chapter6;

/**
 * @Author Administrator
 * @Date 2023/5/11 0:02
 * @Version 1.0
 * Desc:
 */
public class Soup2 {
    private Soup2(){

    }
    private static Soup2 ps1  =new Soup2();

    public static Soup2 access(){
        return  ps1;
    }
    public  void f(){

    }
}
