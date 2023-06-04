package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/30 15:12
 * @Version 1.0
 * Desc:
 */
public class PolyConstructors {

    public static void main(String[] args) {
        RoundGlyph roundGlyph = new RoundGlyph(5);
        //Before Glyph
        //Glyph.draw()
        //After  Glyph
        //"RoundGlyph.RoundGlyph() ,Radius =  5"
    }
}
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println(" Before Glyph ");
        draw();
        System.out.println(" After  Glyph ");

    }
}
class  RoundGlyph extends  Glyph{
    private int radius= 1;
    public RoundGlyph(int radius){
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph() ,Radius = " + radius);
    }
    void  draw(){
        System.out.println("RoundGlyph,draw(),Radius= " + radius);
    }
}