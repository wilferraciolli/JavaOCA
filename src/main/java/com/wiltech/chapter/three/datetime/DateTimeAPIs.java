package com.wiltech.chapter.three.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * The type Date time ap is.
 */
public class DateTimeAPIs {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //current date time
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //custom date
        System.out.println(LocalDate.of(2015, Month.JANUARY, 1));
        System.out.println(LocalDate.of(2015, 1, 1));

        //custom time
        System.out.println(LocalTime.of(00, 00));
        System.out.println(LocalTime.of(00, 00, 00));
        System.out.println(LocalTime.of(00, 00, 00, 00));

        //custom date and time
        System.out.println(LocalDateTime.of(2015, Month.JANUARY, 20, 00, 00));
    }
}
