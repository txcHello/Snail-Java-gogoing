package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/29 22:32
 * @Version 1.0
 * Desc:
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Compsing[] compsings = {
                new Compsing(shared),
                new Compsing(shared),
                new Compsing(shared),
                new Compsing(shared)
        };
        for (Compsing compsing : compsings) {
            compsing.dispose();
        }
    }
}

class Shared {
    private  int refcount= 0;
    private  static  long counter = 0;
    private  final  long id = counter++;
    public Shared(){
        System.out.println("Creating " + this);
    }
    public void  addRef(){
        refcount ++;
    }
    protected  void  dispose(){
        if (--refcount==0 ){
            System.out.println("Disposing" + this);
        }
    }
    public String toString(){
        return  "Shared " + id;
    }
}

class  Compsing{
    private  Shared shared;
    private  static  long counter = 0;
    private final  long  id = counter++;
    public Compsing(Shared shared){
        System.out.println("Creating"+ this);
        this.shared=shared;
        this.shared.addRef();
    }
    public void dispose(){
        System.out.println("disposing" + this);
        shared.dispose();
    }
    public  String  toString(){
        return   "Composing" + id;
    }
}