package com.jxs.chapeter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/4/12.
 */
public class UnboundedWildcards {

    public static void main(String[] args) {

        List list1 = new ArrayList();
        List<?> list2 = new ArrayList<>();
        list1.add(1);
        // list2.add(1); // Error add (capture<?>)in List cannot be applied to (int)
    }
}
