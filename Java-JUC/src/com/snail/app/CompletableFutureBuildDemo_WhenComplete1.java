package com.snail.app;

import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 */
public class CompletableFutureBuildDemo_WhenComplete1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            CompletableFuture<Integer> exceptionally = CompletableFuture.supplyAsync(new Supplier<Integer>() {
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

                    if (result >5){
                        int i =10/0;
                    }
                    return result;
                }
            },executorService).whenComplete(new BiConsumer<Integer, Throwable>() {
                @Override
                public void accept(Integer integer, Throwable throwable) {
                    if (throwable == null) {
                        System.out.println("计算完成，更新系统updateValue:" + integer);
                    }
                }
            }).exceptionally(new Function<Throwable, Integer>() {
                @Override
                public Integer apply(Throwable throwable) {
                    System.out.println("异常情况:" + throwable.getCause() + "\t" + throwable.getMessage());
                    return null;
                }
            });

            System.out.println(Thread.currentThread().getName() + "线程先去忙其他任务");
        }catch (Exception e ){
            e.printStackTrace();
        }finally {

            executorService.shutdown();
        }



    }
}
