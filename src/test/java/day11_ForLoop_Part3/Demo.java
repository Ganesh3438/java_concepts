package day11_ForLoop_Part3;

import java.util.Scanner;

public class Demo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		while (n > 1) {

			n = n / 2;
			count++;
		}
		System.out.println(count);
	}
}
