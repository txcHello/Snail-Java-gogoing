package bigdata.basic

/**
 * @Author Administrator
 * @Date 2022/8/29 0:40
 * @Version 1.0
 *          Desc:
 */
object FuncDemo {

  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3)
    val threeFor = List(3, 4)
    val oneToFour: List[Int] = oneTwoThree ::: threeFor
    val ints: List[Int] = 1 :: oneTwoThree
    println(ints)
    val ints1: List[Int] = oneTwoThree.::(1)
    println(ints1)
    val ints2: List[Int] = 1 :: 2 :: 3 :: Nil
    println(ints2)
    println(ints2(2))


  }

}
