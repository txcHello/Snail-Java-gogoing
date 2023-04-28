package ScalaProgramming.chapter15

/**
 * @Author Administrator
 * @Date 2022/9/8 20:54
 * @Version 1.0
 *          Desc:
 */
object Demo2 extends App {

  val  capitals = Map("France" -> "paris","China"->"beijing")
      println(capitals get "France")
  def show(x:Option[String]) = x match {
    case Some(s)=>s
    case None => "?"
  }

  println(show(None))
  //作为偏函数的case序列
  val withDefault :Option[Int]=>Int ={
    case Some(x)=>x
    case None =>0

   }
   withDefault(Some(10))
  val  Second :List[Int]=>Int ={
    case x::y::_ => y
  }

  val  second:PartialFunction[List[Int],Int]={
    case x::y::_ => y
  }
}
