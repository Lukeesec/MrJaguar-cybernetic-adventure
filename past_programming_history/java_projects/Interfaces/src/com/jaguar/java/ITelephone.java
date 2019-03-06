package com.jaguar.java;

public interface ITelephone {
    /**
     * Theres are the *parameters* of ITelephone (Sorta a signature)
     * You dont write code here from what I can tell.. You write the code
     * in the classes that use the methods listed.
     */
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
