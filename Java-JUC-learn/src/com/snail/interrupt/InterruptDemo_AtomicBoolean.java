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
public class InterruptDemo_AtomicBoolean {
    static  volatile  boolean isStop = false;
    static AtomicBoolean   atomicBoolean =  new AtomicBoolean( false);
    public static void main(String[] args) {

         new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (atomicBoolean.get()) {

                        System.out.println( Thread.currentThread().getName() + "\t atomicBoolean  被修改为True , 程序停止！！");
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
            atomicBoolean.set(true); ;
        } ,"t2").start();
    }
}
