package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int category;

        System.out.print("Enter the hurricane category (1-5): ");
        category = input.nextInt();

        if (category == 1)
        {
            System.out.println("Category 1 Hurricane");
            System.out.println("Wind Speed: 74-95 mph");
            System.out.println("Wind Speed: 64-82 kts");
            System.out.println("Wind Speed: 119-153 km/hr");
        }
        else if (category == 2)
        {
            System.out.println("Category 2 Hurricane");
            System.out.println("Wind Speed: 96-110 mph");
            System.out.println("Wind Speed: 83-95 kts");
            System.out.println("Wind Speed: 154-177 km/hr");
        }
        else if (category == 3)
        {
            System.out.println("Category 3 Hurricane");
            System.out.println("Wind Speed: 111-130 mph");
            System.out.println("Wind Speed: 96-113 kts");
            System.out.println("Wind Speed: 178-209 km/hr");
        }
        else if (category == 4)
        {
            System.out.println("Category 4 Hurricane");
            System.out.println("Wind Speed: 131-155 mph");
            System.out.println("Wind Speed: 114-135 kts");
            System.out.println("Wind Speed: 210-249 km/hr");
        }
        else if (category == 5)
        {
            System.out.println("Category 5 Hurricane");
            System.out.println("Wind Speed: Greater than 155 mph");
            System.out.println("Wind Speed: Greater than 135 kts");
            System.out.println("Wind Speed: Greater than 249 km/hr");
        }
        else
        {
            System.out.println("Invalid category. Please enter a number from 1 to 5.");
        }

        

	}

}
