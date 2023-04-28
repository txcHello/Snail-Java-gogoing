package ScalaProgramming.chapter10

/**
 * @Author Administrator
 * @Date 2022/9/4 0:53
 * @Version 1.0
 *          Desc:
 */
abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length
 //无参方法
  def width: Int = if (height == 0) 0 else contents(0).length
  //空圆括号方法
  def width1():Int = if (height == 0) 0 else contents(0).length
  //推荐的做法是对于没有
  //参数且只通过读取所在对象字段的方式访问可变状态（确切地说不改
  //变状态）的情况下尽量使用无参方法。这样的做法支持所谓的统一访
  //问原则（uniform access principle）[1]：使用方代码不应受到某个
  //属性是用字段还是用方法实现的影响

  var height1 =contents.length
  var width2= if(height==0) 0 else contents(0).length
}
