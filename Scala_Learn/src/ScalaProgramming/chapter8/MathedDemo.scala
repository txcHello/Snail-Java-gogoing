package ScalaProgramming.chapter8

/**
 * @Author Administrator
 * @Date 2022/9/2 0:37
 * @Version 1.0
 *          Desc:
 */
object MathedDemo extends App {
  //函数字面量和函数值的区别相当于 类的源码和对象（运行时）
  (x:Int) =>x+1
  //函数值 是对象,可以将他们存放在变量中

  var   increase = (x:Int)=>x+1
  println(increase)
  println(increase(1))


  private val ints = List(-11, -10, 5, 0, 5, 120)
   ints.foreach(println)
  ints.foreach(x=>println(x))

  ints.filter(((x:Int)=>x>0))

  //字面量的简写形式
  //1.todo  省略类型
  ints.filter((x)=>x>0)
  ints.filter((x=>x>0))
  ints.filter(_>0)
  def sum(a:Int,b:Int,c:Int) =a+b+c

  val a = sum(1 , _:Int ,3)
  println(a(2))
  println(a)
  //闭包： 捕获自由变量从而闭合该函数的字面量的动作

  var  more = 99999
//运行时从这个函数字面量创建出来的函数值（对象）被称作闭包
//（closure）
  def addMore(x:Int) = x + more

  println(addMore(10))

    def echo(args:String*)={
      for (elem <- args) {
        print(elem)
      }
    }

  val  arr = Array("what's","up","doc?")
  // arr :_* 方法告诉编译器，将arr的每个元素作为参数传给echo，而不是将所有元素放在一起作为单个实参传入
  echo(arr:_*)
  def  speed(distance:Float,time:Float)= distance/time

  speed(distance = 1000,time = 10)
  speed(100,25)

  //函数参数设置默认值   =Console.out 为默认值
  def printTime(out:java.io.PrintStream =Console.out)={
    out.println("time =" + System.currentTimeMillis())
  }

  //递归调用 函数体在求遏制过程中的最后一步 调用自己的函数，被称为尾递归函数
  //scala编译器 能过检测到尾递归并将它替换成跳转到函数的最开始，并在跳转之前将参数更新为新的参数

  /**
  def approximate(guess:Double) :Double =
    if(isGoodEnough(guess)) guess
    else approximate(improve(guess))
  */

}
