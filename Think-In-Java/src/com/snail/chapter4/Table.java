package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 0:18
 * @Version 1.0
 * Desc:
 */
public class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("table");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
