package JAVAFIRST;

import java.util.Random;

public class UC7 {
	int wageperhr = 20;
	int dayhr = 8;
	int dailywage=0;
	int workingdays = 2;
	int maxtotalhr = 10;
	int totalempwage=0;
	int totalhr=0;
	int totalworkingdays =0;
	int num=0;
	
	
	void CalculateWage(){
			int dayhr=0;
			Random rand = new Random();	
			while((totalhr <= maxtotalhr) && ( totalworkingdays < workingdays)) {
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
				dayhr = 0;
				break;
			}
			totalhr = totalhr + dayhr;
			dailywage = wageperhr * dayhr;
			totalempwage += dailywage;
			System.out.println("Daily wage ="+ dailywage);
			}
			System.out.println("Wages for month = "+ totalempwage);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UC7 uc = new UC7();
		uc.CalculateWage();
		
		

	}


}
