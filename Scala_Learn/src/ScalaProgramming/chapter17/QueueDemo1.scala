package ScalaProgramming.chapter17

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * @Author Administrator
 * @Date 2022/9/14 17:13
 * @Version 1.0
 *          Desc:
 */
object QueueDemo1 extends App {

  //列表缓冲 ，
  private val ints = new ListBuffer[Int]
  ints += 1
  print(ints)
  ints += 2
  print(ints)
  3 +=: ints
  println(ints)
  ints.toList
  println(ints)
  //数组缓冲
  private val ints1 = new ArrayBuffer[Int]()
  ints1 += 1
  println(ints1)
  ints1 += 2
  println(ints1)
  //字符串：
   def hasUpperCase(s:String) =s.exists(_.isUpper);

}

