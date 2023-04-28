package ScalaProgramming.chapter19

/**
 * @Author Administrator
 * @Date 2022/9/16 0:36
 * @Version 1.0
 *          Desc:
 *
 *        Queue是一个特质，而Queue[String]是一个类型。Queue也
被称作类型构造方法（type constructor），因为我们可以通过指定
类型参数来构造一个类型（这跟通过指定值参数来构造对象实例的普
通构造方法的道理是一样的）。类型构造方法Queue能够“生成”成组
的类型，包括Queue[Int]、Queue[String]和Queue[AnyRef]。
 也可以说Queue是一个泛型（generic）的特质（接收类型参数的
类和特质是“泛型”的，但它们生成的类型是“参数化”的，而不是
泛型的）。“泛型”的意思是我们用一个泛化的类或特质来定义许许
多多具体的类型。举例来说，示例19.4中的Queue特质就定义了一个泛
型的队列。Queue[Int]和Queue[String]等就是那些具体的类型
 */
object  Demo3 {
  def main(args: Array[String]): Unit = {
    val value = new Cell[String]("abc")
     val c2:Cell[String] = value
    c2.set("1")
    println(value.get)
    print(value)
  }
  val  x= 3

  new RationalTrait {
     val numerArg: Int = 1*3
     val demomArg: Int = 1*x
  }
    new {val numerArg =1*x
       val demomArg =2*x}  with RationalTrait

}


class Cell[T](init :T){
  private [this] var current =init
  def get = current
  def set(x:T)= {current=x}

}

trait Abstract{

  type  T
  def  transform(x:T):T
  def  initial1 :T
  val  initial :T
  var current :T

}
class Concrete extends  Abstract{
  override type T = String

  override def transform(x: String): String = x +x

  /**使用方代码可以用完全相同的方式（也就是obj.initial）来引用
  val和方法。不过，如果initial是个抽象的val，使用方可以得到如下
  的保证：每次对obj.initial的引用都会交出相同的值。如果initial
  是抽象方法，那么这个保证无法成立，因为这样一来initial可以被某
  个具体的每次都返回不同值的方法实现。**
   *
   */
  override val initial: String = "hi"
  override var current: String = _

  override def initial1: String = "hello"
}

class Concrete1[T]{
  type T

}


abstract  class  Fruit{
  val  v: String
  def  m:String
}
abstract class  BadApple extends  Fruit{
  val v :String
  val m:String

}

abstract class Apple  extends  Fruit{
  //def v :String    //不能重写val 的值  编译错误
  def m :String

}


trait RationalTrait{
  val  numerArg:Int
  val demomArg:Int

}