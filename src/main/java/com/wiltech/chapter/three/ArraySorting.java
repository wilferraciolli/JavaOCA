package com.wiltech.chapter.three;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        //arrange numbers on an array
        sortArrayOfNumbers();

        //sort string alphabetically
        sortArrayOsStrings();
    }

    private static void sortArrayOsStrings() {
        System.out.println();
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);

        for (String string : strings) {
            System.out.print(string + " ");//10 100 9 - This is not expected as sort string does it alphabetically, therefore 100 is be 9 on the alphabet
        }
    }

    private static void sortArrayOfNumbers() {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
