package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/25 10:02
 * @Version 1.0
 * Desc:
 *
 *  只有非private 的基类方法才可以在 子类进行覆盖
 *  在子类中的方法对于基类中的private方法 最好不要起相同名字
 */
public class PrivateOverride {
    private void  f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.f();
        //基类方法 f()为 private 被自动认为 final方法 且对导出类屏蔽
        //这种情况 Derived 为全新的方法，既然基类中的方法 在子类Derived 中是不可见的因此不能被重载。
        PrivateOverride po = new Derived();
       po.f();
    }

}
