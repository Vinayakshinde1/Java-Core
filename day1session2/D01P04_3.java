package com.learning.core.day1session2;

public class D01P04_3 {
	
	public static int repeatingElementIndex(int a[] ) {
		
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length;j++) {
				
				if (a[i]==a[j]) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public static void main (String [] args ) {
		
		
		int array[]= {10, 5, 3, 4, 3, 5, 6};
		
		int indexOfRepeatedElement=repeatingElementIndex(array);
		
		if(indexOfRepeatedElement != -1) {
			System.out.println("the index of first repeating element id "+indexOfRepeatedElement);
		}else {
			System.out.println("No repeating element");
		}
		
		
		
		
	}

}
