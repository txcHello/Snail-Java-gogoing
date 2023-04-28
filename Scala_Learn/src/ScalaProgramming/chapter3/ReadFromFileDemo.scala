package ScalaProgramming.chapter3

import scala.io.Source

/**
 * @Author Administrator
 * @Date 2022/8/29 2:13
 * @Version 1.0
 *          Desc: 从文件读取文本
 */
object ReadFromFileDemo {
  def main(args: Array[String]): Unit = {
    if (args.length>0){
      for (line <- Source.fromFile(args(0)).getLines())
        println(line)
    }
  }
}
