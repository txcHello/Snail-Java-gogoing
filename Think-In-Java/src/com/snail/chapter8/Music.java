package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/25 9:05
 * @Version 1.0
 * Desc:
 */
public class Music {
    public static void tune(Instrument i ){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();

        tune(wind);
    }
}
