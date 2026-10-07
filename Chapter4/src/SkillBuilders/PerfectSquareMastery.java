/*
Program: PerfectSquare.java          Last Date of this Revision: October 5th 2026

Purpose: Create a PerfectSquare application that prompts the user for an integer and then displays a message indicating whether or not the number is a perfect square. This can be determined by finding the square root of a
number, truncating it (by casting the double result), and then squaring that result.
*/
package SkillBuilders;

import java.util.Scanner;

public class PerfectSquareMastery {

	public static void main(String[] args) {
		// Create a Scanner to get input from the user
		Scanner input = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.print("Enter a number: ");

		// Store the number entered by the user
		int num = input.nextInt();

		// Find the square root of the number and convert it to an integer
		int root = (int)Math.sqrt(num);

		// Check if the square of the root equals the original number
		if (root * root == num)
		    // Display that the number is a perfect square
		    System.out.println("Perfect square");
		else
		    // Display that the number is not a perfect square
		    System.out.println("Not a perfect square");

	}

}
/* Screen Dump
Enter a number: 49
Perfect square

 Enter a number: 35
Not a perfect square
 */