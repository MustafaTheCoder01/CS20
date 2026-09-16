package SkillBuilders;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		//Declare variables
		int Distance;
		int Segment1;
		int Segment2;
		int Segment3;

		// Create Scanner object
	      Scanner input = new Scanner(System.in);
	      
	      //Get each Segment of the race
	      System.out.println("Enter Segment1: ");
	      Segment1 = input.nextInt();
	      
	      System.out.println("Enter Segment2: ");
	      Segment2 = input.nextInt();
	      
	      System.out.println("Enter Segment3: ");
	      Segment3 = input.nextInt();
	      
	      //Calculate each Segment
	      Distance = (Segment1 + Segment2 + Segment3);
	      
	    //Display the distance on the screen
	      System.out.println("The Distance of the entire race is = "+Distance);
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
