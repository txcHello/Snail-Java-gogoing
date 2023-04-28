package ScalaProgramming.chapter12

/**
 * @Author Administrator
 * @Date 2022/9/8 16:16
 * @Version 1.0
 *          Desc:
 */
class Rational(val n:Int,val d:Int) extends Ordered[Rational]{
  override def compare(that: Rational): Int =
   {(this.n * that.d)-(that.n * this.d)}
}
