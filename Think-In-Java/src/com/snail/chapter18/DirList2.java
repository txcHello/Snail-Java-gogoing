package com.snail.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author Administrator
 * @Date 2023/4/18 22:06
 * @Version 1.0
 * Desc:
 */
public class DirList2 {

    public static FilenameFilter filter(String regx) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regx);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }


    public static void main(String[] args) {
        File file = new File(".");
        String[] list;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(filter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
