package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

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
