package day10_ForLoop_Part2;

import java.util.Scanner;

public class WAP02_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// What is Prime number?
		// A positive number with only two factor (1 and number itself) is known as Prime.
		
		// Composite number
		// A positive number more than two factors.
		
		// Note: 1 is neither prime or composite
		
		// What is factor?
		// Any value can divide number completely is known as factor of number.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
		

	}

}
