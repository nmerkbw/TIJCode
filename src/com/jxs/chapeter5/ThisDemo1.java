package com.jxs.chapeter5;

import org.junit.Test;

/**
 * Created by jiangxs on 2018/4/10.
 */
public class ThisDemo1 {

    private int number;

    public void changeNumber(int number) {

        System.out.println("局部变量的number值为：" + (number + 5));
        System.out.println("成员变量的number值为：" + (this.number + 2));
    }

    @Test
    public void test() {

        int inputNum = 2;
        this.changeNumber(inputNum);
    }
}
