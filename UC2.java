package JAVAFIRST;

import java.util.Random;

public class UC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		boolean result = rand.nextBoolean();
		if (result == true) {
			System.out.println("Present");
			int wageperhr = 20;
			int dayhr = 8;
			int dailywage=0;
			dailywage = wageperhr * dayhr;
			System.out.println(dailywage);
		}
		else {
			System.out.println("Absent");
			System.out.println("No Salary");
		}

	}

}
