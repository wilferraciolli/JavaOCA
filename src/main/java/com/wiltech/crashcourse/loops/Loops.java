/*
 * (c) Midland Software Limited 2018
 * Name     : Loops.java
 * Author   : ferraciolliw
 * Date     : 09 Oct 2018
 */
package com.wiltech.crashcourse.loops;

/**
 * The type Loops.
 */
public class Loops {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    //this will produce a infinite for loop
    public static void main(String[] args) {
        for( int i =0; i<10;){
            i = i++;
            System.out.println(i);
        }
    }
}
