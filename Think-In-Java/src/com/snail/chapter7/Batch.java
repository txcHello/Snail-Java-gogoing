package com.snail.chapter7;

/**
 * @Author Administrator
 * @Date 2023/5/23 22:10
 * @Version 1.0
 * Desc:
 */
public class Batch {
    private String s1 = "happy",
            s2 = "Happy", s3, s4;

    private Soap castille;
    private int i;
    private float toy;

    public Batch() {
        System.out.println("Inside Bath()");
        s3 = "joy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null)
            s4 = "joy";
        return
                "value1=" + s1 + " " +
                        "value2=" + s2 + " " +
                        "value3=" + s3 + " " +
                        "value4=" + s4 + "\n" +
                        "i=" + i + "" + "toy=" + toy + " " +
                        "castille = " + castille;

    }

}
