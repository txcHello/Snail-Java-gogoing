package com.snail.preface;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @Author Administrator
 * @Date 2023/4/23 19:08
 * @Version 1.0
 * Desc:
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1, 创建一个DatagramSocket 对象 ， 准备在 9999接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2. 创建一个  DataGramPacket 对象 接收数据
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //3. 调用接收方法  将通过网络传输的 datagramOacket  对象 填充到 DataGramPacket 中
        //  当数据发送到 本机 9999端口， 就会接收到数据
        //  如果没有数据包发送到9999端口 就会阻塞等待
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        byte[] bytes = "好的，收到啦！！！".getBytes(StandardCharsets.UTF_8);
        int length1 = bytes.length;
        datagramPacket = new DatagramPacket(bytes, 0, length1, InetAddress.getByName(""), 9998);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();

    }
}
