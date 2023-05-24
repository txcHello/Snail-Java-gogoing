package com.snail.chapter4;

import javafx.scene.control.Tab;

/**
 * @Author Administrator
 * @Date 2023/5/10 9:15
 * @Version 1.0
 * Desc:
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("cuppard!!!");
        new Cuppoard();
        System.out.println("cuppard!!!");
        new Cuppoard();
        table.f2(1);
        cuppoard.f3(1);
    }

    static Table  table = new Table();
    static Cuppoard cuppoard =  new Cuppoard();
}
