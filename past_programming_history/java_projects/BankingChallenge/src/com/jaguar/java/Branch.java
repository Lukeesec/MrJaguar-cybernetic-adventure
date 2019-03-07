package com.jaguar.java;

import java.util.ArrayList;

public class Branch {
    /**
     * Needs to be able to add a new customer and a initial transaction amount.
     * Also needs to add additional transactions for that customer/branch
     */

    //Branch name
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        //Initializing the arrayList
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //Reason for boolean - So if we pass a customer name that already exists it will return false
    public boolean newCustomer(String customerName,double initialAmount) {
        if(findCustomer(customerName) == null) {
            //Using new so we can create a new customer class (Kinda?)
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    //Checking if the person exists (dont know what the existingCustomer does exactly.. it changes the Customer arrayList somehow
    public boolean addCustomerTransaction(String customerName, double amount) {
        //Making a new object in the class/arrayList customer i.e existingCustomer
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    //Goes through the arraylist checking if the name entered is in the array list already
    private Customer findCustomer(String customerName) {
        for (int i = 0; i <customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
