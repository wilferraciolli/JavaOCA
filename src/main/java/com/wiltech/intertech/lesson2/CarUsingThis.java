package com.wiltech.intertech.lesson2;

public class CarUsingThis {

    String colour = "white";
    String type = "Sedan";

    void customizeUsigThisKeyword(String colour, String type) {
        this.colour = colour;
        this.type = this.type + " " + type;
    }

    void customizeNotUsigThisKeyword(String colour, String type) {
        colour = colour;
        type = type + " " + type;
    }

    String geDescription() {
        final String desc = "This is a " + colour + " " + type;
        return desc;
    }

    void printDescription() {
        System.out.println("This is a " + colour + " " + type);
    }
}
