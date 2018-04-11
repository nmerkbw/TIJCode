package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/2.
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {

        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        List<Integer> l = makeList(1,2,3);
        System.out.println(l);
        ls = makeList(("ABCDEFGHIJKLMNOPQ").split(""));
        System.out.println(ls);
    }
}
