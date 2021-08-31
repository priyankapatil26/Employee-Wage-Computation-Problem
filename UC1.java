package JAVAFIRST;

import java.util.Random;

class UC1{
    public static void main(String[] args) {
    		Random rand = new Random();
    		boolean result = rand.nextBoolean();
    		if (result == true) {
    			System.out.print("Present");
    		}
    		else {
    			System.out.print("Absent");
    		}
    		
    	}
    }
    