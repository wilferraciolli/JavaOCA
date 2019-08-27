/*
 * (c) Midland Software Limited 2019
 * Name     : Lists.java
 * Author   : ferraciolliw
 * Date     : 09 Jul 2019
 */
package com.wiltech.chapter.one;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Lists {

    public static void main(String[] args) {

        List<? super C> list1 = new ArrayList<C>();
        list1.add(new C());
//        list1.add(new D());
        list1.add(new E());




    }
}
interface A{}
interface B{}
class C implements A, B {}
class D implements B {}
class E extends C {}
