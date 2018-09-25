package Exercises;

import java.util.Scanner;

public class AscendingOrDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int lowest= 0;
		int midNumber= 0;
		int highNum= 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter a number >>");
		num1 = input.nextInt();
		System.out.println("Please enter another number >>");
		num2 = input.nextInt();
		System.out.println("Please enter a final number >>");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <=num3){
		lowest = num1;}
		if(num2<=num3){
		midNumber = num2;}
		else{
		highNum = num3;}
		
		if(num2 <= num1 && num2 <= num3) {
		lowest = num2;}
		if(num3 <= num1) {
		midNumber = num3;}
		else {
		highNum= num1;}
		
		if (num3 <= num1 && num3 <= num2) {
		lowest = num3;}
		if(num1<= num2) {
		midNumber = num1;}
		else {
		highNum = num2;}
	 
	System.out.println(lowest + " " + midNumber + " " + highNum); 
	}




}



