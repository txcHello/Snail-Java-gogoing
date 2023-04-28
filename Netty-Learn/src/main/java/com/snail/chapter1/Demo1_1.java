package com.snail.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Administrator
 * @Date 2023/4/19 23:00
 * @Version 1.0
 * Desc:
 * 阻塞 I/O 示例
 */
public class Demo1_1 {

    public static void main(String[] args) throws IOException {

        //创建一个新的ServerSocket对象 用来监听 指定端口上的连接请求
        ServerSocket serverSocket = new ServerSocket(9999);
        //调用accept 方法 直到建立一个连接
        Socket clientSocket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
        String request, response;
        while ((request = bufferedReader.readLine()) != null) {
            if ("Done".equals(request)) {
                break;
            }
            //response =  processRequset(request);  //请求被传递给服务器的处理方法
            printWriter.println(request); //服务器的响应被发送给了客户端
        }

    }
}
