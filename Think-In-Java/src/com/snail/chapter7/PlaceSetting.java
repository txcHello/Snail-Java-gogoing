package com.snail.chapter7;


/**
 * @Author Administrator
 * @Date 2023/5/24 9:42
 * @Version 1.0
 * Desc:
 */
public class PlaceSetting extends Custom {
    private Spoon sp ;
    private Fork frk;
    private Knif  kf;
    private  DinnerPlate pl;
    public PlaceSetting(int i){
        super(i+1);
        sp  = new Spoon(i+2);
        frk = new Fork(i+3);
        kf = new Knif(i+4);
        pl = new DinnerPlate(i+5);
        System.out.println( "PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(1);
        System.out.println(placeSetting);
    }

}
