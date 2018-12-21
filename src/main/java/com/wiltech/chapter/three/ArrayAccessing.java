package com.wiltech.chapter.three;

public class ArrayAccessing {

    public static void main(String[] args) {

        declaringAndAccessingAnArray();

        gettingArraySize();

        populatingAnArray();

    }

    private static void populatingAnArray() {
        System.out.println();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }

        //numbers[10] = 3; //thrown an exception is the index is from 0 - 9
        //numbers[numbers.length] = 5; //thrown an exception is the index is from 0 - 9

        //The method above will throw an exception as the loop will try to access the index 10 which does not exists
        for (int i = 0; i <= numbers.length; i++)
            numbers[i] = i + 5;


        System.out.println(numbers.length);
    }

    private static void gettingArraySize() {
        //array lenght is the size of allocated slots of it and not how mane objects are there
        System.out.println();
        String[] values = new String[6];
        System.out.println(values.length); //6
    }

    private static void declaringAndAccessingAnArray() {
        String[] mammals = {"monkey", "chimp", "donkey"};

        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey
    }
}
