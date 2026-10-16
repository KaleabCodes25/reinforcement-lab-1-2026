package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = input.next();
        System.out.println("How old are you?:");
        int age = input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        input.close();

    }

}
