package com.snail.ahago.charpter1;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2023/5/11 10:17
 * @Version 1.0
 * Desc:
 *   冒泡排序
 *   思想:每次和相邻的数据排序如果不符合大小 就和相邻的数据进行交换。
 *   核心: 双重嵌套循环
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        // 需要排序数组
        int[]  arr1 = {2,3,62,3,1,4,9,6,3};

        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j <arr1.length-1-i ; j++) {
                if (arr1[j]<arr1[j+1]){
                    int tmp = arr1[j];
                    arr1[j] =arr1[j+1];
                    arr1[j+1] =tmp;
                }
            }


        }

        System.out.println(Arrays.toString(arr1));
    }
}
