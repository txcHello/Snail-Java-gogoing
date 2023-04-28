package com.snail.lock;

/**
 * @Author Administrator
 * @Date 2022/7/30 15:38
 * @Version 1.0
 * Desc:
 *
 *  可重入锁：指的是可以重复可递归调用的锁，在外层使用锁后，在内层依然使用，并且不发送死锁，这样的锁我们称为 可重入锁
 *
 *  在一个sychronized 修饰的方法或代码块的内部调用本类的其他 synchronized 修饰的方法或代码块时，是永远可以得到锁的
 */
public class ReEntryLockDemo {
    public static void main(String[] args) {
        final   Object  o  =  new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    System.out.println("外层  ");

                    synchronized (o){
                        System.out.println( "中层 ");
                    }
                }
            }
        },"ta").start();

    }
}
