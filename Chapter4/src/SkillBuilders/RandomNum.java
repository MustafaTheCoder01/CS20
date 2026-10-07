/*
Program: RandomNum.java          Last Date of this Revision: October 7th 2026

Purpose: Create a RandomNum application that prompts the user for two numbers. The first number is a minimum
value and the second is a maximum value. RandomNum then displays an integer between the min and max
values entered by the user.
*/
package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
	
		//Declare the min and max variables
		int min, max;

		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the min number
		System.out.println("Enter the min number: ");
		
		//Record the min number
		min = input.nextInt();
		
        //Prompt the user for the max number
        System.out.println("Enter the max number: ");
		
		//Record the max number
		max = input.nextInt();
		
		//Generate the random numbers
        System.out.println("Random number: " + (int)(max - min + 1) * Math.random()+ min);
		
        
        
    
	}

}
/* Screen Dump
Enter the min number: 
1
Enter the max number: 
2
Random number: 1.71802355387855021????????
 */






