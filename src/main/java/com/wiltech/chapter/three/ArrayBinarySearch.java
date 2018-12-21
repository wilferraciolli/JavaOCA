package com.wiltech.chapter.three;

import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {

        binarySearchArrayOfInts();

        binarySearchWhenValuesAreNotSorted();
    }

    private static void binarySearchWhenValuesAreNotSorted() {
        System.out.println();
       //unsorted values
        int[] numbers = new int[] {3, 2, 1};

        System.out.println(Arrays.binarySearch(numbers, 2)); //1
        System.out.println(Arrays.binarySearch(numbers, 3)); //unpredicted values as array is not sorted
    }

    private static void binarySearchArrayOfInts() {
        int[] numbers = {2, 4, 6, 8};

        //2 is the first element on the osorted array, therefore index 0
        System.out.println(Arrays.binarySearch(numbers, 2)); //0

        //4 isd the second item on the array, therefore index 1
        System.out.println(Arrays.binarySearch(numbers, 4)); //1

        //Although 1 isn’t in the list, the search can determine that it should be inserted at element 0 to preserver  the sorted order,
        // since 0 is already taken, Java subtracts 1 making it (-1 with 0) = -1
        System.out.println(Arrays.binarySearch(numbers, 1)); //-1

        //3 to keep the list  sorted, it would need to go to index 1, since 1 is already taken therefore (-1 with -1) = -2
        System.out.println(Arrays.binarySearch(numbers, 3)); //-2

        //9 would need to go to index 4 to keep the list sorted, since 4 is already taken therefore (-1 with -4) = -5
        System.out.println(Arrays.binarySearch(numbers, 9)); //-5
    }
}
