package com.jxs.chapeter5;

/**
 * Created by jiangxs on 2018/4/2.
 */
class Book {

    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {

        if (checkedOut) {
            System.out.println("Error:check out");
        }
    }
}
public class TerminationCondition {

    public static void main(String[] args) {

        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
