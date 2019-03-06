package com.jaguar.java;

import java.util.Scanner;

public class Main {
    /**
     * 4 types of nested classes
     * <p>
     * static nested classes
     * <p>
     * non static nested class (we call that a inner class)
     * <p>
     * local class (a inner class defined inside of a scope block)
     * <p>
     * Anonymous class (a nested without a class name)
     */
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//
//        class ClickListener implements Button.OnclickListener {
//            public void ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClicListener(new ClickListener());

        btnPrint.setOnClicListener(new Button.OnclickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;

            }
        }
    }
}