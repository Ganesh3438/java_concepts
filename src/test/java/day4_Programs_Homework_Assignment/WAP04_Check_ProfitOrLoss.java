package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP04_Check_ProfitOrLoss {

	/**
	 * You are given the Cost Price C and Selling Price S of a Product. You have to
	 * tell whether there is a Profit or Loss. Also, calculate total profit or loss.
	 * NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
	 * 
	 * @param args
	 */

	/**
	 * Problem Constraints
	 * 
	 * 1 <= C, S <= 109
	 * 
	 * C ≠ S
	 * 
	 * 
	 * 
	 * Input Format
	 * 
	 * First line of the input contains a single integer C.
	 * 
	 * Second line of the input contains a single integer S.
	 * 
	 * 
	 * 
	 * Output Format
	 * 
	 * Print two integers in separate lines.
	 * 
	 * First integer denotes whether there is a profit or loss. If there is a
	 * profit, print 1, else print -1.
	 * 
	 * Second integer is a non-negative integer denoting the absolute value of total
	 * profit or loss.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int S = sc.nextInt();

		if (C > S) {
			System.out.println(-1);
			System.out.println(C - S);

		} else {
			System.out.println(1);
			System.out.println(S - C);
		}
	}

}
