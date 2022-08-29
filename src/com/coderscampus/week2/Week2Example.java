package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {
	
	public static void main (String[] args ) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type out any input:");
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		
		
		
		System.out.println("Type in a number between 50 and 300 " + "\n" + userInput);
		
		if ( convertedInput <= 49 || convertedInput >=301) {
			System.out.println("NO");			
		}
				
		else System.out.println("YES!");
		
		
		
		
		}
}
