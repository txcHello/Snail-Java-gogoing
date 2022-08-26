package com.snail.app;

import java.util.concurrent.*;

/**
 * @Author Administrator
 * @Date 2022/7/20 21:13
 * @Version 1.0
 * Desc:
 */
public class FutureAPIDemo_Done {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
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
        while (true){
            if (stringFutureTask.isDone()){
                System.out.println(stringFutureTask.get());
                break;
            }else {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("不要催啦");
            }
        }
    }
}
