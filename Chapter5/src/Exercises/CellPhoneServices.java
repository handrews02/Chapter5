package Exercises;

import java.util.Scanner;

public class CellPhoneServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = null;
		Scanner input = new Scanner(System.in);
		int txtMessages;
		double data;
		int talkMinutes;
		
		System.out.println("Please enter how many minutes you use for talking");
		txtMessages = input.nextInt();
		System.out.println("Please enter how many text messages you send");
		data = input.nextDouble();
		System.out.println("Please enter how much data you use");
		talkMinutes = input.nextInt();
		
	
		
		if(talkMinutes > 500 && data == 0 && txtMessages == 0) {
			result = "You need plan A which costs $49 per month";}
		if(talkMinutes > 500 && data == 0) {
			result = "You need plan B which costs $55 per month";}
		if(talkMinutes <= 500 && data == 0 && txtMessages == 100){
			result = "You need plan C which costs $61 per month";}
		

		
		
	}

}
