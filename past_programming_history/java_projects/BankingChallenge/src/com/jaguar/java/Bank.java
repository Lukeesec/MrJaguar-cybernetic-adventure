package com.jaguar.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    /** Should have a arraylist of Branches
     * Each branch should have a arraylist of customers..
     */

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    /** So here, we are sorta doing the same thing we would do to check if we already have a customer.. Instead
     * we are checking if we already have the branch.. and if not we will make a new Branch.*/
    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    /** This method adds the customer if findBranch returns a position.. And if it returns a position or does not
     * equal null, then we block of code in the if statement goes through */
    public boolean addCustomer(String branchName,String customerName,double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    //checks if the branch String entered equals any branch in the branchArrayList
    public Branch findBranch(String branchName) {
        for (int i = 0; i <this.branches.size() ; i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    /** Gets the list of the current customers and their transactions.
     *
     * So, we are checking if the branchName entered is on file.. If so then we get the branch name.
     * Then we need to get our customers for that specific branch.. So we make a new arrayList and use branch.getCustomers
     * to get our current customers and put them in our arrayList branchCustomers. Then we do a for loop to get our
     * customers.
     *
     * Now to show the showTransactions is true then we show the transactions.. We make a new arrayList and we get
     * the transactions in the customer class. Then we do a for loop to print out the transactions for the specified branch
     */
    public boolean listCustomers(String branchName,boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customers details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i <branchCustomers.size() ; i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    //Unboxing here
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j <transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));

                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }













}
/* TEST LATER
   public Branch findBranch(String branchName) {
        int position = searchFor(branchName);
        if(position>=0) {
            return true;
        }
        return false;
    }


    private int searchFor(String branchName) {
        return branches.indexOf(branchName);
    }
 */