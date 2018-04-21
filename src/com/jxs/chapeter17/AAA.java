package com.jxs.chapeter17;


import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class BB {

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}

public class AAA extends BB {

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        AAA a = new AAA();
        a.setS("jjj");
        System.out.println(a.getS());

        Class clazz = Class.forName("com.jxs.chapeter17.BB");
        BB bb = (BB) clazz.newInstance();
        Field s = clazz.getDeclaredField("s");
        s.setAccessible(true);
        s.set(bb, "jmf");
        System.out.println(bb.getS());

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
