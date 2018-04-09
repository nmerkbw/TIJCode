package com.jxs.chapeter12;

/**
 * Created by jiangxs on 2018/4/7.
 */
class NeedsCleanup {

    private long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup"+id+"dispose");
    }
}
public class CleanupIdiom {

    public static void main(String[] args) {

        NeedsCleanup n1 = new NeedsCleanup();
        NeedsCleanup n2 = new NeedsCleanup();
        NeedsCleanup n3 = new NeedsCleanup();
        n3.dispose();
        n1.dispose();
        n2.dispose();
    }
}
