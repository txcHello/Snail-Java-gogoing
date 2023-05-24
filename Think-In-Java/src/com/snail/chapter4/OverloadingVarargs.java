package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 16:49
 * @Version 1.0
 * Desc:
 */
//{CompileTimeError}

public class OverloadingVarargs {
    static void f(float i ,Character character){
        System.out.println("first");

    }
    static void  f(Character character){
        System.out.println("Second");
    }
}
