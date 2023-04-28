package com.snail.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author Administrator
 * @Date 2023/4/19 23:46
 * @Version 1.0
 * Desc:
 */
public class DirList3 {
    public static void main(String[] args) {
        File file = new File(".");
        String[] files;
        if (args.length == 0)
            files = file.list();
        else
            files = file.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);
        for (String s : files) {
            System.out.println(s);
        }
    }
}
