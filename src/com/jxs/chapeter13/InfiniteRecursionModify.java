package com.jxs.chapeter13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/8.
 */
public class InfiniteRecursionModify {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {

        List<InfiniteRecursionModify> v = new ArrayList<>();
        for (int i=0;i<10;i++) {
            v.add(new InfiniteRecursionModify());
        }
        System.out.println(v);
    }
}
