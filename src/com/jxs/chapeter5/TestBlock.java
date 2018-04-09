package com.jxs.chapeter5;

/**
 * Created by jiangxs on 2018/4/2.
 */
public class TestBlock {

    public static int a = 0;


    static {
        a = 10;
        System.out.println("静态代码块在执行a=" + a);
    }

    {
        a = 8;
        System.out.println("非静态代码块在执行a=" + a);
    }



    public TestBlock() {
        this("带参构造方法在执行a="+a); // 调用另外一个构造方法
        System.out.println("无参构造方法在执行a=" + a);
    }


    public TestBlock(String n) {
        System.out.println(n);
    }


    public static void main(String[] args) {
        TestBlock t = null;
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        t = new TestBlock("123");
    }
}
