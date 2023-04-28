package com.snail.preface;

import com.snail.utils.StreamUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @Author Administrator
 * @Date 2023/4/24 21:31
 * @Version 1.0
 * Desc:
 */
public class TCPFileUploadClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //创建磁盘读取文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\电子书\\少有人走的路.mobi"));

        byte[] array = StreamUtils.streamToByteArray(bis); //将读取的文件读取到字节数组中
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());// 通过socket 获取到输出流，将bytes数组发送给服务端

         bos.write(array); //将文件对应的字节数组的内容，写入数据通道

        socket.shutdownOutput();//设置数据写入结束标志
        bos.close();
        bis.close();
        socket.close();


    }
}
