package com.snail.chapter9;

/**
 * @Author Administrator
 * @Date 2023/6/1 13:48
 * @Version 1.0
 * Desc:
 */
public class Waveform {
    private static  long    counter;
    private  final   long id = counter++;
    public  String toString(){
        return  "Waveform" +id ;
    }
}
