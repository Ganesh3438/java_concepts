package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program02_EligibleToVote {

	/*
	 * Given age of a person, whether person is eligible or not to vote
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible to cast vote");
		}else {
			System.out.println("Not eligible this time");
		}

	}

}
