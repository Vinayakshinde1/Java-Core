package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P03_3 {

	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Grade ");
	int grade=sc.nextInt();
	
	if(grade>=60) {
		System.out.println("Grade A");
		
	}else if(grade>=45 && grade<=60) {
		System.out.println("Grade B");
		
	}else if(grade >=35 && grade<=45) {
		System.out.println("Grade C");
		
	}else if(grade<35) {
		System.out.println("Fail");
		
	}else {
		System.out.println("please enter valid number");
	}
	
	}
}
