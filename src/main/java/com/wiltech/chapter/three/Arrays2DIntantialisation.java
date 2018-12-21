package com.wiltech.chapter.three;

public class Arrays2DIntantialisation {

    public static void main(String[] args) {

        //ways of creating 2d arrays
        int[][] vars1;          //2D array
        vars1 = new int[][]{{1,2,3}, {4,5,6}};
        int vars2 [][];         //2D array
        vars2 = new int[][]{{1,2,3}, {4,5,6}};

        int[] vars3[];          //2D array, very confusing but valid
        vars3 = new int[][]{{1,2,3}, {4,5,6}};

        //this creates a 2 and 3d array
        int[] vars4[], space [][];  //2D array and a 3D array
        vars4 = new int[][]{{1,2,3},{4,5,6}};
        space = new int[][][]{{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}}};

        //complex arrays initialisation
        int [][] arr = new int[4][];
        arr[0] = new int[5];
        arr[2] = new int[3];
    }
}
