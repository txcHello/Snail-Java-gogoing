package com.snail.app;

import java.text.StringCharacterIterator;
import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:52
 * @Version 1.0
 * Desc:
 *
 *  获得返回结果
 */
public class CompletableFutureAPIDemo {
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
