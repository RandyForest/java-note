package com.randy.net.tcp.requestresponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Author: randy
 * Date: 2019/10/25 11:55
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress(10000);
        serverSocket.bind(socketAddress);

        System.out.println("等待连接...");
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");


        System.out.println("等待请求数据...");
        InputStream inputStream = socket.getInputStream();
        // byte[] bytes = inputStream.readAllBytes();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        String requestMessage = new String(bytes);
        // inputStream.close();
        System.out.println("请求数据内容：" + requestMessage);

        System.out.println("发送响应数据...");
        OutputStream outputStream = socket.getOutputStream();
        String responseMessage = "hello, I am server.";
        byte[] responseMessageBytes = responseMessage.getBytes();
        outputStream.write(responseMessageBytes);
        outputStream.flush();
        // outputStream.close();
        System.out.println("响应数据发送完成");

        socket.shutdownInput();
        socket.shutdownOutput();
        socket.close();
        serverSocket.close();
    }
}
