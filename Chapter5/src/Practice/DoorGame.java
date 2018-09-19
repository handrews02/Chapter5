package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int doorChoice;
			int chestChoice;
			int bookChoice;
			Scanner input = new Scanner (System.in);
			String result = null;
			System.out.println("Welcome to the amazing door choice game!");
			System.out.println("Your host Steve Harvey");
			System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
			doorChoice = input.nextInt();
			
			if(doorChoice == 1)
			{
				System.out.println("Door 1 good choice, choose amoung the following chests");
				System.out.println("1- for chest one\n2- for chest two");
				chestChoice = input.nextInt();
				if(chestChoice == 1)
					result = "pile of gold";
				else if (chestChoice == 2) {
					result = " NOTHING IT'S EMPTY HAHAHAHAHAHAHAHA!!!!";
				}
			}
			
			else if(doorChoice == 2)
			{
				result = "I'm a donkey";
			}
			else if(doorChoice == 3)
			{
				result = "Batman";
			}
			else if (doorChoice == 999)
			{
				System.out.println("You have now entered a secret room with 3 books on a table " +
			"you must choose one of the 3 books, each book has a certain outcome, BEWARE!!!");
				System.out.println("1- Book 1 \n2- Book 2 \n3- Book 3");
				bookChoice = input.nextInt();
				if(bookChoice == 1) {
					result = "death";
				}
				else if (bookChoice == 2) {
					result = "the ability to stay alive AND YOU GET A FREEEEEEEE CAR!!!";	
					}
				else if (bookChoice == 3) {
					result = "a secret trap where you fall to your death, nice knowing you!";
				}
					
				
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