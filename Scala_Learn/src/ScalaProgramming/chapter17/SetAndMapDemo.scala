package ScalaProgramming.chapter17

import scala.collection.mutable

/**
 * @Author Administrator
 * @Date 2022/9/14 18:45
 * @Version 1.0
 *          Desc:
 */
object SetAndMapDemo extends App {
  val words = "Hello, where are you from ? , i  am  from china ?"

  private val strings: Array[String] = words.split("[ !?,]+")
  private val set = mutable.Set.empty[String]

  for (elem <- strings) {

    set += elem
  }

  print(set)
  // 使用映射
  private val stringToString = mutable.Map.empty[String, Int]
  stringToString("Hello") = 1
  stringToString("java") = 2


  println(stringToString("Hello"))

  def countWords(wordString: String) = {

    val strings1: Array[String] = wordString.split("[ !?,]+")

    val stringToInt = mutable.Map.empty[String, Int]

    for (elem <- strings1) {
      val str: String = elem.toLowerCase
      val oldCount: Int = if (stringToInt.contains(str)) stringToInt(str) else 0

      stringToInt += (str -> (oldCount + 1))
    }

    stringToInt
  }

  println(countWords(words))

      val    ts  = mutable.TreeSet(1,2,34,2,35,23,56,56786,2,3,4,5,6)

     println(ts)
}
