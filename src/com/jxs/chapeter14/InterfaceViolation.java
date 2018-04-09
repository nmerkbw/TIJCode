package com.jxs.chapeter14;

/**
 * Created by jiangxs on 2018/4/9.
 */
class B implements A {

    @Override
    public void f() {

    }

    public void g() {

    }
}

public class InterfaceViolation {

    public static void main(String[] args) {

        A a = new B();
        a.f();
        System.out.println(a.getClass().getName());
        if (a instanceof B) {

            B b = (B) a;
            b.g();
        }
    }
}
