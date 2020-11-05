package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write the size of hole A and after B :");
	double AB[] = {console.nextDouble(),console.nextDouble()};
	System.out.println("write the size of brick 'x' after 'y' and after 'z' : ");
	double xyz[] = {console.nextDouble(), console.nextDouble(), console.nextDouble()};
	if (xyz[0] <= AB[0] && xyz[1] <= AB[1] || xyz[0] <= AB[1] && xyz[1] <= AB[0]) {
	    System.out.println("This brick can go through hole!");
    }
	else {
	    if (xyz[0] <= AB[0] && xyz[2] <= AB[1] || xyz[0] <= AB[1] && xyz[2] <= AB[0]) {
            System.out.println("This brick can go through hole!");
        }
	    else {
	        if (xyz[1] <= AB[0] && xyz[2] <= AB[1] || xyz[1] <= AB[1] && xyz[2] <= AB[0]) {
                System.out.println("This brick can go through hole!");
            }
	        else {
                System.out.println("This brick can't go through hole(sad)");
            }
        }
    }

    }
}
