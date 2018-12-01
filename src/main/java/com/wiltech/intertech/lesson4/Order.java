package com.wiltech.intertech.lesson4;

import com.wiltech.intertech.lesson3.MyDate;

public class Order {

    static double taxRate;

    static {
        taxRate = 0.05;
    }

    MyDate orderDate;
    double orderAmount = 0.00;
    String customer;
    String product;
    int quantity;

    public Order(MyDate d, double amt, String c, String p, int q) {
        orderDate = d;
        orderAmount = amt;
        customer = c;
        product = p;
        quantity = q;
    }

    //constructoir to create a single order of Anvil to a customer
    public Order(MyDate d, double amt, String c) {
        this(d, amt, c, "Anvil", 1);
    }


    //update taxrate
    public static void setTaxRate(double newRate) {
        taxRate = newRate;
    }

    //compiute tax rate for an oder amount
    public static void computeTaxOn(double anAmount) {
        System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
    }

    //compute tax for this order
    public double computeTax() {
        System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);

        return orderAmount * Order.taxRate;
    }

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }
}


