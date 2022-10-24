package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program04_GivenAgeCanWATCH_A_Movie {

	/*
	 * Given age, a person can watch A grade movie or not?
	 * 
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Can watch A grade movie");
		}else {
			System.out.println("Sorry, should not watch A grade movies till then watch POGO. Thank you!!");
		}
		
	}

}
