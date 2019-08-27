/*
 * (c) Midland Software Limited 2019
 * Name     : NumberObject.java
 * Author   : ferraciolliw
 * Date     : 09 Jul 2019
 */
package com.wiltech.chapter.one;

/**
 *
 */
public class NumberObject {

    public static void main(String[] args) {
        int i = 10;
//        convert(i);
    }

    static void method (Object o){
        System.out.println("Object call");
    }

    static void method (Number o){
        System.out.println("Number call");
    }

    static void convert (Long l){
        System.out.println("Windering");
    }
}
