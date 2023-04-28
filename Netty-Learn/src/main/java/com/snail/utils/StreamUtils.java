package com.snail.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Administrator
 * @Date 2023/4/23 12:45
 * @Version 1.0
 * Desc:
 */
public class StreamUtils {


    public static  byte[]  streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while (  ( len = is.read(bytes)) != -1){
            bos.write(bytes,0,len);

        }

        byte[] array = bos.toByteArray();
        bos.close();
        return  array;
    }

}
