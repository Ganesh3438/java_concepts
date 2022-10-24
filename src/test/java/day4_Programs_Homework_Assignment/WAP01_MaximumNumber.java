package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP01_MaximumNumber {

	/**
	 * Write a program to input two numbers(A & B) 
	 * from user and print the maximum element among A & B in each line.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
	}

}
