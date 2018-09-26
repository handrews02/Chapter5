package Exercises;

import java.util.Scanner;

public class BarnhillFastenerCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		double hoursWorked;
		double pay;
		int skillLevel;
		int  insuranceOption;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your skill level, level 1, level 2, level 3");
		skillLevel = input.nextInt();
		
		System.out.println("Please enter how many hours you have worked this pay period>> ");
		hoursWorked = input.nextInt();
		
		if(skillLevel == 1) {
			insuranceOption = 0;
			pay = 17;
			displayTotalPay(hoursWorked, insuranceOption, pay);
		
		}

	}
	public static void displayTotalPay(double hoursWorked, int insuranceOption, double pay) {
		System.out.println(hoursWorked);
		
	}
	public
}
