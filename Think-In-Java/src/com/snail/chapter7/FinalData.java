package com.snail.chapter7;

import java.util.Random;

/**
 * @Author Administrator
 * @Date 2023/5/24 11:16
 * @Version 1.0
 * Desc:
 */
public class FinalData {
    private  static Random  rand = new Random(47);
    private  String id ;
    public  FinalData(String id ){
        this.id  = id ;
    }
    // can be compile-time constant
    private  final  int  valueOne= 9;
    private static final int VALUE_TWO =99;
    //typical public constant
    public  static final int VALUE_THREE =999;
    // Cannot be compile-time  constants
    private  final  int  i4 = rand.nextInt(20); //编译时无法确定值，运行时会确定常量值，针对这个对象
    static final int  INT_5 =rand.nextInt(20); //static 当初始化后，针对这个类就不会变了

    private  Value  v1 = new Value(11);
    private   final Value  v2 = new Value(22);
    private static final Value  VAL_3 = new Value(33);
    //Arrays
    private  final int[] arr ={1,2,3,4,5,6};
    public String toString(){
        return  id +": " +" i4 = " + i4 +",INT_5 = " +INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;
        fd1.v1 = new Value(19);
        for (int i = 0; i < fd1.arr.length; i++) {
            fd1.arr[i]++;
        }
       // fd1.v2 = new Value(0);
       // fd1.VAL_3 = new Value(3);
       // fd1.arr = new int[3];
        System.out.println(fd1);
        System.out.println("Create  new  FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
