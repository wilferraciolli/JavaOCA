package com.wiltech.chapter.three.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UpdatingDateTime {

    public static void main(String[] args) {
        createAndAddToDate();

        createAndAddToDateAndTime();

    }

    private static void createAndAddToDateAndTime() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15

        dateTime =dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T05:15

        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
    }

    private static void createAndAddToDate() {
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 30);
        System.out.println(date);

        date.plusDays(1);
        System.out.println(date); // should still printing 2019-01-01 as it is immutable

        //assign the return value to the object
        date = date.plusDays(1);
        System.out.println(date); // 2019-01-31

        //The new date API know that the next month only has 28 days and defaults it to the end of the month
        date = date.plusMonths(1);
        System.out.println(date); //2019-02-28
    }
}
