/*
 * (c) Midland Software Limited 2018
 * Name     : ObjectReference.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.statics;

/**
 * The type Object reference.
 */
public class ObjectReference {
    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //create a new Y object, this will create an instance of Z, however the static methods belong to the class and not the instanc5
        Y y = new Z();
        System.out.println(y.sayHi() + ", " +y.sayHi2());

    }

}

/**
 * The type Y.
 */
class Y {
    /**
     * Say hi string.
     * @return the string
     */
    //static method
    static String sayHi() {
        return "Y-Hello";
    }

    /**
     * Say hi 2 string.
     * @return the string
     */
    //instance method
    String sayHi2() {
        return "Y-Hello2";
    }
}

/**
 * The type Z.
 */
class Z extends Y {
    /**
     * Say hi string.
     * @return the string
     */
    //static method
    static String sayHi() {
        return "Z-Hello";
    }

    //instance method
    String sayHi2() {
        return "Z-Hello2";
    }
}
