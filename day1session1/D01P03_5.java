package com.learning.core.day1session1;

public class D01P03_5 {

	
	public static long calculateFactorial(int n ) {
		if (n<0) {
System.out.println("please enter valid number");
		}
		int factorial =1;
		for (int i=1; i<=n; i++) {
			
			factorial*=i;
		}
		return factorial;
		
	}
	
	public static void main (String [] args) {
		
		int no =5;
		
		System.out.println("The factorial of "+no+ " is "+calculateFactorial(no));
		
		
	}
}
