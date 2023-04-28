package com.snail.lockSupport;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/31 14:14
 * @Version 1.0
 * Desc:
 *   先启动notify 线程  在进行等待效果；
 *
 *
 *   程序一直在等待状态， 必须先执行wait 再执行wait 方法；
 */
public class LockSupportDemo2 {
    public static void main(String[] args) {
        Object objectLock = new Object();

        new Thread( ()->{

            try {
                TimeUnit.MICROSECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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


        new Thread(()->{
            synchronized (objectLock){
                objectLock.notify();

                System.out.println( Thread.currentThread().getName() + "\t 发出通知");
            }
        },"t2").start();
    }
}
