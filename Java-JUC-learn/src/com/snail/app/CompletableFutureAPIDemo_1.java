package com.snail.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 * 对结果进行处理
 *
 */
public class CompletableFutureAPIDemo_1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "abc";
            }
        }).thenApply(new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println(1);
                return s + "aaa";
            }
        });
        TimeUnit.SECONDS.sleep(1);
        //等待2秒
        //System.out.println(stringCompletableFuture.get());
        //System.out.println(stringCompletableFuture.get(2,TimeUnit.SECONDS));
        //System.out.println(stringCompletableFuture.join());
        //System.out.println(stringCompletableFuture.getNow("hello"));
        System.out.println(stringCompletableFuture.complete("complete")+ "\t" + stringCompletableFuture.join());
    }
}
