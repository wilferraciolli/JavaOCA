/*
 * (c) Midland Software Limited 2019
 * Name     : Thread.java
 * Author   : ferraciolliw
 * Date     : 09 Jul 2019
 */
package com.wiltech.chapter.one;

/**
 *
 */
public class Thread {

    public static void main(String[] args) {
        test(new Integer(10));
        test(new Float(20.0f));
        test(10);
        test(20.00);
    }

    static void test(Number n){
        System.out.println(n.toString());
    }
}
