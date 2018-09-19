package Exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String result;
		int x; 
		System.out.println("Please pick an integer >> ");
		x = input.nextInt();
		
		if (0 == x%2) {
			result = "even";
		}
		else {
			result = "odd";
		}
		displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println("Your integer was a " + result);
	}
}
