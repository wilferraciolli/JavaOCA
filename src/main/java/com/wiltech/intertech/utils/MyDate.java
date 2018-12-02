package com.wiltech.intertech.utils;

public class MyDate {

    public int day;
    public int year;
    public int month;

    {
        this.day = 1;
        this.year = 2000;
        this.month = 1;
    }

    public MyDate() {
    }

    public MyDate(final int month, final int day, final int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public void setDate(final int month, final int day, final int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    /**
     * Find leap years.
     */
    public static void leapYears() {
//        for (int i = 1752; i <= 2020; i = i + 4) {
//            if ((i % 100 != 0) || (i % 400 == 0))
//                System.out.println("The year " + i + " is a leap year");
//        }

        for (int i = 1752; i <= 2020; i++) {
            //modules 4
            if (i % 4 == 0) {
                if ((i % 100 == 0) && i % 400 == 0) {
                    //leao year is divisible by 100 and 400
                    System.out.println("The year " + i + " is a leap year");
                } else {
                    //leap year is divisible by 4 and not by 100
                    System.out.println("The year " + i + " is a leap year");
                }
            }
        }
    }

    @Override
    public String toString() {
        //Return MM/DD/YYYY
        return month + "/" + day + "/" + year;
    }
}
