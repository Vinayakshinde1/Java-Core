package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P03_2 {
	
	public static void dayOfWeekPrint(int day) {
		
		if(day==1) {
			System.out.println("Monday");
			
		}else if(day ==2) {
			System.out.println("Tuesday");
			
		}else if(day ==3) {
			System.out.println("Wednesday");
			
		}else if(day ==4) {
			System.out.println("Thursday");
			
		}else if(day ==5) {
			System.out.println("Friday");
			
		}else if(day ==6) {
			System.out.println("Saturday");
			
		}else if(day ==7) {
			System.out.println("Sunday");
			
		}else {
			System.out.println("Invalid Input");
		}
		
	}

	
	
	public static void main (String [] args ) {
		
		int dayOfWeek=2;
		int dayOfWeek2=-4;
		int dayOfWeek3=9;
		
		dayOfWeekPrint(dayOfWeek);
		dayOfWeekPrint(dayOfWeek2);
		dayOfWeekPrint(dayOfWeek3);
		
			}

}
