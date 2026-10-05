/*
Program: Delivery.java          Last Date of this Revision: October 5th 2026

Purpose: Create a Delivery application that prompts the user for the length, width, and height of a package, and then
displays “Reject” if any dimension is greater than 10, and “Accept” if all the dimensions are less than or
equal to 10.
*/
package SkillBuilders;

import java.util.Scanner;

public class DeliveryMastery {

	public static void main(String[] args) {
		// Create variables to store the package dimensions
		int length;
		int width;
		int height;

		// Create a Scanner to get input from the user
		Scanner input = new Scanner(System.in);

		// Ask the user to enter the length of the package
		System.out.print("Enter the length of the package: ");

		// Store the length entered by the user
		length = input.nextInt();

		// Ask the user to enter the width of the package
		System.out.print("Enter the width of the package: ");

		// Store the width entered by the user
		width = input.nextInt();

		// Ask the user to enter the height of the package
		System.out.print("Enter the height of the package: ");

		// Store the height entered by the user
		height = input.nextInt();

		// Check if any of the package dimensions are greater than 10
		if (length > 10 || width > 10 || height > 10) {
		    // Reject the package if any dimension is greater than 10
		    System.out.println("Reject");
		} else {
		    // Accept the package if all dimensions are 10 or less
		    System.out.println("Accept");
		}

	}

	
	
	
	
}
/* Screen Dump
Enter the length of the package: 10
Enter the width of the package: 10
Enter the height of the package: 10
Accept
----------------------------------------
Enter the length of the package: 12
Enter the width of the package: 5
Enter the height of the package: 8
Reject
 */












