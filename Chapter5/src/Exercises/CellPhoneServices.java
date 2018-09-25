package Exercises;

import java.util.Scanner;

public class CellPhoneServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = null;
		Scanner input = new Scanner(System.in);
		String phonePlan;
		
		System.out.println("Welcome to Horizon Phones! We have many plans for you to choose from." +
		"Please choose a plan >> A, B, C, D, E, F");
		phonePlan = input.nextLine();
		
		
		if (phonePlan.equalsIgnoreCase("A")) {
			result = "$49 per month for 500 minutes of talk and NO text";}
		if (phonePlan.equalsIgnoreCase("B")) {
			result = "$55 per month for 500 minutes of talk and any text";}
		if (phonePlan.equalsIgnoreCase("C")) {
			result = "$61 per month for 500 minutes of talk and no data applies and 100 text messages";}
		if (phonePlan.equalsIgnoreCase("D")) {
			result = "$70 per month for 500 minutes of talk and no data applies and more than 100 text messages";}
		if (phonePlan.equalsIgnoreCase("E")) {
			result = "$79 per month for 2 gigabytes of data";}
		if (phonePlan.equalsIgnoreCase("F")) {
			result = "$87 per month for more than 2 gigabytes of data";}
			
		System.out.println(result);
		
		
	}

}
