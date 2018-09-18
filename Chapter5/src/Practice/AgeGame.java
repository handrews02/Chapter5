package Practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usersAge;
		String result;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your age to be insulted ");
		usersAge = input.nextInt();
		
		displayMessage(result) 
		
		if(usersAge <= 12)
		{
			result = "you are a chld go away!";
		}
		else if (usersAge >= 13 && usersAge <= 18)
		{
		result = "You are a snotty teen hahahahaha";
		}
		else if (usersAge >= 19 && usersAge <= 25)
		{
		result = "Get a job!";
		}
		else if (usersAge >= 26 && usersAge<= 30)
		{
		result = "Seems like you have a boring life";
		}
		else if (usersAge >= 31 && usersAge <= 40)
		{
			result = "You need to get off the coach and do something with your life already!";
		}
		else if (usersAge >= 41 && usersAge <= 60)
		{
			result = "Hopefully you accomlished something by now but let's be honest, that's unlikely";
		}
		else if (usersAge >= 61 && usersAge < 61)
		{
			result = "You should be dead by now!";
			
		}
		//0-12
		//13-18
		//19-25
		//26-30
		//31-40
		//41-50
		//51-60
		//61- death hahhahah
	}
public static void displayMessage(String result) {
	System.out.println(result);
}
}
