package day4_Programs_Homework_Assignment;

import java.util.Scanner;

public class WAP06_RollerCoasterRide {

	/**
	 * Problem Description
	 * 
	 * Write a program that asks the user to input their age and tells them if
	 * they're old enough to ride a roller coaster. The minimum age to ride the
	 * roller coaster in this question is 13.
	 * 
	 * 
	 * Input Format
	 * 
	 * There is only 1 single line in the input, which is the age of the user.
	 * 
	 * 
	 * Output Format
	 * 
	 * Print the following if user can ride the roller coaster: You can ride the
	 * roller coaster! Print the following if user can't ride the roller coaster:
	 * You can't ride the roller coaster.
	 * 
	 * 
	 * Example Input
	 * 
	 * Input 1:- 9 Input 2:- 13
	 * 
	 * 
	 * Example Output
	 * 
	 * Output 1:- You can't ride the roller coaster. Output 2:- You can ride the
	 * roller coaster!
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=13){
            System.out.print("You can ride the roller coaster!");
        }else{
             System.out.print("You can't ride the roller coaster.");
        }
	}

}
