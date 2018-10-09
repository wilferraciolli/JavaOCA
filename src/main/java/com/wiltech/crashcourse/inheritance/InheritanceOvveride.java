/*
 * (c) Midland Software Limited 2018
 * Name     : InheritanceOvveride.java
 * Author   : ferraciolliw
 * Date     : 09 Oct 2018
 */
package com.wiltech.crashcourse.inheritance;

/**
 * Class to show that override methods need to have the same or stroonger accessibiliy.
 */
public class InheritanceOvveride {

    public static void main(String[] args) {
SubBase subBase = new SubBase();
subBase.doStuff();
    }
}
class Base2{
     void doStuff(){
        System.out.println("Superclass");
    }
}

class SubBase extends Base2{
//this is an ovveride method, therfore it cannot change the accessibility to a more restricted
    //eg, if the parent was private, then you could not make it protected or public...
     void doStuff() {
            System.out.println("Sub class");
        }

}