/*
 * (c) Midland Software Limited 2019
 * Name     : Test.java
 * Author   : ferraciolliw
 * Date     : 25 Apr 2019
 */
package com.wiltech.chapter.one;

/**
 *
 */
public class Test {

    public static void main(String[] args)  {
       ThreadTest d1 = new ThreadTest();
       ThreadTest d2 = d1;

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

    }

//    public static long factorial(final int n) {
//        System.out.println(n);
//        if (n==1) return 1;
//        return n * factorial(n - 1);
//    }

}


