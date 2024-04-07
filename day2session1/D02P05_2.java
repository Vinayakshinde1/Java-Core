package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_2 {
	
	public static void main (String [] args ) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Please enter any string ");
		String str=sc.nextLine();
		
		System.out.println("Please enter n value ");
		int n=sc.nextInt();
		
		int vowelCount=vowelCount(str,n);
		if(vowelCount == -1) {
			System.out.println("Mismatch ");
		}else {
			System.out.println(vowelCount);
		}
		
		
		
	}
	
	public static int vowelCount(String str, int n ) {
		int vowelCount=0;
		String vowel="";
		String vowelFinal="";
		for(int i=str.length()-1 ; i>=0 && n>0 ; i--) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch =='a' || ch=='e' ||ch=='i'|| ch=='o'|| ch=='u') {
				vowelCount++;
				vowel=vowel+str.charAt(i);
				n--;
			}
			
			
			
		}
		for(int j =vowel.length()-1; j>=0 ;j--) {
			vowelFinal=vowelFinal+vowel.charAt(j);
		}
		System.out.println(vowelFinal);
		
		if(n>0) {
			return -1;
		}
		return vowelCount;
	}

}
