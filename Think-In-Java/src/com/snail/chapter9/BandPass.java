package com.snail.chapter9;

/**
 * @Author Administrator
 * @Date 2023/6/1 13:54
 * @Version 1.0
 * Desc:
 */
public class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff =lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return super.process(input);
    }
}
