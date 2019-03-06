package com.jaguar.java;

public class Bank {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Bank() {
        this(4321, 1234, "Default", "Default", "Default");
        System.out.println("Empty constructor called.");
    }

    public Bank(int number, double balance, String name, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Bank(String name, String email, String phone) {
        this(9999, 100.66, name, email, phone);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        //checking first if there is enough and if so then going to the else statement
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only " + balance + " available. Withdraw canceled.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }

//    public void setAccountNumber(int number) {
//        this.number = number;
//
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//
//    }
//
//    public void setName(String name) {
//        this.name = name;
//
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//
//    }


    //setters and getters

    public int getNumber() {
        return this.number;

    }

    public double getBalance() {
        return this.balance;

    }

    public String getName() {
        return this.name;

    }

    public String getEmail() {
        return this.email;

    }

    public String getPhone() {
        return this.phone;

    }
}

