package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the percentage earned: ");
        double percentage = input.nextDouble();

        if (percentage >= 90) {
            System.out.println("Letter Grade: A");
        } 
        else if (percentage >= 80) {
            System.out.println("Letter Grade: B");
        } 
        else if (percentage >= 70) {
            System.out.println("Letter Grade: C");
        } 
        else if (percentage >= 60) {
            System.out.println("Letter Grade: D");
        } 
        else {
            System.out.println("Letter Grade: F");
        }

	}

}
