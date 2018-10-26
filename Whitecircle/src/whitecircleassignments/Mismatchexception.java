package src.whitecircleassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Mismatchexception{

		public static void main(String[] args) {
			int num;
			boolean inputnum =true;
			Scanner k = new Scanner(System.in);
			do {
			try {
				System.out.println("Please enter a integer number");
				 num = k.nextInt();
				System.out.println("The number entered by you is :"+num);
				inputnum = false;
								} catch (InputMismatchException e) {
				System.out.println("Try again,the number you entered is not an integer");
				k.nextLine();
								}
			 //catch (Exception e) {
				//System.out.println("Please enter a valid integer input");
			
			}while(inputnum);
			
			//@Deepinder - Correct
		}
	}
			
			
	
	


