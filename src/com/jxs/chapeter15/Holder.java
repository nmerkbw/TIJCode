package com.jxs.chapeter15;

/**
 * Created by jiangxs on 2018/4/11.
 */
public class Holder<T> {

    private T value;

    public Holder() {}

    public Holder(T val) {

        value = val;
    }

    public void set(T val) {

        value = val;
    }

    public T get() {

        return this.value;
    }

    public boolean equals(Object object) {

        return value.equals(object);
    }

    public static void main(String[] args) {

        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Holder<Fruit> fruit = apple; // error require:Fruit  find:Apple
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
        // fruit.set(d); error set方法中接受的参数类型为? extends Fruit
        try {
            Orange o = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruit.equals(d));
    }
}
