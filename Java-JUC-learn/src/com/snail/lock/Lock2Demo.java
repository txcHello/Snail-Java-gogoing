package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/21 21:08
 * @Version 1.0
 * Desc:
 *
 *    2. 在资源类SendMail 加入暂停三秒钟，请问先打印邮件还是短信 ？
 *
 *    仍然 先打印 mail 在打印 短信
 *     1-2 现象总结：
 *     笔记总结：一个对象里面如果有多个synchronized 方法，某个时刻内，只要一个线程去调用其中的一个synchronized方法;
 *    其他线程都只能等待
 *
 *    也就是说：某一个时刻，只能执行唯一的线程去访问这些Synchronized 的方法
 *    锁的是当前对象this,被锁定后 其他的线程，都不能进入当前对象的其他的synchronized方法
 *
 */
public class Lock2Demo {

    public static void main(String[] args) throws InterruptedException {
        Phone1 phone2 = new Phone1();
        new Thread(()->{
            phone2.sendMail();
        },"a").start();
        //保准线程的启动顺序
        TimeUnit.SECONDS.sleep(2 );

        new Thread(new Runnable() {
            @Override
            public void run() {
                phone2.sendSMS();
            }
        },"b").start();
    }

}

class Phone2 {
   public   synchronized void sendMail() throws InterruptedException {
       TimeUnit.SECONDS.sleep(2);
       System.out.println("-----------sendMail");
   }
   public   synchronized void  sendSMS(){
       System.out.println("-----sendSmS" );
   }
   public void hello(){
       System.out.println("hello");
   }
}

