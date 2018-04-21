package com.jxs.chapeter17;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class DirList2 {

    private String s;
    public String ss;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static FilenameFilter filter(final String regex) {

        // creating of anonymous inner class
        return new FilenameFilter() {
            //private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                //return pattern.matcher(name).matches();
                return false;
            }
        };
    }

//    public static void main(String[] args) {
//
//        File path = new File(".");
//        String[] list=null;
//        if (args.length == 0) {
//            list = path.list();
//        } else {
//            //list = path.list(filter(args[0]));
//        }
//        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
//        for (String dirItem : list) {
//            System.out.println(dirItem);
//        }
//    }
}

class AA extends DirList2 {

    @Test
    public void test() {

        AA aa = new AA();
        aa.setS("jjj");
        System.out.println(aa.getS());

    }

}