package com.snail.chapter3;

import java.util.Random;

/**
 * @Author Administrator
 * @Date 2023/4/27 23:32
 * @Version 1.0
 * Desc:
 */
public class MathOps {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i,j,k;
        j= random.nextInt(100)+1;
        System.out.println("j = " + j);
        k= random.nextInt(100)+1;
        System.out.println("k = " + k);
        i =j+k;
        System.out.println("j+K = " + i);
    }
}
