package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/9 23:23
 * @Version 1.0
 * Desc:
 */
public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f(){
        return  11;
    }
    int g(int n ){
        return  n*10;
    }
}
