/*
 * (c) Midland Software Limited 2018
 * Name     : ZooKeeper.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.inheritance;

/**
 * The type Zoo keeper.
 */
public class ZooKeeper {

    /**
     * Feed the animals.
     * @param animals the animals
     */
    public static void feedTheAnimals (Animal[] animals){
        for (Animal a : animals){
            a.feed(a.favoriteFood());
        }
    }

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal[] menagerie = {
                new Lion(),
                new Tiger()
        } ;

        feedTheAnimals(menagerie);
    }
}
