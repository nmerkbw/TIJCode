package com.jxs.chapeter5.initialization;

import org.junit.Test;

class Father {

    public String name = getName("父类中的非静态成员变量");

    {
        System.out.println("父类初始化非静态代码块");
    }

    static {
        System.out.println("父类初始化静态代码块");
    }

    public Father() {

        System.out.println("调用父类构造器");
    }

    public static String staticName = getName("父类中的静态成员变量");

    public static String getName(String name) {

        System.out.println("Father.getName: " + name);
        return name;
    }

}
public class Son extends Father {

    public static String staticName = getName("子类中的静态成员变量");

    public Son() {

        System.out.println("调用子类构造器");
    }

    static {
        System.out.println("子类初始化静态代码块");
    }

    public String name = getName("子类中的非静态成员变量");

    {
        System.out.println("子类初始化非静态代码块");
    }

    public static void main(String[] args) {

        new Son();
    }

    @Test
    public void test() {

        new Son();
    }
}
