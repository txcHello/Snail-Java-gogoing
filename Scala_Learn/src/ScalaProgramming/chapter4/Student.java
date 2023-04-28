package ScalaProgramming.chapter4;

/**
 * @Author Administrator
 * @Date 2022/8/29 15:02
 * @Version 1.0
 * Desc:
 */
public class Student {

    private Student(){}
   private  static Student student =  new Student();;
    public static Student   createObject(){

         return student;
    }
}
