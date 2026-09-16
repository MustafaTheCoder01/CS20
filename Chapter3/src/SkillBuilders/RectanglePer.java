package SkillBuilders;

import java.util.Scanner;

public class RectanglePer 
{

	public static void main(String[] args) 
	{
		// Declare variables
		  int width;
		  int length;
		  int area;
		  int perimeter;
     
      
      // Create Scanner object
      Scanner input = new Scanner(System.in);
      
      // Get the width
      System.out.println("Enter a width: ");
      width = input.nextInt();
      
      
      // Get the length
      System.out.println("Enter a length: ");//
      length = input.nextInt();
      
      //Display the width
      System.out.println("The width is:" + width);
      
      //Display the length
      System.out.println("The length is:" + length);
      
      //Calculate the area
      area = length * width;
      
      //Display the area on the screen
      System.out.println("Area = "+ area);
      
      //Calculate the perimeter
      perimeter = (2 * length + 2 * width);
      
      //Display the perimeter on the screen
      System.out.println("Perimeter = "+ perimeter);

	}

}
