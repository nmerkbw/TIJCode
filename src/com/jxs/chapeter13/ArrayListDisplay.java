package com.jxs.chapeter13;

import java.util.ArrayList;

/**
 * Created by jiangxs on 2018/4/8.
 */
public class ArrayListDisplay {

    public static void main(String[] args) {

        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee coffee : new CoffeeGenerator(10)) {
            coffees.add(coffee);
        }
        System.out.println(coffees);
    }
}
