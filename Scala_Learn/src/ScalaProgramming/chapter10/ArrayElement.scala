package ScalaProgramming.chapter10

/**
 * @Author Administrator
 * @Date 2022/9/4 12:19
 * @Version1.0
 *          Desc:
 *
 *     一般来说，Scala只有两个命名空间用于定义，不同于Java的四个。
 *     Java的四个命名空间分别是：字段、方法、类型和包，
 *     而Scala的两个命名空间分别是：
 *     • 值（字段、方法、包和单例对象）
 *     • 类型（类和特质名）
 */
// 定义类前加入val 代表同时定义参数和同名字段的简写
class ArrayElement(  override val contents:Array[String]) extends Element {

}
