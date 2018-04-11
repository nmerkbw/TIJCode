package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/11.
 */
public class GenericsAndCovariance {

    public static void main(String[] args) {

        List<? extends Fruit> flist = new ArrayList<Apple>();
        //flist.add(new Apple());  error

    }
}
