package ScalaProgramming.chapter12

import scala.collection.mutable.ArrayBuffer

/**
 * @Author Administrator
 * @Date 2022/9/8 18:00
 * @Version 1.0
 *          Desc: 特质的混入顺序很重要，  越靠右出现的特质越先起作用
 */

object BasicDemo extends App {
  private val queue = new BasicIntQueue
  queue.put(10)
  queue.put(23)
  println(queue.get())
  println(queue.get())


  private val myqueue = new Myqueue
  myqueue.put(122)
  println(myqueue.get())
  private val queue1 = new  BasicIntQueue with Doubling

}
class BasicIntQueue  extends IntQueue {
   private val buf =  new ArrayBuffer[Int]
  override def get(): Int = buf.remove(0)

  override def put(x: Int): Unit = { buf +=x}
}
abstract class IntQueue{
  def get():Int
  def put(x:Int)

}

trait Doubling extends IntQueue{
  abstract override def put(x: Int): Unit = {
    super.put(x*2)
  }

}
trait Incrementing extends IntQueue{
  abstract override def put(x: Int): Unit = super.put(x+1)

}
trait Filtering  extends IntQueue{
 abstract override def put(x: Int): Unit = {
    if (x>=0) super.put(x)

  }

}

class Myqueue extends BasicIntQueue with Doubling{


}