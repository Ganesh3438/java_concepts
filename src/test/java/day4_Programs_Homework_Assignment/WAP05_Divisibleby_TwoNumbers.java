package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP05_Divisibleby_TwoNumbers {

	/**
	 * Problem Description
	 * 
	 * You are given an integer A as input. You have to tell whether A is divible by
	 * both 5 and 11 or not.
	 * 
	 * 
	 * Problem Constraints
	 * 
	 * 1 <= A <= 109
	 * 
	 * 
	 * 
	 * Input Format
	 * 
	 * The input contains a single integer A.
	 * 
	 * 
	 * 
	 * Output Format
	 * 
	 * Print 1 if A is divisible by both 5 and 11, else print 0.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        if(5/num==0 && 11/num==0){
	            System.out.println("1");
	        }else{
	            System.out.println("0");
	        }
	        
	}

}
