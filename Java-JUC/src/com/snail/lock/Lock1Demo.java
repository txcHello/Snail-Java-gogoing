package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/21 21:08
 * @Version 1.0
 * Desc:
 *
 *    *  1.标准访问有ab两个资源类，请问先打印邮件还是短信 ？
 *
 *
 *
 */
public class Lock1Demo {

    public static void main(String[] args) throws InterruptedException {
        Phone1 phone1 = new Phone1();
        new Thread(()->{
            phone1.sendMail();
        },"a").start();
        //保准线程的启动顺序
        TimeUnit.SECONDS.sleep(2 );

        new Thread(new Runnable() {
            @Override
            public void run() {
                phone1.sendSMS();
            }
        },"b").start();
    }
}
 class Phone1 {
    public   synchronized void sendMail(){
        System.out.println("-----------sendMail");
    }
    public   synchronized void  sendSMS(){
        System.out.println("-----sendSmS" );
    }
    public void hello(){
        System.out.println("hello");
    }
}

