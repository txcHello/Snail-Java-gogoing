package com.snail.chapter7;


/**
 * @Author Administrator
 * @Date 2023/5/23 21:47
 * @Version 1.0
 * Desc:
 *
 *  组合语法：
 */
public class SprinklerSystem {
    private  String value1,value2,value3,value4;
    private WaterSource source  =  new WaterSource();
    private  int i;
    private  float f;
    public  String  toString(){
        return
                "value1=" + value1 +" " +
                        "value2=" + value2 +" " +
                        "value3=" + value3 +" " +
                        "value4=" + value4 +"\n" +
                        "i=" + i + "" + "f=" + f +" " +
                        "source = " +source;
    }
}
