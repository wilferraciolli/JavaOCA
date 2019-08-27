package com.wiltech.chapter.four;

public class Lambdas {

    public static void main(String... args) {

        print(s -> s.startsWith("wil"));
    }

    private static void print(Wil s) {
        System.out.println(s.toString());
    }
}

interface Wil {
    boolean fly(String f);
}
