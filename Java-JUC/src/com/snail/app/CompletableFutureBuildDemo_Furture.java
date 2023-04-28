package com.snail.app;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 */
public class CompletableFutureBuildDemo_Furture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                System.out.println(Thread.currentThread().getName() + "---- call in");

                int result = ThreadLocalRandom.current().nextInt();

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1秒钟后出结果:" + result);
                return result;
            }
        });

        System.out.println(Thread.currentThread().getName() + "线程先去忙其他任务");

        System.out.println(integerCompletableFuture.get());
    }
}
