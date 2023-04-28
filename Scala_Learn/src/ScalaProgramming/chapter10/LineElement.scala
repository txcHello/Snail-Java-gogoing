package ScalaProgramming.chapter10

/**
 * @Author Administrator
 * @Date 2022/9/4 17:06
 * @Version 1.0
 *          Desc:
 */
class LineElement(s:String) extends  ArrayElement(Array(s)){
  override def height: Int = 1

  override def width: Int = s.length
}
