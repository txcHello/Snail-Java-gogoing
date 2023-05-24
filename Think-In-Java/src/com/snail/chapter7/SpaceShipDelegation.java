package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 9:30
 * @Version 1.0
 * Desc:
 */
public class SpaceShipDelegation {
    private  String name;
    private  SpaceShipControls controls = new SpaceShipControls();
    public  SpaceShipDelegation(String name){
        this.name   =name;
    }
    //Delegated method
    public void back(int velocity){
        controls.back(velocity);
    }
}
