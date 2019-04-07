package com.wiltech.chapter.four;

public class MethodOverloadAutoboxing {

    public static void autobox(Long l){
        System.out.println("Long");
    }

    public static void autobox(long l){
        System.out.println("long primitive");
    }

    public static void autobox(Long... l){
        System.out.println("Long var args");
    }


    public static void main(String[] args) {
        autobox(1); //this will be converted onto a long primitive
        autobox(4L); //this will use the long primitive as the prefered option
    }
}
