package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program05_CheckFever_Tempature {

	/*
	 *  98.0 to 98.9 --> Normal
	 *  99.0 to 99.9 --> Mild fever
	 *  100.0 to 102.0 --> Fever
	 *  102.0 >  ---> High fever 
	 *  96.0  to 97.9 ---> Mild hypothermia
	 *  < 96 ---> Serious hypothermia
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		if(temp>=98.0 && temp<=98.9) {
			System.out.println("Normal");
		}else if (temp>=99.0 && temp<=99.9) {
			System.out.println("Mild fever");
		}else if (temp>=100.0 && temp<=102.9) {
			System.out.println("fever");
		}else if (temp>102) {
			System.out.println("High fever");
		}else if (temp>=96.0 && temp<=97.9) {
			System.out.println("Hypothermia");
		}else if (temp<96.0) {
			System.out.println("Serious hypothermia");
		}else {
			System.out.println("Please provide valid input");
		}
	}

}
