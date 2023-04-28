package ScalaProgramming.chapter7

/**
 * @Author Administrator
 * @Date 2022/8/31 1:28
 * @Version 1.0
 *          Desc:
 */
object VariableDemo extends App {

  val a =1 ;
  {
    val a =2 ;
    {
      println(a)
    }
  }

}
