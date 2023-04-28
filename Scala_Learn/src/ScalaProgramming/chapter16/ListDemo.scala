package ScalaProgramming.chapter16

/**
 * @Author Administrator
 * @Date 2022/9/11 12:03
 * @Version 1.0
 *          Desc:
 */
object ListDemo extends App  {
  private val strings = List("a", "B", "c")
  private val ints = List(1, 2, 3, 456)
  //和数组的区别，List是不可变的,列表的元素不能通过赋值进行更改
  //其次 列表的结构是递归的（即链表 linkdedList ），而数组是平的
  // 跟数组一样， 列表List 是同构的， 同一个列表所有元素必须是相同的类
  private val strings1 = List("apples", "orangs", "pears")

    val fruit = "apples"::("oranges"::("pears"::Nil))

  val   nums  = 1::2::3 ::4::Nil

  //列表的基本操作
  println(fruit.head)    //返回第一个元素
  println(fruit.tail)    //返回除第一个元素之外的所有元素
  println(fruit.isEmpty) //判断集合是否为空
  //模式匹配
  val List(a,b,c) =fruit;
  print(a)
  println(b)
  val  first::second::rest = fruit
  println(first)
  println(second)

  /**
   * *
   * @param xs
   * @return
   */
   def isort(xs:List[Int]):List[Int]=xs match {
     case List() => List()
     case x::xs1 => insert(x,isort(xs1))
   }
  def insert(x:Int,xs: List[Int]):List[Int]= xs match {
    case List()=>List()
    case y::ys  =>if (x<=y) x::xs else y::insert(x,ys)
  }

  //list的初阶使用
  private val ints1: List[Int] = List(1, 2) ::: List(2, 3, 4)
  println(ints.length)  //获取类别长度
  println(ints.init)    //返回除最后一个元素之外的剩余部分元素
  println(ints.last)    //获取最后一个元素
  /*
     不像head和tail那样在运行的时候消耗常量时间，
     init和last需要遍历整个列表来计算结果。因此它们的耗时跟列表的长度成正比
   */
   ints.drop(2)//操作“x drop n”返回列表xs除前n个元素之外的所有元素
  ints.take(2)  //表达式“xs take n”返回列表xs的前n个元素
  ints.splitAt(2)  //splitAt操作将列表从指定的下标位置切开，返回这两个列表组成的对偶

  private val strings3 = List("abc", "cba", "hello")
  private val strings2 = List("orange", "java", "Scal")

  private val strings4: List[String] = strings2 ::: strings3

}
