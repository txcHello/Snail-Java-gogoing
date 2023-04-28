package bigdata.basic.collection

import scala.Console.println

/**
 * @Author Administrator
 * @Date 2022/9/8 2:25
 * @Version 1.0
 *          Desc:
 */
object ListTabulateDemo {
  def main(args: Array[String]): Unit = {
    val ints: List[Int] = List.tabulate(2)(x => x * 2)
    val array: Array[Array[Int]] = Array.tabulate(3, 4)((x, y) => {
      x + 1; y + 1
    })
    array.foreach(x=> {
      x.foreach(y => print(y))
    println })
  }

}
