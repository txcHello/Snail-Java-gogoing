package ScalaProgramming.chapter8

/**
 * @Author Administrator
 * @Date 2022/9/3 18:29
 * @Version 1.0
 *          Desc:
 *
 *     尾递归函数并不会在每次调用时创建新的栈针，所有的调用都会在同一个栈针中执行
 *
 */
object TailRescuDemo {


  def main(args: Array[String]): Unit = {


    def boom(x:Int):Int=
      if (x== 0) throw  new Exception("Boom !")
      else  boom(x-1)+1

    boom(3)
  }

  def bang(x:Int) :Int=
    if (x==0) throw  new Exception("bang!")
    else bang(x-1)

}
