/*
 * (c) Midland Software Limited 2019
 * Name     : Employee.java
 * Author   : ferraciolliw
 * Date     : 25 Mar 2019
 */
package com.wiltech.intertech.inheritance;

import com.sun.jnlp.PersistenceServiceNSBImpl;
import com.wiltech.intertech.inheritance.employees.Musician;
import com.wiltech.intertech.inheritance.employees.Person;
import com.wiltech.intertech.inheritance.manager.Manager;

/**
 * The type Employee.
 */
public class Employee extends Person {

    /**
     * Test protected do stuff method.
     */
    public void testProtectedDoStuffMethod(){
        doStuff();
    }

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Employee e = new Employee();
        e.doStuff(); //Legal because Employee is declared within this package

        Person p = new Person();
        // p.doStuff(); //illegal because the access modifier is protected

        Musician m = new Musician();
        // m.doStuff(); //illegal because the access modifier is protected

        Manager man = new Manager();
        // man.doStuff();   // m.doStuff(); //illegal because the access modifier is protected
    }
}
