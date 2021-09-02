package JAVAFIRST;

import java.util.Random;

public class UC9 {

	int dailywage=0;
	int totalempwage=0;
	int totalhr=0;
	int totalworkingdays =0;
	int num=0;
	
	String company;
	int emprateperhr;
	int numofworkingdays;
	int maxhr;
	public UC9(String company,int emprateperhr ,int numofworkingdays,int maxhr) {
		this.company=company;
		this.emprateperhr = emprateperhr;
		this.numofworkingdays = numofworkingdays;
		this.maxhr = maxhr;
	}
	void CalculateWage(){
			int dayhr=0;
			Random rand = new Random();	
			while((totalhr <= maxhr) && ( totalworkingdays < numofworkingdays)) {
			totalworkingdays ++;
			int num = rand.nextInt(3);
			switch(num) {
			case 0:
				dayhr=8;
				break;
			case 1:
				dayhr=4;
				break;
			case 2:
				dayhr=0;
				break;
			}
			totalhr = totalhr + dayhr;
			System.out.println("Day " + totalworkingdays + " Emp hrs "  + dayhr);
			}
			totalempwage = totalhr * emprateperhr;
			System.out.println("Total Emp wage for company  = "+company+" is: "+ totalempwage);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UC9 uc1 = new UC9("Dmart",20,2,10);
		UC9 uc2 = new UC9("Reliance",10,4,20);
		uc1.CalculateWage();
		uc2.CalculateWage();

	}


}
