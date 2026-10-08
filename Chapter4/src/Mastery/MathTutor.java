/*

Program: MathTutor.java          Last Date of this Revision: October 8th 2026

Purpose:Create a MathTutor application that displays math problems by randomly generating two numbers, 1
through 10 and an operator (*, +, –, /), and then prompts the user for an answer. The application should
check the answer, display a message, and the correct answer, if necessary. The application output
should look similar to: What is 6 + 2? 8 Correct 
*/
package Mastery;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate two numbers from 1 to 10
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;

        // Generate a random operator
        int operator = random.nextInt(4);

        double answer = 0;
        String symbol = "";

        // Choose the operation and calculate the correct answer
        if (operator == 0) {
            symbol = "+";
            answer = num1 + num2;
        }
        else if (operator == 1) {
            symbol = "-";
            answer = num1 - num2;
        }
        else if (operator == 2) {
            symbol = "*";
            answer = num1 * num2;
        }
        else {
            symbol = "/";
            answer = (double) num1 / num2;
        }

        // Ask the user the question
        System.out.print("What is " + num1 + " " + symbol + " " + num2 + "? ");
        double userAnswer = input.nextDouble();

        // Check the answer
        if (userAnswer == answer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
            System.out.println("The correct answer is " + answer);
        }
		
		
	}

}
/* Screen Dump
What is 7 * 4? 28
Correct!
 */