//
// Source code recreated from a .class com.randy.file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.randy.jse;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Date;

public class Note_File {
    public Note_File() {
    }

    public static void main(String[] args) throws IOException {
        field();
        createFile();
        fileInformation();
        operation();
        compareFile();
    }

    public static void compareFile() throws IOException {
        File file1 = new File("D:\\randy\\Desktop\\NewFolder\\file1");
        file1.createNewFile();
        file1.deleteOnExit();
        File file2 = new File("D:\\randy\\Desktop\\NewFolder\\file2");
        file2.createNewFile();
        file2.deleteOnExit();
        PrintStream var10000 = System.out;
        boolean var10001 = file1.equals(file2);
        var10000.println("文件名及其路径是否相同" + var10001);
        var10000 = System.out;
        int var2 = file1.compareTo(file2);
        var10000.println("按字典比较file1与file2,结果为：" + var2);
    }

    public static void operation() throws IOException {
        File file = new File("D:\\randy\\Desktop\\NewFolder\\newFile");
        boolean isCreate = file.createNewFile();
        System.out.println("文件是否创建成功：" + isCreate);
        boolean isMake = file.mkdir();
        System.out.println("文件夹是否创建成功：" + isMake);
        File file1 = new File("D:\\randy\\Desktop\\NewFolder\\newFile1");
        boolean isRename = file.renameTo(file1);
        System.out.println("是否重命名成功：" + isRename + "，以前的文件名是：" + file.getName() + "，现在文件名是：" + file1.getName());
        boolean isDelete = file1.delete();
        System.out.println("是否删除成功：" + isDelete);
    }

    public static void fileInformation() throws IOException {
        File file = File.createTempFile("newFile", ".txt", new File("D:\\randy\\Desktop\\NewFolder"));
        file.deleteOnExit();
        System.out.println("是否是隐藏的：" + file.isHidden());
        System.out.println("是否可执行：" + file.canExecute());
        System.out.println("是否可读取：" + file.canRead());
        System.out.println("是否可写入：" + file.canWrite());
        System.out.println("路径是否存在：" + file.exists());
        System.out.println("是否是绝对路径：" + file.isAbsolute());
        System.out.println("路径是：：" + file.getPath());
        System.out.println("绝对路径是：" + file.getAbsolutePath());
        System.out.println("绝对路径是：" + file.getAbsoluteFile());
        System.out.println("路径的规范形式：" + file.getCanonicalPath());
        System.out.println("路径的规范形式：" + file.getCanonicalFile());
        System.out.println("父目录的路径是：" + file.getParent());
        System.out.println("父目录的路径是：" + file.getParentFile());
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是文件夹：" + file.isDirectory());
        System.out.println("名称是：" + file.getName());
        System.out.println("此路径的hash码：" + Integer.toHexString(file.hashCode()));
        PrintStream var10000 = System.out;
        Date var10001 = new Date(file.lastModified());
        var10000.println("最后一次被修改的时间：" + var10001);
        System.out.println("文件内容的长度是：" + file.length());
        var10000 = System.out;
        boolean var5 = file.setExecutable(false);
        var10000.println("设置此路径是否可执行，是否成功：" + var5 + "现在路径是否可执行：" + file.canExecute());
        var10000 = System.out;
        var5 = file.setReadable(false);
        var10000.println("设置此路径是否可读取，是否成功：" + var5 + "，现在路径是否可读取：" + file.canRead());
        var10000 = System.out;
        var5 = file.setWritable(true);
        var10000.println("设置此路径是否可写入，是否成功：" + var5 + "，现在路径是否可写入：" + file.canWrite());
        var10000 = System.out;
        var5 = file.setReadOnly();
        var10000.println("设置此路径是否只读，是否成功：" + var5 + "，现在路径是否可写入：" + file.canWrite());
        var10000 = System.out;
        var5 = file.setLastModified(1000L);
        var10000.println("设置路径最后修改时间，是否成功：" + var5 + ",现在文件最后修改时间为：" + new Date(file.lastModified()));
        File folder = file.getParentFile();
        String[] fileList1 = folder.list();
        System.out.println("文件夹中有：" + Arrays.toString(fileList1));
        String[] fileList2 = folder.list((dir, name) -> {
            return name.endsWith(".jpg");
        });
        System.out.println("以.jpg结尾的文件有：" + Arrays.toString(fileList2));
        File[] roots = File.listRoots();
        System.out.println("列出可用的文件系统根：" + Arrays.toString(roots));
        var10000 = System.out;
        long var6 = file.getTotalSpace();
        var10000.println("所在分区大小是：" + var6 + "Byte 或 " + file.getTotalSpace() / 1024L + "KB 或 " + file.getTotalSpace() / 1024L / 1024L + "MB 或 " + file.getTotalSpace() / 1024L / 1024L / 1024L + "GB");
        var10000 = System.out;
        var6 = file.getFreeSpace();
        var10000.println("所在分区未分配空间有：" + var6 + "Byte 或 " + file.getFreeSpace() / 1024L + "KB 或 " + file.getFreeSpace() / 1024L / 1024L + "MB 或 " + file.getFreeSpace() / 1024L / 1024L / 1024L + "GB");
        var10000 = System.out;
        var6 = file.getUsableSpace();
        var10000.println("所在分区可用于虚拟机的空间有：" + var6 + "Byte 或 " + file.getUsableSpace() / 1024L + "KB 或 " + file.getFreeSpace() / 1024L / 1024L + "MB 或 " + file.getFreeSpace() / 1024L / 1024L / 1024L + "GB");
    }

    public static void createFile() {
        new File("Folder\\com.randy.file");
    }

    public static void field() {
        System.out.println("Path分隔符为：" + File.pathSeparatorChar);
        System.out.println("Path分隔符为：" + File.pathSeparator);
        System.out.println("文件分隔符为：" + File.separatorChar);
        System.out.println("文件分隔符为：" + File.separator);
    }
}
