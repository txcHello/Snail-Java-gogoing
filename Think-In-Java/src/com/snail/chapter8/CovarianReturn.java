package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/30 16:04
 * @Version 1.0
 * Desc:
 *  协变 ：导出类 中的被覆盖方法 可以返回基类方法的返回类型的某种导出类
 *  例如：WheatMill（导出类）  覆盖 基类（Mill）的 process（）方法
 *   Mill的 process的返回值类型 为Grain
 *   WheatMill（导出类）的process() 的返回类型
 */
public class CovarianReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain process = mill.process();
        System.out.println(process); //Grain
        mill = new WheatMill();
        process = mill.process();

        System.out.println(process);
    }
}

class Grain {

    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {

    Wheat process() {
        return new Wheat();
    }
}