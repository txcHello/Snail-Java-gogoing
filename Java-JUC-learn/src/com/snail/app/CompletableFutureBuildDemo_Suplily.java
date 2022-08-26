package com.snail.app;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 */
public class CompletableFutureBuildDemo_Suplily {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //1.
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {

                System.out.println(Thread.currentThread().getName());

                try {
                    TimeUnit.MILLISECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "hello supplyAsync";
            }
        });
        System.out.println(stringCompletableFuture.get());
        executorService.shutdown();
    }
}
