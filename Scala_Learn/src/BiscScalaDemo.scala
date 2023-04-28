import java.math.BigInteger

/**
 * @Author Administrator
 * @Date 2022/8/27 14:58
 * @Version 1.0
 *  Desc:
 *
 */
object BiscScalaDemo {

  def main(args: Array[String]): Unit = {


    val big  = new BigInteger("12345")
     //  big = new BigInteger("2332");

    val greetStrings  = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!\n"

    for (i <- 0 to 2){
      print(greetStrings(i))

      Console println 10
    }


    val words  : Array[String] = Array("zero", "one", "two")

  }

}
