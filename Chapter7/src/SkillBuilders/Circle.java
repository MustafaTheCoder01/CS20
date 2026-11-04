package SkillBuilders;

public class Circle 
{
    //Instance Variable  
	private static final double PI = 3.14; 
	private double radius;
	
	// Default Constructor Method
	public Circle()
	{
	    radius = 1.0;
	}
	
	//Overload Constructor Method
	public Circle(double r)
	{
	     radius = r;
	}
	//Modifier method
	public void setRadius(double r)
	{
	    radius = r;
	}
	
	//Accessor method
	public double getRadius()
	{
	      return radius;
	}
	
	//Area method
	public double area()
	{
	   double cArea;
	
	   cArea = PI * radius * radius;
	   
	   return cArea;
	}
	//Circumference method
	public double circumference()
	{
		double c;
		
		c = 2 * PI * radius;
		
		return c;
	}
	
}
