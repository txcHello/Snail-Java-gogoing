package com.snail.chapter18;

import java.io.File;

/**
 * @Author Administrator
 * @Date 2023/4/18 21:33
 * @Version 1.0
 * Desc:
 */
public class IODemo {
    public static void main(String[] args) {
        File file = new File("E:\\技术书籍\\spark");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File file1 = new File(".");
        for (String s : file1.list()) {
            System.out.println(s);
        }

    }

}
