package com.snail.chapter4;

import java.util.Random;

/**
 * @Author Administrator
 * @Date 2023/5/8 0:17
 * @Version 1.0
 * Desc:
 */
public class VowelAndConsonants {
    public static void main(String[] args) {
        Random random = new Random(47);

        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) +'a';
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                case 'y':
                case 'W':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant                                            ");
            }
        }
    }

    void  f(){
        System.out.println("f");
    }
    int f(String s){
        System.out.println("f");
        return 1;
    }
}
