package com.snail.lock;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @Author Administrator
 * @Date 2022/7/22 17:47
 * @Version 1.0
 * Desc:
 */
public class LockSyncDemo {

     Object  object = new Object();

     public void  m1(){
         synchronized (object){
             System.out.println("---hello");
         }
     }
    public static void main(String[] args) {


    }
}
