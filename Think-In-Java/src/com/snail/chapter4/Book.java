package com.snail.chapter4;

/**
 * @Author Administrator
 * @Date 2023/5/8 23:49
 * @Version 1.0
 * Desc:
 */
public class Book {
    Boolean checkedOut =false ;

    Book(boolean checkOut){
        checkedOut =checkOut;
    }
    void  checkIn(){
        checkedOut =false;
    }
    protected void  finalize(){
        if (checkedOut)
            System.out.println("Error ,check out ");
    }
}
