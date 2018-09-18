package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int doorChoice;
			Scanner input = new Scanner (System.in);
			String result;
			System.out.println("Welcome to the amazing door choice game!");
			System.out.println("Your host Steve Harvey");
			System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
			doorChoice = input.nextInt();
			
			if(doorChoice == 1)
			{
			result = "pile of gold";
			}
			else if(doorChoice == 2)
			{
			result = "I'm a donkey";
			}
			else if(doorChoice == 3)
			{
			result = "Batman";
			}
			else
			{
			result = "nothing because that was not a choice!";
			}
			displayMessage(result);
	}
public static void displayMessage (String result) {
		System.out.println("You won : " + result);
	
}
}