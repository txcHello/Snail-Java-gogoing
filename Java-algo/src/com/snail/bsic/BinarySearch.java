package com.snail.bsic;

/**
 * @Author Administrator
 * @Date 2023/5/18 22:17
 * @Version 1.0
 * Desc:
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7, 9, 21, 45};
        int i = BinarySearch.binarySearch(arr, 9);
        System.out.println(i);

    }

    public static int binarySearch(int[] arr, int target) {


        int left = 0;
        int right = arr.length - 1;


        while (left <= right) {
           // int mid = (int) ((left + right) / 2);
            int mid = (int) ((left + right) >>> 1); //减少超出数据范围 为负数， 右移 以为

            System.out.println(mid);
            if (arr[mid] > target) {
                right = mid - 1;

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }
        return  -1;
    }
}
