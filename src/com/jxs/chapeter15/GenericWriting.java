package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/12.
 */
public class GenericWriting {

    static <T> void writeExact(List<T> list, T item) {

        list.add(item);
    }

    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruit = new ArrayList<>();

    static void f1() {

        writeExact(apples, new Apple());
        try {
            writeExact(fruit, new Apple());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {

        list.add(item);
    }

    static void f2() {

        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {

        f1();
        f2();
    }
}
