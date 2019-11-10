package com.randy.note.base.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Author: randy
 * Date: 2019/7/11 23:18
 */
public class URLConnectionNote {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/img/favicon.ico");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();

        System.out.println(urlConnection.getAllowUserInteraction());
        System.out.println(urlConnection.getConnectTimeout());
        System.out.println(urlConnection.getContent());
        System.out.println(urlConnection.getContentEncoding());
        System.out.println(urlConnection.getContentLength());
        System.out.println(urlConnection.getContentLengthLong());
        System.out.println(urlConnection.getContentType());
        System.out.println(urlConnection.getDate());
        System.out.println(urlConnection.getDefaultUseCaches());
        System.out.println(urlConnection.getDoInput());
        System.out.println(urlConnection.getDoOutput());
        System.out.println(urlConnection.getExpiration());
        System.out.println(urlConnection.getHeaderField(1));
        System.out.println(urlConnection.getLastModified());

    }
}
