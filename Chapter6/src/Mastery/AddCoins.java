/*

Program: AddCoins.java          Last Date of this Revision: October 27th 2026

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes,
and quarters, and then displays their total dollar amount. The AddCoins application should include
a getDollarAmount() method that has four Int parameters corresponding to the number of pennies,
nickels, dimes, and quarters, and returns a String that corresponds to the dollar value of the coins.
Note that the String returned should include the currency sign ($)

*/
package Mastery;

import java.util.Scanner;

        public class AddCoins { public static String getDollarAmount(int pennies, int nickels,
        int dimes, int quarters)
{
        int totalCents = pennies + (nickels * 5)
        + (dimes * 10) + (quarters * 25);

        double dollars = totalCents / 100.0;

        return String.format("$%.2f", dollars);
}

	    public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of pennies: ");
	        int pennies = input.nextInt();

	        System.out.print("Enter the number of nickels: ");
	        int nickels = input.nextInt();

	        System.out.print("Enter the number of dimes: ");
	        int dimes = input.nextInt();

	        System.out.print("Enter the number of quarters: ");
	        int quarters = input.nextInt();

	        String total = getDollarAmount(pennies, nickels, dimes, quarters);

	        System.out.println("Total dollar amount: " + total);

	        input.close();

	}

}
/* Screen Dump

Enter the number of pennies: 15
Enter the number of nickels: 2
Enter the number of dimes: 5
Enter the number of quarters: 1
Total dollar amount: $1.00    
         
*/