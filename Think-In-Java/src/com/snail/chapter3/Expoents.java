package com.snail.chapter3;

/**
 * @Author Administrator
 * @Date 2023/4/28 23:46
 * @Version 1.0
 * Desc:
 */
public class Expoents {
    public static void main(String[] args) {
        float v = 1.39e-43f; //代表  1.39e-43  代表   1.39 *  10^-43
        System.out.println(v);
        double v1 = 1.24e-23;
        //按位操作符
        int i = 1 & 1;
        //移位操作符
        int i1 = -1;
        System.out.println(Integer.toBinaryString(i1));
        i1 >>>=10;
        System.out.println(Integer.toBinaryString(i1));
        long i2=-1;
        System.out.println(Long.toBinaryString(i2));
        i2 >>>=10;
        System.out.println(Long.toBinaryString(i2));

        short i3=-1;
        System.out.println(Integer.toBinaryString(i3));
        i3 >>>=10;
        System.out.println(Integer.toBinaryString(i3));



    }
}
