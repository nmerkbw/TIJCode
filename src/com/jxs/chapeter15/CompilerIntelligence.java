package com.jxs.chapeter15;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/12.
 */
public class CompilerIntelligence {

    public static void main(String[] args) {

        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple apple = (Apple) flist.get(0); // No Warning
        flist.contains(new Apple());// Argument is 'Object'
        flist.indexOf(new Apple());// Argument is 'Object'
    }
}
