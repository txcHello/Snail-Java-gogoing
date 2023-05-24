package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 9:26
 * @Version 1.0
 * Desc:
 */
public class SpaceShip extends SpaceShipControls{
    private  String name;
    public  SpaceShip(String name){this.name=name;}
    public String  toString (
    ){
        return  name;
    }

    public static void main(String[] args) {
        SpaceShip hello = new SpaceShip("hello");
        hello.forward(23);
    }

}
