/*
 * (c) Midland Software Limited 2019
 * Name     : ThreadTest.java
 * Author   : ferraciolliw
 * Date     : 08 Jul 2019
 */
package com.wiltech.chapter.one;

/**
 *
 */
public class ThreadTest {

    private int count = 1;

    public synchronized void doSomething(){
        for (int i = 0; i <10; i++) {
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
//        ThreadTest demo = new ThreadTest();
//        Thread print1To10 = new A(demo);
//        Thread print11To20 = new A(demo);
//
//        print1To10.start();
//        print11To20.start();
    }
}
//
//class A extends Thread{
//    ThreadTest demo;
//
//    public A(ThreadTest td){
//        demo = td;
//    }
//
//    public void run(){
//
//        demo.doSomething();
//    }
//}
