package com.randy.note.base.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Author: randy
 * Date: 2019/7/11 19:48
 */
public class URLNote {
    public static void main(String[] args) throws IOException {
        baseUsage();

    }

    private static void baseUsage() throws IOException {
        URL url = new URL("https://www.baidu.com/img/favicon.ico?user=user1&passwd=pass#top");
        System.out.println("Host: "+url.getHost());
        System.out.println("Authority： "+url.getAuthority());
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Path: "+url.getPath());
        System.out.println("File: "+url.getFile());
        System.out.println("Port: "+url.getPort());
        System.out.println("Query: "+url.getQuery());
        System.out.println("Ref: "+url.getRef());
        System.out.println("UserInfo: "+url.getUserInfo());
        System.out.println("DefaultPort: "+url.getDefaultPort());
        System.out.println("Content: "+url.getContent());
    }
}
