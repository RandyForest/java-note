package com.randy.note.base.modifier.access;

/**
 * 访问权限修饰符
 * <p>
 * Author: randy
 * Date: 2019/11/16 23:12
 */
class AccessModifier {
    int a1 = 1;
    static int a2 = 2;
    final int a3 = 3;

    class PP1 {
        int b1 = a1;
        int b2 = a2;
        int b3 = a3;
        final int b4 = a1;
        int bb2 = PP2.b2;
    }

    static class PP2 {
        int b1 = a2;
        static int b2 = a2;
        int b3 = new AccessModifier().a1;
        PP1 pp1 = new AccessModifier().new PP1();
    }

}
