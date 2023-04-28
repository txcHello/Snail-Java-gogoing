package ScalaProgramming.chapter7

/**
 * @Author Administrator
 * @Date 2022/8/30 17:46
 * @Version 1.0
 *          Desc:
 *
 *
 *          Scala所有的控制结构都返回某种值作为结果
 *
 *
 */
object OpratorDemo extends App {

  //指令式编码风格
  var filename = "default.txt"
  if (!args.isEmpty) {
    filename = args(0)
  }
  /**
   * 真正的优势在于它用的是val而不是var。使用val是函数式的风格，就像Java的final变量那样，
   * 有助于你编写出更好的代码。它也告诉读这段代码的人，这个变量一旦初始化就不会改变，
   * 不必再扫描该变量整个作用域的代码来搞清楚它会不会变。
   *
   * 只要有机会，尽可能使用val，它们会让你的代码更易读也更易重构
   */
  val filename1 = if (!args.isEmpty) args(0) else "default.txt"

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val tmp = 0
      a = b % a
      b = tmp
    }
    b
  }
 // 在编译这段代码时，Scala编译器会给出一个警告：用!=对类型为Unit的值和String做比较将永远返回true;
   var line = ""

  def  greet()={println("hello")}
  var func1 =greet()
  val func2 =greet()
   while ((line = readLine() )!=""){
     println(line)
   }
  //函数式编程一般不支持循环,替代方案为递归
}
