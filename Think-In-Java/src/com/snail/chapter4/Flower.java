package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/8 22:40
 * @Version 1.0
 * Desc:
 */
public class Flower {
    int petalCount =0 ;

    String s = "initial value";
    Flower( int petals){
        petalCount =petals;
        System.out.println("Csonstructure w/ int arg only ,petalCount =" + petals);
    }
    Flower(String ss){
        s =ss;
        System.out.println("s = " + ss );
    }
    Flower(String s ,int peats){
        this(peats);
       // this(s);
        this.s =s;

    }
    Flower(){
        this("ss",12);
        System.out.println( "no args ");
    }
    void  printPetal(){

        System.out.println( "print petal");
    }
}
