package com.jxs.chapeter11;

import java.util.Iterator;

/**
 * Created by jiangxs on 2018/4/6.
 */
public class IterableClass implements Iterable {

    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped.").split(" ");

    public Iterator<String> iterator() {

        return new Iterator<String>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {

                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {

        for (Object s : new IterableClass()) {
            System.out.print((String) s+" ");
        }
    }
}
