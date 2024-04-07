package com.learning.core.day2session2;
import java.io.*;
import java.util.Scanner;

class NegativeAmount extends Exception {
	public  NegativeAmount(String str) {
		super(str);
	}

}
class LowBalance extends Exception {
	public  LowBalance(String str) {
		super(str);
	}

	
}

public class D02P06_1 {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter Account no ");
		int accNo=sc.nextInt();
		System.out.print("please enter customer Name ");
		String custName=sc.nextLine();
		System.out.print("please enter account type ");
		String accType=sc.nextLine();
		System.out.print("please enter balance ");
		float balance=sc.nextFloat();
		
		try {
			BankAccount account =new BankAccount(accNo, custName, accType, balance);
		}catch (LowBalance e) {
			System.out.print("LowBalance "+ e);
		}catch(NegativeAmount n) {
			System.out.print("NegativeAmount"+ n);
		}
		
		
	}

}


class BankAccount{
	
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	
	
	
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	public BankAccount (int accNo, String custName, String accType, float initialBalance)  throws LowBalance,
	NegativeAmount{
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = initialBalance;
		if(initialBalance<0) {
			throw new NegativeAmount("Negavtive Amount");
		}
		
		if((accType.equals("saving")) && initialBalance<1000 || (accType.equals("current")) && initialBalance>5000 ) {
			throw new LowBalance("low Balance");
		}
		this.balance=initialBalance;
		
	}
	
	
	public void deposit(float amt)throws NegativeAmount {
		if(amt<0) {
			throw new NegativeAmount("Amount is negative");
		}
		this.balance+=amt;
		
	}
	public float getBalance()throws LowBalance, NegativeAmount {
		if(this.balance<0) {
			throw new NegativeAmount("Negative Amount");
		}
		
		if((accType.equals("saving")) && this.balance<1000 || (accType.equals("current")) && this.balance<5000 ) {
			throw new LowBalance("low Balance");
		}
		return this.balance;
		
	}
	
}


