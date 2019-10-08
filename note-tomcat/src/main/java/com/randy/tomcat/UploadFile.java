package com.randy.tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * Author: randy
 * Date: 2019/8/23 21:33
 */
public class UploadFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UploadFile#doGet()");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UploadFile#doPost()");

        // 读取文件
        URI uri = null;
        try {
            // System.out.println(this.getClass().getClassLoader().getResource("./").toURI());
            uri = Objects.requireNonNull(this.getClass().getClassLoader().getResource("./")).toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        assert uri != null;
        URI uri1 = uri.resolve("./files/test-file.txt");
        File file = new File(uri1);
        System.out.println(file.getAbsoluteFile());

        // String[] list = file.list();
        // assert list != null;
        // for (String i : list) {
        //     System.out.println(i);
        // }

        InputStream is = new FileInputStream(file);
        byte[] bytes = is.readAllBytes();
        String s = new String(bytes);
        System.out.println(s);

        resp.sendRedirect(req.getContextPath()+"/upload-file.html");
    }
}
