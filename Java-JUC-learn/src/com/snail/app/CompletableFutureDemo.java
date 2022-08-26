package com.snail.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author Administrator
 * @Date 2022/7/20 6:34
 * @Version 1.0
 * Desc:
 */
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> vFutureTask = new FutureTask<>(new Mythread2());
        Thread t1 = new Thread(vFutureTask, "t1");
        t1.start();
      //  System.out.println(vFutureTask.get());
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {

    }
}

class Mythread2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("come in call");
        return  "hello  callable" ;
    }
}