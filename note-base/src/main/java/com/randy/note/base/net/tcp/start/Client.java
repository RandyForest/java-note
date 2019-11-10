package com.randy.note.base.net.tcp.start;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

/**
 * Author: randy
 * Date: 2019/10/25 12:01
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        // 绑定客户端socket
        InetAddress inetAddress = Inet4Address.getByName("localhost");
        SocketAddress socketAddress=new InetSocketAddress(inetAddress,20000);
        socket.bind(socketAddress);

        // 连接服务器socket
        InetAddress serverAddress = Inet4Address.getByName("localhost");
        SocketAddress serverSocketAddress=new InetSocketAddress(serverAddress,10000);
        socket.connect(serverSocketAddress);

        OutputStream outputStream = socket.getOutputStream();
        String message="hello, I am client.";
        byte[] bytes = message.getBytes();
        outputStream.flush();
        outputStream.write(bytes);
        // outputStream.close();
        System.out.println("发送完成");

        socket.shutdownOutput();
        socket.shutdownInput();
        socket.close();
    }
}
