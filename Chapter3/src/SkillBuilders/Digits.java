package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		//Declare the variables
        int number;
        int onesplace;
        int tensplace;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a two digit number.
        System.out.print("Please enter a two digit number: ");

        //Store the number entered by the user.
        number = input.nextInt();

        //Find the tens place digit.
        tensplace = number / 10;

        //Find the ones place digit.
        onesplace = number % 10;

        //Display the tens place digit.
        System.out.println("Tens place digit: " + tensplace);

        //Display the ones place digit.
        System.out.println("Ones place digit: " + onesplace);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
