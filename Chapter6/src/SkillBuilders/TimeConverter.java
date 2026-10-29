package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) 
	{
		  Scanner input = new Scanner(System.in);

	        int choice;
	        double time;
	        double result;

	        System.out.println("Time Converter");
	        System.out.println("1. Hours to Minutes");
	        System.out.println("2. Days to Hours");
	        System.out.println("3. Minutes to Hours");
	        System.out.println("4. Hours to Days");
	        System.out.print("Choose a conversion (1-4): ");

	        choice = input.nextInt();

	        System.out.print("Enter the amount of time: ");
	        time = input.nextDouble();

	        if (choice == 1)
	        {
	            result = HoursToMinutes(time);
	            System.out.println(time + " hours = " + result + " minutes");
	        }
	        else if (choice == 2)
	        {
	            result = DaysToHours(time);
	            System.out.println(time + " days = " + result + " hours");
	        }
	        else if (choice == 3)
	        {
	            result = MinutesToHours(time);
	            System.out.println(time + " minutes = " + result + " hours");
	        }
	        else if (choice == 4)
	        {
	            result = HoursToDays(time);
	            System.out.println(time + " hours = " + result + " days");
	        }
	        else
	        {
	            System.out.println("Invalid choice. Please choose 1-4.");
	        }

	        input.close();    
	
	}	
	public static double HoursToMinutes(double hours)
	{
	return hours * 60;
	}
	
	public static double DaysToHours(double Days)
	{
	return Days * 24;
	}
	
	public static double MinutesToHours(double Minutes)
	{
	return Minutes / 60;
	}
	
	public static double HoursToDays(double Hours)
	{
	return Hours / 24;
	}	
		
		
		
			
}
