package com.wiltech.chapter.three;

public class EqualityWhenNotImplemented {

    public static void main(String[] args) {

        //If a class does not implement Equals method, then the default equals provided will compare if they point to the same object ion memory
        String name;

        EqualityWhenNotImplemented t1 = new EqualityWhenNotImplemented();
        EqualityWhenNotImplemented t2 = new EqualityWhenNotImplemented();
        EqualityWhenNotImplemented t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false

        //although they are logically equlas, as there is no equals implementation,
        // it will use the default equals and compare whether they point to the same object
        System.out.println(t1.equals(t2)); // false
    }

}
