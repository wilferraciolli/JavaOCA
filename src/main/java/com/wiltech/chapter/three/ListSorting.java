package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);

        System.out.println(numbers);

        //sort
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
