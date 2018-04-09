package com.jxs.chapeter13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/8.
 */
public class InfiniteRecursion {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {

        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i=0;i<10;i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
