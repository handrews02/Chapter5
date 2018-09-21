package Exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userHouse;
		
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
	displayMessage(result);
	}
	
	public static void displayMessage (String result) {
		System.out.println(result);
	}

}
