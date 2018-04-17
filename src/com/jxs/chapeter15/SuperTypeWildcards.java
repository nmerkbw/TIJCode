package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/12.
 */
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        List<? extends Apple> list = new ArrayList<Jonathan>();
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit());   // Error
    }
}
