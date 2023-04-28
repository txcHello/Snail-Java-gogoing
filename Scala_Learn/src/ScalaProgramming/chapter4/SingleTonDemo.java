package ScalaProgramming.chapter4;

/**
 * @Author Administrator
 * @Date 2022/8/29 15:02
 * @Version 1.0
 * Desc:
 */
public class SingleTonDemo {
    public static void main(String[] args) {
     //   Student student = new Student();

        Student student = Student.createObject();
        Student student1 = Student.createObject();

        System.out.println(student==student1);


    }
}
