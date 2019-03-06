package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        ITelephone lukesPhone;
        lukesPhone = new DeskPhone(123);
        lukesPhone.powerOn();
        lukesPhone.callPhone(123);
        lukesPhone.answer();
        System.out.println("========================");
        lukesPhone = new MobilePhone(321);
        lukesPhone.powerOn();
        lukesPhone.callPhone(321);
        lukesPhone.answer();
    }
}
