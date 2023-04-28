package ScalaProgramming.chapter3

import scala.collection.mutable

/**
 * @Author Administrator
 * @Date 2022/8/29 1:20
 * @Version 1.0
 *          Desc:
 */
object MapAndSetOfUseDemo {
  def main(args: Array[String]): Unit = {
    var strings = Set("alice", "Airbus")
    strings += "Lear"
    println(strings.contains("Cessna"))

    println("------------可变集合---------------")
    val movieSet : mutable.Set[String] = mutable.Set("Hitch", "Poltergeist")
    movieSet +="Shrek"
    println(movieSet)

    val treasureMap : mutable.Map[Int, String] = mutable.Map[Int, String]()
       treasureMap +=(1 -> "go to island.")
    treasureMap +=(2 -> "find big X on ground")
    treasureMap +=(3 -> "Dig.")
    println(treasureMap(2))
    val tuple: (Int, String) = 1.->("hello")
  }

}
