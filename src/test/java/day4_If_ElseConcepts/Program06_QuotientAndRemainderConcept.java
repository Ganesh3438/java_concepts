package day4_If_ElseConcepts;

import java.util.Scanner;

public class Program06_QuotientAndRemainderConcept {

	/**
	 * To know what is quotient?
	 * Let say for example we have two numbers; int a = 19, int b = 5;
	 * 5/19;
	 * Then quotient will be 3 and remainder will be the 4.
	 * Note: What is even and odd number?
	 * Even numbers which are divisible by 2 and 
	 * odd numbers are not divisible by 2
	 */
	public static void main(String[] args) {
		
        // check whether the given number is even or not?
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is even number");
		}else {
			System.out.println(num + " is odd number");
		}
	}

}
