package com.wiltech.chapter.two;

public class ControlFlowWithLabel {

    public static void main(String[] args) {

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        //label for loop
        OUTER_LOOP:
        for (
                int[] mySimpleArray : myComplexArray) {
            //label for loop
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();

        }
    }
}

