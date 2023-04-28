package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/21 21:08
 * @Version 1.0
 * Desc:
 *
 *     5_6.
 *     都换成静态同步方法，锁为类锁
 *     普通同步方法 锁为对象。
 *     对于同步代码块，锁的是synchronized 括号内的对象
 *    换成两个对象后,不是同一把锁。
 *
 *
 */
public class Lock5Demo {

    public static void main(String[] args) throws InterruptedException {
        Phone5 phone1 = new Phone5();
        Phone5 phone2 = new Phone5();
        new Thread(()->{
            phone1 .sendMail();
        },"a").start();
        //保准线程的启动顺序
        TimeUnit.SECONDS.sleep(2 );
        new Thread(new Runnable() {
            @Override
            public void run() {

                //phone1.sendSMS();
                phone2.sendSMS();
            }
        },"b").start();
    }
}

class Phone5 {
   public  static synchronized void sendMail()  {
       try {
           TimeUnit.SECONDS.sleep(4 );
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("-----------sendMail");
   }
   public  static  synchronized void  sendSMS(){
       System.out.println("-----sendSmS" );
   }

   public void hello(){
       System.out.println("hello");
   }
}

