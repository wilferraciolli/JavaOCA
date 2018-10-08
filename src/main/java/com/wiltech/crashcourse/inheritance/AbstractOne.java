/*
 * (c) Midland Software Limited 2018
 * Name     : AbstractOne.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.inheritance;

/**
 * The type Abstract one.
 */
public class AbstractOne {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //instantiate a new abstract class
        Base b = new Derived();
        b.doStuff();

     //   System.out.println(b.doStuff());

    }
}

/**
 * The type Base.
 */
abstract class Base{
    /**
     * Do stuff.
     */
    abstract void doStuff();
}

/**
 * The type Derived.
 */
class Derived extends Base{
    void doStuff(){}
}