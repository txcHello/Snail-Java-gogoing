package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/10 17:00
 * @Version 1.0
 * Desc:
 */
 class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness hot = Spiciness.HOT;
        System.out.println(hot);

        for (Spiciness value : Spiciness.values()) {
            System.out.println(value +",ordinal"+value.ordinal());//根据声明顺序排序
        }
    }
}
