package com.wiltech.chapter.three;

public class ArrayWithObjects {

    public static void main(String[] args) {

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(
                alias)); // true, the array does not implemetn equlas, therefore equals() method will check iof they point to the same object

        // [L means it is an array, java.lang.String is the reference type, and 160bc7c0 is the hash code.
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        //Casting Arrays
        System.out.println();
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

        //This is dangerous as it will compile but will throw ArrayStoreException as the type expected is String and StringBuilder is being passed
        objects[0] = new StringBuilder(); // careful!

    }
}
