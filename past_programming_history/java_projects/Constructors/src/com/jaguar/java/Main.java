package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
//
//        Bank lukesAccount = new Bank();//1234,0.00,"Luke","Lukemartin@","808-9347");
//        System.out.println("Account constructor with parameters called.");
//
//        lukesAccount.deposit(200);
//        lukesAccount.withdraw(100);
//
//        System.out.println("Lukes account info: Account number " + lukesAccount.getNumber() + " " +
//                lukesAccount.getBalance() + " " + lukesAccount.getEmail());
//
//        Bank jagsAccount = new Bank("Luke","Lukemartin1968@","123456");
//        System.out.println(jagsAccount.getNumber() + " name " + jagsAccount.getName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Luke","Lukemartin1968@yahoo.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Jaguar", "Jaguar@Yahoo.com",5012);
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());


    }
}
/*
A constructor makes it so parameters can be passed easier and cleaner (may other uses)
 */