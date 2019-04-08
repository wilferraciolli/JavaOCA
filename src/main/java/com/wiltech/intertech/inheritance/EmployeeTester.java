/*
 * (c) Midland Software Limited 2019
 * Name     : Employee.java
 * Author   : ferraciolliw
 * Date     : 25 Mar 2019
 */
package com.wiltech.intertech.inheritance;

import com.wiltech.intertech.inheritance.employees.Person;

/**
 *
 */
public class EmployeeTester extends Person {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.testProtectedDoStuffMethod();
    }
}
