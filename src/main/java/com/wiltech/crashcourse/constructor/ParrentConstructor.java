/*
 * (c) Midland Software Limited 2018
 * Name     : ParrentConstructor.java
 * Author   : ferraciolliw
 * Date     : 09 Oct 2018
 */
package com.wiltech.crashcourse.constructor;

import javax.sql.rowset.BaseRowSet;

/**
 * The type Parrent constructor.
 */
public class ParrentConstructor {
    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //this should call the super class first thna the sub class
        new Q26Sub(4);

        //this will call the subclass
        new Q27Sub();
    }

}

/**
 * The type Q 26 base.
 */
class Q26Base{
    /**
     * The X.
     */
    int x = 99;

    /**
     * Instantiates a new Q 26 base.
     * @param x the x
     */
    Q26Base(int x){
        System.out.println("in base constructor x is " + x);
    }
}

/**
 * The type Q 26 sub.
 */
class Q26Sub extends Q26Base {
    /**
     * Instantiates a new Q 26 sub.
     * @param x the x
     */
    Q26Sub(int x){
        super(x);
        System.out.println("in subs constructor x is " +x );
    }
}

/**
 * The type Q 27 base.
 */
class Q27Base{
    /**
     * The X.
     */
    int x = 99;
}

/**
 * The type Q 27 sub.
 */
class Q27Sub extends Q27Base {
    /**
     * Instantiates a new Q 27 sub.
     */
    //    You cannot have both this and super on a  constructor. It must be one or the other. Also it needs to be the first call on the method
    Q27Sub(){
        this(4);
     //   super();
        System.out.println("in subs constructor x is " +x );
    }

    /**
     * Instantiates a new Q 27 sub.
     * @param x the x
     */
    Q27Sub(int x){
        System.out.println("in default constructor x is " + x);
    }
}
