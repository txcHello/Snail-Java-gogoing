package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 15:54
 * @Version 1.0
 * Desc:
 *  验证 数据赋值  只是复制了数据的引用；
 */
public class InitiationArray {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 ;
        a2 =a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i]=i*2;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
