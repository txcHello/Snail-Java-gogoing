package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/30 16:03
 * @Version 1.0
 * Desc:
 *  死锁是什么？
 *   两个或者两个以上的线程，访问相同资源，而造成相互等待的现象，若无外力干涉那它们将无法执行下去 ;
 *
 *   死锁 产生的原因，
 *   系统资源不足；
 *   进城运行推进的顺序不合适
 *   资源分配不当
 */
public class DeathLockDemo {
    public static void main(String[] args) {
         final  Object a =new Object();
         final  Object b = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    System.out.println(Thread.currentThread().getName() +"\t 自己持有A锁，希望获得b锁");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName() + "\t 成功获得B锁");
                    }
                }
            }
        },"a").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println(Thread.currentThread().getName() +"\t 自己持有B锁，希望获得A锁");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println(Thread.currentThread().getName() + "\t 成功获得A锁");
                    }
                }
            }
        },"b").start();
    }
}
