package com.learning.core.day1session1;


//D01P02



interface  MedicineInfo {
	void displayLabel();
}



class Tablet implements MedicineInfo{

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Store Tablets in a cool dry place.");
	}
	
}
class Syrup implements MedicineInfo {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup is consumable only on prescription.");	
	}
	
}
class Ointment implements MedicineInfo{

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment is for external use only.");
	}
	
}

public class D01P02TestClass {
	public static void main (String [] args) {
		
		MedicineInfo[] medicine=new MedicineInfo[3];
		medicine[0]=new Tablet();
		medicine[1]=new Syrup();
		medicine[2]=new Ointment();
		
		
		for( MedicineInfo m: medicine) {
			m.displayLabel();
		}
		
		
	}

}

