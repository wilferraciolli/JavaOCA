/*
 * (c) Midland Software Limited 2018
 * Name     : DateExamples2.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.crashcourse.dates;

import java.time.LocalDate;
import java.time.Period;

/**
 *Period, Instant and Duration
 * Period = number of days between two dates.
 * Instant =  Current moment in date and time
 */
public class DateExamples2 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2018,10,8);

        Period oneMonth = Period.of(0, 1, 0);
        LocalDate nextMonth = today.plus(oneMonth);
        System.out.println("Next month " + nextMonth);

        //printing periods
        Period longish = Period.of(1,18,379);
        Period tidy = longish.normalized();

        System.out.println("Longish " + longish );
        System.out.println("Tidy " + tidy );

    }
}
