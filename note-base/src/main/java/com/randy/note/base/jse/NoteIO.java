//
// Source code recreated from a .class com.randy.file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.randy.note.base.jse;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NoteIO {
    public NoteIO() {
    }

    public static void main(String[] args) throws IOException {
        baseUsage();
        arrIO();
        extensionMethod();
        bufferedInputStream();
        fileReader();
        changeEncoding();
    }

    public static void changeEncoding() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\randy\\Desktop\\NewFolder\\file_o"), "GBK"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\randy\\Desktop\\NewFolder\\file_copy"), "UTF-8"));
        bw.write(br.readLine());
        br.close();
        bw.close();
    }

    public static void fileReader() throws IOException {
        FileReader fr = new FileReader("D:\\randy\\Desktop\\NewFolder\\file_o");
        System.out.println("该文件字符编码是：" + fr.getEncoding());
        System.out.println("流是否准备好读取：" + fr.ready());
        FileWriter fw = new FileWriter("D:\\randy\\Desktop\\NewFolder\\file_copy");
        System.out.println(fw.getEncoding());

        int i;
        while((i = fr.read()) != -1) {
            fw.write(i);
        }

        fr.close();
        fw.close();
    }

    public static void bufferedInputStream() throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("D:\\randy\\Desktop\\NewFolder\\file_o"));
        System.out.println("是否支持mark()方法" + fis.markSupported());
        fis.mark(1);
        System.out.print("标记当前位置并读取5个字节：");

        int i;
        for(i = 0; i < 5; ++i) {
            System.out.print(fis.read() + " ");
        }

        System.out.println();
        fis.reset();
        System.out.print("返回上一次被标记的位置继续读取：");

        for(i = 0; i < 5; ++i) {
            System.out.print(fis.read() + " ");
        }

        fis.close();
    }

    public static void extensionMethod() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\randy\\Desktop\\NewFolder\\file_o");
        System.out.println("是否支持mark()方法" + fis.markSupported());
        byte[] bytes = new byte[10];
        fis.read(bytes);
        System.out.println("读取10个字节后，指针后还有多少字节" + fis.available());
        fis.skip(10L);
        System.out.println("跳过10个字节后，指针后还有多少字节" + fis.available());
        fis.close();
        FileOutputStream fos = new FileOutputStream("D:\\randy\\Desktop\\NewFolder\\file_copy");
        fos.write(bytes, 5, 1);
        fos.flush();
        fos.close();
    }

    public static void arrIO() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\randy\\Desktop\\NewFolder\\file_o");
        byte[] arrB = new byte[5];
        FileOutputStream fos = new FileOutputStream("D:\\randy\\Desktop\\NewFolder\\file_copy");

        int b;
        while((b = fis.read(arrB)) != -1) {
            fos.write(arrB, 0, b);
        }

        fis.close();
        fos.close();
    }

    public static void baseUsage() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\randy\\Desktop\\NewFolder\\file_o");
        int b = fis.read();
        fis.close();
        FileOutputStream fos = new FileOutputStream("D:\\randy\\Desktop\\NewFolder\\file_copy");
        fos.write(b);
        fos.close();
    }
}
