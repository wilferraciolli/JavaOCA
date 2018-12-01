package com.wiltech.intertech.lesson3;

/**
 * create nultiple instances of StaticAndTheJVM and ceck that on the JVM the static variables are still only one for many objects.
 */
public class TestStaticAndTheJVM {

    public static void main(final String[] args) {

        //create 5 instances
        final StaticAndTheJVM staticAndTheJVM1;
        StaticAndTheJVM staticAndTheJVM2;
        StaticAndTheJVM staticAndTheJVM3;
        StaticAndTheJVM staticAndTheJVM4;
        StaticAndTheJVM staticAndTheJVM5;


        System.out.println("The counter should be 0 and is = " + StaticAndTheJVM.count);

        //instantiate then
        staticAndTheJVM1 = new StaticAndTheJVM();
        System.out.println("The counter should be 1 and is = " + StaticAndTheJVM.count);
        staticAndTheJVM2 = new StaticAndTheJVM();
        System.out.println("The counter should be 2 and is = " + StaticAndTheJVM.count);
        staticAndTheJVM3 = new StaticAndTheJVM();
        System.out.println("The counter should be 3 and is = " + StaticAndTheJVM.count);
        staticAndTheJVM4 = new StaticAndTheJVM();
        System.out.println("The counter should be 4 and is = " + StaticAndTheJVM.count);
        staticAndTheJVM5 = new StaticAndTheJVM();
        System.out.println("The counter should be 5 and is = " + StaticAndTheJVM.count);
    }

}
