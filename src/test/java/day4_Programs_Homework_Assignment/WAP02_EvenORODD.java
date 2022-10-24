package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP02_EvenORODD {

	/**
	 * Write a program to input an integer from user and print 1 
	 * if it is odd otherwise print 0.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }

	}

}
