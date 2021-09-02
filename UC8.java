package JAVAFIRST;

import java.util.Random;

public class UC8 {

	int dayhr = 8;
	static int dailywage=0;
	static int wageperhr = 20;
	int workingdays = 2;
	int maxtotalhr = 10;
	static int totalempwage=0;
	static int totalhr=0;
	static int totalworkingdays =0;
	int num=0;
	
	
	static void CalculateWage(String company,int emprate ,int numofdays,int maxhr){
			int dayhr=0;
			Random rand = new Random();	
			while((totalhr <= maxhr) && ( totalworkingdays < numofdays)) {
			totalworkingdays ++;
			int num = rand.nextInt(2);
			switch(num) {
			case 0:
				dayhr=8;
				break;
			case 1:
				dayhr=4;
				break;
			}
			totalhr = totalhr + dayhr;
			dailywage = emprate * dayhr;
			System.out.println("Day " + totalworkingdays + " Emp hrs "  + dayhr);
			}
			totalempwage = totalhr * emprate;
			System.out.println("Total Emp wage for company  = "+company+" is: "+ totalempwage);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateWage("Dmart",20,2,10);
		CalculateWage("Reliance",10,4,20);		

	}


}
