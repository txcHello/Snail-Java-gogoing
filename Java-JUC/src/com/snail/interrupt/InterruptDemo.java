package com.snail.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/30 17:21
 * @Version 1.0
 * Desc:
 *
 * //通过变量 修改是程序停止
 */
public class InterruptDemo {
    static  volatile  boolean isStop = false;
    public static void main(String[] args) {

         new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (isStop) {

                        System.out.println( Thread.currentThread().getName() + "\t isStop被修改为True , 程序停止！！");
    break;
                    }
                    System.out.println("------- hello world!!!");
                }
            }
        }, "t1").start();


        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            isStop =true ;
        } ,"t2").start();
    }
}
