package com.wiltech.chapter.two;

/**
 * Class to show how to break out of a nested for loop. the label is used to tell the compiler where to break to.
 * Otherwise it would break to its nearest closing bracket.
 */
public class SearchSampleExitingWithLabelToOuterLoop {

    public static void main(String[] args) {

        //2d array
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    //break with a label, this will change the flow of the applciation to break onto a super upper level statement
                    // rather than breaking out of its own statement
                    break PARENT_LOOP;
                }
            }
        }

        //It will print Value 2 found at: (1,1)
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
        }
    }

}
