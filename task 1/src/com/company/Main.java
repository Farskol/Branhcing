package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write first coal :");
        double firstCoal = console.nextDouble();
        System.out.println("write second coal :");
        double secondCoal = console.nextDouble();
        if (firstCoal + secondCoal >= 180) {
            System.out.println("we  can\'t paint triangle");
        } else {
            System.out.print("we can paint, ");
            if (firstCoal == 90 || secondCoal == 90 || firstCoal+secondCoal == 90) {
                System.out.println("this is rectangular triangle ");
            }
            else {
                System.out.println("this is triangle, but it isn\'t rectangular ");
            }
        }
    }
}