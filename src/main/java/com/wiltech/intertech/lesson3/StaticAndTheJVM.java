package com.wiltech.intertech.lesson3;

/**
 * This class is to show how static and instant variables are mnaged by the JVM.
 * the idea is to show that even many objects were created by this class, only one static variable was created.
 */
public class StaticAndTheJVM {

    //This static variable is created once by the JVM and is kept as single instance for the class
    public static int count = 0;

    //instance variables used to each object created by the class
    int id;
    String name;


    //Defauult no args constructor to increment the static class variable of counter
    public StaticAndTheJVM() {
        count++;
    }
}
