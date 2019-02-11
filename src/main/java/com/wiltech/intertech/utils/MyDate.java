package com.wiltech.intertech.utils;

public class MyDate {

    private int day;
    private int year;
    private int month;

    {
        this.day = 1;
        this.year = 2000;
        this.month = 1;
    }

    /**
     * Provide default date values if constructor is empty
     */
    public MyDate() {
        this(1,1,1900);
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = month;
        }
    }

    private boolean valid(int day, int month, int year){
        if (day > 31 || day < 1 || month > 12 || month < 1 ){
            System.out.println("Attempting to create a non-valid date "
                    + month + "/" + day + "/" + year);
            return false;
        }
        switch (month){
        case 4:
        case 6:
        case 9:
        case 11: return (day <= 30);
        case 2: return day <= 28 || ( day == 29 && year % 4 == 0) ;
        }
        return true;
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
