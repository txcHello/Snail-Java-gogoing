package com.snail.app;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/20 0:29
 * @Version 1.0
 * Desc:
 */
public class DamenDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t 开始运行" +
                    (Thread.currentThread().isDaemon() ? "守护线程" : "用户线程"));
            while (true){

            }
        }, "t1");
        t1.setDaemon(true);
        t1.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "\t  ---end 主线程" );

    }
}
