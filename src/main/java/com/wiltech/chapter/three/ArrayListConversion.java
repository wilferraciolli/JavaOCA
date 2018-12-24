package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConversion {

    public static void main(String[] args) {
        convertListToArray();

        convertArrayToList();

        sortingStringList();

        sortingIntList();

    }

    private static void sortingIntList() {
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(new Integer(5));
        list.add(81);
        System.out.println(list); //[99, 5, 81]

        Collections.reverse(list);
        System.out.println(list); //[81, 5, 99]

        Collections.sort(list);
        System.out.println(list); //[5, 81, 99]

        Collections.reverse(list);
        System.out.println(list); //[99, 81, 5]
    }

    private static void sortingStringList() {
        System.out.println();

        List<String> list = Arrays.asList("cucumber", "brocoli");
        System.out.println(list); //[cucumber, brocoli]

        Collections.sort(list);
        System.out.println(list); //[brocoli, cucumber]

        Collections.reverse(list);
        System.out.println(list); //[cucumber, brocoli]
    }

    private static void convertArrayToList() {
        System.out.println();

        String[] array = {"hawk", "robin"};

        List<String> list = Arrays.asList(array); //[hawk, robin]
        System.out.println(list.size());
        list.set(1, "test"); //[hawk, test]

        array[0] = "new"; ////[new, test]

        for (String s : array) {
            System.out.println(s + " "); //new test
        }

        // throws Unsupportd exception because the list size is not allowed to be changed as this is a backed version list of the array we copied in line 20
        //tis is not a normal ArrayList
        //list.remove(1);
    }

    private static void convertListToArray() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        //convert list to array of objects
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);

        //convert list to array of strings
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
    }
}
