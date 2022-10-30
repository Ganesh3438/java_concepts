package day7_WhileLoopConcepts;

import java.util.Scanner;

public class WAP03_MutlipleWithFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 4;
		
		while(i<= num) {
			if(i  % 4 == 0) {
				System.out.print(i+ " ");
			}
			i++;
		}
		
		System.out.println("--------------");
		
		// Second approach
		
		int a = 4;
		while(a<=num) {
			System.out.print(a+ " ");
			a = a + 4;
		}
		
	}

}
