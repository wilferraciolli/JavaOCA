package com.wiltech.chapter.four;

public class ChainingConstructors {

    int number;
    String name;
    int age;

    ChainingConstructors(int number){
        this(number,"name");
    }

    public ChainingConstructors(int number, String name) {
        this(number, name, 30);
    }

    public ChainingConstructors(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }
}
