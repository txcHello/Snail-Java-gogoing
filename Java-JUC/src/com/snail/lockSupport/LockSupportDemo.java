package com.snail.lockSupport;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/31 14:14
 * @Version 1.0
 * Desc:
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        Object objectLock = new Object();

        new Thread( ()->{
            synchronized (objectLock){
                System.out.println(Thread.currentThread().getName() +"\t ----come in ");


                try {
                    objectLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName() + " \t  被唤醒！！！");
            }
        },"t1" ).start();

        try {
            TimeUnit.MICROSECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            synchronized (objectLock){
                objectLock.notify();

                System.out.println( Thread.currentThread().getName() + "\t 发出通知");
            }
        },"t2").start();
    }
}
