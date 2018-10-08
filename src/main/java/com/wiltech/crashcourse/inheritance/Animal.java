/*
 * (c) Midland Software Limited 2018
 * Name     : Animal.java
 * Author   : ferraciolliw
 * Date     : 08 Oct 2018
 */
package com.wiltech.crashcourse.inheritance;

/**
 * The type Animal.
 */
public abstract class Animal {
    public abstract String favoriteFood();

    public void feed(String food){
        if (food.equals(favoriteFood())){
            System.out.println("Yum! eating " + food);
        }else{
            System.out.println("Not Yum! eating " + food);
        }

    }


}
