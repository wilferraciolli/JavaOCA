/*
 * (c) Midland Software Limited 2018
 * Name     : ParrentConstructor.java
 * Author   : ferraciolliw
 * Date     : 09 Oct 2018
 */
package com.wiltech.crashcourse.constructor;

import javax.sql.rowset.BaseRowSet;

/**
 *
 */
public class ParrentConstructor {
    public static void main(String[] args) {

        //this should call the super class first thna the sub class
        new Q26Sub(4);

        //this will call the subclass
        new Q27Sub();
    }

}

class Q26Base{
    int x = 99;
    Q26Base(int x){
        System.out.println("in base constructor x is " + x);
    }
}
class Q26Sub extends Q26Base {
    Q26Sub(int x){
        super(x);
        System.out.println("in subs constructor x is " +x );
    }
}

class Q27Base{
    int x = 99;
}
class Q27Sub extends Q27Base {
//    You cannot have both this and super on a  constructor. It must be one or the other. Also it needs to be the first call on the method
    Q27Sub(){
        this(4);
     //   super();
        System.out.println("in subs constructor x is " +x );
    }

    Q27Sub(int x){
        System.out.println("in default constructor x is " + x);
    }
}
