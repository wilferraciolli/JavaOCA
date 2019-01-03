package com.wiltech.oop.ita.lesson2;

public class StaticVsInstanceVars {

    static int valueStatic = 0;

    String name;
    int valueInstance = 0;

    void sum() {
        valueInstance++;
        valueStatic++;
    }

    void print() {
        System.out.println("The sum " + name + " instance = " + valueInstance + " and static = " + valueStatic);
    }
}

