package ScalaProgramming.chapter7

import java.io.{BufferedReader, InputStreamReader}
import scala.util.control.Breaks.{break, breakable}

/**
 * @Author Administrator
 * @Date 2022/8/31 0:14
 * @Version 1.0
 *        Desc:
 *
 * 在while循环中，continue的含义是清楚的，不过在函数字面量当中应该是什么含义才合理呢？尽管Scala同时支持指令式和函数式风格
 * 的编程，在这个具体的问题上，它更倾向于函数式编程，以换取语言的简单。不过别担心，就算没有了break和continue，一样有很多其他
 * 方式来编程。而且，如果你用好了函数字面量，这里提到的其他方式
 * 通常比原来的代码更短。
 *
 *
 *   最简单的方式是用if换掉每个continue，用布尔值换掉每个break ;
 *
 *
 *   命令式编程向函数式编程过渡，其中一个问题就是不再写循环（while、for），而用递归函数代替
 *
 *但若从未总结的话，有时候会发现比较难以转换。这里就进行一下总结，找出循环和递归的对应关系
 *
 *什么是循环？所有的循环都可以看作，在一定条件下，反复执行某一段代码。循环体可以访问体外的变量，更改它们而产生副作用（实际上也仅能通过副作用来产生影响）
 *
 *循环的几个关键是：没有返回值、产生副作用、可以终止、可以进入下一轮
 *
 *而我们的目标是使用递归函数实现循环，同时满足需求。
 *
 *这个递归函数需要具有这样的特征来匹配对应的循环：有返回值、没有副作用、可以终止、可以进入下一轮
 *
 *这里暗含了为什么我们容易写循环而不容易写递归函数。循环的终止和继续都在循环体外控制，而参数是通过外部变量的形式被循环体访问，也不用返回，因此循环体写起来比较轻松。而对应的递归函数，需要在函数内考虑终止，考虑继续，考虑接受的参数，考虑返回的值。
 *
 *接下来就要分析如何从循环映射到递归函数
 *
 *首先要分析环境。环境就是这段代码要用到的变量、返回值。对于循环，理论上循环体外的所有变量它都可以访问，但是这里要看清楚，它具体使用了哪些，修改了哪些。对应地，循环体访问过的变量，就是递归函数需要接受的参数（包括index）；而循环体改变的变量，可能是递归函数的返回值，这个根据情况而定，有些变量仅仅是作为传递的逻辑依据，比如index。
 *
 *然后，循环的进入下一轮，包括条件满足，以及内部的continue，都可以在递归函数中实现为用新参数递归调用。而循环的终止，包括条件不满足以及break，都可以在递归函数中实现为返回值。
 *
 *注意，由于循环的每一体不可能驻留，所以循环一定可以实现为尾递归。
 *
 *
 *tips：找出设计的变量，找出终止的情况（成功返回，失败返回），找出进入下一轮的情况（递归）
 *
 */
object BreakAndContinueDemo extends App {

  var  i = 0
  var fountIt = false
  while (i<args.length && !fountIt){
    if (!args(i).startsWith("-")){

      if (args(i).endsWith(".scala")){
        fountIt =true
      }
    }
    i =i +1
  }

  //将var 变成 val  递归操作
  def searchFrom(i:Int):Int ={
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i+1)
    else if (args(i).endsWith(".scala")) i
    else  searchFrom(i+1)
  }

  val  in =new BufferedReader(new InputStreamReader(System.in))
    breakable{
      while(true){
        println("?")
        if (in.readLine()=="") break
      }
    }


}
