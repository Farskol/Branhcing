package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write a:");
        double a = console.nextDouble();
        System.out.println("Write b:");
        double b = console.nextDouble();
        System.out.println("Write c:");
        double c = console.nextDouble();
        System.out.println("Write d:");
        double d = console.nextDouble();
        double sum = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println(sum);
    }
}
