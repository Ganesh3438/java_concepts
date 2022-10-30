package day7_WhileLoopConcepts;

import java.util.Scanner;

public class WAP01_Print1To5NumbersUsingWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 1;
		while(i<=num) {
			System.out.print(i + " ");
			i++;
		}

	}

}
