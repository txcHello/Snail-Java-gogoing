package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/25 10:16
 * @Version 1.0
 * Desc:
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + "   sup.getField() = " +sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field=  " + sub.field + "   sub.getField()=  " +sub.getField() + "  sub.superField()=  " +sub.getSuperField());
    }
}
