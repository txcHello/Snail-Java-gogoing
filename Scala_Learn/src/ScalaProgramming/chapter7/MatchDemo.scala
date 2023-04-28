package ScalaProgramming.chapter7

import scala.io.Source

/**
 * @Author Administrator
 * @Date 2022/8/31 0:08
 * @Version 1.0
 *          Desc:
 */
object MatchDemo extends  App {

  //  val  firstArgs = if (args(0).length >0) args(0) else ""
  val  firstArgs = "hehe"
  private val hh : Unit = firstArgs match {
    case "salt" => println("papper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }

}
