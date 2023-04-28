package ScalaProgramming.chapter7

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

/**
 * @Author Administrator
 * @Date 2022/8/30 23:37
 * @Version 1.0
 *          Desc:
 */
object TryDemo extends  App  {

      val n = 2
  val half =
    if ( n % 2 == 0)
       n/2
      else
      throw  new RuntimeException("n must be even")

  try {
     val f = new FileReader("input.txt")
  }catch {
    case ex: FileNotFoundException =>
    case ex: IOException  =>
  }

  def uriFor(path:String)=
    try {
      new URL(path)
    }catch {
      case e: MalformedURLException  => new URL("http://www.scala-lang.org")
    }

  //跟Java一样，当finally子
  //句包含一个显式的返回语句，或者抛出某个异常，那么这个返回值或
  //异常将会“改写”（overrule）任何在之前的try代码块或某个catch
  //子句中产生的值。
  def f() :Int= try  return 1 finally  return 2
  println(f())
  def g():Int = try 1 finally 2
  println(g())

  //最好避免在finally子句中返回值，最好将finally子句用来确保某些副作用发生，比如关闭一个打开的文件。

}
