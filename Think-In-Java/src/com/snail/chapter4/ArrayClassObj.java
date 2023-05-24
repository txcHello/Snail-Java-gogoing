package com.snail.chapter4;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Administrator
 * @Date 2023/5/10 16:12
 * @Version 1.0
 * Desc:
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(23);
        int i = random.nextInt(23);
        Integer[]  intA = new Integer[i];
        System.out.println(intA.length);

        for (int i1 = 0; i1 < intA.length; i1++) {
            intA[i1]=random.nextInt(500); //自动装箱
        }
        System.out.println(Arrays.toString(intA));

        System.out.println("--------------------------------");
        Integer[] a = {
                new Integer(23),new Integer(2),3
        };
        for (int i1 = 0; i1 < a.length; i1++) {
            System.out.println(a[i1]);
        }
    }
}
