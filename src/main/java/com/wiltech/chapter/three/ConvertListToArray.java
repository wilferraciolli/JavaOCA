package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

    public static void main(String[] args) {
        creatingArrayOfSameSizeAsList();
    }

    private static void creatingArrayOfSameSizeAsList() {
        List<String> list = new ArrayList();
        list.add("hawk");
        list.add("robin");

        //calling the toArray method on a list will create an array of Objects
        Object[] objectArrays = list.toArray();
        System.out.println(objectArrays.length); // 2

        //calling the toArray method and passign the type with a bvalue of 0 will clone the list onto an array
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
    }
}
