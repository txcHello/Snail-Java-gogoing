 package com.snail.interrupt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

 /**
  * @Author Administrator
  * @Date 2022/7/30 17:21
  * @Version 1.0
  * Desc:
  *
  *  通过原子布尔类型  操作
  */
 public class InterruptDemo2 {

     public static void main(String[] args) {

         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < 300; i++) {
                     System.out.println("==========>" + i);
                 }

                 System.out.println("t1线程调用interrupt()后的中断标识02:"+ Thread.currentThread().isInterrupted() );
             }
         }, "t1");
         t1.start();

         System.out.println("t1 线程的默认的中断标识：" + t1.isInterrupted());
         try {
             TimeUnit.MILLISECONDS.sleep(2);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         t1.interrupt();
         System.out.println("t1 调用interrupt 后的中断标识01:" + t1.isInterrupted());

         try {
             TimeUnit.SECONDS.sleep(10);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         System.out.println("t1 调用interrupt()后的中断标识03:" + t1.isInterrupted());


     }
 }
