package com.snail.chapter8;

import sun.security.krb5.internal.crypto.Des;

/**
 * @Author Administrator
 * @Date 2023/5/26 15:47
 * @Version 1.0
 * Desc:
 */
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description   t  = new Description("Eats bugs");
    public  Frog(){
        System.out.println("Frog ()");
    }

    protected void   dispose(){
        System.out.println(" Frog dispose()");
        p.dispose();
        t.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        frog.dispose();
    }
}



class Characteristic {
    private  String s ;
    Characteristic(String s){
        this.s = s ;
        System.out.println("create Charateristic " + s);
    }
    protected void dispose(){
        System.out.println("dispose Charateristic " + s);
    }

}

class Description {
    private  String s ;
     Description(String s){
        this.s = s ;
        System.out.println("create Description " + s);
    }
    protected void dispose(){
        System.out.println("dispose Description " + s);
    }

}
class  LivingCreature{
    private  Characteristic c = new Characteristic("is alive");
    private Description t = new Description("Basic living is alive");
    LivingCreature (){
        System.out.println("Living Creature()");
    }
    protected  void  dispose(){
        System.out.println("LivingCreature dispose");
        c.dispose();
        t.dispose();
    }
}

class  Animal  extends LivingCreature{
    private Characteristic  p =  new Characteristic("has heart");
    private  Description   t = new Description("Animal not Vegetable");
    Animal(){
        System.out.println("Animal");
    }
    protected  void  dispose(){
        System.out.println("Animal dispose()");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends  Animal{
    private  Characteristic c = new Characteristic("can live in water");
    private  Description  d = new Description("Both water and land ");
    Amphibian (){
        System.out.println("Amphibian");
    }
    protected  void  dispose(){
        System.out.println("Amphibian dispose()");
        c.dispose();
        d.dispose();
        super.dispose();
    }

}
