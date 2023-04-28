package ScalaProgramming.chapter7

import java.io.File
import scala.io.BufferedSource

/**
 * @Author Administrator
 * @Date 2022/8/30 20:25
 * @Version 1.0
 *          Desc:
 *
 *          for 表达式可以遍历任意集合。
 */
object ForDemo1 extends App {


  //todo  1.遍历集合
  val filesHere = new File("E:\\test").listFiles()
  //嵌套迭代   如果你
  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toArray

  def grep(pattern: String) = {
    for (
      file <- filesHere if file.getName.startsWith("test")
    //  line <- fileLines(file)
    ) println(s"$file")
  }
  grep("([a-zA-Z_]*)")

  private val source: BufferedSource = scala.io.Source.fromFile(new File("E:\\test\\test.txt"))
  for (elem <- source.getLines().toArray) {
    println(elem)
  }
}
