package com.snail.app;

import java.util.concurrent.*;

/**
 * @Author Administrator
 * @Date 2022/7/20 19:42
 * @Version 1.0
 * Desc:
 */
public class FutureThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();

        ExecutorService thredPool = Executors.newFixedThreadPool(3);

        //线程1执行任务
        FutureTask<String> task1 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    TimeUnit.MICROSECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "task1 ovar ";
            }
        });

        thredPool.submit(task1) ;
        //线程2执行任务
        FutureTask<String> task2 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    TimeUnit.MICROSECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "task2 ovar ";
            }
        });
        thredPool.submit(task2) ;

        System.out.println(task1.get());
        System.out.println(task2.get());
        //主线程执行
                try {
                    TimeUnit.MICROSECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        long endTime  = System.currentTimeMillis();

        System.out.println(  "----- costTime : " + (endTime -startTime) + "毫秒");

        System.out.println(Thread.currentThread().getName()+ "\t ----end ");


    }

    private static  void m1(){
        //3个任务，只有一个线程处理  耗时多少
        long startTime = System.currentTimeMillis();
        try {TimeUnit.MICROSECONDS.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
        try {TimeUnit.MICROSECONDS.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
        try {TimeUnit.MICROSECONDS.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
        long endTime  = System.currentTimeMillis();

        System.out.println(  "----- costTime : " + (endTime -startTime) + "毫秒");

        System.out.println(Thread.currentThread().getName()+ "\t ----end ");
    }
}
