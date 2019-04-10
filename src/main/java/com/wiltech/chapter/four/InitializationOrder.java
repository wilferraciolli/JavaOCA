package com.wiltech.chapter.four;

public class InitializationOrder {

    private String name = "Torchie"; // fith line to run

    {
        System.out.println(name); //sixth line to run
    }

    private static int COUNT = 0; //first line to run

    static {
        System.out.println(COUNT); //second line to run
    }

    {
        COUNT++;//seventh lne to run
        System.out.println(COUNT); //eight line to run
    }

    public InitializationOrder() {
        System.out.println("constructor");//nineth leine to run
    }


    //call the main
    //This method will instantiate every static vars and run every static before it even runs te main method
    public static void main(String[] args) {
        System.out.println("Read to contruct");//thrid line to run
        new InitializationOrder();


        //this will output
//        0
//        Read to contruct
//                Torchie
//        1
//        constructor
    }
}
