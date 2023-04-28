package com.snail.preface;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Administrator
 * @Date 2023/4/20 22:03
 * @Version 1.0
 * Desc:
 */
public class InetApiDemo {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //根据主机名获取ip
        InetAddress byName = InetAddress.getByName("SC-202111292206");
        System.out.println(byName);
        //根据域名 获取ip
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);

    }
}
