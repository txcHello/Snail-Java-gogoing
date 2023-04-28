package ScalaProgramming.chapter3

import scala.::

/**
 * @Author Administrator
 * @Date 2022/8/29 0:55
 * @Version 1.0
 *          Desc:
 *          Scala : List  列表的一些使用方法
 */
object ListOfUseDemo {

  def main(args: Array[String]): Unit = {
    val emptyList = List()
    val emptyList1 = Nil
    val strings = List("Cool", "tools", "rule")
    val thrill: List[String] = "Will" :: "fill" :: "until" :: Nil
    val abcd : List[String] = List("a", "b") ::: List("c", "d")
    println(thrill(2))
    //计算thrill中，长度为4的字符串进行计数
    val i: Int = thrill.count(s => s.length == 4)
  //去掉thrill 头连个元素列表
    println(thrill.drop(2))
    //去掉thrill 的后两个元素列表
    println(thrill.dropRight(2))
    //判断thrill 中是否有字符串元素的值为until
    println(thrill.exists(s => s == "until"))
    //过滤
    println(thrill.filter(x => x.length == 4))
    //表示是否所有元素 以l结尾
    println(thrill.forall(x => x.endsWith("l")))
    thrill.foreach(x=>println(x))
    //返回首个元素
    println(thrill.head)

    println("init:"+thrill.init)
    println("isEmpty:"+thrill.isEmpty)
    println("last:"+ thrill.last)
    println("length:"+thrill.length)
    val strings1: List[String] = thrill.map(s => s + "Y")
    println("map"+strings1)
    println("mkstring:"+thrill.mkString(","))

    println("reverse:"+thrill.reverse)

    println(thrill.sortBy(x => x.charAt(1)))

    println(" 返回除首个元素之外的其他元素:tail:"+thrill.tail)



  }

}
