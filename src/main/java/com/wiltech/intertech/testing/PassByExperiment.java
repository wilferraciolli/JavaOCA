package com.wiltech.intertech.testing;

import com.wiltech.intertech.utils.MyDate;

public class PassByExperiment {

    public static void main(String[] args) {
        //create  a new date
        MyDate date = new MyDate(1,20,2008);

        //pass New date as object and update its variables
        System.out.println("Before passing an object " + date);
        passObject(date);
        System.out.println("After passing an object " + date);

        //pass in a primitive and assign a value to itself.
        // Notingh should change as it is not being assigned to anything.
        System.out.println("Before passing a primitive " + date.year);
        passPrimitive(date.year);
        System.out.println("After passing a primitive " + date.year);

        //create a string and pass it to a method
        //note that Strings are immutable and cannot be changed
        String x = date.toString();
        System.out.println("Before passing a String " + x);
        passString(x);
        System.out.println("After passing a String " + x);

        //Do the same as above but with a StringBuilder
        //This time as StringBuilder is not Immutable, it will update its value
        StringBuilder sb = new StringBuilder(date.toString());
        System.out.println();
        System.out.println("Before passing a String " + sb);
        passStringBuilder(sb);
        System.out.println("After passing a String " + sb);

    }

    public static void passObject(MyDate d){
        d.year=2009;
    }

    public static void passPrimitive(int i) {
        i = 2010;
    }

    public static void passString(String s){
        //get the index of where rhte year starts
        int yearSlash =s.lastIndexOf('/');
        //remove the year
        s = s.substring(0, yearSlash+1);
        //append a year to the end of the date
        s += "2012";
        System.out.println("New date string: " + s);
    }

    public static void passStringBuilder(StringBuilder sb){
        int yearSlashIndex = sb.toString().lastIndexOf('/');
        sb.replace(  yearSlashIndex+1,  sb.toString().length(), "2012");
        System.out.println("New date string: " + sb);
    }
}
