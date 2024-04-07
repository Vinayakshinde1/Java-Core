package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P03_1 {


		public static void main (String [] args) {
			
			Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter a no between 1 to 12");
		
		int no=sc.nextInt();
		
		switch (no) {
		case 1: {
			
			System.out.println("January");
		}
case 2 : {
			
			System.out.println("February");
		}

case 3: {
	
	System.out.println("March");
}case 4 : {
	
	System.out.println("April");
}case 5 : {
	
	System.out.println("May");
}case 6 : {
	
	System.out.println("June");
}case 7 : {
	
	System.out.println("July");
}case 8 : {
	
	System.out.println("August");
}case 9: {
	
	System.out.println("September");
}case 10 : {
	
	System.out.println("October");
}case 11 : {
	
	System.out.println("November");
}case 12 : {
	
	System.out.println("December");
}



		default:
			System.out.println("Invalid Input");
		}
	}
	}
	

