package ScalaProgramming.chapter7

import java.io.File

/**
 * @Author Administrator
 * @Date 2022/8/30 20:25
 * @Version 1.0
 *          Desc:
 *
 *          for {} yield  返回集合
 */
object ForDemo2 extends App {


  //todo  1.遍历集合
  val filesHere = new File("E:\\百度云下载\\01.笔记").listFiles()

  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toArray
  def grep(pattern: String) = {
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(s"$file:$trimmed")
  }

  def scalaFile =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file;

  def scalaFile1 =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield  trimmed.length
}
