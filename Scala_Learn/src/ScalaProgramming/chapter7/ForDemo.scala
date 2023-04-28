package ScalaProgramming.chapter7

import java.io.File

/**
 * @Author Administrator
 * @Date 2022/8/30 20:25
 * @Version 1.0
 *          Desc:
 *
 *          for 表达式可以遍历任意集合。
 */
object ForDemo extends App {


  //todo  1.遍历集合
  val filesHere = new File("E:\\百度云下载\\01.笔记").listFiles()
  for (file <- filesHere) {
    println(file)
  }

  for (i <- 1 to 4) {
    println(i)
  }
  for (i <- 1 until 4) {
    println(i)
  }

  //过滤  此方法不推荐
  for (file <- filesHere) {
    if (file.getName.endsWith(".md")) {
      println(file)
    }
  }

  //
  for (file <- filesHere if file.isFile if file.getName.endsWith(".md")) {
    println(file)
  }
  //嵌套迭代   如果你

  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toArray



  def grep(pattern: String) = {
    for (
      file <- filesHere if file.getName.endsWith(".txt");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(s"$file:${line.trim}")
  }
  grep("([a-zA-Z_]*)")
}
