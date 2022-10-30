package day7_WhileLoopConcepts;

import java.util.Scanner;

public class WAP04_Print5To1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 5;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}

	}

}
