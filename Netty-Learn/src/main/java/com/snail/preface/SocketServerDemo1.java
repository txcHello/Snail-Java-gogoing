package com.snail.preface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Administrator
 * @Date 2023/4/23 11:01
 * @Version 1.0
 * Desc:
 */
public class SocketServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String result = null;
        while ((result = bufferedReader.readLine()) != null) {
            System.out.println(result);
        }

        bufferedReader.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
