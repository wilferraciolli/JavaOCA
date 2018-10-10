package com.wiltech.crashcourse.exceptions;

/**
 * The type Base exception.
 */
public class BaseException {
    /**
     * Do base stuff.
     */
    public void doBaseStuff() {
        System.out.println("base do stuff");
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }
}

/**
 * The type Sub exception.
 */
class SubException extends BaseException {

    public void doBaseStuff() {
        System.out.println("sub do stuff");
    }

    /**
     * Do other stuff.
     */
    public void doOtherStuff() {
        System.out.println("other do stuff");
    }

}