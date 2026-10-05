/*

Program: Hurricane.java          Last Date of this Revision: October 5th 2026

Purpose: The Saffir-Simpson Hurricane Scale provides a rating (a category) depending on the current intensity of a
hurricane. Create a Hurricane application that displays the wind speed for the hurricane category entered
by the user. Display the speed in miles per hour (mph), knots (kts), and kilometers per hour (km/hr). Refer
to the Saffir-Simpson Hurricane Scale below for wind speeds:
Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr
Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr
Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr
Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr
Category 5: greater than 155 mph or 135 kt or 249 km/hr
*/

package SkillBuilders;

import java.util.Scanner;

public class HurricaneMastery {

	public static void main(String[] args) {
		// Create a Scanner to get input from the user
		Scanner input = new Scanner(System.in);

		// Create a variable to store the hurricane category
		int category;

		// Ask the user to enter a hurricane category from 1 to 5
		System.out.print("Enter the hurricane category (1-5): ");

		// Store the category entered by the user
		category = input.nextInt();

		// Check if the user entered Category 1
		if (category == 1)
		{
		    // Display the hurricane category
		    System.out.println("Category 1 Hurricane");
		    
		    // Display the wind speed in miles per hour
		    System.out.println("Wind Speed: 74-95 mph");
		    
		    // Display the wind speed in knots
		    System.out.println("Wind Speed: 64-82 kts");
		    
		    // Display the wind speed in kilometers per hour
		    System.out.println("Wind Speed: 119-153 km/hr");
		}

		// Check if the user entered Category 2
		else if (category == 2)
		{
		    // Display the hurricane category
		    System.out.println("Category 2 Hurricane");
		    
		    // Display the wind speed in miles per hour
		    System.out.println("Wind Speed: 96-110 mph");
		    
		    // Display the wind speed in knots
		    System.out.println("Wind Speed: 83-95 kts");
		    
		    // Display the wind speed in kilometers per hour
		    System.out.println("Wind Speed: 154-177 km/hr");
		}

		// Check if the user entered Category 3
		else if (category == 3)
		{
		    // Display the hurricane category
		    System.out.println("Category 3 Hurricane");
		    
		    // Display the wind speed in miles per hour
		    System.out.println("Wind Speed: 111-130 mph");
		    
		    // Display the wind speed in knots
		    System.out.println("Wind Speed: 96-113 kts");
		    
		    // Display the wind speed in kilometers per hour
		    System.out.println("Wind Speed: 178-209 km/hr");
		}

		// Check if the user entered Category 4
		else if (category == 4)
		{
		    // Display the hurricane category
		    System.out.println("Category 4 Hurricane");
		    
		    // Display the wind speed in miles per hour
		    System.out.println("Wind Speed: 131-155 mph");
		    
		    // Display the wind speed in knots
		    System.out.println("Wind Speed: 114-135 kts");
		    
		    // Display the wind speed in kilometers per hour
		    System.out.println("Wind Speed: 210-249 km/hr");
		}

		// Check if the user entered Category 5
		else if (category == 5)
		{
		    // Display the hurricane category
		    System.out.println("Category 5 Hurricane");
		    
		    // Display the wind speed in miles per hour
		    System.out.println("Wind Speed: Greater than 155 mph");
		    
		    // Display the wind speed in knots
		    System.out.println("Wind Speed: Greater than 135 kts");
		    
		    // Display the wind speed in kilometers per hour
		    System.out.println("Wind Speed: Greater than 249 km/hr");
		}

		// If the user enters anything other than 1 through 5, display an error message
		else
		{
		    // Tell the user that the category is invalid
		    System.out.println("Invalid category. Please enter a number from 1 to 5.");
		}

	}

}
/* Screen Dump
Enter the hurricane category (1-5): 3
Category 3 Hurricane
Wind Speed: 111-130 mph
Wind Speed: 96-113 kts
Wind Speed: 178-209 km/hr
 */