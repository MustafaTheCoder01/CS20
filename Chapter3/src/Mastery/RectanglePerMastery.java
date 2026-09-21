/*

Program: RectanglePer.java          Last Date of this Revision: September 21, 2026

Purpose: Create a RectanglePerimeter application that calculates and displays the Perimeter of a rectangle with
width 4 and length 13. The perimeter of a rectangle is calculated as 2w + 2l. Use variables as appropriate.
*/

package Mastery;

import java.util.Scanner;

public class RectanglePerMastery {

	public static void main(String[] args) {
		
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
/* Screen Dump
Enter a width: 
2
Enter a length: 
6
The width is:2
The length is:6
Area = 12
Perimeter = 16

Enter a width: 
5
Enter a length: 
11
The width is:5
The length is:11
Area = 55
Perimeter = 32
 
 */









