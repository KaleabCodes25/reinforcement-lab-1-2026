package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = input.next();
        System.out.println("How old are you?:");
        int age = input.nextInt();
        askNameAge("Kaleab", 27);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        input.close();

        System.out.println(age >= 18 ? "Old enough to vote" : "Not old enough to vote");
    }
    public static void askNameAge(String name, int age ) {
        System.out.println("Hello " + name + " You are " + age + " years old !");
    }




}
