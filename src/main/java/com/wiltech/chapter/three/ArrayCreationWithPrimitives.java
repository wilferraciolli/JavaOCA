package com.wiltech.chapter.three;

public class ArrayCreationWithPrimitives {

    public static void main(String[] args) {

        //different ways to instantiate arrays
        int[] numbers = new int[3];
        int[] numbers1 = new int[] {1, 2, 3};

        //creating anonymous array without specifiyng the type and size
        int[] numbers2 = {1, 2, 3};

        //valid ways to create arrays, note that there is allowed space between the brackets and the variable type/name
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        //creating multiple arrays in one line
        int[] values, indexes; //creates int[] values and int[] indexes
        values = new int[3];
        indexes = new int[5];

        //very misleading way of creating arrays
        int properties[], index; // creates int[] properties and int index
        properties = new int[3];
        index = 1;

        equalityCheck();
    }

    private static void equalityCheck() {
        System.out.println();
        int[] values1 = {1, 2, 3};
        int[] indexes1 = {1, 2, 3};
        System.out.println(values1.equals(indexes1));//false as they do not point to the same thing

        System.out.println();
        int[] values2 = {1, 2, 3};
        int[] indexes2 = values2;
        System.out.println(values2.equals(indexes2));//true as they do point to the same thing

        System.out.println();
        int[] values3 = {1, 2, 3};
        int[] indexes3 = values3.clone();
        System.out.println(values3.equals(indexes3));//false as they do not point to the same thing
    }
}
