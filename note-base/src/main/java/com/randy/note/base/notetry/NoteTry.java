package com.randy.note.base.notetry;

/**
 * Author: randy
 * Date: 2019/10/22 14:39
 */
class NoteTry {
    int tryInt() {
        int i;
        try {
            System.out.println("try");
            i = 1;
            return i;
        } catch (Exception e) {
            System.out.println("catch");
            i = 2;
            return i;
        } finally {
            System.out.println("finally");
            i = 3;      // 虽然最终会执行，但如果不在之后的return返回就不会覆盖try中的结果值1
            return i;   // 会覆盖 try 中的 return
        }

        // return i;    // 会覆盖 try 中的 return
    }

    /**
     * 在finally中改变了指针的地址也不会影响返回值
     * @return
     */
    public String tryString() {
        String s = new String("");
        try {
            s = new String("try");
            return s;
        } catch (Exception e) {
            s = new String("catch");
            return s;
        } finally {
            s = new String("finally");
            // return s;
        }

        // return s;
    }

    /**
     * 会改变引用变量的内部值
     * @return
     */
    public SimpleClass trySimpleClass(){
        SimpleClass simpleClass = new SimpleClass();
        try {
            simpleClass.setNum(1);
            return simpleClass;
        } catch (Exception e) {
            simpleClass.setNum(2);
            return simpleClass;
        }finally {
            simpleClass.setNum(3);  // 会改变 simpleClass 中的 num 的值
            // return simpleClass;
        }

        // return simpleClass;
    }

}
