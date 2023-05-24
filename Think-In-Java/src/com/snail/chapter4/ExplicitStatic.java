package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 15:45
 * @Version 1.0
 * Desc:
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup.f(12);
    }
   // static  Cups cups1= new Cups();
    //static  Cups cups2 =new Cups();
}
