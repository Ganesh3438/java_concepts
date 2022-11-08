package demo;

import java.util.Scanner;

public class TC01_MultipleTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int ld = n % 10;
			int fd = 0;
			
			while(n>0) {
				int d = n % 10;
				fd = d;
				n = n / 10;
			}
			System.out.println(fd);
			System.out.println(ld);
			t--;
		}
	}

}
