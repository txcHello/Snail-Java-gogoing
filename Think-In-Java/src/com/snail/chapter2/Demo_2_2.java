package com.snail.chapter2;

/**
 * @Author Administrator
 * @Date 2023/4/26 23:06
 * @Version 1.0
 * Desc:
 * 基本类型：不用new来创建变量，而是创建一个并非是引用的自动变量， 直接存储 ‘值‘  并置于  堆栈（） 中  更高效。
 * 基本类型 :
 * 大小       最小值      最大值                        包装类
 * boolean   -           -          -                         Boolean
 * char    16 bit      UniCode 0    UniCode  2^16 -1          Character
 * byte    8  bit      -128            127                     Byte
 * int     32 bit      -2^31           +2^31 - 1               Integer
 * short   16 bit      -2^15           +2^15 - 1               Short
 * Long    64 bit      -2^63           +2^63 - 1               Long
 * float   32 bit      IEEE754         IEEE754                 Float
 * double  64 bit      IEEE754         IEEE754                Double
 * void    -              -               -                   Viod
 */
public class Demo_2_2 {
    public static void main(String[] args) {
        char c = 'x';
        Character ch = new Character(c);

        Character x = new Character('x');

        Character ch1 = 'x'; //自动包装
        char c1 = ch1;       //拆装
        //高精度数字

        // BigInteger      BigDecimal   通过方法调用计算 运算速度慢
        // BigInteger bigInteger = new BigInteger();

        //java 数组  保准安全性，  每个数组上少量内存开销及运行时的下标检查为代价  换来安全性和效率提高
        // todo 2.3  永远不需要销毁对象

        // 2.3.1 作用域   作用域：决定其内部定义的变量名的可见性和生命周期  ｛｝决定
        {
            String s = new  String("a string ");
        }
         //这无法应用s ,引用s在作用域的终点消失了  但是  String对象仍然占据着内存。
        // java垃圾回收器 用来监视new创建的对象，并辨别哪些对象不被引用。随后释放这些对象的内存空间。避免内存泄露问题
        //todo 2.4  创建新的数据类型 类

        //字段（数据成员）：可以是任意类型的对象也可以是基本类型
        //  每个对象都有其字段的存储空间，普通字段不能在对象空间共享。
         // 字段为基本类型： 没有初始化也会有默认值  null 0
        // 方法（成员函数）：
        // 参数：通过传递对象的形式 传递信息， 传递对象的引用
        // 返回值：

        DataOnly dataOnly = new DataOnly();
        dataOnly.i=47;
        dataOnly.d=23.4;
        dataOnly.b=true;
        int f = dataOnly.f();//发送消息给对象 消息是f()  对象为dataOnly
    }
}
