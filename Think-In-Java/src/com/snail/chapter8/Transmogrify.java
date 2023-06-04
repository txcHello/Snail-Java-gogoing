package com.snail.chapter8;

/**
 * @Author Administrator
 * @Date 2023/5/30 23:40
 * @Version 1.0
 * Desc:
 *
 *  用继承表达行为间的差异，并用字段
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perFormPlay();
        stage.change();
        stage.perFormPlay();
    }
}

class Actor{
    public void act(){

    }
}

class SadActor extends Actor{
    public void act(){
        System.out.println("SadActor");
    }
}
class HappyActor extends  Actor{
    public void act(){
        System.out.println("HappyActor");
    }
}

class Stage{
    private Actor actor = new HappyActor();
    public void  change(){
        actor= new SadActor() ;
    }
    public void  perFormPlay(){
        actor.act();
    }
}