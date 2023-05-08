package com.snail.chapter3;

/**
 * @Author Administrator
 * @Date 2023/5/7 22:37
 * @Version 1.0
 * Desc:
 */
import javax.swing.*;

import static com.snail.chapter2.Print.*;
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (;true;){

            inner:
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" +j);
                if (j==2){
                    print("continiu1");
                    continue ;
                }
                if (i==3){
                    print("break");
                    i++;
                    break ;
                }
                if (i==7){
                    print("continue outer  !!" );
                    continue  outer;
                }
                if (i==8){
                    print("break outer");
                    break  outer;
                }
                for (int k = 0; k < 5; k++) {
                    print("conntinue inner");
                    continue  inner;
                }
            }
        }
    }
}
