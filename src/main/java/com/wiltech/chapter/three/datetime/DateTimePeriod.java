package com.wiltech.chapter.three.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTimePeriod {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2019, Month.JANUARY, 01);
        LocalDate endDate = LocalDate.of(2019, Month.MARCH, 01);
        Period occurrence = Period.ofWeeks(1);

        calculateOccurrences(startDate, endDate, occurrence);
    }

    private static void calculateOccurrences(LocalDate startDate, LocalDate endDate, Period occurrence) {
        LocalDate upTo = startDate;

        while (upTo.isBefore(endDate)) {
            System.out.println("Reccurrence on " + upTo);
            upTo= upTo.plus(occurrence);
        }
    }
}
