package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/11.
 */
public class GenericsAndCovariance {

    public static void main(String[] args) {

        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());  error
        // flist.add(new Fruit());   error
        // flist.add(new Object());   error
        flist.add(null);  // legal but uninteresting
        // we know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}
