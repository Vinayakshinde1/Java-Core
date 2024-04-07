package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_1 {
	
	
	public static void main (String args []) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter any string ");
		String str=sc.nextLine();
		
		System.out.println("The length of given String is "+str.length());
		System.out.println("the given string after converting to Uppercase  "+str.toUpperCase());
		
		String str2="";
		for (int i =str.length()-1 ; i>=0; i--) {
			
			str2=str2+str.charAt(i);
			
		}
		if (str.equals(str2)) {
			System.out.println("It is a palindrome ");
		}else {
		System.out.println("It is not a palindrome ");
		}
		
	}

}
