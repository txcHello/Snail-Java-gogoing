package ScalaProgramming.chapter5

/**
 * @Author Administrator
 * @Date 2022/8/29 20:09
 * @Version 1.0
 *          Desc:
 */
object StringInsertDemo extends App{

  val  name ="reader"
  private val value = s" hello ,$name"
  println(s"Hello, $name !")
  //多变量需要 ｛｝

  private val value1 = s" The answer : is ${6 * 7}"
  println(value1)
  // 插值器
     s""
  // 行插值器  不会识别转义字符
  private val value2 = raw"No\\\escape!"
  println(value2)

  //f字符串插值器允许你给内嵌的表达式加上printf风格的指令。需
  //要 将 指 令 放 在 表 达 式 之 后 ， 以 百 分 号 （ % ） 开 始 ， 使 用
  //java.util.Formatter中给出的语法。

  println(f"${Math.PI}%.5f")
}
