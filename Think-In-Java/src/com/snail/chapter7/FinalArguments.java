package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/24 14:24
 * @Version 1.0
 * Desc:
 *
 *
 */
public class FinalArguments {
    void with(final  Gizmo gizmo){
        //  gizmo =new Gizmo();  //非法 gizmo is final
    }
    void  withOut(Gizmo gizmo){
        gizmo = new Gizmo();
        gizmo.spin();
    }
//    int g(final  int a){a +1;}
}
