package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/26 13:44
 * @Version 1.0
 * Desc:
 *
 * 1)调用基类构造器。这个步骤会不断地反复递归下去，首先是构造这种层次结构的根，然后是下一层导出类，等等，直到最低层的导出类。
 * 2)按声明顺序调用成员的初始化方法。
 * 3)调用导出类构造器的主体。
 */
public class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }

}
