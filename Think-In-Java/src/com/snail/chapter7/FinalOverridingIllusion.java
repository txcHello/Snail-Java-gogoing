package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 14:47
 * @Version 1.0
 * Desc:
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        Overiding2 overiding2 = new Overiding2();
        overiding2.f();
        overiding2.g();
        OverridingPrivate op2 = overiding2;
        // op2.g();  //cannot call
        //op2.f();   //cannot call

    }
}
