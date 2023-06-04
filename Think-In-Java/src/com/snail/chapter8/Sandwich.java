package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/26 13:45
 * @Version 1.0
 * Desc:
 */
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich(){
        System.out.println("SandWich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
