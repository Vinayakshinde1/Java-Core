package com.learning.core.day1session2;
import java.util.Scanner;

public class D01P04_1 {

	public static void main (String [] args ) {
		
		Scanner sc=new Scanner(System.in);
		int array2[]= {7,25,19,30,5};
		
		System.out.println("Please enter a no between 1 to 40 ");
		int num1=sc.nextInt();
		
		System.out.println("Please enter second no between 1 to 40 ");
		int num2=sc.nextInt();
		
		checkArray(num1, num2, array2);
		
		
	
		
	}
	
	public static void checkArray( int num1, int num2, int arr[] ) {
		
		boolean val1=false;
		boolean val2=false;
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]==num1) {
				val1=true;
			}if (arr[i]==num2) {
				val2=true;
			}
		}
		
	if(val1 && val2) {
		System.out.println("Bingo");
	}else {
		System.out.println("Not Found ");
	}
	}
	
}
