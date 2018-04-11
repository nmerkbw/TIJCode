package com.jxs.chapeter5;

public class ThisDemo2 {

    private String name;
    private int age;

    public ThisDemo2() {
        System.out.println("这是构造器1");
    }

    public ThisDemo2(String name) {

        this();
        this.name = name;
        System.out.println("这是构造器2");
    }

    public ThisDemo2(String name, int age) {

        this(name);
        this.age = age;
        System.out.println("这是构造器3");
    }

    public static void main(String[] args) {

        String userName = "jiangxs";
        int age = 24;
        ThisDemo2 t = new ThisDemo2(userName, age);
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "ThisDemo2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
