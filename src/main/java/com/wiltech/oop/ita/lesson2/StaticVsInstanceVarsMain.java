package com.wiltech.oop.ita.lesson2;

public class StaticVsInstanceVarsMain {

    public static void main(String[] args) {
        StaticVsInstanceVars s1 = new StaticVsInstanceVars();
        s1.name = "Sum 1";

        StaticVsInstanceVars s2 = new StaticVsInstanceVars();
        s2.name = "Sum 2";

        StaticVsInstanceVars s3 = new StaticVsInstanceVars();
        s3.name = "Sum 3";

        //sum 3 times for each object
        for (int i = 0; i < 3; i++) {
            s1.sum();
            s2.sum();
            s3.sum();
        }

        //add one tot he instance variable
        s2.sum();

        //print them all
        s1.print();//The sum Sum 1 instance = 3 and static = 10
        s2.print();//The sum Sum 2 instance = 4 and static = 10
        s3.print();//The sum Sum 3 instance = 3 and static = 10
    }
}
