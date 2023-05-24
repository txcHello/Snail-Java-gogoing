package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 16:26
 * @Version 1.0
 * Desc:
 */
public class NewVarArgs {

    static  void  testVarArgs(Object... objects){
        for (Object object : objects) {
            System.out.println(object);
        }

    }
    static void  testFistVarArgs(int i,String... s){
        System.out.println("i="+i);
        for (int i1 = 0; i1 < s.length; i1++) {
            System.out.println(s[i1]);
        }
    }

    public static void main(String[] args) {
        String[] sArr = {"233","hello","java"};
        testVarArgs(sArr);
        testFistVarArgs(1);
        testFistVarArgs(0,"w","scala","java");
    }
}
