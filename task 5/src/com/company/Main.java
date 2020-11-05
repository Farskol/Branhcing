package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("please write something, for example x:");
        double x = console.nextDouble();
        System.out.println("Thank you!");
        double sum ;
        if (x > 3) {
            System.out.println("Ooo your x > 3");
            sum = Math.pow(x,2) - 3*x + 9;
            System.out.println("Hmm i have done with it something and happen this -> " + sum);
        }
        else {
            System.out.println("Ooo your x <= 3");
            sum = 1/(Math.pow(x,3)+6);
            System.out.println("Hmm i have done with it something and happen this -> " + sum);
        }
    }
}
