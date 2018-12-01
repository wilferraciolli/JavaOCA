package com.wiltech.intertech.testing;

import com.wiltech.intertech.utils.ConversionService;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestConversionService {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ConversionService.fluidOunces(1.1f));
        System.out.println(ConversionService.gallons(2.2f));
        System.out.println(ConversionService.grams(new BigInteger("30")));
        System.out.println(ConversionService.milliliters(40));
        System.out.println(ConversionService.ounces(new BigDecimal("50")));
        System.out.println(ConversionService.pints(6.6f));
        System.out.println(ConversionService.pounds(new BigDecimal("7.7")));

        // can you figure out why these do not compile
        ConversionService.fluidOunces((float) 1.1F);
        ConversionService.grams(new BigInteger("30"));
        ConversionService.milliliters((int) 4.0);
        BigInteger grams = ConversionService.grams(new BigInteger("30"));
        BigInteger byteGrams = ConversionService.grams(new BigInteger("30"));

        System.out.println();
        System.out.println(grams);
        System.out.println(byteGrams);

        // why do these still work even though the types are different
        System.out.println("------------------------------------");
        double ounces = ConversionService.fluidOunces(1.1f);
        System.out.println(ounces);
        long milliliters = ConversionService.milliliters(40);
        System.out.println(milliliters);
        double decimalmilliliters = ConversionService.milliliters(40);
        System.out.println(decimalmilliliters);
        short s = 30;
        System.out.println(ConversionService.grams(new BigInteger(String.valueOf(s))));
        byte b = 4;
        System.out.println(ConversionService.milliliters(b));
        char z = 'z';
        System.out.println(ConversionService.milliliters(z));
        System.out.println(ConversionService.gallons(200));
        System.out.println(ConversionService.ounces(new BigDecimal("50.5")));
        System.out.println(ConversionService.pints(6L));
        System.out.println(ConversionService.pounds(new BigDecimal("7")));


        // compare these results.  Can you tell why they are different?
        // The problem is that htey both are being casted to a lower numbber, therfore it loses precision.
        //Eg the first example there is the se of int32 and long64
        //Eg the second example there is the se of float32 and double64
        //Hence the massive difference
        System.out.println("------------------------------------");
        float bigGallons = ConversionService.gallons(123456789123456789L);  //will print 3.26172852E16 because int
        System.out.println(bigGallons);
        double bigGallons2 = 123456789123456789L * 0.2642;                       //will print 3.261728368641728E16 because long
        System.out.println(bigGallons2);

        System.out.println("------------------------------------");
        BigInteger bigGrams = ConversionService.grams(new BigInteger("1234567890"));
        System.out.println(bigGrams);
        long bigGrams2 = 1234567890L * 1000L;
        System.out.println(bigGrams2);
    }

}


