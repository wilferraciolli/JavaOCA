package com.wiltech.chapter.two;

import java.util.ArrayList;
import java.util.List;

public class ForLoops {

    public static void main(String[] args) {
        forLoopWhenNull();

        forLoopWhenEmpty();

        forLoopWhenMixedEmptyAndStrings();
    }



    /**
     * Print an array with null values
     */
    public static void forLoopWhenNull() {
        final String[] names = new String[3];

        //this will print null null null
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * This wont print anything as the list is empty
     */
    public static void forLoopWhenEmpty() {
        final List<String> names = new ArrayList<>();

        //this will print null null null
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void forLoopWhenMixedEmptyAndStrings() {
        final List<String> names = new ArrayList<>();

        names.add("Wiliam");
        names.add(null);
        names.add("Maria");

        //this will print null null null
        for (String name : names) {
            System.out.println(name);
        }
    }
}
