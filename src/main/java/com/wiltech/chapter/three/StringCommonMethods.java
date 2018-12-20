package com.wiltech.chapter.three;

public class StringCommonMethods {

    public static void main(String[] args) {

        //charAt returns the char at the index specifies, if nothinf is found, it throws an error
        charAt();

        //index of tries to find the index where the char is, if nothign is found , then returns -1
        indexOf();

        //substring is used to grab parts of  a string by passing the start and end index
        substring();

        //note that theses methods are case sensitive
        startsEndsWith();

        //replaces string chars
        replace();
    }

    /**
     * The first example uses the first method signature, passing in char parameters.
     * The second example uses the second method signature, passing in String parameters.
     */
    private static void replace() {
        System.out.println();
        //        String replace(char oldChar, char newChar)
        //        String replace(CharSequence oldChar, CharSequence newChar)

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
    }

    private static void startsEndsWith() {
        System.out.println();
        //        boolean startsWith(String prefix)
        //        boolean endsWith(String suffix)

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
        System.out.println("abc".endsWith("bc")); // true
        System.out.println("abc".endsWith("abc")); // true

    }

    private static void substring() {
        System.out.println();
        // String substring(int beginIndex)
        // String substring(int beginIndex, int endIndex)

        String string = "animals";

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // empty string

        // System.out.println(string.substring(3, 2)); // throws exception as end index is before starting index
        //  System.out.println(string.substring(3, 10)); // This would throw an exception as the string only has 7 chars

    }

    private static void indexOf() {
        System.out.println();
        //        int indexOf ( char ch)
        //        int indexOf ( char ch, index fromIndex)
        //        int indexOf (String str)
        //        int indexOf (String str, index fromIndex)The following

        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1 this means that it has not found
    }

    private static void charAt() {
        String string = "animals";

        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        try {
            System.out.println(string.charAt(7)); // throws exception because there is not index there. use try catch
        } catch (Exception c) {
            System.out.println("There were no char at this position");
        }
    }
}
