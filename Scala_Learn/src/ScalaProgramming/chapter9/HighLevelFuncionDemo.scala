package ScalaProgramming.chapter9

import java.io.File

/**
 * @Author Administrator
 * @Date 2022/9/3 22:28
 * @Version 1.0
 *          Desc:
 *          高阶函数的好处之一是可以用来创建减少代码重复的控制抽象
 *
 */
object HighLevelFuncionDemo {
  private  def filesHere = (new File(".")).listFiles

  def filesEnding(query:String) =
    for (file <- filesHere ; if file.getName.endsWith(query))
      yield  file
  def filesContaining(query:String) =
    for(file <- filesHere ; if file.getName.contains(query))
      yield file

  def filesRegex(query:String) =
    for (file<- filesHere; if file.getName.matches(query))
      yield  file
  //提取公共部分
  def fileMatching(query:String,macher:(String,String)=>Boolean)={
    for (file <- filesHere ;if  macher(file.getName,query))
      yield file
  }

  def  filesEnding1(query:String)=
    fileMatching(query,_.endsWith(_))

  def  filesMatching1(macher:String=>Boolean)={
    for (file <-filesHere;if macher(file.getName))
      yield file
  }

  def filesMathed(query:String)=
    filesMatching1(_.endsWith(query))

}
