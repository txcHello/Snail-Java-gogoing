package ScalaProgramming.chapter3

/**
 * @Author Administrator
 * @Date 2022/8/29 1:38
 * @Version 1.0
 *          Desc:
 *
 *          scala 允许采用指令式编程，但鼓励使用函数式编程
 *
 *
 * 首先是从代码层面识别出两种风格的差异。
 * 一个显著的标志是如果代码包含任何var变量，它通常是指令式风格的；
 * 而如果代码完全没有var（也就是说代码只包含val），那么它很可能是函数式的。因此，一个向函数式风格转变的方向是尽可能不用var。
 *
 * Scala程序员的平衡心态
 * 倾向于使用val、不可变对象和没有副作用的方法，优先选择它们。
 * 不过当你有特定的需要和理由时，也不要拒绝var、可变对象和带有副作用的方法。
 */
object IdentifyAndProgrammingStyle {
  def main(args: Array[String]): Unit = {
    var  string =  "hello"
     string = "hi"
    val  string1  = "hello"
         //string1 ="hi";
    val  Strings = Array("hello","scala")
    Strings(1) = "java"
    val strings = List("hello", "java")

    /**
     *  感受函数式编程  尽量使用val 作为工具
     */

    def printArgs(args:Array[String]):Unit={
      var i = 0
      while (i<args.length){
        print(args(i))
        i+=1
      }
    }

    //去掉var
    def printArgs1(args:Array[String]):Unit={
      for (elem <- args) {
        print(elem)
      }
    }
    //此种并不是完全的符合函数式编程，有副作用，副作用的的特征为结果为Unit类型

    /**
     * 如果一个函数的返回结果是unit类型，他存在世上的唯一意义就是产生副作用
     * @param args
     */
    def printArgs2(args:Array[String]):Unit={
     args.foreach(println)
    }

    def formatArgs(args:Array[String])={
      args.mkString(",")
    }

    val strings1: Array[String] = Array("hello", "one", "two")
    val str: String = formatArgs(strings1)
    assert(str=="hello,one,two")
  }

}
