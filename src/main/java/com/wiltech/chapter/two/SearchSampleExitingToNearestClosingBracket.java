package com.wiltech.chapter.two;

/**
 * Class to show how to break out of a nested for loop. the label is used to tell the compiler where to break to.
 * Otherwise it would break to its nearest closing bracket.
 */
public class SearchSampleExitingToNearestClosingBracket {

    public static void main(String[] args) {

        //2d array
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    //Instead of exiting when the first matching value is found, the program will now only exit the inner loop when the condition is met
                    break ;
                }
            }
        }

        //It will print Value 2 found at: (2,0)
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
        }
    }

}
