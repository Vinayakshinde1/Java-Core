package com.learning.core.day1session1;

public class D01P03_4 {
	
	public static void main (String [] args) {
		
		int row=5;
		int col=5;
		int no=1;
		
		for(int i=1; i<=row; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(no);
			}
			no++;
			System.out.println();
		}
	}

}
