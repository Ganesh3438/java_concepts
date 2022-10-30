package day6_If_Else_Concept_Part_Three;

import java.util.Scanner;

public class Program02_Print_PositiveEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("Positive even");
		}else if(num > 0 && num % 2 !=0) {
			System.out.println("Positive odd");
		}else if (num < 0 && num % 2 == 0) {
			System.out.println("Negative even");
		}else if (num < 0 && num %2 !=0) {
			System.out.println("Negative odd");
		}
		
	}

}
