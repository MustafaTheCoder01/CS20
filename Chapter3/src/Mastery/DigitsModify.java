package Mastery;

import java.util.Scanner;

public class DigitsModify {

	public static void main(String[] args) {
		
		//Declare the variables
		int number;
		int hundredsplace;
		int tensplace;
		int onesplace;

		//Create a Scanner
		Scanner input = new Scanner(System.in);

		//Ask the user to enter a three digit number.
		System.out.print("Please enter a three digit number: ");

		//Store the number entered by the user.
		number = input.nextInt();

		//Find the hundreds place digit.
		hundredsplace = number / 100;

		//Find the tens place digit.
		tensplace = number / 10 % 10;

		//Find the ones place digit.
		onesplace = number % 10;

		//Display the hundreds place digit.
		System.out.println("Hundreds place digit: " + hundredsplace);

		//Display the tens place digit.
		System.out.println("Tens place digit: " + tensplace);

		//Display the ones place digit.
		System.out.println("Ones place digit: " + onesplace);
	}

}
