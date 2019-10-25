package com.randy.net.tcp.requestresponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.*;
import java.util.Arrays;

/**
 * Author: randy
 * Date: 2019/10/25 12:01
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        InetAddress inetAddress = Inet4Address.getByName("localhost");
        SocketAddress socketAddress=new InetSocketAddress(inetAddress,20000);
        socket.bind(socketAddress);

        InetAddress serverAddress = Inet4Address.getByName("localhost");
        SocketAddress serverSocketAddress=new InetSocketAddress(serverAddress,10000);
        socket.connect(serverSocketAddress);


        System.out.println("发送请求数据...");
        OutputStream outputStream = socket.getOutputStream();
        String requestMessage="hello, I am client.";
        byte[] requestMessageBytes = requestMessage.getBytes();
        requestMessageBytes = Arrays.copyOf(requestMessageBytes, 1024);
        outputStream.write(requestMessageBytes);
        outputStream.flush();
        // outputStream.close();
        System.out.println("请求数据发送完成");

        System.out.println("等待响应数据...");
        InputStream inputStream = socket.getInputStream();
        byte[] responseMessageBytes = inputStream.readAllBytes();
        String responseMessage = new String(responseMessageBytes);
        // inputStream.close();
        System.out.println("响应数据内容："+responseMessage);

        socket.shutdownOutput();
        socket.shutdownInput();
        socket.close();
    }
}
