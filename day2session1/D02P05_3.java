package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_3 {

	public static void main (String args []) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any string ");
		String string=sc.nextLine();
		
		findSubsequence(string, 0, "");
		
		
		
	}
	
	public static void findSubsequence(String str, int index, String current) {
		
		if(index==str.length()) {
			if(!current.isEmpty()) {
				System.out.println(current);
			}
			return;
		}
		findSubsequence(str, index+1, current+str.charAt(index));
		findSubsequence(str, index+1, current);
	}
	
	
}
