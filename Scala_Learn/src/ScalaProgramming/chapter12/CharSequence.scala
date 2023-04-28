package ScalaProgramming.chapter12

/**
 * @Author Administrator
 * @Date 2022/9/8 15:50
 * @Version 1.0
 *          Desc:
 */
trait CharSequence {
  def charAt(index:Int):Char
  def length:Int
  def subSequence(start:Int,engd:Int):CharSequence
  def toString():String

}
