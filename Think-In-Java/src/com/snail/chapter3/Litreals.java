package com.snail.chapter3;

/**
 * @Author Administrator
 * @Date 2023/4/28 23:11
 * @Version 1.0
 * Desc:
 *  直接常量
 *
 */
public class Litreals {

    public static void main(String[] args) {
        int i1= 0x2f;// 0x 代表16进制
        System.out.println( i1);
        System.out.println( Integer.toBinaryString(i1)); //较小类型传递给 Integer.ToBinaryString  会转换为int
        int i2 = 0x2F;
        System.out.println(i2);
        System.out.println(Integer.toBinaryString(i2));
        int i3 =0177; // 0开头 为八进制
        System.out.println(i3);
        System.out.println(Integer.toBinaryString(i3));
        char c = 0xffff;  //max char  hex value
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        byte  b = 0x7f; // max byte hex value
        System.out.println(Integer.toBinaryString(b));
        short s = 0x7fff; // max short value
        System.out.println(Integer.toBinaryString(s));
        long l1 = 200l;
        long l2 =200L;
        float f = 1f;
        float f1 =1F;
        double d = 123.32d;
        double d1 =231323.231D;

        long  l3 = 0x21313;
        System.out.println(Long.toBinaryString(l3));

        long  l4 = 0x21313l;
        System.out.println(Long.toBinaryString(l4));

    }
}
