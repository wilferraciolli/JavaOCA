package com.wiltech.intertech.lesson2;

public class Car {

    String colour;
    String type;

    void start() {
        System.out.println("Get started!");
    }

    void printDescription() {
        System.out.println("This is a " + colour + " " + type);
    }
}
