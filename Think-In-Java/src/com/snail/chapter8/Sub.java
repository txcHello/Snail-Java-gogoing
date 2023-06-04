package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/25 10:14
 * @Version 1.0
 * Desc:
 */
public class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
     return    super.getField();
    }
}
