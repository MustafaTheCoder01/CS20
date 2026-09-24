package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		int length;
        int width;
	    int height;
	
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the length of the package: ");
        length = input.nextInt();

        System.out.print("Enter the width of the package: ");
        width = input.nextInt();

        System.out.print("Enter the height of the package: ");
        height = input.nextInt();

        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }

	
	}
	

}
