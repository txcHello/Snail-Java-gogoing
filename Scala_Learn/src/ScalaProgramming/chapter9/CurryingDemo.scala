package ScalaProgramming.chapter9

import java.io.{File, PrintWriter}

/**
 * @Author Administrator
 * @Date 2022/9/3 23:45
 * @Version 1.0
 *          Desc:
 */
object CurryingDemo {

  def plainOldSum(x: Int, y: Int) = x + y

  def curriedSum(x: Int)(y: Int) = x + y

  def first(x: Int) = (y: Int) => x + y
  // 编写新的控制结构
  def twice(op:Double=>Double,x:Double) =op(op(x))

  twice(_+1,5);

  def withPrintWriter(file:File ,op :PrintWriter => Unit)={
    val writer = new PrintWriter(file)
    try {
      op(writer)
    }finally{
      writer.close()
    }
  }

  //传名参数
  var assertionsEnabled =true
  def myAssert(predicate:()=>Boolean)={
    if (assertionsEnabled && !predicate()){
      throw  new AssertionError()
    }
  }
  myAssert(()=>5>3)

  //如何不写 （）=>
  //要让参数称为传名参数，需要给参数一个以 => 开头的类型声明，而不是（）=>
  def byNameAssert(predicate: =>Boolean)={
    if (assertionsEnabled && !predicate){
      throw  new AssertionError()
    }
  }
   byNameAssert(5>3)

}

