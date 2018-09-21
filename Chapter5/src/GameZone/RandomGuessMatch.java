package GameZone;

import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		
		String result;
		
		computerSecret = (int )(Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number any number as long as its no higher than 10! >>");
		userGuess = input.nextInt();
		
		if (userGuess == computerSecret) {
			result = "You win!";
		}
		else {
			result = "You lose, computers number was " + computerSecret;
		}
		
		displayMessage(result); 
	}
public static void displayMessage(String result) {
	System.out.println(result); 
}
}
