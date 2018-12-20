package com.wiltech.chapter.three;

public class StringConcatenation {

    public static void main(String[] args) {

        //The rule is, if both values are numeric, then it is addition
        //if either is a String, then it is String concatenation
        System.out.println(1 + 2);
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

    }
}
