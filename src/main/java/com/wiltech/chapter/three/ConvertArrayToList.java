package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This converts the array onto a linked list. The list will point to the same value as the array is pointing.
 * Thererfore any changes on the array or list will change them both
 */
public class ConvertArrayToList {
    public static void main(String[] args) {

        String[] array = {"hawk", "robin"};

        List<String> list = Arrays.asList(array);
        System.out.println(list.size());// 2

        //update the list and check that the value was updated on both array and list
        list.set(1, "test");

        //update the array and check that the value was updated on both array and list
        array[0] = "new";

        for(String b: array){
            System.out.print(b + " "); //new test
        }

        System.out.println();
        list.remove(1); //this throws and excepotion as the list cannot change its size since it points to the same object as the array
    }
}
