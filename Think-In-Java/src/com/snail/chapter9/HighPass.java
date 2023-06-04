package com.snail.chapter9;

/**
 * @Author Administrator
 * @Date 2023/6/1 13:53
 * @Version 1.0
 * Desc:
 */
public class HighPass extends Filter{


    double cutoff;
    public HighPass(double cutoff){
        this.cutoff= cutoff;
    }

    public Waveform process(Waveform input) {
        return super.process(input);
    }
}
