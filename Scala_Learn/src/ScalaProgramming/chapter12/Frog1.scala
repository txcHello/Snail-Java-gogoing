package ScalaProgramming.chapter12

/**
 * @Author Administrator
 * @Date 2022/9/8 15:42
 * @Version 1.0
 *          Desc:
 *        特质 能声明字段并保存状态
 *        在特质定义中可以做任何类定义的事情，语法相同
 *       区别：
 *      1.  但是不能 有类的参数（即传入类的主构造方法的参数）
 *      2. 类的super调用是静态绑定的，特质是静态绑定的  ，特质能实现可叠加修改 的关键
 */
class Frog1 extends Animal with Philosophical with HasLegs {
  override def toString: String = "green"

}
trait HasLegs

//trait Hello(x:Int,y:Int)