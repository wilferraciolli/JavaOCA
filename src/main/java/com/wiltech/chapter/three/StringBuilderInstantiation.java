package com.wiltech.chapter.three;

public class StringBuilderInstantiation {

    public static void main(String[] args) {

        //instantiating only 1 string builder
        StringBuilderInstantiation();
    }

    /**
     * This is using two string builders,
     * however only one was created with the keyword new so they both point to the same object in memory.
     */
    private static void StringBuilderInstantiation() {
        StringBuilder a = new StringBuilder("abc");
        //This assignment make both string builders to point at the same object.
        // So every change will affect the state of the object, which them both String builder a and b are pointing to
        StringBuilder b = a.append("de");

        b = b.append("f").append("g");

        System.out.println("a=" + a); //prints a=abcdefg
        System.out.println("b=" + b); //prints b=abcdefg
    }

}
