package com.randy.net.tcp.start;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Author: randy
 * Date: 2019/10/25 11:55
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress(10000);
        serverSocket.bind(socketAddress);
        // serverSocket.setSoTimeout(5*1000);
        // Set<SocketOption<?>> socketOptions = serverSocket.supportedOptions();
        // socketOptions.forEach(socketOption -> {
        //     System.out.print("name: "+socketOption.name());
        //     System.out.print(", type: "+socketOption.type());
        //     System.out.println();
        // });

        // System.out.println("LocalPort： "+serverSocket.getLocalPort());
        // System.out.println("ReuseAddress： "+serverSocket.getReuseAddress());
        // System.out.println("ReceiveBufferSize： "+serverSocket.getReceiveBufferSize());

        System.out.println("等待连接...");
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");

        System.out.println("等待数据...");
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        String s = new String(bytes);
        System.out.println("数据内容："+s);
        // inputStream.close();

        socket.shutdownOutput();
        socket.shutdownInput();
        socket.close();
        serverSocket.close();
    }
}
