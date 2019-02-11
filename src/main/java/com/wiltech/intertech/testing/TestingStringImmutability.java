package com.wiltech.intertech.testing;

public class TestingStringImmutability {

    public static void main(String[] args) {

        //Updatable String
        String name = "Wiliam";
        name = "Wil";
        System.out.println(name);

        //non updatable String
        String color = "blue";
        changeColor(color);
        System.out.println(color);
    }

    private static void changeColor(String c) {
        c = "green";
    }
}
