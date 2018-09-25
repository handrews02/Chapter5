package Exercises;

import java.util.Scanner;

public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userHouse;
		int parkingSpace;
		
		String result = null; 
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please choose 1 of the 3 condominiums >> ");
		userHouse = input.nextInt();
		
		if (userHouse == 1) {
			result = "A park view condo which costs $150,000";
		}
		else if (userHouse == 2) {
			result = "A golf course view condo which costs $170,000";
		}
		else if (userHouse == 3) {
			result = "A lake view condo which costs $210,000 ";
		}
		else {
			result = "That is not valid";
		}
		System.out.println("Now, would you like a parking space? 1 for yes, 2 for no ");
		parkingSpace = input.nextInt();
		
		if (parkingSpace == 1) {
			result = "It will be an aditional $5,000 ";
		}
		else {
			result = "No need to spend the extra money ";
		}
		
		
		
		
	displayMessage(result);
	}
	
	public static void displayMessage (String result) {
		System.out.println(result);
	}

}
