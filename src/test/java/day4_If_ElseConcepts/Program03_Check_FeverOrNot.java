package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program03_Check_FeverOrNot {

	/*
	 * Given temp of a person, check fever or not?
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		
		if(temp >= 98.6) {
			System.out.println("Fever");
		}else {
			System.out.println("No fever");
		}
	}

}
