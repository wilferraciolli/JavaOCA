/*
 * (c) Midland Software Limited 2018
 * Name     : InheritancePart2.java
 * Author   : ferraciolliw
 * Date     : 09 Oct 2018
 */
package com.wiltech.crashcourse.inheritance;

/**
 * The type Inheritance part 2.
 */
public class InheritancePart2 {
    public static void main(String[] args) {

    }

}

/**
 * The type Parent.
 */
class Parent{
    public Parent getOne(){ return null;}
    public long getNum(){return  99L;}
}

/**
 * The type Child.
 */
class Child extends Parent{

    @Override
    public long getNum() {
        return super.getNum();
    }

    @Override
    public Parent getOne() {
        return super.getOne();
    }
}