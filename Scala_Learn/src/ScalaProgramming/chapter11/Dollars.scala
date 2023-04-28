package ScalaProgramming.chapter11

/**
 * @Author Administrator
 * @Date 2022/9/4 18:31
 * @Version 1.0
 *          Desc:
 */
class Dollars(val amount:Int) extends  AnyVal {
  override def toString: String =  "$"+amount
}
