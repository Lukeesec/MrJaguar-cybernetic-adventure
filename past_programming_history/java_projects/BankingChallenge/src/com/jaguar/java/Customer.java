package com.jaguar.java;

import java.util.ArrayList;

public class Customer {
    /** Where I explain everything.
     * Name and a array list of doubles.. Point of this class is just to hold customer details.. Makes everything
     * cleaner.
     */
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialAmount) {
        this.name = name;
        //We initialized the ArrayList and saved the name
        this.transactions = new ArrayList<Double>();
        //Adding the initial a  mount to our arrayList
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
