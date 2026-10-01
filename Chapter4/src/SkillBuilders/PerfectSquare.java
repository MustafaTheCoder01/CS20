package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int root = (int)Math.sqrt(num);

        if (root * root == num)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
		
		
		

	}

}
