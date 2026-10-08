/*

Program: Grade.java          Last Date of this Revision: October 8th 2026

Purpose: Create a Grade application that prompts the user for the percentage earned on a test or other graded
work and then displays the corresponding letter grade. The application should use the grading scale
at your school or the following grading scale:
90 – 100 A
80 – 89 B
70 – 79 C
60 – 69 D
below 60 F
 The application output should look similar to: Enter the percentage: 80 Grade = B
*/
package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		 // Create a Scanner to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter their percentage
        System.out.print("Enter the percentage earned: ");
        
        // Store the user's percentage in the percentage variable
        double percentage = input.nextDouble();

        // Check if the percentage is 90 or higher
        if (percentage >= 90) {
            System.out.println("Letter Grade: A");
        } 
        
        // Check if the percentage is 80 to 89
        else if (percentage >= 80) {
            System.out.println("Letter Grade: B");
        } 
        
        // Check if the percentage is 70 to 79
        else if (percentage >= 70) {
            System.out.println("Letter Grade: C");
        } 
        
        // Check if the percentage is 60 to 69
        else if (percentage >= 60) {
            System.out.println("Letter Grade: D");
        } 
        
        // If the percentage is below 60, give an F
        else {
            System.out.println("Letter Grade: F");
        }
        }

	}
/* Screen Dump
Enter the percentage earned: 91
Letter Grade: A
 */

