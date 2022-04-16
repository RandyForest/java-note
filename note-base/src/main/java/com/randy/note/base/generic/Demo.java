package com.randy.note.base.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    static class Parent {
        void parentFun() {}
    }

    static class Son extends Parent {
        void sonFun() {}
    }

    static class House<T> {
        T person;

        T getPerson() {
            return person;
        }

        void setPerson(T person) {
            this.person = person;
        }
    }

    public static void main(String[] args) {
        House<? super Son> house = new House<Parent>();
        // house.setPerson(new Parent());
        house.setPerson(new Son());

        // Son s = house.getPerson();
        // Parent p = house.getPerson();
        Object o = house.getPerson();

        House<? extends Parent> house2 = new House<Son>();
        // house2.setPerson(new Parent());
        // house2.setPerson(new Son());

        // Son s2 = house2.getPerson();
        Parent p2 = house2.getPerson();
        Object o2 = house2.getPerson();
    }

    void fun() {
        // List<Integer> list = new ArrayList<Object>();
        List<? super Integer> list = new ArrayList<Number>();
        list.add(Integer.valueOf(1));
        // list2.add(new Object());

        // Integer i = list.get(0);
        // Number n = list.get(0);
        Object o = list.get(0);

        // List<Object> list2 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Integer>();
        // list2.add(new Object());
        // list2.add(Integer.valueOf(1));
        // Integer i2 = list2.get(0);
        // Number n = list.get(0);
        Object o2 = list2.get(0);
    }
}
