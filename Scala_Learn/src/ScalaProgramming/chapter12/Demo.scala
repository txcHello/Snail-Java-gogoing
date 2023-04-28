package ScalaProgramming.chapter12

/**
 * @Author Administrator
 * @Date 2022/9/8 15:40
 * @Version 1.0
 *          Desc:
 */
object Demo extends App {

  private val frog = new Frog
  frog.philosophise()

  val phil :Philosophical = frog;
  phil.philosophise()

}
