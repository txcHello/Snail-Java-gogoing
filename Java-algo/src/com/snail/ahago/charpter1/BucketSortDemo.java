package com.snail.ahago.charpter1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Administrator
 * @Date 2023/5/11 9:42
 * @Version 1.0
 * Desc:
 *   题目
 *   学生考试 试卷分满分为10分；
 *   根据学生成绩排序
 *
 *   桶排序：
 *   时间 复杂度 O(m+n): m为学生个数，n为桶的大小
 *
 *   浪费空间，不能知道人名
 */
public class BucketSortDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学习成绩");
        String next = scanner.next();
        String[] split = next.split(",");

        //根据学生成绩最大值：创建 一样长度的数组
        int[] arr  = new int[11];
        System.out.println("数组长度"+arr.length);
        //将学生成绩 相当于数组的索引值，如果 A学生 得 1分，则 arr[1] =1,如果 B学生 也得1分 则 arr[1]=2;
        for (int i = 0; i < split.length; i++) {
            int i1 = Integer.parseInt(split[i]);
            arr[i1] +=1;
        }

        for (int i = arr.length; i >0 ; i--) {

            for (int j = 0; j < arr[i-1]; j++) {
                System.out.println(i-1);
            }
        }



    }
}
