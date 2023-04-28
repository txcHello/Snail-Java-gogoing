package com.snail.app;

import java.util.concurrent.*;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 */
public class CompletableFutureBuildDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //1.
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },executorService);
        System.out.println(voidCompletableFuture.get());
        executorService.shutdown();
    }
}
