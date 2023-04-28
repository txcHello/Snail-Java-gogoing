package com.snail.chapter3;

/**
 * @Author Administrator
 * @Date 2023/4/27 23:12
 * @Version 1.0
 * Desc:
 */
public class Assign {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.level=12;
        Tank tank1 = new Tank();
        tank1.level=34;
        System.out.println(tank.level); //12
        System.out.println(tank1.level);//34
         tank1 =tank; //对 tank1 引用赋值  tank1的引用被覆盖丢失， 后续垃圾回收器 对其自动清理
        System.out.println(tank1.level);//12
        tank.level =56;

        System.out.println(tank1.level); //56

        tank1.level=78;
        System.out.println(tank.level);//78


    }
}
