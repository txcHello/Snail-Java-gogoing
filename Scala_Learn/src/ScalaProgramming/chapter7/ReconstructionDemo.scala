package ScalaProgramming.chapter7

/**
 * @Author Administrator
 * @Date 2022/8/31 1:33
 * @Version 1.0
 *          Desc:
 */
object ReconstructionDemo extends App {

  //while 操作打印 乘法表
  def printMultiTable() = {
    var i = 1
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        val prod = (i * j).toString
        var k = prod.length
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j +=1
      }
      println()
      i += 1
    }
  }
 printMultiTable()
  //重构  函数式编程
 println("***********************************************************************************")
  def makeRowSeq(row :Int)={
    for (col <- 1 to 10 ) yield {
      val prod = (row *col ).toString
      val padding= " " * (4 - prod.length)
      padding +prod
    }
  }
    //以字符串形式返回一行
    def makeRow(row:Int) = makeRowSeq(row).mkString
      //以每行占一个文本的字符串返回表格
  def multiTable()={
    val tableSeq = for (row<- 1 to 10) yield  makeRow(row)
    tableSeq.mkString("\n")
  }


  println(multiTable())


}
