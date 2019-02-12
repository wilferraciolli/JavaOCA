package com.wiltech.intertech.domain;

import com.wiltech.intertech.utils.MyDate;

public class Order {

    public static double taxRate;

    static {
        taxRate = 0.05;
    }

    private MyDate orderDate;
    private double orderAmount = 0.00;
    private String customer;
    private String product;
    private int quantity;

    public Order(MyDate d, double amt, String c, String p, int q) {
        //        if (!validIntNumber(quantity)) {
        //            System.out.println("Invalid number provided " + quantity);
        //        }
        //        if (!validDoubleNumber(orderAmount)) {
        //            System.out.println("Invalid value provided " + orderAmount);
        //        }
        this.orderDate = d;
        this.orderAmount = amt;
        this.customer = c;
        this.product = p;
        this.quantity = q;
    }

    //constructor to create a single order of Anvil to a customer
    public Order(MyDate d, double amt, String c) {
        this(d, amt, c, "Anvil", 1);
    }

    /**
     * calculate the size of hte order
     * @return
     */
    public char jobsize() {

        if (this.quantity <= 25) {
            return 'S';
        } else if (this.quantity <= 75) {
            return 'M';
        } else if (this.quantity <= 150) {
            return 'L';
        } else {
            return 'X';
        }
    }

    /**
     * Calculate total, amount, tax and discount
     * @return
     */
    public double computeTotal() {

        //orderamount - discount+ tax
        char jobSize = jobsize();
        double total = orderAmount;
        double discount = (orderAmount * getDiscount(jobSize));
        double tax = orderTaxIsent() ? 0 : (computeTax());

        return total - discount + tax;
        //
        //
        //        if () {
        //            double total = orderAmount + computeTax();
        //        }
        //
        //        if (jobSize == 'S') {
        //            return orderTaxIsent() ? orderAmount : total;
        //        } else {
        //            return (orderTaxIsent() ? orderAmount : total) - (orderAmount * getDiscount(jobSize));
        //        }
    }

    /**
     * check if the order is more than the price to remove tax
     * @return
     */
    private boolean orderTaxIsent() {
        return orderAmount > 1500;
    }

    /**
     * function to get the discount based on order size
     * @param jobSize
     * @return
     */
    private double getDiscount(char jobSize) {
        if (jobSize == 'M') {
            return 0.01;
        } else if (jobSize == 'L') {
            return 0.02;
        } else if (jobSize == 'X') {
            return 0.03;
        } else {
            return 0;
        }
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

    public MyDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(MyDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        if (validDoubleNumber(orderAmount)) {
            this.orderAmount = orderAmount;
        } else {
            System.out.println("Invalid double  provided " + orderAmount);
        }
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (validIntNumber(quantity)) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity provided " + quantity);
        }
    }

    private boolean validIntNumber(int number) {
        return number > 0;
    }

    private boolean validDoubleNumber(double number) {
        return number > 0d;
    }

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }
}


