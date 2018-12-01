package com.wiltech.intertech.lesson2;

public class Car {

    String colour;
    String type;
    int serialNumber;
    static int carCount;

    //static initialazation block
    //This ets run by order
    //it will only execute once, when the class is loaded
    static {
        //First static block to run
        carCount = 1;
    }

    public static void setCarCounbt(final int c) {
        carCount = c;
    }

    Car() {
        carCount++;
        serialNumber = carCount;
    }

    void start() {
        System.out.println("Get started!");
    }

    static {
        //Second static block to run
        carCount = 2;
    }


    void printDescription() {
        System.out.println("This is a " + colour + " " + type);
    }
}
