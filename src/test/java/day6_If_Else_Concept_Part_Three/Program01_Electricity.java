package day6_If_Else_Concept_Part_Three;

import java.util.Scanner;

public class Program01_Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();

		if (units < 50) {

			System.out.println(units * 1);
		} else if (units > 50 && units <= 150) {

			System.out.println(50 * 1 + (units - 50) * 2);

		} else if (units > 150 && units <= 250) {

			System.out.println(50 * 1 + 100 * 2 + (units - 150) * 3170170);
			
		} else if (units > 250) {
			
			System.out.println(50 * 1 + 100 * 2 + 100 * 3 + (units - 250) * 5);
		}

	}

}
