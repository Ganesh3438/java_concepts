package day10_ForLoop_Part2;

import java.util.Scanner;

public class WAP03_FactorialOfN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
