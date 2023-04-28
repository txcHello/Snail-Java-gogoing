package com.snail.preface;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @Author Administrator
 * @Date 2023/4/23 19:20
 * @Version 1.0
 * Desc:
 */
public class UDPSendB {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] bytes = "明天吃饭去！！！！！".getBytes(UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.2"), 9999);
        datagramSocket.send(datagramPacket);
        byte[] buf = new byte[1024];

        datagramPacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        String string = new String(data, 0, length);
        System.out.println(string);
    }
}
