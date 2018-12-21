package com.wiltech.chapter.three;

public class Arrays2D {

    public static void main(String[] args) {

        definingArrays();

        loopingThrough2DArrays();

    }

    private static void loopingThrough2DArrays() {
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " "); // print element
                System.out.println(); // time for a new row }
            }
        }

        //also it can be accomplished like that
        // for (int[] inner : twoD) {
        //      for (int num : inner)
        //          System.out.print(num + " ");
        //      System.out.println();
        // }
    }

    private static void definingArrays() {
        //arrays declaration, arrays can be populated, bit by bit
        String[][] rectangle = new String[3][2];
        rectangle[1][1] = "Wiliam";

        //array to have different size (which can lead to NPE)
        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};
    }
}
