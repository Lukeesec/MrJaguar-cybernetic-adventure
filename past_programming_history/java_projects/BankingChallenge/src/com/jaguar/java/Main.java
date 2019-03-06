package com.jaguar.java;

public class Main {


    public static void main(String[] args) {

        //Creating a new object for the bank class
        Bank bank = new Bank("The National American Bank");

        bank.addBranch("TheRed");
        bank.addCustomer("TheRed", "Luke", 50);
        bank.addCustomer("TheRed", "Joshua", 100);
        bank.addCustomer("TheRed", "Ally", 200);

        bank.addBranch("Capital One");
        bank.addCustomer("Capital One", "Caleb", 1200);
        bank.addCustomer("Capital One", "Mindy", 1300);
        bank.addCustomer("Capital One", "Ben", 1200);

        bank.addCustomerTransaction("TheRed","Luke",300);
        bank.addCustomerTransaction("TheRed","Luke",400);
        bank.addCustomerTransaction("TheRed","Luke",500);
        bank.addCustomerTransaction("Capital One","Mindy",100000);

        bank.listCustomers("TheRed",false);
        System.out.println("");
        bank.listCustomers("Capital One",true);

        //Checking all of our validation down below

        bank.addBranch("Melivn");
        if(!bank.addCustomer("Melivn","Bran",553)) {
            System.out.println("Error melvin, branch does not exist");
        }

        if(!bank.addBranch("Capital One")) {
            System.out.println("Capital one already exist");
        }

        if(!bank.addCustomerTransaction("Capital One","Frug",2000)) {
            System.out.println("Customer does not exist");
        }

        if(!bank.addCustomer("TheRed","Luke",50)) {
            System.out.println("Customer Luke already exist");
        }
    }

}