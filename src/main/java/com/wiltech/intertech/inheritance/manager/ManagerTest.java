package com.wiltech.intertech.inheritance.manager;

import com.wiltech.intertech.inheritance.employees.Person;

public class ManagerTest extends Person {

    public void testProtectedMethod(){
        doStuff();
    }

    public static void main(String[] args) {

        Manager m = new Manager();
        m.doStuff();
    }
}


