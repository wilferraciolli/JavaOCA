/*
 * (c) Midland Software Limited 2018
 * Name     : StaticRefecenceObject.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.statics;

/**
 *
 */
public class StaticRefecenceObject {
}

class ThingParent {
    public static int x = 10;
}
class Thingy extends ThingParent {
    private int x =99;

    public static void doOther(Thingy t){
        System.out.println(t.x);
    }
}