package com.snail.preface;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Author Administrator
 * @Date 2023/4/22 21:19
 * @Version 1.0
 * Desc:
 */
public class SocketTCP02 {


    public static void main(String[] args) throws IOException {
        //1.在本机的 9999端口监听,等待连接
        //要求 9999端口没有被占用
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.  当有客户端连接9999 端口时  程序会堵塞，等待连接
        // 如果有客户端l连接，则返回Socket 对象  程序继续
        Socket accept = serverSocket.accept();
        System.out.println(accept);
        //3. 获取写入的数据
        InputStream inputStream = accept.getInputStream();
        // 4.  IO额读取

        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1)
            System.out.println(new String(bytes, 0, readLen)); //根据实际读取的长度显示内容

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello client!!".getBytes(StandardCharsets.UTF_8));
        accept.shutdownOutput();
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }


}
