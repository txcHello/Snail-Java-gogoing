package ScalaProgramming.chapter15

/**
 * @Author Administrator
 * @Date 2022/9/8 19:57
 * @Version 1.0
 *          Desc:
 */
object Example1 extends App {


   val  v = Var("x")
  val op = BinOp("+",Number(1.0),v)
  v.name
  op.left


}

abstract class Expr

case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class Unop(operator:String,arg:Expr)extends Expr
case class BinOp(operator:String,left:Expr,right:Expr)extends Expr
