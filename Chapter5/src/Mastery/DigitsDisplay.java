/*
Program: DigitsDisplay.java          Last Date of this Revision: October 13th 2026

Purpose: Create a DigitsDisplay application that prompts the user for a non-negative integer and then displays
each digit on a separate line

*/
package Mastery;

import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        System.out.println("Each digit on a separate line:");

        String digits = "";

        if (number == 0)
        {
            System.out.println(0);
        }
        else
        {
            while (number > 0)
            {
                int digit = number % 10;
                digits = digit + "\n" + digits;
                number = number / 10;
            }

            System.out.print(digits);
        }

	}

}
/* Screen Dump
Enter a non-negative integer: 835
Each digit on a separate line:
8
3
5
 */