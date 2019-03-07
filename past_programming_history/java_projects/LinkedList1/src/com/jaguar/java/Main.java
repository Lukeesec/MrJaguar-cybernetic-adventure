package com.jaguar.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /** anotherCustomer is just pointing to Customer thats why the balance change affected customer*/

        //Created a new object.. A new instance of the customer class.
        Customer customer = new Customer("Luke", 54.96);
        //anotherCustomer is the second  object in the Customer class.
        Customer anotherCustomer;
        //Now we are setting anotherCustomer to the customer class
        anotherCustomer = customer; //this block only saved the memory of customer?
        //Setting the balance to 12.18
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is: " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(4);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + 1 + ": " + integerArrayList.get(i));
        }

        integerArrayList.set(2, 10);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + 1 + ": " + integerArrayList.get(i));
        }
    }
}
