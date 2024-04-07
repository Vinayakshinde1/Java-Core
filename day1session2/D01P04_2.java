package com.learning.core.day1session2;

public class D01P04_2 {
	
	public static void main(String [] args) {
		int sum=0;
		int avg=0;
		int smallest=10;
	int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
	
	for (int i=0; i<15; i++) {
		sum=sum+A[i];
	}
	 A[15]=sum;
	 for (int j =0; j<15; j++) {
		 
		 avg=avg+A[j];
		 
		 
	 }
	 avg=avg/14;
	 A[16]=avg;
	 
	 for(int k=0; k<15; k++) {
		 if (A[k]<smallest) {
			 smallest=A[k];
		 }
		 
	 }
	 A[17]=smallest;
	 
	 for (int Arr:A) {
		 System.out.print(Arr+ " ");
		 
	 }
	 }
}
