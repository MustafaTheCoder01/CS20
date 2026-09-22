package Mastery;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		 
		//Create Scanner
        Scanner input = new Scanner(System.in);

        //Declare variables
        int t;
        int h;

        //Ask the user for the time
        System.out.print("Enter the time in seconds (less than 4.5): ");
        t = input.nextInt();

        //Calculate the height
        h = 100 - (49 * t * t) / 10;

        //Display the height
        System.out.println("The height of the object is " + h + " meters.");
    }

	}


