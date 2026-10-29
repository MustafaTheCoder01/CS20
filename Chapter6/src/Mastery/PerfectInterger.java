/*

Program: PerfectInterger.java          Last Date of this Revision: October 28th 2026

Purpose: Create a PerfectIntegers application that displays all perfect integers up to 100. A perfect integer is a
number which is equal to the sum of all its factors except itself. For example, 6 is a perfect number
because 1 + 2 + 3 = 6. The application should include a boolean method isPerfect().

*/
package Mastery;

public class PerfectInterger {

	 public static boolean isPerfect(int number)
	    {
	        int sum = 0;

	        // Find all factors except the number itself
	        for (int i = 1; i < number; i++)
	        {
	            if (number % i == 0)
	            {
	                sum = sum + i;
	            }
	        }

	        // Return true if the sum equals the number
	        return sum == number;
	    }
	public static void main(String[] args) {

		System.out.println("Perfect integers up to 100:");

        // Check every integer from 1 to 100
        for (int i = 1; i <= 100; i++)
        {
            if (isPerfect(i))
            {
                System.out.println(i);
            }
        }
    }

}
/* Screen Dump

Perfect integers up to 100:
6
28
 
 */

