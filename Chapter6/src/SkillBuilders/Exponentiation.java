package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        double number;
        double power;
        double result;

        System.out.println("Exponentiation");
        
        System.out.print("Enter the first number: ");
        number = input.nextDouble();

        System.out.print("Enter the power: ");
        power = input.nextDouble();

        result = powerOf(number, power);

        System.out.println(number + " raised to the power of " + power + " = " + result);

        input.close();
    }

    public static double powerOf(double number, double power)
    {
        return Math.pow(number, power);

	}

}
