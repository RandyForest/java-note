//
// Source code recreated from a .class com.randy.file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.randy.note.base.jse;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class NoteArrayList {
    public NoteArrayList() {
    }

    public static void main(String[] args) {
        constructor();
        addElement();
        ckeck();
        operation();
    }

    public static void operation() {
        ArrayList<Integer> arrInt1 = new ArrayList();

        for(int i = 1; i < 20; ++i) {
            arrInt1.add(i);
        }

        ArrayList<Integer> arrInt2 = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            arrInt2.add(i);
        }

        arrInt1.ensureCapacity(30);
        arrInt1.trimToSize();
        Integer num = (Integer)arrInt1.remove(3);
        System.out.println(num + "被移除了，现在arrInt1中有：" + arrInt1);
        arrInt1.remove(5);
        System.out.println("移除元素5后，arrInt1中有：" + arrInt1);
        arrInt1.removeAll(arrInt2);
        System.out.println("移除arrInt2中的元素后，arrInt1中的元素有：" + arrInt1);
        arrInt1.removeIf((integer) -> {
            return integer > 15;
        });
        System.out.println("删除大于10的元素后，arrInt1中的元素有：" + arrInt1);
        arrInt1.removeIf(new Predicate() {
            public boolean test(Object o) {
                return (Integer)o > 14;
            }
        });
        System.out.println("删除大于14的元素后，arrInt1中的元素有：" + arrInt1);
        arrInt1.replaceAll((integer) -> {
            return integer + 1;
        });
        System.out.println("将每个元素都加1后，arrInt1中的元素为：" + arrInt1);
        Object[] objects = arrInt1.toArray();
        System.out.println("把arrInt1作为对象数组传入object后，object中元素有：" + Arrays.toString(objects));
        Integer[] array = (Integer[])arrInt1.toArray(new Integer[0]);
        System.out.println("把arrInt1作为Integer数组传入array后，array中有：" + Arrays.toString(array));
        arrInt1.retainAll(arrInt2);
        System.out.println("保留arrInt1中包含arrInt2中的元素，arrInt1中元素有：" + arrInt1);

        for(int i = 0; i < 5; ++i) {
            arrInt1.add(i);
        }

        System.out.println("加入5个元素后，arrInt1中有：" + arrInt1);
        List<Integer> list = arrInt1.subList(1, 3);
        System.out.println("arrInt1中索引1到2的元素是：" + list);
    }

    public static void ckeck() {
        ArrayList<Integer> arrInt1 = new ArrayList();
        arrInt1.add(1);
        arrInt1.add(2);
        arrInt1.add(3);
        arrInt1.add(4);
        arrInt1.add(5);
        arrInt1.add(5);
        arrInt1.add(5);
        ArrayList<Integer> arrInt2 = new ArrayList();
        arrInt2.add(1);
        System.out.println("arrInt1中元素是否为空：" + arrInt1.isEmpty());
        System.out.println("arrInt1中的元素有：" + arrInt1.size() + "个");
        System.out.println("arrInt1中是否包含3：" + arrInt1.contains(3));
        PrintStream var10000 = System.out;
        boolean var10001 = arrInt1.containsAll(arrInt2);
        var10000.println("arrInt1中是否包含arrInt2中的元素：" + var10001);
        System.out.println("arrInt1中索引1处的元素是：" + arrInt1.get(1));
        System.out.println("元素4第一次出现的索引是：" + arrInt1.indexOf(4));
        System.out.println("元素4最后一次出现的索引是：" + arrInt1.lastIndexOf(4));
        arrInt1.forEach(new Consumer<Integer>() {
            public void accept(Integer integer) {
                if (integer < 3) {
                    System.out.println("小于3的数有：" + integer);
                }

            }
        });
        arrInt1.forEach((integer) -> {
            if (integer > 3) {
                System.out.println("大于3的数有：" + integer);
            }

        });
        Iterator<Integer> iterator = arrInt1.iterator();
        System.out.println("arrInt1中有下一个元素吗：" + iterator.hasNext());
        System.out.println("arrInt1中下一个元素是：" + iterator.next());
        iterator.remove();
        System.out.println("移除上一个获取到的元素后，arrInt1中的元素有：" + arrInt1);
        iterator.forEachRemaining(new Consumer<Integer>() {
            public void accept(Integer integer) {
                if (integer < 3) {
                    integer = integer + 1;
                }

                System.out.println("所有小于3的数被加上1后：" + integer);
            }
        });
        arrInt1.iterator().forEachRemaining((Integer) -> {
            if (Integer > 3) {
                Integer = Integer - 1;
                System.out.println("所有大于3的数减去1后：" + Integer);
            }

        });
        ListIterator listIterator = arrInt1.listIterator();

        while(listIterator.hasNext()) {
            listIterator.next();
        }

        System.out.println("指针前有元素吗：" + listIterator.hasPrevious());
        System.out.println("指针前一个元素是：" + listIterator.previous());
        System.out.println("指针的前一个元素的索引是：" + listIterator.previousIndex());

        while(listIterator.hasPrevious()) {
            int n = (Integer)listIterator.previous();
            if (n == 3) {
                listIterator.set(111);
            } else if (n > 3) {
                listIterator.remove();
            } else {
                listIterator.add(11);
                listIterator.previous();
            }
        }

        System.out.println(arrInt1);
    }

    public static void addElement() {
        ArrayList<Integer> arrInt1 = new ArrayList();
        boolean b1 = arrInt1.add(11);
        String str = arrInt1.toString();
        System.out.println("向arrInt1中加入元素11，是否加入成功：" + b1 + "，现在arrInt1中的元素有：" + str);
        arrInt1.add(1, 22);
        System.out.println("arrInt1中的元素有：" + arrInt1);
        ArrayList<Integer> arrInt2 = new ArrayList(10);
        boolean b2 = arrInt2.addAll(arrInt1);
        System.out.println("把arrInt1中的元素全部加入arrInt2，是否加入成功：" + b2 + "，现在arrInt2中的元素有：" + arrInt2);
        boolean b3 = arrInt2.addAll(1, arrInt1);
        System.out.println("在attInt2中索引1处加入arrInt1中的所有元素，是否加入成功：" + b3 + "现在arrInt2中的元素有：" + arrInt2);
        ArrayList<Integer> arrInt3 = (ArrayList)arrInt2.clone();
        System.out.println("把arrInt2克隆到arrInt3，现在arrInt3中的元素有：" + arrInt3);
    }

    public static void constructor() {
        ArrayList<Integer> arrInt1 = new ArrayList();
        new ArrayList(10);
        new ArrayList(arrInt1);
    }
}
