package com.wiltech.intertech.testing;

import com.wiltech.intertech.lesson2.CarUsingThis;

public class TestCarUsingThis {


    public static void main(final String[] args) {

        //current description
        final CarUsingThis carUsingThis = new CarUsingThis();
        System.out.println(carUsingThis.geDescription());

        //new description NOT using this
        carUsingThis.customizeNotUsigThisKeyword("Black", "convertible");
        System.out.println("Note that the value did not cange at all " + carUsingThis.geDescription());

        //new description using this
        carUsingThis.customizeUsigThisKeyword("Black", "convertible");
        System.out.println(carUsingThis.geDescription());

    }

}
