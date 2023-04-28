package com.snail.chapter2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @Author Administrator
 * @Date 2023/4/24 14:07
 * @Version 1.0
 * Desc:
 */
public class EchoServer {
    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 1) {
            System.err.println("Usage: " + EchoServer.class.getSimpleName() + "<port>");
        } else {
            int i = Integer.parseInt(args[0]);
            new EchoServer(i).start();
        }
    }

    public void start() throws InterruptedException {
        final EchoServerHandler echoServerHandler = new EchoServerHandler();
        // 创建EventLoopGroup
        NioEventLoopGroup group = new NioEventLoopGroup();

        try {
            // 创建ServerBootstrap
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(group)
                    .channel(NioServerSocketChannel.class)  //指定所使用的 NIO 传输 Channel
                    .localAddress(new InetSocketAddress(port))  //使用指定的 端口设置套 接字地址
                    .childHandler(new ChannelInitializer<SocketChannel>() {  //添加一个EchoServerHandler 到子Channel的 ChannelPipeline
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(echoServerHandler);//EchoServerHandler 被标注为@Shareable，所以我们可以总是使用同样的实例
                        }
                    });

            ChannelFuture sync = serverBootstrap.bind().sync();//异步地绑定服务器；调用 sync()方法阻塞等待直到绑定完成
            sync.channel().closeFuture().sync(); //获取 Channel 的CloseFuture，并且阻塞当前线程直到它完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully().sync();  //关闭 EventLoopGroup,释放所有的资源
        }
    }
}
