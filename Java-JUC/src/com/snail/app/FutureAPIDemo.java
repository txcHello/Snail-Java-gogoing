package com.snail.app;

import java.util.concurrent.*;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:13
 * @Version 1.0
 * Desc:
 */
public class FutureAPIDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        FutureTask<String> stringFutureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "\t  --------come in ");
                TimeUnit.SECONDS.sleep(5);
                return "task over ";
            }
        });
        Thread t1 = new Thread(stringFutureTask, "t1");
        t1.start();

        System.out.println(Thread.currentThread().getName() + "\t  -----忙其他任务了");
        /**
         * get()方法会导致程序堵塞， 一旦调用 不见不散， 容易程序堵塞。 一般放在程序最后
         */
        System.out.println(stringFutureTask.get());
        System.out.println(stringFutureTask.get(3,TimeUnit.SECONDS));
    }
}
