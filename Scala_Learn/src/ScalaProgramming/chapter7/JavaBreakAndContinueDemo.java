package ScalaProgramming.chapter7;

import java.util.ArrayList;

/**
 * @Author Administrator
 * @Date 2022/8/31 0:34
 * @Version 1.0
 * Desc:
 */
public class JavaBreakAndContinueDemo {
    public static void main(String[] args) {
        String[] strings = {"hello", ".scala"};

        int i= 0 ;
        boolean foundIt =false;
        while(strings.length>i){

            if(strings[i].startsWith("-")){
                i =i+1;
                continue;
            }
            if (strings[i].endsWith(".scala")){
                foundIt =true;
                break;
            }
            i = i+1 ;
        }
    }
}
