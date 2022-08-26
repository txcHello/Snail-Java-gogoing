package com.snail.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Administrator
 * @Date 2022/7/29 17:04
 * @Version 1.0
 * Desc:
 *
 *  资源类,模拟三个售票员卖完50张票
 */
 class Ticket {

    private  int number = 50;
    ReentrantLock lock = new ReentrantLock(true);
    public void  sale(){
        lock.lock(); 
        try {
           if (number >0){
               System.out.println(Thread.currentThread().getName()+"卖出第 : \t " + (number--) + "还剩下:" + number +"; ");
           }
        }finally {
            lock.unlock();
        }
    }

}

public class SaleTicketDemo{
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 55; i++) {
                    ticket.sale();
                }
            }
        },"a").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 55; i++) {
                    ticket.sale();
                }
            }
        },"b").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 55; i++) {
                    ticket.sale();
                }
            }
        },"c").start();
    }
}
