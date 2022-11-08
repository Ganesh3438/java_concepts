
package day11_ForLoop_Part3;

import java.util.Scanner;

public class WAP02_ArmstrongNumbers {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int n = i;
			int sum = 0; // sum of cubes
			
			while(n>0) {
				int d = n % 10;
				sum = sum + d*d*d;
				n = n/10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	}

}
