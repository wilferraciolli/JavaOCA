package com.wiltech.chapter.three;

public class Equality {

    public static void main(String[] args) {

        //both strings pooint to the same space in memory
        String a = "Hello World";
        String b = "Hello World";
        System.out.println(a == b); // true

        //this will print false as String b1 will be comput4ed at runtime, therefore a new string is created.
        System.out.println();
        String a1 = "Hello World";
        String b1 = " Hello World".trim();
        System.out.println(a1 == b1); // false

        //the new keyword tell the JVM to create a new object regardless of the content
        String x = new String("Hello World");
        String y = "Hello World";
        System.out.println(x == y); // false

        //string builders point to the same object if the new keyword is not especified
        System.out.println();
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

    }

}
