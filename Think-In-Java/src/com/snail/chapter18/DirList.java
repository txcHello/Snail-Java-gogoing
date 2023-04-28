package com.snail.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author Administrator
 * @Date 2023/4/18 21:42
 * @Version 1.0
 * Desc:
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list = path.list();
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter {

    private Pattern pattern;

    DirFilter(String regx) {
        pattern = Pattern.compile("regex");
    }


    @Override
    public boolean accept(File dir, String name) {
        pattern.matcher(name).matches();
        return false;
    }
}