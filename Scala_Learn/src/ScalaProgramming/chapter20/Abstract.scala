package ScalaProgramming.chapter20

/**
 * @Author Administrator
 * @Date 2022/9/21 21:48
 * @Version 1.0
 *          Desc:
 */

trait Abstract {
  //特质特种抽象成员
  //使用类型成员的原因之一是给真名冗长或含义不明显的类型定义一个短小且描述性强的别名
  //类型成员的另一个主要用途是声明子类必须定义的抽象类型
  type T  //抽象类型: 类和特质在scala中的都不叫抽象类型;scala的抽象类型永远都是某个类的成员


  def transform(x: T): T

  //当 每次 obj.initial 和 抽象的val 相同要保证每次obj.initial的引用都会交出相同的值。
  //抽象val 限制了它的合法实现:任何实现都必须是一个val定义;
  val initial: T
  //def initial:String

  //像hour和minute这样的抽象var的含义是什么；声明为类成员的var默认都带上了getter和setter方法
  var current: T

}

class Concrete extends Abstract {
  type T = String
  override def transform(x: String): String = x + x
  override val initial: String = "hi"
  override var current: String = initial
}

abstract class Fruit{
  val v:String  // v 表示值
  def m:String  // m 表示方法
}

abstract class Apple extends Fruit{
  val v : String
  def m : String  //用val  重写 覆盖  def 是ok 的
}
abstract class BadApple extends Fruit{
  def v :String   // 错误: 不能用def 重写(覆盖) val
  def m :String
}

