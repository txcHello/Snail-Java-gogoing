package com.snail.chapter7;

import java.security.DigestOutputStream;

/**
 * @Author Administrator
 * @Date 2023/5/24 14:51
 * @Version 1.0
 * Desc:
 */
public class SmallBrain {
}

final class Dinosaur{
    int i =7 ;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){
        System.out.println("f()");
    }
}
class Demo1{
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.i=1;
        System.out.println(dinosaur.i);
        dinosaur.f();
    }
}

