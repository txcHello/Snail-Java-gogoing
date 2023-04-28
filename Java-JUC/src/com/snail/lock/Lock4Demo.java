package com.snail.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author Administrator
 * @Date 2022/7/21 21:08
 * @Version 1.0
 * Desc:
 *
 *     4.有两部手机，请问先打印邮件还是短信
 *    加普通方法后，发现和同步锁无关；
 *
 *   换成两个对象后,不是同一把锁。
 *
 *
 */
public class Lock4Demo {

    public static void main(String[] args) throws InterruptedException {
        Phone4 phone1 = new Phone4();
        Phone4  phone2= new Phone4();;
        new Thread(()->{
            phone1 .sendMail();
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

class Phone4 {
   public   synchronized void sendMail()  {
       try {
           TimeUnit.SECONDS.sleep(4 );
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("-----------sendMail");
   }
   public   synchronized void  sendSMS(){
       System.out.println("-----sendSmS" );
   }

   public void hello(){
       System.out.println("hello");
   }
}

