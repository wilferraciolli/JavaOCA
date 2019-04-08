/*
 * (c) Midland Software Limited 2018
 * Name     : StaticRefecenceObject.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.statics;

/**
 * The type Static refecence object.
 */
public class StaticRefecenceObject {
}

/**
 * The type Thing employees.
 */
class ThingParent {
    /**
     * The constant x.
     */
    public static int x = 10;
}

/**
 * The type Thingy.
 */
class Thingy extends ThingParent {
    private int x =99;

    /**
     * Do other.
     * @param t the t
     */
    public static void doOther(Thingy t){
        System.out.println(t.x);
    }
}
