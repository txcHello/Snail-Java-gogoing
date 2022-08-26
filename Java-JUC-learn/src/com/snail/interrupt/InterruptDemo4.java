 package com.snail.interrupt;

import java.util.concurrent.TimeUnit;

 /**
  * @Author Administrator
  * @Date 2022/7/30 17:21
  * @Version 1.0
  * Desc:
  *
  *  通过原子布尔类型  操作
  */
 public class InterruptDemo4 {

     public static void main(String[] args) {
         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());
         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());
         System.out.println("---   1");
         Thread.currentThread().interrupt();
         System.out.println("---   2");


         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());
         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());
         System.out.println("---   3");
         Thread.currentThread().interrupt();
         System.out.println("---   4");

         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());
         System.out.println(Thread.currentThread().getName() +"\t" + Thread.interrupted());



     }
 }
