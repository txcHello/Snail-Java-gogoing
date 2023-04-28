package com.snail.preface;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Author Administrator
 * @Date 2023/4/22 21:27
 * @Version 1.0
 * Desc:
 */
public class SockertTCP01Client {
    public static void main(String[] args) throws IOException {
        // 1. 连接服务器(ip ,端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 2. 连接后生成Socket
        System.out.println("客户端 Socket " + socket);
        //3  得到和socket 连接的输出流
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello ,sever !!".getBytes(StandardCharsets.UTF_8));
        // 4.  关闭路对象和 socket
        //
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];

        int len = 0;

        while ((len = inputStream.read()) != -1) {

            System.out.println(new String(buf, 0, len));
        }
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
