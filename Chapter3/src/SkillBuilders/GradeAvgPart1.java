package SkillBuilders;

import java.util.Scanner;

public class GradeAvgPart1 {

	public static void main(String[] args) {
		
		 // Declare the variables.
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        int total;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for five grades.
        System.out.print("Please enter grade 1: ");
        grade1 = input.nextInt();

        System.out.print("Please enter grade 2: ");
        grade2 = input.nextInt();

        System.out.print("Please enter grade 3: ");
        grade3 = input.nextInt();

        System.out.print("Please enter grade 4: ");
        grade4 = input.nextInt();

        System.out.print("Please enter grade 5: ");
        grade5 = input.nextInt();

        // Add all five grades together.
        total = grade1 + grade2 + grade3 + grade4 + grade5;

        // Divide by 5.0 to get the average with decimals.
        System.out.println("The average is: " + total / 5.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
