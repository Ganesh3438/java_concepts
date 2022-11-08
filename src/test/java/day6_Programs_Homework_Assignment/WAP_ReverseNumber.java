package day6_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(;T>0;) {
			int n = sc.nextInt();
			int ld = n % 10;
			int fd = 0;
			
			for(;n>0;) {
				int d = n % 10;
				fd = d;
				n = n/10;
			}
			System.out.println("First Digit =" + fd);
			System.out.println("Last Digit =" + ld);
			T--;
		}
		
		
	}

}
