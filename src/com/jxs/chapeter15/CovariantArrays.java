package com.jxs.chapeter15;

/**
 * Created by jiangxs on 2018/4/11.
 */
public class CovariantArrays {

    public static void main(String[] args) {

        // 创建一个Apple类型的数组，并赋值给一个Fruit数组引用
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();

        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Fruit{}

class Apple extends Fruit {}

class Jonathan extends Apple {}

class Orange extends Fruit {}
