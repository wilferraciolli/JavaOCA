package com.wiltech.intertech.testing;

import com.wiltech.intertech.utils.MyDate;

public class TestMyDate {

    public static void main(final String[] args) {
        final MyDate date1 = new MyDate(11, 11, 1918);

        final MyDate date2 = new MyDate();
        date2.setDay(11);
        date2.setMonth(11);
        date2.setYear(1918);

        final MyDate date3 = new MyDate();
        date3.setDate(4, 21, 1968);

        final String str1 = date1.toString();
        final String str2 = date2.toString();
        final String str3 = date3.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //bonus exercise lab 2
        final MyDate date4 = new MyDate();
        final String str4 = date4.toString();
        System.out.println(str4);

        //test leap years
        // MyDate.leapYears();
    }
}