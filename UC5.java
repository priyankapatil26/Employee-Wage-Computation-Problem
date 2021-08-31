package JAVAFIRST;

import java.util.Random;

public class UC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean result = rand.nextBoolean();
		if (result == true) {
			System.out.println("Present");
			int wageperhr = 20;
			int dayhr = 8;
			int dailywage=0;
			int Monthsalary = 0;
			int workingdays = 20;
			
			for(int i=1;i<=workingdays;i++) {
				int num = rand.nextInt(2);
			switch(num) {
				case 0:
					dayhr = 8;
					break;
				case 1:
					dayhr = 4;
					break;
			}
			dailywage = wageperhr * dayhr;
			Monthsalary = Monthsalary + dailywage;
			System.out.println("Daily Wage ="+ dailywage);	
			}
			System.out.println("Wages for month = "+Monthsalary);
		}
		else {
			System.out.println("Absent");
			System.out.println("No Salary");
		}
	}
}
