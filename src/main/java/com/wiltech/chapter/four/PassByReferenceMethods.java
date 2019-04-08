package com.wiltech.chapter.four;

/**
 * The type Pass by reference methods.
 */
public class PassByReferenceMethods {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String name = "Wiliam";
        StringBuilder sb = new StringBuilder("Wiliam");

        //note that passign this object will pass the value of it rather than where it points to
        assignName(name);

        //note that passign a sring builder to the method will create a new object pointing to the same location in  memory, t
        // therefore it gets updated
        appendToBuilder(sb);

        System.out.println(name); // Wiliam - note that the assignment o ht emethod does not affect
        System.out.println(sb); // Wiliam new name - note tha the assignment will take place as both point to the same object
    }

    public static void assignName(String name) {
        name = "new name";
    }

    public static void appendToBuilder(StringBuilder sb) {
        //sb is a new Strig bilder that points to the same Stringbuilder as sb on the instance.
        //As we are calling a method on the sb, therfore the data on the memory will be updated
        // which means both stringBuldrs will be pointing at the same data, therfore both updated
        sb.append(" new name");
    }
}
