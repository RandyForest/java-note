package com.randy.jse;

public class Note_Integer {
    public Note_Integer() {
    }

    public static void main(String[] args) {
        displayDetails();
        basicUsage();
        conversionBase();
        conversionType();
        compareNumber();
        decodeNumber();
        integerOfBit();
    }

    public static void integerOfBit() {
        System.out.println("---使用Integer操作二进制---");
        int num = 233;
        int n = 1;
        System.out.println(num + "的符号是：" + Integer.signum(num));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，其中包含" + Integer.bitCount(num) + "个1");
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，只保留最高位的1后：" + Integer.toBinaryString(Integer.highestOneBit(num)));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，只保留最低位的1后：" + Integer.toBinaryString(Integer.lowestOneBit(num)));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，最高位1之前0的数量：" + Integer.numberOfLeadingZeros(num));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，最低位1之后0的数量：" + Integer.numberOfTrailingZeros(num));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，反转位后：" + Integer.toBinaryString(Integer.reverse(num)));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，反转字节后：" + Integer.toBinaryString(Integer.reverseBytes(num)));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，循环左移" + n + "位后：" + Integer.toBinaryString(Integer.rotateLeft(num, 1)));
        System.out.println(num + "的二进制补码是：" + Integer.toBinaryString(num) + "，循环右移" + n + "位后：" + Integer.toBinaryString(Integer.rotateRight(num, 1)));
    }

    public static void decodeNumber() {
        System.out.println("---解码数字---");
        System.out.println("八进制数0123的十进制是" + Integer.decode("0123"));
        System.out.println("十六进制数0x123的十进制是" + Integer.decode("0x123"));
    }

    public static void compareNumber() {
        System.out.println("---比较数字大小---");
        Integer num1 = 233;
        Integer num2 = -233;
        System.out.println(num1.compareTo(num1));
        System.out.println(num1.compareTo(num2));
        System.out.println(num2.compareTo(num1));
        System.out.println(Integer.compareUnsigned(num1, num1));
        System.out.println(Integer.compareUnsigned(num1, num2));
        System.out.println(Integer.compareUnsigned(num2, num1));
    }

    public static void conversionType() {
        System.out.println("---数据类型转换---");
        Integer num = 233;
        System.out.println(num + "的byte值是：" + num.byteValue());
        System.out.println(num + "的short值是：" + num.shortValue());
        System.out.println(num + "的int值是：" + num);
        System.out.println(num + "的long值是：" + num.longValue());
        System.out.println(num + "的float值是：" + num.floatValue());
        System.out.println(num + "的double值是：" + num.doubleValue());
        System.out.println(num + "的hash值是：" + num.hashCode());
    }

    public static void conversionBase() {
        System.out.println("---进制转换---");
        int num = 233;
        int radix = 4;
        System.out.println(num + "的二进制是：" + Integer.toBinaryString(num));
        System.out.println(num + "的八进制是：" + Integer.toOctalString(num));
        System.out.println(num + "的十六进制是：" + Integer.toHexString(num));
        System.out.println(num + "的" + radix + "进制是：" + Integer.parseInt(Integer.toString(num), radix));
        System.out.println(num + "的" + radix + "进制是：" + Integer.valueOf(Integer.toString(num), radix));
        System.out.println(num + "的" + radix + "进制是：" + Integer.toString(num, radix));
    }

    public static void basicUsage() {
        int num1 = 1;
        Integer num2 = Integer.valueOf(num1);
        num2 = num1;    // 自动装箱
        num1 = num2;    //自动拆箱
    }

    public static void displayDetails() {
        System.out.println("---显示Integer详情---");
        System.out.println("Integer的类型是：" + Integer.TYPE);
        System.out.println("Integer的字节数是：4");
        System.out.println("Integer的位数是：32");
        System.out.println("Integer的最小值是：-2147483648");
        System.out.println("Integer的最大值是：2147483647");
    }
}
