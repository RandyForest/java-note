//
// Source code recreated from a .class com.randy.file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.randy.jse;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Note_Arrays {
    public Note_Arrays() {
    }

    public static void main(String[] args) {
        createList();
        operation();
    }

    public static void operation() {
        int[] arrInt1 = new int[]{1, 2, 3, 4, 5};
        int[] arrInt2 = new int[]{-1, 0, 1, 2, 3};
        int[] arrInt3 = new int[]{1, 2, 3, 4, 5};
        System.out.println("将数组转换成特定格式的字符串：" + Arrays.toString(arrInt1));
        PrintStream var10000 = System.out;
        Object[] var10001 = new Object[]{arrInt1};
        var10000.println("深度转换成字符串：" + Arrays.deepToString(var10001));
        System.out.println("arrInt1的hash码是：" + Arrays.hashCode(arrInt1));
        var10000 = System.out;
        var10001 = new Object[]{arrInt1};
        var10000.println("arrInt1的深度hash码：" + Arrays.deepHashCode(var10001));
        var10000 = System.out;
        int var4 = Arrays.compare(arrInt1, arrInt2);
        var10000.println("arrInt1与arrInt2比较，返回：" + var4);
        System.out.println(Arrays.equals(arrInt1, arrInt3));
        System.out.println(Arrays.equals(new int[][]{arrInt1}, new int[][]{arrInt3}));
        System.out.println(Arrays.deepEquals(new int[][]{arrInt1}, new int[][]{arrInt3}));
        System.out.println(Arrays.deepEquals(new int[][]{arrInt1}, new int[][]{arrInt2}));
        var10000 = System.out;
        var4 = Arrays.mismatch(arrInt1, arrInt2);
        var10000.println("arrInt1与arrInt2从第几个索引开始不匹配：" + var4);
        int[] arrInt4 = Arrays.copyOf(arrInt1, 3);
        System.out.println("arrInt3从arrInt1中复制了前3个元素，arrInt3中的元素：" + Arrays.toString(arrInt4));
        Arrays.fill(arrInt4, 111);
        System.out.println("arrInt4中全部填入111后：" + Arrays.toString(arrInt4));
        Arrays.setAll(arrInt1, (operand) -> {
            return operand - 1;
        });
        System.out.println("设置全部元素为索引减1：" + Arrays.toString(arrInt1));
        Arrays.sort(arrInt1);
        System.out.println("升序排序：" + Arrays.toString(arrInt1));
        Arrays.parallelPrefix(arrInt1, (left, right) -> {
            return left + right;
        });
        System.out.println("全部元素等于自身加上左边的元素：" + Arrays.toString(arrInt1));
        Arrays.parallelSetAll(arrInt1, (operand) -> {
            return operand * 2;
        });
        System.out.println("对每个元素按照索引值乘以2后，arrInt1中是：" + Arrays.toString(arrInt1));
        Arrays.parallelSort(arrInt1);
        System.out.println("按照数字顺序排序后，arrInt1:" + Arrays.toString(arrInt1));
    }

    public static int[] getInts() {
        int[] arrInt1 = new int[]{1, 2, 3, 4, 5};
        System.out.println("整型1在数组中的第几个索引：" + Arrays.binarySearch(arrInt1, 1));
        System.out.println("在索引[0,2)中查找整型3的索引：" + Arrays.binarySearch(arrInt1, 0, 2, 3));
        return arrInt1;
    }

    public static void createList() {
        List list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1);
    }
}
