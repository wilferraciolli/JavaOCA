package com.wiltech.chapter.three;

public class StringBuilderCommonMethods {

    public static void main(String[] args) {
        //creating a string builder and assigning a size to it
        //it will allow bigger size than that, it will automatically increase it
        StringBuilder sb = new StringBuilder(16);
        sb.append("Animal");

        commonMethodsWithString(sb);

        //append different types to the string
        appendExample();

        //insert characters based on index
        insert();

        //delete characters
        delete();

        reverse();
    }

    private static void reverse() {
        System.out.println();
        //StringBuilder reverse()

        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);//CBA
    }

    private static void delete() {
        System.out.println();
        // StringBuilder delete(int start, int end)
        // StringBuilder deleteCharAt(int index)

        StringBuilder sb = new StringBuilder("abcdef");
        //the delete works by starting at index 1 upo to index 3, it will not delete index 3
        sb.delete(1, 3);
        System.out.println(sb); //adef
        // sb = adef sb.deleteCharAt(5); // throws an exception as there is no index 5

        sb.deleteCharAt(0);
        System.out.println(sb);//def
    }

    private static void insert() {
        System.out.println();

        // StringBuilder insert(int offset, String str)

        StringBuilder sb = new StringBuilder("animals");
        //It can only be added to the maximun on n+1 index, otherwise it will throw an StringIndexOutOfBoundsException exception
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-

        System.out.println(sb);//-ani-mals-
    }

    private static void appendExample() {
        System.out.println();
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);

        System.out.println(sb); // 1c-true
    }

    //    These behave exactly as String does
    private static void commonMethodsWithString(StringBuilder sb) {
        System.out.println(sb.charAt(0)); //A
        // System.out.println(sb.charAt(10)) ;//throws exception
        System.out.println(sb.indexOf("A"));//0
        System.out.println(sb.length());//6

        String sub = sb.substring(sb.indexOf("n"), sb.indexOf("al"));
        System.out.println(sub); //nim
    }
}
