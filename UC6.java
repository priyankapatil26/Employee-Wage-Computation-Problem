package JAVAFIRST;

import java.util.Random;

public class UC6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean result = rand.nextBoolean();
		if (result == true) {
			System.out.println("Present");
			int wageperhr = 20;
			int dayhr = 8;
			int dailywage=0;
			int workingdays = 20;
			int maxtotalhr = 100;
			int totalempwage=0;
			int totalhr=0;
			int totalworkingdays =0;
			while((totalhr <= maxtotalhr) && ( totalworkingdays < workingdays)) {
			totalworkingdays ++;
			int num = rand.nextInt(2);
			switch(num) {
				case 0:
					dayhr = 8;
					break;
				case 1:
					dayhr = 4;
					break;
			}
			totalhr = totalhr + dayhr;
			dailywage = wageperhr * dayhr;
			totalempwage += dailywage;
			System.out.println("Daily wage ="+ dailywage);
			}
			System.out.println("Wages for month = "+ totalempwage);
		}
		else {
			System.out.println("Absent");
			System.out.println("No Salary");
		}



	}

}
