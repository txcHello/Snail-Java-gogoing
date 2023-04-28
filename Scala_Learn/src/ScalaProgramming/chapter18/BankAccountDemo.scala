package ScalaProgramming.chapter18

/**
 * @Author Administrator
 * @Date 2022/9/14 23:45
 * @Version 1.0
 *          Desc:
 */
object BankAccountDemo {
  def main(args: Array[String]): Unit = {
    val acount = new BankAcount
    acount deposit 50
    println(acount withdraw 20)

    println(acount withdraw (40))

  }

  //可重新被赋值的变量和属性
  var a = 12


}

class Time {
  var hour = 2
  var minit = 10
}

class Time1 {
  private[this] var h = 2
  private[this] var minit = 10

  def hour = h

  def hour_=(x: Int) = {
    h = x
  }

  def minute = minit

  def minute_=(x: Int) = minit = x

}

class  Thermometer{
  var    cel :Float =_    // _会设置初始值，初始值取决于定义的类型
  def   fah = cel*9/5+32
  def fah_=(x:Float): Unit ={
    cel =(x-32)*5/9
  }

  override def toString: String =  fah + "F/" + cel+ "C"

}


class  SlowHeadQueue[T](smele:List[T]){
  def head  =smele.last;
  def tail = new SlowHeadQueue(smele.init)
    List(1,2,3,4)
}