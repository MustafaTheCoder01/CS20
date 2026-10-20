package SkillBuilders;

public class DemoMethods {

	public static void main(String[] args) 
	{
		
		

	}

	
	
	
	//Method 1: No parameters, not return value
	public static void displayMessage()
	{
		System.out.println("Welcome to our class.");
	}

	//Method 2: One Parameters, no return value
	public static void greetStudent(String name)
	{
	System.out.println("Hello," + name);
	}
	
	//Method 3: Two parameters, return and interger
	public static int addNumbers(int a, int b)
	{
	int sum = a + b;
	return sum;
	}
	
	//Method 4: One Parameter, returns a decimal
	public static double calculateArea(double radius)
	{
	double area = 3.14 * radius * radius;
	return area;
	}

	//Method 5: One parameter, return a boolean
	public static boolean isPassing(int mark)
	{
	return mark >= 50;
	
	}
	
	
	
	
	
}

