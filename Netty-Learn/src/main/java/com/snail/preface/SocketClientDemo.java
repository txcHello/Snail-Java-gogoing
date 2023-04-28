package com.snail.preface;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author Administrator
 * @Date 2023/4/23 11:10
 * @Version 1.0
 * Desc:
 */
public class SocketClientDemo {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello  server 字符流！！");
        bufferedWriter.newLine(); //通过写入结束， 接收数据必须通过readline接受
        bufferedWriter.flush();


        bufferedWriter.close();
        outputStream.close();
        socket.close();

    }
}
