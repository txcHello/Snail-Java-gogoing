package ScalaProgramming.chapter4

import scala.collection.mutable

/**
 * @Author Administrator
 * @Date 2022/8/29 14:01
 * @Version 1.0
 *          Desc:
 *
 *          一般返回为unit 类型的方法称为副作用
 *          副作用 通常是改变外部变量的值或执行I/O操作。
 *          因为去副作用而被执行的方法称作过程
 */
class ChecksumAccumulator {
  private var sum = 0

  // 参数默认是val    称为过程
  def add(b: Byte): Unit = {
    // b =1
    sum += b
  }

  //缩减
  def add1(b: Byte): Unit = sum += b

  def checkSum(): Int = {
    return ~(sum & 0xFF) + 1
  }

  val s = "hello";
  println(s)
}

// 称为伴生对象
object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
        val cs = acc.checkSum()
        cache += (s -> cs)
        cs
    }
  }
}