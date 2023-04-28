package ScalaProgramming.chapter18

/**
 * @Author Administrator
 * @Date 2022/9/14 23:41
 * @Version 1.0
 *          Desc:
 */
class BankAcount {
  private  var  bal :Int = 0
    def  balance :Int = bal

  def  deposit(acount: Int)={
    require(acount>0)
    bal += acount

  }
  def withdraw (acount:Int):Boolean={
    if (acount>bal){
      false
    }else{
      bal -=acount
        true
    }


  }



}
