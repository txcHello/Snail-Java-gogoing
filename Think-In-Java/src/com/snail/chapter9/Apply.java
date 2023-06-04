package com.snail.chapter9;

import java.util.Arrays;


/**
 * @Author Administrator
 * @Date 2023/6/1 11:00
 * @Version 1.0
 * Desc:
 *  策略模式:
 *  创建一个能够根据传递参数对象的不同而执行不同的而具有不同行为的方法的 被称为策略模式
 */
public class Apply {
    public  static void process(Processor p ,Object s){
        System.out.println("Useing Processor " +  p.name());
        System.out.println(p.process(s));
    }
        public static  String  s = "Disagreement with beliefs  is  by definition  incorret!!";
    public static void main(String[] args) {
        process(new Upcase(),s);
    }
}

class Processor{
    public String name(){
        return  getClass().getSimpleName();
    }
    Object process (Object input){
        return input;
    }
}
class  Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class  Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class  Spliter extends Processor{
    String process(Object input){
        String[] s = ((String) input).split(" ");


        String s1 = Arrays.toString(s);
        return  s1;
    }
}
