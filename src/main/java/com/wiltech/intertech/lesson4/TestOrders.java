package com.wiltech.intertech.lesson4;

import com.wiltech.intertech.lesson3.MyDate;

public class TestOrders {

    /**
     * @param args
     */
    public static void main(String[] args) {

        MyDate date1 = new MyDate(1, 20, 2008);
        Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

        MyDate date2 = new MyDate(4, 10, 2008);
        Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);

        System.out.println(anvil);
        System.out.println(balloons);

        //Test orders
        System.out.println();
        System.out.println("The tax Rate is currently: " +
                Order.taxRate);
        Order.computeTaxOn(3000.00);
        anvil.computeTax();
        balloons.computeTax();

        //increase the tax rate and check the results
        Order.setTaxRate(0.06);
        System.out.println();
        System.out.println("The tax Rate is currently: " +
                Order.taxRate);
        Order.computeTaxOn(3000.00);
        anvil.computeTax();
        balloons.computeTax();

        //aditional test to test the anvil constructor
        System.out.println();
        MyDate date3 = new MyDate(5, 20, 2008);
        Order anotherAnvil = new Order(date3, 200, "Road Runner");
        System.out.println(anotherAnvil);
    }

}
