package com.wiltech.chapter.four;


import java.math.BigInteger;

public class ReturningValues {

    public static void main(String[] args) {
        int number = 1;
        BigInteger numberInt = new BigInteger("1");

        incrementPrimitive(number);
        incrementWrapper(numberInt);

        System.out.println(number); //1
        System.out.println(numberInt); //1

    }

    public static void incrementPrimitive(int number) {
        number++;
    }

    public static void incrementWrapper(BigInteger numberInt) {
          numberInt.add(new BigInteger("1"));
    }

    public int sum (int a, int b){
        return a + b+1;
    }
}
