/*

Program: GradeAvg.java          Last Date of this Revision: September 21, 2026

Purpose: Create a GradeAvg application that prompts the user for five grades and then displays the average of the grades. Assume the grades 
are integer values (for example, 89, 97, and so on). Real division should be performed when calculating the average. - Modify the GradeAvg application to use
the += operator to sum the grades as they are entered by the user. Format the average grade to display as a percentage.
*/
package Mastery;

import java.util.Scanner;

public class GradeAvgMastery {

	public static void main(String[] args) {
		

		// Create Scanner
				Scanner input = new Scanner(System.in);

				// Declare variables
				int grade;
				int total = 0;

				// Ask the user for all the grades
				System.out.print("Please enter grade 1: ");
				grade = input.nextInt();
				total += grade;

				System.out.print("Please enter grade 2: ");
				grade = input.nextInt();
				total += grade;

				System.out.print("Please enter grade 3: ");
				grade = input.nextInt();
				total += grade;

				System.out.print("Please enter grade 4: ");
				grade = input.nextInt();
				total += grade;

				System.out.print("Please enter grade 5: ");
				grade = input.nextInt();
				total += grade;

				// Display the average
				System.out.println("Your average grade is: " + (total / 5.0) + "%");
			
	}

}
/* Screen Dump
Please enter grade 1: 51
Please enter grade 2: 52
Please enter grade 3: 53
Please enter grade 4: 54
Please enter grade 5: 55
Your average grade is: 53.0%

Please enter grade 1: 72
Please enter grade 2: 65
Please enter grade 3: 49
Please enter grade 4: 87
Please enter grade 5: 62
Your average grade is: 67.0%
 */












