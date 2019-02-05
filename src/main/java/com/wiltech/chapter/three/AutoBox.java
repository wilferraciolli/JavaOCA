package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {

    public static void main(String[] args) {
        //test that autobox will convert the primitive value onto a Double Wrapper class and remove it
        autoBoxAndRemove();

        //test that integers autoboxing will be tricky as it will try and remove the incdex of rather than aoutobox
        autoBoxAndRemoveByIndex();

        //test that integers autoboxing will be tricky as it will try and remove the object of rather than the index
        autoBoxAndRemoveByValue();
    }

    private static void autoBoxAndRemoveByIndex() {

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.remove(1);

        System.out.println(ints.get(0));//should print 1 as the values passed in was the index rather than the object Integer
    }

    private static void autoBoxAndRemoveByValue() {

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.remove(new Integer(1));

        System.out.println(ints.get(0));//should print 2 as the values passed in was the index rather than the object Integer
    }

    private static void autoBoxAndRemove() {
        List<Double> numbers = new ArrayList();

        numbers.add(50.5);
        numbers.add(new Double(30.5));
        numbers.remove(50.5);

        System.out.println(numbers.get(0));//this should print 30.5
    }

}
