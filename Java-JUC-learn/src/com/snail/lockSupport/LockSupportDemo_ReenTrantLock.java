package com.snail.lockSupport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Administrator
 * @Date 2022/7/31 14:14
 * @Version 1.0
 * Desc:
 *   通过 ReenTrantLock  方式实现 等待唤醒；
 */
public class LockSupportDemo_ReenTrantLock {
    public static void main(String[] args) {


        ReentrantLock lock  = new ReentrantLock();
        Condition condition = lock.newCondition();


        new Thread(()->{

            lock.lock();
            try {

                System.out.println(Thread.currentThread().getName() +  "\t  come in !!!!!");
                condition.await();

                System.out.println(Thread.currentThread().getName() + "\t  被唤醒！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }




        },"t1").start();

        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{

            lock.lock();
try {
    condition.signal();
    System.out.println(Thread.currentThread().getName() + "\t  发出通知");
}finally {

    lock.unlock();
}


        },"t2").start();


    }
}
