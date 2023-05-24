package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/23 21:45
 * @Version 1.0
 * Desc:
 */
public class WaterSource {
    private String s ;
    WaterSource(){
        System.out.println("WaterSource()");
        s="Constructed";
    }
    public String toString(){
        return  s;
    }
}
