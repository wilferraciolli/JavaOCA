package com.wiltech.chapter.three;

public class StringCreationsAndGB {

    public static void main(String[] args) {

        //chain over creation and garbage collecting Strings
        replace();

        //this method will create 26 String and garbage collect it until the loop ends.
        //to solve this issue, use StringBuilder. page 111 OCA SE8 book
        loopThroughAndCreateAllTheTime();
    }

    private static void replace() {
        System.out.println();

        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "AnimAl"

        System.out.println(result);
    }

    private static void loopThroughAndCreateAllTheTime() {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }

        System.out.println(alpha);

    }

}
