package com.wiltech.intertech.lesson3;

public class MyDate {

    int day;
    int year;
    int month;

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


    @Override
    public String toString() {
        //Return MM/DD/YYYY
        return month + "/" + day + "/" + year;
    }
}
