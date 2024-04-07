package com.learning.core.day2session2;
import java.util.Scanner;
import java.io.*;


class NotEligibleException extends Exception{
	public NotEligibleException(String str) {
		super(str);
	}
}
public class D02P06_2_TesterClass {
	
	public static void main(String [] args) throws NotEligibleException {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter player Name ");
		 String playerName=sc.nextLine();
		 
		 CricketRating cr =new CricketRating();
		 
		 
		 System.out.println("Tell us how many critics players has ");
		 int criticsCount=sc.nextInt();
		if(criticsCount==3) {
		System.out.println("please enter critic1");
		float critic1=sc.nextFloat();
		
		System.out.println("please enter critic2");
		float critic2=sc.nextFloat();
		System.out.println("please enter critic3");
		float critic3=sc.nextFloat();
		System.out.print(playerName+ " ");
		cr.calculateAverageRating(critic1, critic2, critic3);
		
		}
		if(criticsCount==2) {
			System.out.println("please enter critic1");
			float critic1=sc.nextFloat();
			
			System.out.println("please enter critic2");
			float critic2=sc.nextFloat();
			System.out.println(playerName+ " ");
			cr.calculateAverageRating(critic1, critic2);
		}
		if(criticsCount==1) {
			System.out.println("please enter critic1");
			float critic1=sc.nextFloat();
			System.out.println(playerName+" ");
			System.out.println(cr.calculateCoins(critic1));
		}
		
	}
	
	

}

class CricketRating 
{
	private String playerName;
	private String coins;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	
	
	void calculateAverageRating(float critic1,float critic2) throws NotEligibleException {
		float rating=critic1+critic2;
		rating=rating/2;
		System.out.print(rating+ " ");
		System.out.print(calculateCoins(rating)+" ");
		
	}
	void calculateAverageRating(float critic1,float critic2, float critic3) throws NotEligibleException {
		float rating=critic1+critic2+critic3;
		rating=rating/3;
		System.out.print(rating+ " ");
		System.out.print(calculateCoins(rating)+" ");
		
	}
	String calculateCoins(float rating) throws NotEligibleException {
		String finalRating="";
		
		if(rating>7) {
			finalRating=finalRating+"Gold";
		}else if(rating>=5 && rating<7) {
			finalRating=finalRating+"Silver";
		}else if(rating<5 && rating >=2) {
			finalRating=finalRating+"Copper";
			
		}else {
			try {
				if(rating<2) {
					throw new NotEligibleException("Not Eligible");
				}
			}catch(NotEligibleException n) {
				System.out.println("Not eligible");
			}
		}
		
		return finalRating;
		
	}


}
