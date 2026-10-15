/*
Program: Investment.java          Last Date of this Revision: October 14th 2026

Purpose: Create an Investment application that calculates how many years it will take for a $2,500 investment
to be worth at least $5,000 if compounded annually at 7.5%
*/
package Mastery;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter initial investment: $");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double interestRate = input.nextDouble() / 100;

        System.out.print("Enter target amount: $");
        double target = input.nextDouble();

        int years = 0;

        while (investment < target)
        {
            investment = investment * (1 + interestRate);
            years++;
        }

        System.out.println("Years required: " + years);
        System.out.printf("Final investment value: $%.2f%n", investment);


	}

}
/* Screen Dump
Enter initial investment: $2500
Enter annual interest rate (%): 7.5
Enter target amount: $5000
Years required: 10
Final investment value: $5152.58
 */