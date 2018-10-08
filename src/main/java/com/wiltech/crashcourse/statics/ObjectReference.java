/*
 * (c) Midland Software Limited 2018
 * Name     : ObjectReference.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.statics;

/**
 *
 */
public class ObjectReference {
    public static void main(String[] args) {

        //create a new Y object, this will create an instance of Z, however the static methods belong to the class and not the instanc5
        Y y = new Z();
        System.out.println(y.sayHi() + ", " +y.sayHi2());

    }

}
class Y {
    //static method
    static String sayHi() {
        return "Y-Hello";
    }

    //instance method
    String sayHi2() {
        return "Y-Hello2";
    }
}

class Z extends Y {
    //static method
    static String sayHi() {
        return "Z-Hello";
    }

    //instance method
    String sayHi2() {
        return "Z-Hello2";
    }
}
