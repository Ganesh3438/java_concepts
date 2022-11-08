package day10_ForLoop_Part2;

import java.util.Scanner;

public class WAP01_FactorsOfGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definition: Any value which can divide n completely is known as factor of N.
		// for ex: 24 can divide by 1, 2, 3, 6, 8, 12, 24
		// factor of 25 is 1, 5, 25
		
		// Given a positive number, print all its factor
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}

}
}