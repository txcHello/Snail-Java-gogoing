package ScalaProgramming.chapter19

import scala.collection.{immutable, mutable}


/**
 * @Author Administrator
 * @Date 2022/9/15 23:06
 * @Version 1.0
 *          Desc:
 */
object ClassTypeArgsDemo {
  def main(args: Array[String]): Unit = {
    val value = mutable.Queue(1, 2, 3)
    println(value)
    val ql = value.enqueue(4)
    println(ql)
    println(List(1) ::: List(2, 34))
    println(1 :: List(2, 34))

    Queue1(1, 3, 34)
  }

}

class SlowAppendQueue[T](elemnt: List[T]) {
  def head = elemnt.head

  def tail = new SlowAppendQueue(elemnt.tail)

  def enqueue(x: T) = {

    new SlowAppendQueue(elemnt ::: List(x))
  }

}

class Queue[T](
                private val leading: List[T], //背后的理念是用leading和trailing两个列表来表示队列  //leading列表包含队列中靠前的元素，
                private val trailing: List[T] //而trailing列表包含队列中靠后的元素，按倒序排列。
              ) {
  private def mirror = {
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this
  }

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def enqueue(x: T) = {
    new Queue(leading, x :: trailing)

  }

}

//通过标记为private来隐藏构造方法
class Queue1[T] private(
                         private val leading: List[T], //背后的理念是用leading和trailing两个列表来表示队列  //leading列表包含队列中靠前的元素，
                         private val trailing: List[T] //而trailing列表包含队列中靠后的元素，按倒序排列。
                       ) {
  def this() = this(Nil, Nil)

  def this(elements: T*) = this(elements.toList, Nil)


}

object Queue1 {
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)

}

