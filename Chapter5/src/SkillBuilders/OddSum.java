package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++)
        {
            if (i % 2 != 0)
            {
                sum = sum + i;
            }
        }

        System.out.println("The sum of the odd numbers from 1 to "
                           + number + " is = " + sum);

	}

}
