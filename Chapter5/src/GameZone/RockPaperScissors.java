package GameZone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

public static void main(String[] args) 
{ 
    String userChoice; 
    String computerChoice = null;  
    int computerInt;
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");


   
    computerInt = generator.nextInt(3)+1; 

  

    if (computerInt == 1) 
       computerChoice = "R"; 
    else if (computerInt == 2) 
       computerChoice = "P"; 
    else if (computerInt == 3) 
       computerChoice = "S"; 


 
    System.out.println("Enter your play: "); 
    userChoice = scan.next();


    userChoice = userChoice.toUpperCase(); 

 
    System.out.println("Computer play is: " + computerChoice); 



    if (userChoice.equals(computerChoice)) 
       System.out.println("It's a tie!"); 
    else if (userChoice.equals("R")) 
       if (computerChoice.equals("S")) 
          System.out.println("Rock crushes scissors. You win!!");
    else if (computerChoice.equals("P")) 
            System.out.println("Paper eats rock. You lose!!"); 
    else if (userChoice.equals("P")) 
       if (computerChoice.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerChoice.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (userChoice.equals("S")) 
         if (computerChoice.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerChoice.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input."); 
	}

}

