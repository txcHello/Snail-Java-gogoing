package com.snail.chapter2;

/**
 * @Author Administrator
 * @Date 2023/4/27 21:48
 * @Version 1.0
 * Desc:
 */
public class ShowProperties {
    public static void main(String[] args) {
         System.getProperties().list(System.out);
         System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.libary.path"));
    }
}
