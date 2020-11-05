package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write x1 and y1:");
        double x1y1[]= {console.nextDouble(), console.nextDouble()};
        System.out.println("write x2 and y2:");
        double x2y2[]= {console.nextDouble(), console.nextDouble()};
        System.out.println("write x3 and y3:");
        double x3y3[]= {console.nextDouble(), console.nextDouble()};
        double minX = Math.min(x1y1[0],Math.min(x2y2[0],x3y3[0]));
        if (x1y1[0] == minX) {
            if ((x2y2[0]-x1y1[0])/(x2y2[1]-x1y1[1])==(x3y3[0]-x1y1[0])/(x3y3[1]-x1y1[1])){
                System.out.println("it is line!");
            }
            else {
                System.out.println("it is not line(sad)");
            }
        }
        else {
            if (x2y2[0] == minX) {
                if ((x1y1[0]-x2y2[0])/(x1y1[1]-x2y2[1]) == (x3y3[0]-x2y2[0])/(x3y3[1]-x2y2[1])){
                    System.out.println("it is line!");
                }
                else {
                    System.out.println("it is not line(sad)");
                }
            }
            else {
                if ((x2y2[0]-x3y3[0])/(x2y2[1]-x3y3[1]) == (x1y1[0]-x3y3[0])/(x1y1[1]-x3y3[1])){
                    System.out.println("it is line!");
                }
                else {
                    System.out.println("it is not line(sad)");
                }
            }
        }
    }
}
