package com.snail.lockSupport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author Administrator
 * @Date 2022/7/31 14:14
 * @Version 1.0
 * Desc:
 */
public class LockSupportDemo_Support {
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName() + "\t ----come in ");
            LockSupport.park();
            System.out.println(Thread.currentThread().getName() + " \t  被唤醒！！！");

        }, "t1");

        t1.start();

        try {
            TimeUnit.MICROSECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
               LockSupport.unpark(t1);
                System.out.println( Thread.currentThread().getName() + "\t 发出通知");

        },"t2").start();
    }
}
