/*
 * (c) Midland Software Limited 2019
 * Name     : Person.java
 * Author   : ferraciolliw
 * Date     : 25 Mar 2019
 */
package com.wiltech.intertech.inheritance.employees;

/**
 * The type Person.
 */
public class Person {

    /**
     * Do stuff.
     * This method is protected, which means it can only be used on classes on the same package
     * and classes that inherit it within their own packages.
     */
    protected void doStuff(){
        System.out.println("Parent protected method");
    }
}
