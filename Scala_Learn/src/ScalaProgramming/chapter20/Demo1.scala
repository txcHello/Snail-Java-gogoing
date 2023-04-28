package ScalaProgramming.chapter20

import ScalaProgramming.chapter19.RationalTrait

/**
 * @Author Administrator
 * @Date 2022/9/18 13:28
 * @Version 1.0
 *          Desc:
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
    println(twoThirds.demomArg)
  }
  new  RationalTrait {
    override val numerArg: Int = 3
    override val demomArg: Int = 3
  }
  new {
    val numerArg =2
    val demomArg =3
  } with RationalTrait
}
object twoThirds extends {
  val numerArg =2
  val demomArg =3

}with RationalTrait

