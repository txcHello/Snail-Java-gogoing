package ScalaProgramming.chapter6

/**
 * @Author Administrator
 * @Date 2022/8/29 21:28
 * @Version 1.0
 *          Desc:
 */
object Demo extends  App {


  private val number = new RationalNumber(1, 2)

  private val number1 = new RationalNumber(1, 3)
  private val number2 = new RationalNumber(2)
    println(number + number1)

  private val number3 = new RationalNumber(4, 2)
  println(number3)
  private val number4: RationalNumber = number2 + 2
 // private val value: Any = 2 + number2
  //添加隐式转  告诉编译器 将Int 转换为 RationalNumler 类型 执行对应方法
  implicit def intToRation(x :Int) = new RationalNumber(x)

  private val number5: RationalNumber = 2 + number2
}
