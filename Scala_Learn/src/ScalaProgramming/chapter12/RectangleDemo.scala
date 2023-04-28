package ScalaProgramming.chapter12

/**
 * @Author Administrator
 * @Date 2022/9/8 16:05
 * @Version 1.0
 *          Desc:
 */
object RectangleDemo extends App {

}


class Point(val x:Int,val y:Int)

class Rectangle(val topleft :Point,val bootoomRight:Point){
  def left = topleft.x
  def right =bootoomRight.x
  def width = right - left
}

trait Rectangular{
  def topleft :Point
  def bootoomRight :Point
  def left = topleft.x
  def right =bootoomRight.x
  def width = right - left

}