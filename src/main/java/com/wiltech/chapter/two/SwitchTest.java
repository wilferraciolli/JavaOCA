package com.wiltech.chapter.two;

public class SwitchTest {

    /**
     * Allowed data types for a switch
     * int and Integer
     * byte and Byte
     * shortAnd Short
     * char and Character
     * String
     * enum values
     */

    public static void main(String[] args) {
        int i = 0;

        switch (i){
            case 1:
            System.out.println("Value was one");
            break;
            default:
                System.out.println("Default");
        }

        double d = 0.5;//not allowed
        boolean b = true;//not allowed
        float f = 10f;//not Allowed


        //test enu,m switches
        testSwitchOnEnum(Types.ONE);
    }

    public static void testSwitchOnEnum(Types enumTypes){
        switch (enumTypes){
            case ONE:
                System.out.println("One");
                break;
            case TWO:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
                break;
        }

        //test switch with return
        System.out.println(testEnumsWithReturn());
    }

    public static int testEnumsWithReturn(){
        String name = "Wiliam";

        switch (name){
            case "Wiliam":
                return 1;
            case "Nah":
                return 5;
            default:
                return  0;
        }
    }

}

enum Types{
    ONE, TWO
}