package day11_ForLoop_Part3;

import java.util.Scanner;

public class WAP01_Find_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = 0;
		
		if(a<b) {
			min = a;
		}else {
			min = b;
		}
		
		int gcd = 0;
		
		
		// Approach 1:  (Performance wise approach 1 is better)
		for(int i= min; i>=1; i--) {
			if(a%i==0 && b % i ==0) {
				gcd = i;
				break;
			}
		}

		System.out.println(gcd);
		
		
		
		/*
		// Approach 2:
		for(int i=1; i<=min; i++) {
			if(a%i==0 && b % i ==0) {
				gcd = i;
				
			}
		}
		System.out.println(gcd);
		*/
	}

}
