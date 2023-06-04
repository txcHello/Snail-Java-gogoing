package com.snail.chapter9;

/**
 * @Author Administrator
 * @Date 2023/6/1 13:50
 * @Version 1.0
 * Desc:
 */
public class Filter {
    public String  name(){
        return  getClass().getSimpleName();
    }
    public Waveform process(Waveform input ){
        return  input;
    }
}
