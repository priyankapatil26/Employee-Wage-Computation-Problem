package JAVAFIRST;

import java.util.Random;

public class UC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean result = rand.nextBoolean();
		if (result == true) {
			System.out.println("Present");
			int wageperhr = 20;
			int dayhr = 8;
			int dailywage=0;
			int num = rand.nextInt(2);
			switch(num) {
				case 0:
					System.out.println("Full Time");
					dayhr = 8;
					break;
				case 1:
					System.out.println("Part time");
					dayhr = 4;
					break;
			}
				
			dailywage = wageperhr * dayhr;
			System.out.println(dailywage);
		}
		else {
			System.out.println("Absent");
			System.out.println("No Salary");
		}

	}

}
