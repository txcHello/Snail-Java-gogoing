package com.snail.preface;

import com.snail.utils.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Administrator
 * @Date 2023/4/24 21:31
 * @Version 1.0
 * Desc:
 */
public class TCPFileUploadServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        BufferedInputStream bis  = new BufferedInputStream(socket.getInputStream());

        byte[] array = StreamUtils.streamToByteArray(bis);

        //将得到的 bytes数组 写入指定路径 得到一个文件

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./demo.mobi"));
        bos.write(array);


        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }
}
