package day7_WhileLoopConcepts;

import java.util.Scanner;

public class WAP02_Print_AllEvenNumberFrom0ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i =1;
		while(i<= num) {
			if(i % 2 ==0) {
				System.out.print(i + " ");
			}
			
			i++;
		}

	}

}
