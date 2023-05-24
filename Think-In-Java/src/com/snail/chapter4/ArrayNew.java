package com.snail.chapter4;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Administrator
 * @Date 2023/5/10 16:05
 * @Version 1.0
 * Desc:
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[]  arr = new int[random.nextInt(20)] ;

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
