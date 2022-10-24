package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program01_IF_Else {

	/*
	 * Note: Can else exists without if -- No
	 * Can if exists without else --- Yes
	 * 
	 * Question: Given whether person is non-veg or not, suggest some 
	 * sources of protein
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the input:");
		Scanner sc = new Scanner(System.in);
		
		// user please write true in input if you are non_veg otherwise 
		// write veg
		boolean status = sc.nextBoolean();
		
		if(status == true) {
			System.out.println("Chicken, eggs, fish etc...");
		}else {
			System.out.println("Pulses, sprouts, paneer etc...");
		}
		
	
	}

}
