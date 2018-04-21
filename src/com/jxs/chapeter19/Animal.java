package com.jxs.chapeter19;

public enum Animal {

    DOG,PIG,CAT,MOUSE,ELEPHANT
}

enum A {

    DOG("dog"), PIG("pig"), CAT("cat");

    private A(String name) {

        System.out.println("I'm "+name);
    }
}

class Test {

    public static void main(String[] args) {

        A a = A.DOG;
        System.out.println(a);
    }
}