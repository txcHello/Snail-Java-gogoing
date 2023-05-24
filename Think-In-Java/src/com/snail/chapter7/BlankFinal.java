package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 14:13
 * @Version 1.0
 * Desc:
 */
public class BlankFinal {
    private final int i = 0 ;
    private final  int j ; //空白final
    private final  Poppet p; //空表final reference
    BlankFinal(){
        j =i;  //Initialize blank final
        p = new Poppet(1);
    }
    BlankFinal(int x ){
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal();
        BlankFinal blankFinal1 = new BlankFinal(2);
    }

}
