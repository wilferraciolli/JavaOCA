package com.wiltech.chapter.two;

public class Loops {

    public static void main(String[] args) {

        //infinite loop
        infiniteLoop();

        //multiple terms for statement loop
        multipleTermsForLoop();


        // Redeclaring a variable iniitialization
        illegalMultipleDeclarationLoop();

        //with multiple statements
        multipleStatements();

        //incompatible data type
        declaringTwoTypesOnInitialaztion();

        //using variables outside the loop
        usingVariablesOutside();

    }

    /**+
     * using variables outside the scope
     */
    private static void usingVariablesOutside() {
//        for(long y = 0, x=4; x <5 && y<10; x++,y++){
//            System.out.println(y + " ");
//        }
//        System.out.println(x);//does not compile
    }


    /**
     * This  does not compile because on the initialazion block there are two data types, long and int
     */
    private static void declaringTwoTypesOnInitialaztion() {
//        for (long y=0, int x= 4; x< 5 && y<10; x++,y++){// does not compile because long and int
//            System.out.println(x + " ");
//        }
    }


    private static void multipleStatements() {
        int x = 0;
        long y = 10;
        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(x + " ");
        }
    }

    /**
     * this will not compile because when declaring multiple variables, it cannot have duplicated names
     * Eg x already exists therefore cannot be created within the pool.
     */
    private static void illegalMultipleDeclarationLoop() {
//        int x = 0;
//        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//            System.out.println(y + " ");
//       }
    }

    /**
     * prints 0 1 2 3 4
     */
    private static void multipleTermsForLoop() {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(y + " ");
        }
        System.out.println(x);
    }

    private static void infiniteLoop() {
        for (; ; ) {
            System.out.println("Hello ");
        }

    }
}
