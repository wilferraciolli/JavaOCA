/*
 * (c) Midland Software Limited 2018
 * Name     : DateExamples.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.crashcourse.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Dates and Date formats
 */
public class DateExamples {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2018,10,8);

        System.out.println(today);


        LocalDate threeDaysFromNow = today.plus(3, ChronoUnit.DAYS);
        LocalDate tomorrow = today.plusDays(1);

        System.out.println(threeDaysFromNow);
        System.out.println(tomorrow);

        //create apatternr to format date
        //make sure that adding time to date will cause an exception
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");


        System.out.println("prints 08 10 2018 " + dateTimeFormatter.format( today));
    }
}
