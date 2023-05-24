package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 0:32
 * @Version 1.0
 * Desc:
 */
public class Cuppoard {
    Bowl  bowl3 = new Bowl(3);
    static  Bowl  bowl4 = new Bowl(4 );
    Cuppoard(){
        System.out.println("Cupboard");
        bowl4.f1(2);
    }
    void  f3( int marker){
        System.out.println("f3(" + marker + ")");
    }
    static  Bowl  bowl5 = new Bowl(5);
}
