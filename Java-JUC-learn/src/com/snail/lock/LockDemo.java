package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/21 21:08
 * @Version 1.0
 * Desc:
 */
public class LockDemo {

    public static void main(String[] args) throws InterruptedException {
        Phone1 phone1 = new Phone1();
        Phone1 phone2 = new Phone1();
        new Thread(()->{
            phone1.sendMail();
        },"a").start();
        //保准线程的启动顺序
        TimeUnit.SECONDS.sleep(2 );

        new Thread(new Runnable() {
            @Override
            public void run() {
                phone2.hello();
                phone2.sendSMS();
            }
        },"b").start();
    }
}

/**
 * 题目  谈谈你对多线程锁的理解，
 * 口诀：线程  操作 资源类
 * 案例说明：
 *  1.标准访问有ab两个资源类，请问先打印邮件还是短信 ？
 *
 *  2.在资源类SendMail 加入暂停三秒钟，请问先打印邮件还是短信 ？
 *
 *  3，添加一个普通的hello方法，请问先打印邮件还是hello
 *
 *  4.有两部手机，请问先打印邮件还是短信
 *
 *  5.有两个静态同步方法 有1部手机，请问先打印邮件还是短信
 *
 *  6.有两个静态同步方法 有两部手机， 请问先打印邮件还是短信
 *
 *  7.有一个静态同步方法，有一个普通同步方法， 有1部手机，先打印哪个 ？
 *
 *  8.有一个静态同步方法，有一个普通同步方法， 有2部手机，先打印哪个 ？
 */
